package com.joker.util.servlet;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class RespUtil {

	
	/**
	 * 向请求方打印信息
	 * @param response
	 * @param msg
	 */
	public static void responseOut(HttpServletResponse response,String msg){
		 response.setContentType("text/html;charset=UTF-8");
		 PrintWriter out = null;
         try {
        	 out = response.getWriter();
             out.println(msg);                      
         }catch (Exception e) {
        	 e.printStackTrace();
         }finally {   
        	out.flush();
            out.close();
        }
	}
	
	
}
