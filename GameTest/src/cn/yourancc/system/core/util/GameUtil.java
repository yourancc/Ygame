package cn.yourancc.system.core.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * ��Ϸ�����е�ͼƬ���ع�����
 */
public class GameUtil {

	/**
	 * ͼƬ���ع����� 
	 * @param path  ͼƬ��·��
	 * @return  Image����
	 */
	public static Image getImage(String path) {
		URL url = GameUtil.class.getClassLoader().getResource(path);
		
		BufferedImage image = null;
		try {
			image = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return image;
	}
}
