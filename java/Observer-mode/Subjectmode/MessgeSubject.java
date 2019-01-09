package Subjectmode;

import java.util.ArrayList;

import com.alibaba.fastjson.JSONArray;

import Observermode.Observer;

public class MessgeSubject  implements Subject{
	private ArrayList<Observer> observers=new ArrayList<Observer>();
	public JSONArray message;
	public void registerObserver(Observer obs) {
		// TODO Auto-generated method stub
		if(observers.indexOf(obs)<0){
			observers.add(obs);
			System.out.println("对象已添加\n");
		}else{
			System.out.println("对象重复注册\n");
		}
		
	}

	public void removeObserver(Observer obs) {
		// TODO Auto-generated method stub
		int i=observers.indexOf(obs);
		if(i>=0){
			observers.remove(i);
			System.out.println("对象已移除\n");
		}
		System.out.println("对象不存在\n");
		
	}

	public void notifyObserver( ) {
		// TODO Auto-generated method stub
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update(message);
		}
	}
	public void updateMessage(JSONArray message){
		this.message=message;
		notifyObserver();
	}

}
