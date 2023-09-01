package test.javaconcepts;


interface Sayable1{  
    void say();  
}  


public class MethodReferenceExample {  
    public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
    public static void main(String[] args) {  
    	MethodReferenceExample methodReference = new MethodReferenceExample(); // Creating object  
        // Referring non-static method using reference  
            Sayable1 sayable = methodReference::saySomething;  
        // Calling interface method  
            sayable.say();  
            // Referring non-static method using anonymous object  
            Sayable1 sayable2 = new MethodReferenceExample()::saySomething; // You can use anonymous object also  
            // Calling interface method  
            sayable2.say();  
    }  
}  