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
			System.out.println("���������\n");
		}else{
			System.out.println("�����ظ�ע��\n");
		}
		
	}

	public void removeObserver(Observer obs) {
		// TODO Auto-generated method stub
		int i=observers.indexOf(obs);
		if(i>=0){
			observers.remove(i);
			System.out.println("�������Ƴ�\n");
		}
		System.out.println("���󲻴���\n");
		
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
