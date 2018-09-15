package cn.yourancc.system.core.util;

import java.util.Map;

import cn.yourancc.system.object.GameObject;

/**
 * 常量类
 */
public class Constant {

	//操作窗口宽度
	public static final int OPERATE_WIDTH = 550;
	//操作窗口坐标
	public static final int OPERATE_WIDTH_X = 30;
	public static final int OPERATE_WIDTH_Y= 80;
	// 游戏窗口长和宽
	public static final int WINDOW_WIDTH = 720;
	public static final int WINDOW_HEIGHT = 600;
	//游戏世界基本单位大小
	public static final int BASE_BLOCK = 50;
	
	public static Map<String,GameObject> gameObjects = null;
	
	
	
	
	
	
	
	
	
	
	// 游戏窗口长和宽
	public static final int GAMEOVER_WIDTH = 230;
	public static final int GAMEOVER_HEIGHT = 110;
	
	// 游戏窗口位置的长和高
	public static final int WINDOW_LOCATION_WIDTH = 500;
	public static final int WINDOW_LOCATION_HEIGHT = 20;
	
	public static String[] direction = {"up","down","left","right","stop"};
	
	// 坦克的长和高
	public static final int TANK_WIDTH = 47;
	public static final int TANK_HEIGHT = 47;
	
	// 地方坦克2 的长和高
	public static final int TANK2_WIDTH = 47;
	public static final int TANK2_HEIGHT = 47;
	
	// 子弹的长和高
	public static final int BULLET_WIDTH = 4;
	public static final int BULLET_HEIGHT = 12;
	
	// 子弹速度
	public static final int BULLET_SPEED = 7;
	
	// 坦克速度
	public static final int TANK_SPEED = 4;
	
	// 玩家坦克速度
	public static final int MyTANK_SPEED = 3;
	
	//砖块的长度和高度
	public static final int WALL_HEIGHT = 25;
	
	//敌方坦克死亡后生成新坦克的时间间隔
	public static final int WAIT_TIME = 30;
}
