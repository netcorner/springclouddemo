package com.netcorner.webui.error;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * Created by shijiufeng on 2019/3/5.
 */
@Component
class MyErrorPageRegistrar implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry errorPageRegistry) {
        //1、按错误的类型显示错误的网页
        //错误类型为404，找不到网页的，默认显示404.html网页
        ErrorPage e404 = new ErrorPage(HttpStatus.NOT_FOUND, "/html/error/404.html");
        //错误类型为500，表示服务器响应错误，默认显示500.html网页,页面已经处理
        ErrorPage e500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/html/error/500.html");
        errorPageRegistry.addErrorPages(e404,e500);
    }

}