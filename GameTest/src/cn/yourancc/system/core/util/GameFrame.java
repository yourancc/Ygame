package cn.yourancc.system.core.util;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



/**
 * 项目框架类
 *
 */
@SuppressWarnings("serial")
public class GameFrame extends Frame {
	public static long gameTime;
	/**
	 * 定义重画窗口的线程内部类，让图片动起来
	 */
	class PaintThread extends Thread {
		
		@Override
		public void run() {
			while (true) {
				// 重画窗口，反复调用paint()方法
				repaint();
				try {
					gameTime++;
					Thread.sleep(40);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public long getSecond() {
		return gameTime/25;
	}
	public long getMmillisecond() {
		return gameTime*25;
	}
	/**
	 * 设置游戏窗口
	 */
	public void launchFrame() {
		
		// 设置窗口大小
		setSize(Constant.WINDOW_WIDTH, Constant.WINDOW_HEIGHT);
		// 设置窗口位置
		setLocation(Constant.WINDOW_LOCATION_WIDTH, Constant.WINDOW_LOCATION_HEIGHT);
		// 使窗口可见
		setVisible(true);
		// 修改标题栏文字
		setTitle("泡泡堂");
		// 禁止修改窗口大小
		setResizable(false);
		
		// 实时刷新窗口
		new PaintThread().start();
		
		// 点击X可以关闭窗口
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}
	
	/** 
	 * 利用刷过缓冲计数消除闪烁
	 */
	private Image offScreenImage = null;
	public void update(Graphics g) {
		if(offScreenImage == null) { 
			offScreenImage = this.createImage(Constant.WINDOW_WIDTH, Constant.WINDOW_HEIGHT);
		}
		Graphics gOff = offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage, 0, 0, null);
	}
	
}
