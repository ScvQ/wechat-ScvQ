package com.joker.wechat.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joker.util.io.StreamUtil;
import com.joker.util.servlet.RespUtil;
import com.joker.util.string.StringUtil;
import com.joker.util.xml.XMLUtil;
import com.joker.wechat.cgi.access.AccessCheck;

@Controller
@RequestMapping("/wechat")
public class WechatHandler {

	@RequestMapping("handler")
	public void handler(HttpServletRequest request, HttpServletResponse response) throws IOException {

		//微信第一次验证start
		String signature = (String) request.getParameter("signature");
		String timestamp = (String) request.getParameter("timestamp");
		String nonce = (String) request.getParameter("nonce");
		String echostr = (String) request.getParameter("echostr");
		System.out.println("===signature:"+signature+"===timestamp:"+timestamp+"===nonce:"+nonce+"===echostr:"+echostr+"===");
		if (!StringUtil.isNullOrEmpty(echostr)) {
			AccessCheck ac = new AccessCheck(echostr, request);
			if (ac.checkSignature()) {
				System.out.println("=========================微信第一次验证成功==========================");
				RespUtil.responseOut(response, echostr);
			}
		}
		//微信第一次验证end
		
String result = "";
		
		String orderXmlStr = StreamUtil.readStream(request.getInputStream());
		
		System.out.println("===========================[" + orderXmlStr + "]=============================================");

		Element e = XMLUtil.getElementFromXML(orderXmlStr);
		
		String ToUserName = e.elementText("ToUserName");
		String FromUserName = e.elementText("FromUserName");
		
		String MsgType = e.elementText("MsgType");
		
		if(MsgType.equals("event")){
			
			String Event = e.elementText("Event");
			
			if(Event.equals("CLICK")){
				String EventKey = e.elementText("EventKey");
				
				Document document = DocumentHelper.createDocument();
				Element root = document.addElement("xml");
				Element ToUserNamee = root.addElement("ToUserName");
				ToUserNamee.addCDATA(FromUserName);
				Element FromUserNamee = root.addElement("FromUserName");
				FromUserNamee.addCDATA(ToUserName);
				Element CreateTimee = root.addElement("CreateTime");
				CreateTimee.addCDATA(String.valueOf(System.currentTimeMillis()));
				Element MsgTypee = root.addElement("MsgType");
				MsgTypee.addCDATA("text");
				Element Contente = root.addElement("Content");
				
				
				if(EventKey.equals("a")){
					Contente.addCDATA("你好a");
				}else if(EventKey.equals("b")){
					Contente.addCDATA("你好b");
				}
				
				result = document.asXML();
			}
		}
		
		RespUtil.responseOut(response, result);
		
		
	}
	
}
