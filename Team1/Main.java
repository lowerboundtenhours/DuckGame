import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	private static Map<String, Duck> ducks = new HashMap<>();
	
	public static void main(String[] args) {
		try {
			File input = new File(args[0]);
			BufferedReader reader = new BufferedReader(new FileReader(input)); 
			String line;
			
			while((line = reader.readLine()) != null) {
				String token[] = line.split(" ");
				
				if (token[0].equals("duck")) {
					ducks.put(token[1], createDuck(token[1]));
					setDuckFlyBehavior(ducks.get(token[1]), token[2]);
					setDuckQuackBehavior(ducks.get(token[1]), token[3]);
				} else if (token[0].equals("changeFly")) {
					setDuckFlyBehavior(ducks.get(token[1]), token[2]);
				} else if (token[0].equals("changeQuack")) {
					setDuckQuackBehavior(ducks.get(token[1]), token[2]);
				} else if (token[0].equals("swim")) {
					ducks.get(token[1]).swim();
				} else if (token[0].equals("fly")) {
					ducks.get(token[1]).performFly();
				} else if (token[0].equals("quack")) {
					ducks.get(token[1]).performQuack();
				}
			}
			reader.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	 static Duck createDuck(String type) {
		
		if (type.equals("MallardDuck"))
			return new MallardDuck();
		else if (type.equals("RedheadDuck"))
			return new RedheadDuck();
		else if (type.equals("RubberDuck"))
			return new RubberDuck();
		else
			return new DecoyDuck();
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
