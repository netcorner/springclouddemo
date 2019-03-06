package com.netcorner.webui.utils;
public class SimpleTagHandler implements UBBTagHandler {
    //    [b]文字加粗体效果[/b]
    //    [i]文字加倾斜效果[/i]
    //    [u]文字加下划线效果[/u]
    //    [size=4]改变文字大小[/size]
    //    [color=red]改变文字颜色[/color]
    //    [quote]这个标签是用来做为引用所设置的，如果你有什么内容是引用自别的地方，请加上这个标签！[/quote]  
    //    [url]http://www.cnjm.net[/url]
    //    [url=http://www.cnjm.net]JAVA手机网[/url]
    //    [email=webmaster@cnjm.net]写信给我[/email] 
    //    [email]webmaster@cnjm.net[/email]
    //    [img]http://www.cnjm.net/myimages/mainlogo.gif[/img]
    public SimpleTagHandler() { }

    public String[] parseTag(String s, boolean isEmpty) {
        if (isEmpty) { // 本处理器不支持空标签
            return null;
        }
        // 如果标签中有'='号就把标签分为UBB标记和属性两部分，否则属性为空
        String tag = s, attr = "";
        int idx = s.indexOf('=');
        if (idx >= 0) {
            tag = s.substring(0, idx);
            attr = s.substring(idx + 1);
        } else {
            idx = s.indexOf(':');
            if (idx >= 0) {
                tag = s.substring(0, idx);
                attr = s.substring(idx + 1);
            }
        }
        String tmp = tag.toLowerCase(); // 大小写不敏感
        // 只有下面的标记是本处理器支持的
        if ("b".equals(tmp) || "i".equals(tmp) || "u".equals(tmp)
                || "size".equals(tmp) || "color".equals(tmp)
                || "quote".equals(tmp) || "url".equals(tmp)
                || "email".equals(tmp) || "img".equals(tmp) || "*".equals(tmp)
                || "list".equals(tmp) || "fly".equals(tmp)
                || "move".equals(tmp) || "align".equals(tmp)
                || "flash".equals(tmp) || "wmv".equals(tmp) || "rm".equals(tmp)
                || "code".equals(tmp) || "glow".equals(tmp)
                || "sign".equals(tmp) || "em".equals(tmp)) {
            return new String[] { tag, attr };

        }
        // 不是一个合法的UBB标签，作为普通文本处理
        return null;
    }

