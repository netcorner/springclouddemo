package com.netcorner.webui.utils;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

public  class ClientTools {
	public static String getRequestParamString(HttpServletRequest request, int maxLength){
		Map<String,String[]> ps=request.getParameterMap();
		StringBuilder sb=new StringBuilder();
		boolean f=false;
		String tmp;
		for(Entry<String,String[]> kv : ps.entrySet()){
			if(f) sb.append("&");
			if(kv.getValue().length==1){
				sb.append(kv.getKey());
				sb.append("=");
				tmp=kv.getValue()[0];
				if(tmp.length()<maxLength){
					sb.append(tmp);
				}
			}else{
				for(String kv1 : kv.getValue()){
					sb.append(kv.getKey());
					sb.append("=");
					sb.append(kv1);
				}
			}
			f=true;
		}
		try {
			URLEncoder.encode("","gbk");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sb.toString();
	}
	/**
	 * 得到某路径的服务器路径地址
	 * @param request
	 * @param path
	 * @return
	 */
	public static String getServerPath(HttpServletRequest request, String path){
		return request.getSession().getServletContext().getRealPath(path);
	}
	/**
	 * 得到某用户的文件夹路径
	 * @param file
	 * @param userid
	 * @return
	 */
	public static String getUserPath(MultipartFile file, Object userid){
		String fileName = file.getOriginalFilename();
		String[] suffix = fileName.split("\\.");
		SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");
		return "user/"+userid+sdf.format(new Date()) + UUID.randomUUID()+ "."+ suffix[suffix.length - 1];
	}
	/**
	 * 得到上传文件的表单项
	 * @param request
	 * @return
	 */
	public static MultipartFile getUploadFile(MultipartHttpServletRequest request){
		for(Entry<String, MultipartFile> mfile:request.getFileMap().entrySet()){
			return mfile.getValue();
		}
		return null;
	}
	
	/**
	 * 上传文件
	 * @param file
	 * @param homePath
	 * @param filePath
	 * @return
	 */
	public static String saveUploadFile(MultipartFile file, String homePath, String filePath) {
		File path = new File(homePath+filePath);
		if (!path.exists()) {
			path.mkdirs();
		}
		try {
			file.transferTo(path);
		} catch (Exception e) {
			throw new DALException(e.toString());
		}
		return filePath;
	}
	/**
	 * 得到请求路径
	 * @return
	 */
	public static String getRequestPath(HttpServletRequest request){
		return request.getRequestURI().replace(request.getContextPath(), StringTools.empty);
	}
	/**
	 * 清理url中某个参数
	 * @param request
	 * @param key
	 * @return
	 */
	public static String clearUrlParams(HttpServletRequest request, String key){
        return clearUrlParams(request.getRequestURI()+"?"+request.getQueryString(),key);
	}
	/**
	 * 清理url中某个参数
	 * @param currentUrl
	 * @param key
	 * @return
	 */
	public static String clearUrlParams(String currentUrl,String key){
        String url=currentUrl.replaceAll("[?]*" + key + "=[^&]+", StringTools.empty);
        int l=url.length();
        if(url.substring(l-1, l).equals("?")){
        	url=url.substring(0,l-1);
        }
        return url;
	}
	/**
	 * 得到本地IP
	 * @return
	 */
	public static String getHostIpAddr() {   
        InetAddress address=null;
		try {
			address = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        return address.getHostAddress();   
    }
	public static String getRemoteIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("x-client-ip");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}

		// 多级反向代理
		if (null != ip && !"".equals(ip.trim())) {
			StringTokenizer st = new StringTokenizer(ip, ",");
			if (st.countTokens() > 1) {
				return st.nextToken();
			}
		}
		return ip;
	} 
	/**
	 * 提交或交互的URL数据是否来源于其它地方，站内提交，防止跨站
	 */
	public static boolean isBreakRomoteURL(HttpServletRequest request, HttpServletResponse response){
        if (getSrcLink(request).equals(getApplicationUrl(request)))
        {
    		response.setContentType("text/html;charset=utf-8");
    		response.setCharacterEncoding("utf-8");
    		try {
				response.getWriter().write("不支持直接输入地址浏览!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		return false;
        }else{
        	return true;
        }
	}
	/**
	 * 得到来源链接地址
	 * @return
	 */
    public static String getSrcLink(HttpServletRequest request)
    {
    	String url=request.getHeader("Referer");
        return StringTools.isNullOrEmpty(url) ? getApplicationUrl(request) : url; 
    }
    
    private  static String applicationUrl;
    /**
     * 得到应用程序的路径
     * @return
     */
	public static  String getApplicationUrl(HttpServletRequest request) {
		if (applicationUrl == null){
			applicationUrl = request.getContextPath();
            if (applicationUrl == "/") applicationUrl = StringTools.empty;
		}
		return applicationUrl;
	}
    
	/**
	 * 得到请求参数并以map方式返回，get,post请求的数据将都被获取
	 * @return
	 */
	public static Map<String, Object> getRequestParamsMap(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String,String[]> ps=request.getParameterMap();
		for(Entry<String,String[]> kv : ps.entrySet()){
			if(kv.getValue().length==1){
				map.put(kv.getKey(), StringTools.htmlEncode(StringTools.queryFilter(kv.getValue()[0])));
			}else{
				map.put(kv.getKey(), kv.getValue());
			}
		}
		return map;
//		Map<String, Object> map = new HashMap<String, Object>();
//		Enumeration pNames = request.getParameterNames();
//		while (pNames.hasMoreElements()) {
//			String name = (String) pNames.nextElement();
//			//过滤html标签，过滤sql注入
//			String value =StringTools.htmlEncode(StringTools.queryFilter(request.getParameter(name)));
//			map.put(name, value);
//			//map.put(name, StringTools.convertUTF8(value,"ISO-8859-1"));
//		}
//		return map;
	}
    
//	/**
//	 * <pre>
//	 * 发送带参数的POST的HTTP请求
//	 * </pre>
//	 *
//	 * @param reqUrl
//	 *            HTTP请求URL
//	 * @param parameters
//	 *            参数映射表
//	 * @return HTTP响应的字符串
//	 */
//	public static String doPost(String reqUrl, Map<String, String> parameters,
//			String recvEncoding) throws Exception{
//		HttpClient client=HttpClients.createDefault();
//
//		HttpPost post=new HttpPost(reqUrl);
//		List<NameValuePair> nvps=new ArrayList<NameValuePair>();
//		Iterator<Entry<String, String>> iterator=parameters.entrySet().iterator();
//		while(iterator.hasNext()){
//			Entry<String, String> entry=iterator.next();
//			nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
//		}
//		post.setEntity(new UrlEncodedFormEntity(nvps,recvEncoding));
//		CloseableHttpResponse response=(CloseableHttpResponse)client.execute(post);
//		HttpEntity clientEntity=response.getEntity();
//		BufferedReader reader=new BufferedReader(new InputStreamReader(clientEntity.getContent(),recvEncoding));
//		String lines;
//		StringBuilder sb=new StringBuilder();
//		while ((lines = reader.readLine()) != null) {
//			sb.append("\n" + lines);
//		}
//		HttpClientUtils.closeQuietly(response);
//		HttpClientUtils.closeQuietly(client);
//		return sb.toString();
//	}
	/**
	 * 通过get来访问url
	 * 
	 * @param src
	 *            需要访问的url
	 * @return
	 * @throws Exception
	 */
	public static String doGet(String src) throws Exception {
		return doGet(src, "utf-8");
	}

	/**
	 * 通过get来访问url
	 * 
	 * @param src
	 *            需要访问的地址
	 * @param outputencode
	 *            获取输出时的编码
	 * @return
	 * @throws Exception
	 */
	public static String doGet(String src, String outputencode)
			throws Exception {
		return doGet(src, outputencode, null);
	}

	
	
	
	/**
	 * 通过get来访问url
	 * 
	 * @param src
	 *            需要访问的地址
	 * @param outputencode
	 *            获取输出时的编码
	 * @param headers
	 *            需要添加的访问头信息
	 * @return
	 * @throws Exception
	 */
	public static String doGet(String src, String outputencode,
			HashMap<String, String> headers) throws Exception {
		StringBuffer result = new StringBuffer();
		URL url = new URL(src);
		URLConnection connection = url.openConnection();
		connection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
		
		BufferedReader in = null;
		try {
			if (headers != null) {
				Iterator<String> iterators = headers.keySet().iterator();
				while (iterators.hasNext()) {
					String key = iterators.next();
					connection.setRequestProperty(key, headers.get(key));
				}
			}
			connection.connect();
			in = new BufferedReader(new InputStreamReader(
					connection.getInputStream(), outputencode));
			String line;
			while ((line = in.readLine()) != null) {
				result.append("\n" + line);
			}
			return result.toString();
		} catch (Exception ex) {
			throw ex;
		} finally {
			if (in != null) {
				in.close();
			}
		}

	}
	
	/**
	 * 页面跳转
	 * @param url
	 * @param msg
	 */
    public static void redirectUrl(HttpServletRequest request, HttpServletResponse response, String url, String msg)
    {
        redirectUrl(request,response,url, msg, null,RedirectTypeEnum.defaultWindow);
    }
    /**
     * 页面跳转
     * @param url
     * @param msg
     * @param from
     */
    public static void redirectUrl(HttpServletRequest request, HttpServletResponse response, String url, String msg, String from, RedirectTypeEnum redirectType)
    {
        url = url.replaceAll("&amp;", "&");
        String rtype="";
        if(redirectType==RedirectTypeEnum.topWindow){
        	rtype="top.";
        }else{
        	if(redirectType==RedirectTypeEnum.parentWindow){
        		rtype="parent.";
        	}
        }
        
        if (StringTools.isNullOrEmpty(msg))
        {
            if (request.getHeader("x-requested-with") != null  
                    && request.getHeader("x-requested-with").equalsIgnoreCase(  
                            "XMLHttpRequest")) { 
                PrintWriter out;
				try {
					out = response.getWriter();
	                out.print("{\"redirect\":\""+url+"\"}");  
	                out.flush();  
	                out.close();  
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
            }else { // http 超时处理  
                try {
    				//response.sendRedirect(url);
    				response.getWriter().write("<script>"+rtype+"document.location.href='"+url+"'</script>");
                	return;
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
            } 
        }
        else
        {

            url = url.replaceAll("#", StringTools.empty);
            
            if (url.contains("?"))
            {
                url += "&msg=" + msg;
            }
            else
            {
                url += "?msg=" + msg;
            }
            String requestUrl = request.getRequestURI();  
            String query=request.getQueryString();
            if(!StringTools.isNullOrEmpty(query)){
            	requestUrl+="?"+query;
            }
            
            url += "&" + from + "=" + requestUrl;
            
             
            if (request.getHeader("x-requested-with") != null  
                    && request.getHeader("x-requested-with").equalsIgnoreCase(  
                            "XMLHttpRequest")) { 
                PrintWriter out;
				try {
					out = response.getWriter();
	                out.print("{\"redirect\":\""+url+"\",\"msg\":\""+msg+"\"}");  
	                out.flush();  
	                out.close();  
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
            }else { // http 超时处理  
                try {
    				//response.sendRedirect(url);
    				response.getWriter().write("<script>"+rtype+"document.location.href='"+url+"'</script>");
                	return;
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
            }  
        }
    }
    /**
     * 跳转
     * @param url
     */
    public static void redirectUrl(HttpServletRequest request, HttpServletResponse response, String url)
    {
    	redirectUrl(request,response,url, null,null,RedirectTypeEnum.defaultWindow);
    }
    /**
     * 返回上页
     * @param response
     */
    public static void backward(HttpServletResponse response)
    {
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		try{
			response.getWriter().write("<script>history.back(-1);</script>");
		}catch(Exception e){
		}
    }
    /**
     * 得到cookie
     * @param request
     * @param name
     * @return
     */
    public static Cookie getCookieByName(HttpServletRequest request, String name){
        Map<String,Cookie> cookieMap = readCookieMap(request);
        if(cookieMap.containsKey(name)){
            Cookie cookie = (Cookie)cookieMap.get(name);
            return cookie;
        }else{
            return null;
        }   
    }
    /**
     * 将cookie封装到Map里面
     * @param request
     * @return
     */
    private static Map<String,Cookie> readCookieMap(HttpServletRequest request){
        Map<String,Cookie> cookieMap = new HashMap<String,Cookie>();
        Cookie[] cookies = request.getCookies();
        if(null!=cookies){
            for(Cookie cookie : cookies){
                cookieMap.put(cookie.getName(), cookie);
            }
        }
        return cookieMap;
    }
}
