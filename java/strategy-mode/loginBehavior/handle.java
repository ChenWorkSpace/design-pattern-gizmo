package loginBehavior;

import behaviormode.DefaultHandleBehavior;
import behaviormode.DefaultPreBehavior;
import behaviormode.HandleLogicBehavior;
import behaviormode.PreLogicBehavior;

public class handle {
	private PreLogicBehavior preBehavior;
	private HandleLogicBehavior handleBehavior;
	public handle() {
		// TODO Auto-generated constructor stub
		this.preBehavior=new DefaultPreBehavior();
		this.handleBehavior=new DefaultHandleBehavior();
	}
	public void  process(){
		preBehavior.parseInfor("");
		handleBehavior.handle(null);
	}
	public PreLogicBehavior getPreBehavior() {
		return preBehavior;
	}
	public void setPreBehavior(PreLogicBehavior preBehavior) {
		this.preBehavior = preBehavior;
	}
	public HandleLogicBehavior getHandleBehavior() {
		return handleBehavior;
	}
	public void setHandleBehavior(HandleLogicBehavior handleBehavior) {
		this.handleBehavior = handleBehavior;
	}
	
}
