package cn.yourancc.system.core.util;

import cn.yourancc.system.core.entity.Point;

public class PointConverter {

	
	public static Point getRealPoint(int x,int y) {
		Point p = new Point();  
		p.setX(Constant.OPERATE_WIDTH_X + x * Constant.BASE_BLOCK);;
		p.setY(Constant.OPERATE_WIDTH_Y+y*Constant.BASE_BLOCK);
		return p;
		
	}
	
	public static Point getViewPoint(int x,int y) {
		Point p = new Point();  
		p.setX((x-Constant.OPERATE_WIDTH_X)/Constant.BASE_BLOCK);//   
		p.setY((y-Constant.OPERATE_WIDTH_Y)/Constant.BASE_BLOCK);// 
		return p;
		
	}
}
