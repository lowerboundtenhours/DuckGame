public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    public void swim() {
        System.out.println("RubberDuck is swimming");
    }
}