package cn.yourancc.system.core.view;

import java.awt.Color;
import java.awt.Graphics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import cn.yourancc.system.component.behavior.Paintable;
import cn.yourancc.system.core.controller.KeyMonitor;
import cn.yourancc.system.core.util.Constant;
import cn.yourancc.system.core.util.GameFrame;
import cn.yourancc.system.object.GameObject;



public class BaseScene extends GameFrame {
	private Map<String,GameObject> gameObjects = new HashMap<>();

	

	public BaseScene() {
		super();
		this.launchFrame();
		Constant.gameObjects = gameObjects;
		addKeyListener(new KeyMonitor(gameObjects));
	}
	


	public void paint(Graphics g) {
		g.clearRect(0, 0, Constant.WINDOW_WIDTH, Constant.WINDOW_HEIGHT);
		Iterator<String> it = gameObjects.keySet().iterator();
		while(it.hasNext()) {
			String Objectkey =it.next();
			GameObject gameobject = gameObjects.get(Objectkey);
			//�ж��Ƿ�Ϊ�գ���״̬�Ƴ�
			if(gameobject == null) 
				it.remove();
			else {
				//�ж��Ƿ�̳��˿ɻ��ӿ�
				if(gameobject instanceof Paintable) {
					//�ж��Ƿ����״̬
					if(gameobject.isVisiable()) {
						((Paintable) gameobject).paint(g);
					}
					
				}
			}
				
		}
		
	}
}
