import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	private static Duck[] ducks = {new Duck("MallardDuck"), 
								   new Duck("RedheadDuck"), 
								   new Duck("RubberDuck"), 
								   new Duck("DecoyDuck")};
	
	public static void main(String[] args) {
		try {
			File input = new File(args[0]);
			BufferedReader reader = new BufferedReader(new FileReader(input)); 
			String line;
			Duck duck;
			
			while((line = reader.readLine()) != null) {
				String token[] = line.split(" ");
				
				if (token[0].equals("duck")) {
					duck = ducks[getDuck(token[1])];
					setDuckFlyBehavior(duck, token[2]);
					setDuckQuackBehavior(duck, token[3]);
				} else if (token[0].equals("changeFly")) {
					duck = ducks[getDuck(token[1])];
					setDuckFlyBehavior(duck, token[2]);
				} else if (token[0].equals("changeQuack")) {
					duck = ducks[getDuck(token[1])];
					setDuckQuackBehavior(duck, token[2]);
				} else if (token[0].equals("swim")) {
					duck = ducks[getDuck(token[1])];
					duck.swim();
				} else if (token[0].equals("fly")) {
					duck = ducks[getDuck(token[1])];
					duck.performFly();
				} else if (token[0].equals("quack")) {
					duck = ducks[getDuck(token[1])];
					duck.performQuack();
				}
			}
			reader.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	 static int getDuck(String type) {
		
		if (type.equals("MallardDuck"))
			return 0;
		else if (type.equals("ReadheadDuck"))
			return 1;
		else if (type.equals("RubberDuck"))
			return 2;
		else
			return 3;
	}
	
	static void setDuckFlyBehavior(Duck duck, String behavior) {
		if (behavior.equals("CanFly"))
			duck.setFlyBehavior(new FlyWithWings());
		else if (behavior.equals("CannotFly"))
			duck.setFlyBehavior(new FlyNoWay());
	}

	static void setDuckQuackBehavior(Duck duck, String behavior) {
		if (behavior.equals("Quack"))
			duck.setQuackBehavior(new Quack());
		else if (behavior.equals("Squeak"))
			duck.setQuackBehavior(new Squeak());
		else if (behavior.equals("Silent"))
			duck.setQuackBehavior(new Silent());
	}
}
