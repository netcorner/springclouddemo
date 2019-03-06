package com.netcorner.webui.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * Created by shijiufeng on 2019/3/2.
 */
@Aspect            //使用@Aspect注解将一个java类定义为切面类
@Component
public class WebLogAspect {
    private static Logger logger = Logger.getLogger(WebLogAspect.class);


    private ThreadLocal<Long> startTime = new ThreadLocal<>();

    //使用@Pointcut定义一个切入点，可以是一个规则表达式，比如下例中某个package下的所有函数，也可以是一个注解等。
    @Pointcut("execution(public * com.netcorner.*.controller.*.*(..))")
    public void webLog() {
    }

    //使用@Before在切入点开始处切入内容
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());

        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        logger.info("请求URL : " + request.getRequestURL().toString());
        logger.info("请求HTTP_METHOD : " + request.getMethod());
        logger.info("请求IP : " + request.getRemoteAddr());
        logger.info("请求CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("请求参数值 : " + Arrays.toString(joinPoint.getArgs()));
        Enumeration<String> enu=request.getParameterNames();
        while(enu.hasMoreElements()){
            String name=enu.nextElement()+"";
            logger.info("name:"+name+",value:"+request.getParameter(name));
        }

    }


    //使用@AfterReturning在切入点return内容之后切入内容（可以用来对处理返回值做一些加工处理）
    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("响应RESPONSE : " + ret);
        logger.info("响应时间SPEND TIME : " + (System.currentTimeMillis() - startTime.get()));
    }

}