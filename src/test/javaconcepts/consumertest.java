package test.javaconcepts;
import java.util.function.Consumer;

public class consumertest {

public static void main(String[] args)
{
	
		Consumer<String> consumerString=s->System.out.println(s);
		consumerString.accept("HelloWorld");
		}
		
	}

