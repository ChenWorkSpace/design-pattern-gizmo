package loginBehavior;

import com.alibaba.fastjson.JSON;

public class test {
	public static void main(String[] args) {
		handle han=new handle();
		han.process();
		han.setPreBehavior(new HandleInform());
		han.setHandleBehavior(new CleanData());
		han.process();
	}
}
