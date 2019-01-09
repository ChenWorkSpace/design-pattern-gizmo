package instance;

import origin.Component;

public class Mocha extends CondimentDecorator{
	private Float cost= (float) 1.3;
	private Component beverage;
	public Mocha(Component coffe) {
		// TODO Auto-generated constructor stub
		this.beverage= coffe;
	}
	
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+" Mocha";
	}


	public Object behavior() {
		// TODO Auto-generated method stub
		return cost+(Float)beverage.behavior();
	}

}
