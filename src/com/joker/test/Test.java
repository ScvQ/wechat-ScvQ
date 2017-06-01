package com.joker.test;

import com.joker.util.http.HttpUtil;
import com.joker.wechat.cgi.access.AccessToken;
import com.joker.wechat.constants.WeChatConstants;

public class Test {
	
	public static void main(String[] args){
		
		//1、获取access_token
		/*AccessToken at = new AccessToken();
		at.get();*/
		
		//2、通过access_token获取微信服务器IP地址列表ip_list
		/*String url = "https://api.weixin.qq.com/cgi-bin/getcallbackip?access_token=bafk2_hkPHdUDeeq6un6qkm4WYqQXDmK6jPFHVG_hwfsxgu-F0JknTZE4YaUPO7O-xNHMh3hk1MUzLg0TnmTEkt2Xw7Tw_6ACII_X2yVHkMRPAiAEALJU";
		String result = HttpUtil.get(url);
		System.out.println(result);*/
		
		//3、自定义菜单json:点击、菜单,json1:扫码、发图,json2:发送地理位置
		/*String url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=bafk2_hkPHdUDeeq6un6qkm4WYqQXDmK6jPFHVG_hwfsxgu-F0JknTZE4YaUPO7O-xNHMh3hk1MUzLg0TnmTEkt2Xw7Tw_6ACII_X2yVHkMRPAiAEALJU";
		String json = " {\"button\":[{\"type\":\"click\",\"name\":\"今日歌曲\",\"key\":\"V1001_TODAY_MUSIC\"},{\"name\":\"菜单\",\"sub_button\":[{\"type\":\"view\",\"name\":\"搜索\",\"url\":\"http://www.soso.com/\"},{\"type\":\"view\",\"name\":\"视频\",\"url\":\"http://v.qq.com/\"},{\"type\":\"click\",\"name\":\"赞一下我们\",\"key\":\"V1001_GOOD\"}]}]}";
		String json1 = "{\"button\": [{\"name\": \"扫码\", \"sub_button\": [{\"type\": \"scancode_waitmsg\", \"name\": \"扫码带提示\", \"key\": \"rselfmenu_0_0\", \"sub_button\": [ ]}, {\"type\": \"scancode_push\", \"name\": \"扫码推事件\", \"key\": \"rselfmenu_0_1\", \"sub_button\": [ ]}]}, {\"name\": \"发图\", \"sub_button\": [{\"type\": \"pic_sysphoto\", \"name\": \"系统拍照发图\", \"key\": \"rselfmenu_1_0\", \"sub_button\": [ ] }, {\"type\": \"pic_photo_or_album\", \"name\": \"拍照或者相册发图\", \"key\": \"rselfmenu_1_1\", \"sub_button\": [ ]}, {\"type\": \"pic_weixin\",  \"name\": \"微信相册发图\",  \"key\": \"rselfmenu_1_2\", \"sub_button\": [ ]}]}]}";
		String json2 = "{\"button\": [{\"name\": \"发送位置\", \"type\": \"location_select\", \"key\": \"rselfmenu_2_0\"}]";
		String result = HttpUtil.post(url, json);
		System.out.println(result);*/
		
		//4、个性化菜单,{"menuid":417306228},可以让不同的用户分组、性别、手机系统、地区、语言的人看到不同的菜单
		/*String url = "https://api.weixin.qq.com/cgi-bin/menu/addconditional?access_token=bafk2_hkPHdUDeeq6un6qkm4WYqQXDmK6jPFHVG_hwfsxgu-F0JknTZE4YaUPO7O-xNHMh3hk1MUzLg0TnmTEkt2Xw7Tw_6ACII_X2yVHkMRPAiAEALJU";
		String json = " {\"button\":[{\"type\":\"click\",\"name\":\"今日歌曲\",\"key\":\"V1001_TODAY_MUSIC\"},{\"name\":\"菜单\",\"sub_button\":[{\"type\":\"view\",\"name\":\"搜索\",\"url\":\"http://www.soso.com/\"},{\"type\":\"view\",\"name\":\"视频\",\"url\":\"http://v.qq.com/\"},{\"type\":\"click\",\"name\":\"赞一下我们\",\"key\":\"V1001_GOOD\"}]}],\"matchrule\":{\"group_id\":\"2\",\"sex\":\"1\",\"country\":\"中国\",\"province\":\"广东\",\"city\":\"广州\",\"client_platform_type\":\"2\"\"language\":\"zh_CN\"}}";
		String result = HttpUtil.post(url, json);
		System.out.println(result);*/
		
		//5、测试Oauth2.0跳转
		/*String url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=kdEpS8ePrLo9aM6Yfa_dRujdwrGCmGfvLeGUWEahkOlVZUHLibT2gw3wY18caxorDoXEZ6XM9OdtNGt4a_tkoZkxxsdjc6HhiVVjhiXTvsOdkSOqT3C-9880-ybFfaBOVZNcAHAIMA";
		String json = "{\"button\":["
				+ "{\"type\":\"view\",\"name\":\"微的商城\",\"url\":\"" + WeChatConstants.URL + "oauth2/authorize.html?state=a\"},"
				+ "{\"name\":\"微活动\",\"sub_button\":["
					+ "{\"type\":\"click\",\"name\":\"a\",\"key\":\"a\"},"
					+ "{\"type\":\"click\",\"name\":\"b\",\"key\":\"b\"}]}}]";
		String result = HttpUtil.post(url, json);
		System.out.println(result);*/
		
		//6、通过access_token和openid获取用户信息并打印
		/*String ACCESS_TOKEN = "q2X3wyne0xLGaoaN9600bGckE6KH9OJR_M7ob1rcu0NumjsGcUzTGyG-MjLSfBFgUW23KYJ8MYYY5OHLYD3gxr1oxM6yxKXI89NNQCy9-vfiODurgLbbVpjJTLi9cMcYJAOgAJAWNB";
		String OPEN_ID = "oLaT0wy6SeiuhknoXIQ_v0NU3hAw";
		String url = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=" + ACCESS_TOKEN + "&openid=" + OPEN_ID + "&lang=zh_CN ";
		String result = HttpUtil.get(url);
		System.out.println(result);*/
		
		//7、练习
		String url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=aWluSTzjOOAu9qEBIP-COtVPmCYdP-tf7QyICZen-hwNtlQc5kCI9fHGD9RvXsmCROobjJ61SB_9x6KNRBXN9NkuGIi8TzbfL9pSzDWvRPQyK3GO9QkP6gXpZblkBiV1PXLbACAYGU";
		String json = "{\"button\":["
						+ "{\"name\":\"微活动\",\"sub_button\":["
							+ "{\"type\":\"click\",\"name\":\"活动一\",\"key\":\"a\"},"
							+ "{\"type\":\"click\",\"name\":\"活动二\",\"key\":\"b\"}"
						+ "]},"
						+ "{\"type\":\"view\",\"name\":\"微商城\",\"url\":\"" + WeChatConstants.URL + "oauth2/authorize.html?state=a\"},"
						+ "{\"type\":\"view\",\"name\":\"关于我们\",\"url\":\"" + WeChatConstants.URL + "about_us.html\"},"
					+ "}]";
		String result = HttpUtil.post(url, json);
		System.out.println(result);
		
	}
}
