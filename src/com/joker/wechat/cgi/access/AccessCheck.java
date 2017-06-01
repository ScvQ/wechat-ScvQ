package com.joker.wechat.cgi.access;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import com.joker.util.security.AlgorithmType;
import com.joker.util.security.Encryption;
import com.joker.wechat.constants.WeChatConstants;

/**
 * 微信服务器介入请求安全验证
 * @author zhouqi
 * @date 2016年6月9日 下午11:46:22
 */
public class AccessCheck {

	private String signature;
	private String timestamp;
	private String nonce;
	
	public boolean checkSignature(){
		
		String[] tmpArr = new String[]{WeChatConstants.TOKEN,this.timestamp,this.nonce};
		Arrays.sort(tmpArr);
		StringBuffer sb = new StringBuffer();
		for(String s:tmpArr){
			sb.append(s);
		}
		
		String sign = Encryption.encode(AlgorithmType.SHA1.toString(), sb.toString());
		if(sign.equals(this.signature))
			return true;
		return false;
	}
	
	public AccessCheck(String echostr,HttpServletRequest request){
        this.signature=request.getParameter("signature");
        this.timestamp=request.getParameter("timestamp");
        this.nonce=request.getParameter("nonce");
	}
	
	
}
