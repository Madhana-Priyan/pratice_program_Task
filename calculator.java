import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First values");
        double a=sc.nextDouble();
        System.out.println("Enter the Second values");
        double b=sc.nextDouble();
        System.out.println("Enter the math Operation(+,-,*,/,%):");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println("Addition of numbers:"+(a+b));
                break;
            case '-':
                System.out.println("Subtraction of numbers:"+(a-b));
                break;
            case '*':
                System.out.println("Multiplication of numbers:"+(a*b));
                break;
            case '/':
                if(b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Sorry,we Can't divide by zero");
                break;
            case '%':
                if(b!=0)
                    System.out.println("Modulous of numbers:"+(a % b));
                
                else
                    System.out.println("Sorry,We Can't modulus by zero");
                break;
            default:
                System.out.println("Please use correct operator !!");
    }
sc.close();
}
}