package loginBehavior;

import com.alibaba.fastjson.JSONArray;

import behaviormode.HandleLogicBehavior;

public class CleanData implements HandleLogicBehavior{
	private void print(){
		System.out.println("CleanData\n");
	}
	public JSONArray handle(JSONArray data) {
		// TODO Auto-generated method stub
		print();
		return null;
	}

}
