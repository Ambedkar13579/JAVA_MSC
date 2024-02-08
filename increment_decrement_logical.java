public class increment_decrement_logical {
   public static void main(String[] args){
    int num1=68;
    int num2=15;
    // Increment and Decrement
    num1++;
    num2--;
    System.out.println("Incremented num1 : "+num1);
    System.out.println("Decremented num2 : "+num2);
    // Logical Operator
    System.out.println("Is num1 greater than num2 ? "+(num1>num2));
    System.out.println("Is num1 less than num2 ? "+(num1<num2));
    System.out.println("Is num1 equal to num2 ? "+(num1=num2));
    // Logical Operator
    boolean a= true;
    boolean b= false;

    System.out.println("Logical AND Opeartor : "+(a&&b));
    System.out.println("Logical OR Opeartor : "+(a||b));
    System.out.println("Logical NOT Opeartor : "+(!a));

    //Bitwise Operators
    System.out.println("Bitwise AND Opeartor : "+(num1&num2));
    System.out.println("Bitwise OR Opeartor : "+(num1|num2));
    System.out.println("Bitwise XOR Opeartor : "+(num1^num2));
    System.out.println("Bitwise COMPLEMENT Opeartor : "+(~num1));
    System.out.println("Bitwise LEFT SHIFT (num1<<2) : "+(num1<<2));
    System.out.println("Bitwise RIGHT SHIFT (num1>>2) : "+(num1>>2));
   } 
}
