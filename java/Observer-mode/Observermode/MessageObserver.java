package Observermode;

import com.alibaba.fastjson.JSONArray;

public class MessageObserver implements Observer{

	public void update(JSONArray data) {
		// TODO Auto-generated method stub
		System.out.println("数据已更新："+data.toJSONString()+"\n");
	}

}
