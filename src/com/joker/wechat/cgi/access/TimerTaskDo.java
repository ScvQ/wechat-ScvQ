package com.joker.wechat.cgi.access;

import java.util.TimerTask;

/**
 * 定时器操作事件
 * 用于获取AccessToken
 * @author zhouqi
 * @date 2016年6月9日 下午11:56:00
 */
public class TimerTaskDo extends TimerTask {

	@Override
	public void run() {
		System.setProperty ("jsse.enableSNIExtension", "false");
		
		AccessToken at = new AccessToken();
		at.get();
		
		
	}

}
