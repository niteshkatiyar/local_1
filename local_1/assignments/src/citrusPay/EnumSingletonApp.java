package citrusPay;

/*
 * How do we create Singletons using Enum? What is the advantage? Is there any scenario where
 * you would not like to use Enum based Singletons?
 *
 */

/*
 * Advantage of EnumSingleton lies in the ease of creating the Singleton and it is thread safe	
 * so even in multi-threaded environment it guarantees the same single instance.
 * auto serialization is added advantage in enum singletons.
 * 
 * problem with enum singleton is that we need another class to call the methods of singleton.
 * so in a scenario where client code is calling this singleton, which we are not at liberty to change, 
 * using this is a bad idea if we have to upgrade our code.
 * 
 * and as general problem with enum is that it is a special class that extends java.lang.Enum, 
 * so we cannot extend it anymore.
 * 
 */

public class EnumSingletonApp {

	public static void main(String[] args) {
		EnumSingleton.INSTANCE.displayMessage();
	}
}
