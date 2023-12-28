package test.javaconcepts;

public class RuntimeExample {

	public static void main(String args[]) {

		System.out.println("Inside RuntimeExample main method - from feature2 testing merge conflicts");
		System.out.println("Inside RuntimeExample main method - from feature2 - committing and pushing changes to feature branch");
		System.out.println("Inside RuntimeExample main method - from feature2 testing trying to create a conflict case");
		Runtime rt = getRuntime();
		System.out.println("runtime::" + rt.toString());
	}

	public static Runtime getRuntime() {
		Runtime re = Runtime.getRuntime();
		return re;

	}
}
