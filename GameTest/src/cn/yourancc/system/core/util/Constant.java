package cn.yourancc.system.core.util;

import java.util.Map;

import cn.yourancc.system.object.GameObject;

/**
 * ������
 */
public class Constant {

	//�������ڿ��
	public static final int OPERATE_WIDTH = 550;
	//������������
	public static final int OPERATE_WIDTH_X = 30;
	public static final int OPERATE_WIDTH_Y= 80;
	// ��Ϸ���ڳ��Ϳ�
	public static final int WINDOW_WIDTH = 720;
	public static final int WINDOW_HEIGHT = 600;
	//��Ϸ���������λ��С
	public static final int BASE_BLOCK = 50;
	
	public static Map<String,GameObject> gameObjects = null;
	
	
	
	
	
	
	
	
	
	
	// ��Ϸ���ڳ��Ϳ�
	public static final int GAMEOVER_WIDTH = 230;
	public static final int GAMEOVER_HEIGHT = 110;
	
	// ��Ϸ����λ�õĳ��͸�
	public static final int WINDOW_LOCATION_WIDTH = 500;
	public static final int WINDOW_LOCATION_HEIGHT = 20;
	
	public static String[] direction = {"up","down","left","right","stop"};
	
	// ̹�˵ĳ��͸�
	public static final int TANK_WIDTH = 47;
	public static final int TANK_HEIGHT = 47;
	
	// �ط�̹��2 �ĳ��͸�
	public static final int TANK2_WIDTH = 47;
	public static final int TANK2_HEIGHT = 47;
	
	// �ӵ��ĳ��͸�
	public static final int BULLET_WIDTH = 4;
	public static final int BULLET_HEIGHT = 12;
	
	// �ӵ��ٶ�
	public static final int BULLET_SPEED = 7;
	
	// ̹���ٶ�
	public static final int TANK_SPEED = 4;
	
	// ���̹���ٶ�
	public static final int MyTANK_SPEED = 3;
	
	//ש��ĳ��Ⱥ͸߶�
	public static final int WALL_HEIGHT = 25;
	
	//�з�̹��������������̹�˵�ʱ����
	public static final int WAIT_TIME = 30;
}
