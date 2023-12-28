package test.javaconcepts;

class leetcodesolution {
    public static String addStrings(String num1, String num2) {
    
        int a= Integer.parseInt(num1);
        int b= Integer.parseInt(num2);

        while( b!= 0 )
        {
            int carry = a & b;
            a = a ^ b;
            b= carry<<1;
        }

         return String.valueOf(a);
    }
     public static void main(String[] args)
    {
       System.out.println("Inside leetcodesolution class - main method - latest code - pull test);
        String s1= "11";
       String s2 = "123";
        System.out.println(addStrings(s1,s2));
    }
}
