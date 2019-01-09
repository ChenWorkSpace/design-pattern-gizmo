package instance;

import origin.Component;

public class test {
	public static void main(String[] args) {
		Component coffe=new coffe();
		coffe=new Mocha(coffe);
		coffe=new Whip(coffe);
		System.out.println(coffe.getDescription()+" $"+coffe.behavior());
	}
}