    public String compose(String tag, String[] attr, String data,
            boolean isEmpty) {
        // 针对不同标记进行组合工作
        String tmp = tag;
        String style = null;
        if ("b".equals(tmp) || "i".equals(tmp) || "u".equals(tmp)) {
            return "<" + tag + ">" + data + "</" + tag + ">";
        } else if ("size".equals(tmp) || "color".equals(tmp)) {
            return "<font " + tag + "='" + attr[0] + "'>" + data + "</font>";
        } else if ("quote".equals(tmp)) {
            return "<div class=\"clearfix\"> </div><div class='quote'><div class='fheader_fillet'><div class='fheader_fillet1'><div class='fheader_fillet2'></div></div></div><div class='quotemain'><div class='quotemain1'><div class='quotemain2'>"
                    + data
                    + "</div></div></div><div class='ffooter_fillet'><div class='ffooter_fillet1'><div class='ffooter_fillet2'></div></div></div></div>";
        } else if ("url".equals(tmp)) {
            String link = attr[0] != "" ? attr[0] : data;
            String domain;
            link.trim();
            String code = link.substring(0, 1);
            if (code.equals("#") == true) {
                return "<a href='" + link + "'>" + data + "</a>";
            } else {
                int index = link.indexOf('/');
                if (index < 0) {
                    link = "http://" + link;
                } else {
                    String head = link.substring(0, index);
                    if ((head.equals("http:") == false)
                            && (head.equals("ftp:") == false)
                            && (head.equals("gopher:") == false)
                            && (head.equals("news:") == false)
                            && (head.equals("telnet:") == false)
                            && (head.equals("mms:") == false)
                            && (head.equals("rtsp:") == false))
                        link = "http://" + link;
                }
                try {
                    domain = link.substring((link.indexOf('.') + 1));
                    domain = domain.substring(0, (domain.indexOf('.')));
                } catch (Exception ex) {
                    domain = "";
                }
                if (domain.equals("moabc"))
                    return "<a href='" + link + "' target=_blank>" + data+ "</a>";
                else
                    return "<a href='/wap/out?url="+ link + "' target=_blank>" + data + "</a>";
            }
        } else if ("email".equals(tmp)) {
            String email = attr[0] != "" ? attr[0] : data;
            return "<a href='mailto:" + email + "'>" + data + "</a>";
        } else if ("img".equals(tmp)) {
            return "<img src='" + data + "' border=0>";
        } else if ("*".equals(tmp)) {
            return "<li>" + data + "</li>";
        } else if ("list".equals(tmp)) {
            return "<ul>" + data + "</ul>";
        } else if ("fly".equals(tmp)) {
            return "<marquee width=90% behavior=alternate scrollamount=3>"
                    + data + "</marquee>";
        } else if ("move".equals(tmp)) {
            return "<marquee scrollamount=3>" + data + "</marquee>";
        } else if ("align".equals(tmp)) {
            style = attr[0] != "" ? attr[0] : "left";
            return "<div align='" + style + "'>" + data + "</div>";
        } else if ("sign".equals(tmp)) {
            return "<a name='" + attr[0] + "'>" + data + "</a>";
        } else if ("flash".equals(tmp)) {
            String height;
            String width;
            try {
                height = attr[1];
                width = attr[0];
            } catch (Exception ex) {
                height = String.valueOf(360);
                width = String.valueOf(480);
            }
            return "<OBJECT CLASSID=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" WIDTH="
                    + width
                    + " HEIGHT="
                    + height
                    + "><PARAM NAME=MOVIE VALUE='"
                    + data
                    + "'><PARAM NAME=PLAY VALUE=TRUE><PARAM NAME=LOOP VALUE=TRUE><PARAM NAME=QUALITY VALUE=HIGH><EMBED SRC='"
                    + data
                    + "' WIDTH="
                    + width
                    + " HEIGHT="
                    + height
                    + " PLAY=TRUE LOOP=TRUE QUALITY=HIGH></EMBED></OBJECT><br />[<a target=_blank href='"
                    + data + "'>全屏播放</a>]";
        } else if ("wmv".equals(tmp)) {
            return "<EMBED src='" + data
                    + "' HEIGHT=\"256\" WIDTH=\"314\" AutoStart=1></EMBED>";
        } else if ("rm".equals(tmp)) {
            return "<object classid=clsid:CFCDAA03-8BE4-11cf-B84B-0020AFBBCCFA height=241 id=Player width=316 VIEWASTEXT><param name=\"_ExtentX\" value=\"12726\"><param name=\"_ExtentY\" value=\"8520\"><param name=\"AUTOSTART\" value=\"0\"><param name=\"SHUFFLE\" value=\"0\"><param name=\"PREFETCH\" value=\"0\"><param name=\"NOLABELS\" value=\"0\"><param name=\"CONTROLS\" value=\"ImageWindow\"><param name=\"CONSOLE\" value=\"_master\"><param name=\"LOOP\" value=\"0\"><param name=\"NUMLOOP\" value=\"0\"><param name=\"CENTER\" value=\"0\"><param name=\"MAINTAINASPECT\" value=\""
                    + data
                    + "\"><param name=\"BACKGROUNDCOLOR\" value=\"#000000\"></object><br /><object classid=clsid:CFCDAA03-8BE4-11cf-B84B-0020AFBBCCFA height=32 id=Player width=316 VIEWASTEXT><param name=\"_ExtentX\" value=\"18256\"><param name=\"_ExtentY\" value=\"794\"><param name=\"AUTOSTART\" value=\"1\"><param name=\"SHUFFLE\" value=\"0\"><param name=\"PREFETCH\" value=\"0\"><param name=\"NOLABELS\" value=\"0\"><param name=\"CONTROLS\" value=\"controlpanel\"><param name=\"CONSOLE\" value=\"_master\"><param name=\"LOOP\" value=\"0\"><param name=\"NUMLOOP\" value=\"0\"><param name=\"CENTER\" value=\"0\"><param name=\"MAINTAINASPECT\" value=\"0\"><param name=\"BACKGROUNDCOLOR\" value=\"#000000\"><param name=\"SRC\" value=\""
                    + data + "\"></object>";
        } else if ("em".equals(tmp)) {
            style = attr[0] != "" ? attr[0] : "1";
            return "<img src='../ico/em" + attr[0]
                    + ".gif' style=\"border:0\" >";
        } else if ("glow".equals(tmp)) {
            String glowwidth, glowcolor, glowstrength;
            try {
                glowwidth = attr[0];
            } catch (Exception ex) {
                glowwidth = String.valueOf(360);
            }
            try {
                glowcolor = attr[1];
            } catch (Exception ex) {
                glowcolor = String.valueOf(360);
            }
            try {
                glowstrength = attr[2];
            } catch (Exception ex) {
                glowstrength = String.valueOf(360);
            }
            return "<span style='WIDTH:" + glowwidth + ";filter:glow(color="
                    + glowcolor + ", strength=" + glowstrength + ")'>" + data
                    + "</span>";
        } else if ("code".equals(tmp)) {
            java.util.Random random = new java.util.Random();
            int x = random.nextInt(9999);
            String s = String.valueOf(x);
            //System.out.println("data: \n" + data);
            //int index = link.indexOf('/');
            return "<div class=\"clearfix\"> </div><div class=\"somecode\"><div class=\"somecode_main\"><div class=\"fheader_fillet\"><div class=\"fheader_fillet1\"><div class=\"fheader_fillet2\"></div></div></div><div class=\"body\"><div class=\"code_header\"><input type=\"button\" value=\"复制代码\" onclick=\"getcode('code-content"
                    + s
                    + "')\" class=\"btn\"/></div><div class=\"code_tools\"><a class=\"c_to\" id=\"c_to"
                    + s
                    + "\" onclick=\"showsomecode('"
                    + s
                    + "')\"> </a></div><div class=\"code-content\" id=\"code-content"
                    + s
                    + "\">"
                    + data
                    + "</div><div id=\"code_footer"
                    + s
                    + "\"><div class=\"code_footer\"><input type=\"button\" value=\"复制代码\" onclick=\"getcode('code-content"
                    + s
                    + "')\" class=\"btn\"/></div><div class=\"code_tools\"><a class=\"c_to\" id=\"c_to\" onclick=\"showsomecode('"
                    + s
                    + "')\"> </a></div></div></div><!-- body --><div class=\"ffooter_fillet\"><div class=\"ffooter_fillet1\"><div class=\"ffooter_fillet2\"></div></div></div></div><!-- somecode_main --><div class=\"clearfix\"> </div></div>";
        }
        return data;
    }

    // 测试代码，可以运行这个类，并把包含UBB标签的文本作为参数传入来测试
    // 比如java util.SimpleTagHandler "[color=red]你[color=blue]好[/color]啊[/color]"
    public static void main(String[] args) throws Exception {
        String ubb = "[color=red]你[color=blue]好[/color]啊  &&& [color=red]你<font color='blue'>好</font>啊";
        System.out.println(">>>>" + ubb);
        // 下面采用了忽略模式来容错，你也可以用MODE_CLOSE试验一下关闭模式的容错效果
        System.out.println("=========================\n"
                + UBBDecoder.decode(ubb, new SimpleTagHandler(),
                        UBBDecoder.MODE_CLOSE));
    }

}