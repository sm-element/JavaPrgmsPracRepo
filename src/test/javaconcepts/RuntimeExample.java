package test.javaconcepts;

public class RuntimeExample {

	public static void main(String args[]) {

		System.out.println("Inside RuntimeExample main method - from feature2 testing merge conflicts");
		Runtime rt = getRuntime();
		System.out.println("runtime::" + rt.toString());
	}

	public static Runtime getRuntime() {
		Runtime re = Runtime.getRuntime();
		return re;

	}
}
