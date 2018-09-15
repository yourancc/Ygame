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
			//ÅÐ¶ÏÊÇ·ñÎª¿Õ£¬¿Õ×´Ì¬ÒÆ³ý
			if(gameobject == null) 
				it.remove();
			else {
				//ÅÐ¶ÏÊÇ·ñ¼Ì³ÐÁË¿É»­½Ó¿Ú
				if(gameobject instanceof Paintable) {
					//ÅÐ¶ÏÊÇ·ñ¿ÉÊÓ×´Ì¬
					if(gameobject.isVisiable()) {
						((Paintable) gameobject).paint(g);
					}
					
				}
			}
				
		}
		
	}
}
