package com.joker.wechat.cgi.access;

import java.util.Timer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 定义一个监听器，在Servlet启动的时候启动一个定时器，用户获取AccessToken
 * @author zhouqi
 * @date 2016年6月9日 下午11:55:24
 */
public class AccessTokenListener implements ServletContextListener {

	Timer timer = null;

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		if (timer != null) {
			timer.cancel();// 关闭定时器
		}
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// 创建一个定时器，用于安排需要定时执行的任务。
		timer = new Timer();
		// 为定时器安排需要定时执行的任务，该任务就是前面创建的任务类TaskAvailableConnectNumber，并指定该任务每30分钟执行一次。
		timer.schedule(new TimerTaskDo(), 0, 60 * 60 * 1000);

	}

}
