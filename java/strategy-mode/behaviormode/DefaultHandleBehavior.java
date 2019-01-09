package behaviormode;

import com.alibaba.fastjson.JSONArray;

public class DefaultHandleBehavior implements HandleLogicBehavior{
	
	private void print(){
		System.out.println("DefaultHandleBehavior\n");
	}
	public JSONArray handle(JSONArray data) {
		// TODO Auto-generated method stub
		print();
		return null;
	}

}
