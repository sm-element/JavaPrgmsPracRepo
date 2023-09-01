package test.javaconcepts;

public class OverLoadingTest {

	    void prova(Object o){
	        System.out.println("object");
	    }

	    void prova(Integer i){
	    System.out.println("integer");
	    }

	    void prova(String s){
	        System.out.println("string");
	    }

	    void test(){
	        Object o = new String("  ");
	        this.prova(o); // Prints 'object'!!! Why?!?!?
	    }

	    public static void main(String[] args) {
	    	OverLoadingTest olt = new OverLoadingTest();
	        olt.test(); // Prints 'object'!!! Why?!?!?
	        
	        // argument  to invoke is deceided at  compile time and not at runtime
	        //General JVMs only use single dispatch: the runtime type is only considered for the receiver object; for the method's parameters, 
	        //the static type is considered
	    }
	}


