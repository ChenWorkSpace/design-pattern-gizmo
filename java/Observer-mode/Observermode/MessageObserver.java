package Observermode;

import com.alibaba.fastjson.JSONArray;

public class MessageObserver implements Observer{

	public void update(JSONArray data) {
		// TODO Auto-generated method stub
		System.out.println("�����Ѹ��£�"+data.toJSONString()+"\n");
	}

}
