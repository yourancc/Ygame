package cn.yourancc.system.core.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * 游戏开发中的图片加载工具类
 */
public class GameUtil {

	/**
	 * 图片加载工具类 
	 * @param path  图片的路径
	 * @return  Image对象
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
