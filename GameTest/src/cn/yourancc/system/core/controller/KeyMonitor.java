package cn.yourancc.system.core.controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Map;

import cn.yourancc.system.component.behavior.Controllable;
import cn.yourancc.system.object.GameObject;



public class KeyMonitor extends KeyAdapter {

	private Map<String,GameObject> gameobjects = null;
	public KeyMonitor(Map<String,GameObject> gameobjects) {
		this.gameobjects = gameobjects;

	}

	// 按下键盘的按键
	@Override
	public void keyPressed(KeyEvent e) {
		Iterator<String> it = gameobjects.keySet().iterator();
		while(it.hasNext()) {
			GameObject gameobject = gameobjects.get(it.next());
			if(gameobject instanceof Controllable) {
				((Controllable) gameobject).getKeyDown(e);;
			}
		}
	}

	// 释放键盘的按键
	@Override
	public void keyReleased(KeyEvent e) {
		Iterator<String> it = gameobjects.keySet().iterator();
		while(it.hasNext()) {
			GameObject gameobject = gameobjects.get(it.next());
			if(gameobject instanceof Controllable) {
				((Controllable) gameobject).getKeyUp(e);;
			}
		}
	}
}