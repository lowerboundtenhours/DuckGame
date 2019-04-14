public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void swim() {
        System.out.println("RedheadDuck is swimming");
    }
}