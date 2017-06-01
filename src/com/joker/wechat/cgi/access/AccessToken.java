package com.joker.wechat.cgi.access;

import java.util.Date;
import java.util.Map;

import com.joker.util.date.DateUtil;
import com.joker.util.http.HttpUtil;
import com.joker.util.json.JsonUtil;
import com.joker.wechat.constants.WeChatConstants;


/**
 * 通过appid和appsecret获得access_token
 * 
 * @author ScvQ
 *
 */

public class AccessToken {

	public String get() {
		String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="
				+ WeChatConstants.APP_ID
				+ "&secret="
				+ WeChatConstants.APP_SECRET;

		String result = HttpUtil.get(url);
		System.out.println(result);
		Map<String, Object> map = JsonUtil.readMapJson(result, 0);
		String ACCESS_TOKEN = map.get("access_token").toString();
		int expires_in = Integer.parseInt(map.get("expires_in").toString());
		WeChatConstants.ACCESS_TOKEN = ACCESS_TOKEN;
		System.out.println("=========="
				+ DateUtil.getDateFormat(new Date(), "yyyy-MM-dd hh:mm:ss")
				+ "=====================" + ACCESS_TOKEN
				+ "===========================");
		return ACCESS_TOKEN;
	}

}
