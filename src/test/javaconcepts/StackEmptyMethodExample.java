package test.javaconcepts;

import java.util.Stack;  
public class StackEmptyMethodExample  
{  
public static void main(String[] args)   
{  
//creating an instance of Stack class  
Stack<Integer> stk= new Stack<>();  


// checking stack is empty or not  
boolean result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
// pushing elements into stack  
stk.push(78);  
stk.push(113);  
stk.push(90);  
stk.push(120);  
//prints elements of the stack  
System.out.println("Elements in Stack: " + stk);  

// peek

stk.peek();
System.out.println("Elements in Stack peek: " + stk); 
stk.pop();
stk.pop();
stk.pop();

System.out.println("Elements in Stack now: " + stk); 
result = stk.empty();  
System.out.println("Is the stack empty? " + result);  

for(Integer i:stk)
{
Integer popElement = stk.pop();


}
System.out.println("After popping: elements now:: " + stk); 

}  
}