package com.joker.wechat.controller;

import java.io.IOException;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joker.util.http.HttpUtil;
import com.joker.util.json.JsonUtil;
import com.joker.wechat.constants.WeChatConstants;
import com.joker.wechat.model.entity.User;
import com.joker.wechat.service.IUserService;

@Controller
@RequestMapping("/oauth2")
public class OAuth2Controller {
	
	@Resource
	private IUserService userService;

	@RequestMapping("authorize")
	public void authorize(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String redirect_uri = WeChatConstants.URL + "oauth2/access_token.html";
		String state = request.getParameter("state");
		String url = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + WeChatConstants.APP_ID
				+ "&redirect_uri=" + redirect_uri + "&response_type=code&scope=snsapi_userinfo&state=" + state
				+ "#wechat_redirect";
		response.sendRedirect(url);
	}

	@RequestMapping("access_token")
	public void access_token(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String code = request.getParameter("code");
		String state = request.getParameter("state");
		String sUrl = "";
		if(state.equals("a")){
			sUrl = "index.html";
		}
		String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=" + WeChatConstants.APP_ID + "&secret="
				+ WeChatConstants.APP_SECRET + "&code=" + code + "&grant_type=authorization_code";
		String result = HttpUtil.get(url);
		System.out.println("===========OAuth2.0000===========[" + result + "]=============");
		Map<String, Object> map = JsonUtil.readMapJson(result, 0);
		String openid = map.get("openid").toString();
		String accessToken = map.get("access_token").toString();
		String userInfoUrl = "https://api.weixin.qq.com/sns/userinfo?access_token=" + accessToken + "&openid=" + openid + "&lang=zh_CN ";
		String userInfoResult = HttpUtil.get(userInfoUrl);
		System.out.println("==============OAuth2.0==============[" + userInfoResult + "]========================");
		Map<String,Object> userInfoMap = JsonUtil.readMapJson(userInfoResult, 0);
		String nickname = (String)userInfoMap.get("nickname");
		Integer sex = (Integer) userInfoMap.get("sex");
		userService.addUser(openid,nickname,sex);
		HttpSession session = request.getSession();
		session.setAttribute("userInfoMap", userInfoMap);
		response.sendRedirect(WeChatConstants.URL + sUrl);
	}

}
