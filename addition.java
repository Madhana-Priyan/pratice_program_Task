import java.util.Scanner;
class addition{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        double a = sc.nextDouble();
        System.out.println("Enter the Second Number : ");
        double b = sc.nextDouble();
        a += b;
        System.out.println("Addition of Two Number is " + a);
        sc.close();
    }
}