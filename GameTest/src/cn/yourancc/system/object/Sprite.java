package cn.yourancc.system.object;

import java.awt.Graphics;
import java.awt.Image;


import cn.yourancc.system.component.behavior.Paintable;
import cn.yourancc.system.core.entity.Direction;
import cn.yourancc.system.core.entity.Point;
import cn.yourancc.system.core.util.GameUtil;
import cn.yourancc.system.core.util.PointConverter;


public class Sprite extends GameObject implements Paintable {

	Image img = null;
	public int width=50;
	public int height=50;
	private int true_x;
	private int true_y;
	public Direction dir = Direction.stop;
	public int speed;
	public Sprite(String path) {
		super();
		this.img = GameUtil.getImage(path);
		Point p = PointConverter.getRealPoint(x, y);
		true_x = p.getX();
		true_y = p.getY();
	}

	public Sprite(String path,int view_x,int view_y) {
		super();
		this.img = GameUtil.getImage(path);
		this.x = view_x;
		this.y = view_y;
		Point p = PointConverter.getRealPoint(x, y);
		true_x = p.getX();
		true_y = p.getY();
	}

	public Sprite(String path,int view_x,int view_y, int width, int height, Direction dir, int speed) {
		super();
		this.img = GameUtil.getImage(path);
		this.width = width;
		this.height = height;
		this.dir = dir;
		this.speed = speed;
		this.x = view_x;
		this.y = view_y;
		Point p = PointConverter.getRealPoint(x, y);
		true_x = p.getX();
		true_y = p.getY();
	}

	@Override
	public void paint(Graphics g) {
		
		switch(dir) {
		case left:
			true_x -= speed;
			break;
		case up:
			true_y -= speed;
			break;
		case right:
			true_x += speed;
			break;
		case down:
			true_y += speed;
			break;
		case stop:
			break;
		}
		Point p = PointConverter.getViewPoint(true_x, true_y);
		x = p.getX();
		y = p.getY();
		
		g.drawImage(img, true_x, true_y, width, height,null, null);
	}

}
