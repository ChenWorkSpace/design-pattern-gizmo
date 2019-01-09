import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import Observermode.MessageObserver;
import Subjectmode.MessgeSubject;

public class test {
	public static void main(String[] args) {
		JSONArray array=new JSONArray();
		JSONObject object=(JSONObject) new JSONObject();
		object.put("CHINA", "number one£¡");
		array.add(object);
		MessageObserver messageObserver=new MessageObserver();
		MessgeSubject subject=new MessgeSubject();
		subject.registerObserver(messageObserver);
		subject.updateMessage(array);
	}

}
