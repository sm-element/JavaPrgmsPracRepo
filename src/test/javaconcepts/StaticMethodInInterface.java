package test.javaconcepts;

interface vehicle{
	static void lights()
	{
		System.out.println("Test");
	}
}

public class StaticMethodInInterface implements vehicle {
	
public static void main(String args[]) {
	vehicle.lights();
}

}
