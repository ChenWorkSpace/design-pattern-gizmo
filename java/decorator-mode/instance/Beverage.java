package instance;

import mode.ConcreteComponent;

public abstract  class Beverage extends ConcreteComponent {
	public String description ="Unknown Beverage";

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	

}
