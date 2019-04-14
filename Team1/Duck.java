public class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	private String type;
	
	public Duck(String type) {
		this.type = type;
	}
	
	public void swim() {
		System.out.println(type + " is swimming");
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
