public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void swim() {
        System.out.println("MallardDuck is swimming");
    }
}