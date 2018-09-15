package cn.yourancc.view;

import java.io.FileInputStream;

import cn.yourancc.domain.TestObject;
import cn.yourancc.system.core.entity.Direction;
import cn.yourancc.system.core.view.BaseScene;

public class Client {
	
		public static void main(String args[]) {
			FileInputStream fis;
			byte[] buffer;
			
			BaseScene bs = new BaseScene();
			TestObject t = new TestObject();
			t.dir = Direction.right;
			t.speed = 1;
		}
}
 

