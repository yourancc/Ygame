package cn.yourancc.system.core.util;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



/**
 * ��Ŀ�����
 *
 */
@SuppressWarnings("serial")
public class GameFrame extends Frame {
	public static long gameTime;
	/**
	 * �����ػ����ڵ��߳��ڲ��࣬��ͼƬ������
	 */
	class PaintThread extends Thread {
		
		@Override
		public void run() {
			while (true) {
				// �ػ����ڣ���������paint()����
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
	 * ������Ϸ����
	 */
	public void launchFrame() {
		
		// ���ô��ڴ�С
		setSize(Constant.WINDOW_WIDTH, Constant.WINDOW_HEIGHT);
		// ���ô���λ��
		setLocation(Constant.WINDOW_LOCATION_WIDTH, Constant.WINDOW_LOCATION_HEIGHT);
		// ʹ���ڿɼ�
		setVisible(true);
		// �޸ı���������
		setTitle("������");
		// ��ֹ�޸Ĵ��ڴ�С
		setResizable(false);
		
		// ʵʱˢ�´���
		new PaintThread().start();
		
		// ���X���Թرմ���
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}
	
	/** 
	 * ����ˢ���������������˸
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
