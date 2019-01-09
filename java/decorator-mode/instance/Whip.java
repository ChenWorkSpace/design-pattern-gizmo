package instance;

import origin.Component;

public class Whip extends CondimentDecorator {
	private Component beverage;
	private Float cost=(float) 2.3;
	public Whip(Component coffe) {
		// TODO Auto-generated constructor stub
		this.beverage=coffe;
	}
	
	
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+" Whip";
	}



	public Object behavior() {
		// TODO Auto-generated method stub
		return (Float)beverage.behavior()+cost;
	}

}
