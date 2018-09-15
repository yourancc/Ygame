package cn.yourancc.domain;

import java.awt.Image;
import java.awt.event.KeyEvent;

import cn.yourancc.system.component.behavior.Controllable;
import cn.yourancc.system.core.entity.Direction;
import cn.yourancc.system.object.Sprite;

public class TestObject extends Sprite implements Controllable{

	public TestObject() {
		super("img/player.png", 1, 2, 50, 50, Direction.stop, 0);
	}

	@Override
	public void getKeyDown(KeyEvent e) {
		switch(e.getKeyCode()) {
		case 37:
			dir = Direction.left;
			speed = 5;
			break;
		case 38:
			dir = Direction.up;
			speed = 5;
			break;
		case 39:

			dir = Direction.right;
			speed = 5;
			break;
		case 40:
			dir = Direction.down;
			speed = 5;
			break;
		default:
			dir = Direction.stop;
			speed = 0;
		}
		System.out.println("x:" + x + "   Y:" + y);
	}

	@Override
	public void getKeyUp(KeyEvent e) {
		switch(e.getKeyCode()) {
		case 37:
		case 38:
		case 39:
		case 40:
			dir = dir.stop;
			speed = 5;
		}
	}



}
