package CH02.designpatterns.strategy;

public class MallardDuck extends CH02.designpatterns.strategy.Duck {

	public MallardDuck() {

		quackBehavior = new CH02.designpatterns.strategy.Quack();
		flyBehavior = new CH02.designpatterns.strategy.FlyWithWings();

	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
