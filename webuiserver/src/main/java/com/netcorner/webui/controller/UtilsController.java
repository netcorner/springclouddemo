package com.netcorner.webui.controller;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.netcorner.webui.utils.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

/**
 * Created by shijiufeng on 2019/3/3.
 */
@Controller
public class UtilsController extends BaseController{
    /**
     * 1、验证码工具
     */
    @Autowired
    DefaultKaptcha defaultKaptcha;
    public static final String RANDOMCODEKEY = "rand";//放到session中的key

    /**
     * 2、生成验证码
     * @param httpServletRequest
     * @param httpServletResponse
     * @throws Exception
     */
    @GetMapping("/getvcode")
    public void getvcode(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws Exception {
        byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        try {
            // 生产验证码字符串并保存到session中
            String createText = defaultKaptcha.createText();
            httpServletRequest.getSession().setAttribute(RANDOMCODEKEY, createText);
            // 使用生产的验证码字符串返回一个BufferedImage对象并转为byte写入到byte数组中
            BufferedImage challenge = defaultKaptcha.createImage(createText);
            ImageIO.write(challenge, "jpg", jpegOutputStream);
        } catch (IllegalArgumentException e) {
            httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        // 定义response输出类型为image/jpeg类型，使用response输出流输出图片的byte数组
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        httpServletResponse.setHeader("Cache-Control", "no-store");
        httpServletResponse.setHeader("Pragma", "no-cache");
        httpServletResponse.setDateHeader("Expires", 0);
        httpServletResponse.setContentType("image/jpeg");
        ServletOutputStream responseOutputStream = httpServletResponse.getOutputStream();
        responseOutputStream.write(captchaChallengeAsJpeg);
        responseOutputStream.flush();
        responseOutputStream.close();
    }

    /**
     * 3、校对验证码
     * @return
     */
    @ResponseBody
    @GetMapping("/vrifyVcode")
    public String vrifyVcode() {
        String rightCode = (String) session.getAttribute(RANDOMCODEKEY);
        String vcode = request.getParameter("vcode");
        System.out.println("rightCode:"+rightCode+" ———— vcode:"+vcode);
        if (!rightCode.equals(vcode)) {
           return "错误的验证码";
        } else {
           return "验证码正确";
        }
    }
}
