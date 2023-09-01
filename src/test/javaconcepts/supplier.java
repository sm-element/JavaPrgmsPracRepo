package test.javaconcepts;
import java.util.function.Supplier;

public class supplier {


		
	public static void main(String[] args) {
	Supplier<String> supplier= ()-> "HelloLearners";
	System.out.println(supplier.get());
	}
	}

