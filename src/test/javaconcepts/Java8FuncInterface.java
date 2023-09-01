package test.javaconcepts;

interface Doable {
	default void doIt() {
		System.out.println("Do it now");
	}
}

@FunctionalInterface
interface Sayable extends Doable {
	void say(String msg); // abstract method
}

public class Java8FuncInterface implements Sayable {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Java8FuncInterface fie = new Java8FuncInterface();
		fie.say("Hello there");
		fie.doIt();
	}

}
