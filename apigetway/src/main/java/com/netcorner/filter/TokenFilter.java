package com.netcorner.filter;

import com.netflix.discovery.util.StringUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by shijiufeng on 2019/2/26.
 */
//@Component
public class TokenFilter extends ZuulFilter {
    /**
     * 过滤器类型
     * @return
     */
    @Override
    public String filterType() {
        return "pre";//pre 表示在请求之前执行
    }

    /**
     * 过滤器执行顺序，当一个请求在同一阶段存在多个相同过滤器时，按数字执行顺序执行
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 过滤器是否生效
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 编写过滤器拦截业务逻辑代码
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        //判断服务接口是否传递token
        RequestContext currentContext=RequestContext.getCurrentContext();
        HttpServletRequest request=currentContext.getRequest();
        String token=request.getParameter("token");
        if(StringUtils.isEmpty(token)){
            //不调用转发请求直接返回给客户端
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseBody("userToken is null");
            currentContext.setResponseStatusCode(401);
        }
        return null;
    }
}
