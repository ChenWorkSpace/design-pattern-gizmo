package behaviormode;

import java.util.HashMap;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class DefaultPreBehavior implements PreLogicBehavior{
	private void print(){
		System.out.println("DefaultPreBehavior\n");
	}

	public JSONArray parseInfor(String data) {
		// TODO Auto-generated method stub
		print();
		return null;
	}

	public JSONArray parseInfor(JSONObject data) {
		// TODO Auto-generated method stub
		print();
		return null;
	}

	public JSONArray parseInfor(HashMap<String, Object> data) {
		// TODO Auto-generated method stub
		print();
		return null;
	}

}
