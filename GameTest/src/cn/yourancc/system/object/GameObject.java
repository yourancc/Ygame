package cn.yourancc.system.object;

import java.util.UUID;

import cn.yourancc.system.core.util.Constant;

public class GameObject {

	public int x=0;
	public int y=0;
	
	private String objectId = UUID.randomUUID().toString();
	
	private boolean visiable = true;
	
	public boolean isVisiable() {
		return visiable;
	}
	public void setVisiable(boolean b) {
		visiable = b;
	}
	
	public String getId() {
		return objectId;
	}
	
	public GameObject() {
		super();
		Constant.gameObjects.put(objectId, this);
	}
	public void destroy() {
		Constant.gameObjects.put(objectId, null);
	}
}
