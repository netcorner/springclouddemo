package com.netcorner.webui.utils;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by shijiufeng on 2019/3/2.
 */
public class BaseController {
    public static final String RESULT_KEY="RESULT_KEY";
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;
    /**
     * 设置request和response,继承的controller层初始化实例初始化时会调用该方法
     * @param request
     * @param response
     */
    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response){
        this.request = request;
        this.response = response;
        this.session = request.getSession();
    }


    /**
     * 设置基础的模板变量
     * @param ctx
     */
    public ModelAndView getProcessModelAndView(Map<String,Object> ctx){
        return getProcessModelAndView(ctx, ClientTools.getRequestPath(request));
    }
    /**
     * 设置基础的模板变量
     * @param ctx
     * @param viewName
     * @return
     */
    public ModelAndView getProcessModelAndView(Map<String,Object> ctx,String viewName){
        //ctx.put("dateTools", (new DateTools()));

        ModelAndView mv=new ModelAndView(viewName);
        if(ctx!=null){
            mv.addObject("map", ctx);
        }
        try {
            mv.addObject("applicationPath", request.getContextPath());
        }catch (Exception e){
            mv.addObject("applicationPath", "/");
        }
        mv.addObject("currentPath", request.getRequestURI());
        mv.addObject("session", session);
        mv.addObject("request", request);
        mv.addObject("response", response);
        return mv;
    }
    /**
     * 设置基础的模板变量
     * @return
     */
    public ModelAndView getProcessModelAndView(){
        return getProcessModelAndView(getProcessMap(), ClientTools.getRequestPath(request));
    }
    /**
     * 设置基础的模板变量
     * @param viewName
     * @return
     */
    public ModelAndView getProcessModelAndView(String viewName){
        return getProcessModelAndView(getProcessMap(),viewName);
    }
    /**
     * 得到拦截后处理的hash
     * @return
     */
    @SuppressWarnings("unchecked")
    public Map<String,Object> getProcessMap(){
        return (Map<String,Object>)request.getAttribute(RESULT_KEY);
    }

    /**
     * 合并两个map
     * @param reqMap
     * @param map
     */
    public void mergeMap(Map<String,Object> reqMap,Map<String,Object> map){
        if(map!=null){
            for(Map.Entry<String,Object> o:map.entrySet()){
                reqMap.put(o.getKey(), o.getValue());
            }
        }
    }

    /**
     * 检测上传的文件扩展名是不是图片形式的
     * @param file
     * @return
     */
    public  boolean checkImageExtension(MultipartFile file){
        String ext= FileTools.getExtension(file.getOriginalFilename());
        boolean flag=false;
        String[] limitFileType=new String[]{"jpg","gif","jpeg","png","bmp"};
        for(String e:limitFileType){
            if(e.equals(ext)){
                flag=true;
                break;
            }
        }
        return flag;
    }
}
