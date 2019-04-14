public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new Silent();
        flyBehavior = new FlyNoWay();
    }

    public void swim() {
        System.out.println("DecoyDuck is swimming");
    }
}