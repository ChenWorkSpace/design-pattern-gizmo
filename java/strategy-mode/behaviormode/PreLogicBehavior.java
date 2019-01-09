package behaviormode;

import java.util.HashMap;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public interface PreLogicBehavior {
	public JSONArray parseInfor(String data);
	public JSONArray parseInfor(JSONObject data);
	public JSONArray parseInfor(HashMap<String,Object> data);
}
