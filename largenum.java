import java.util.Scanner;

public class largenum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        double a = sc.nextDouble();
        System.out.println("Enter the Second Number : ");
        double b = sc.nextDouble();
        System.out.println("Enter the First Number : ");
        double c = sc.nextDouble();
        if(a>b && a>c){
            System.out.println(a +" is Larger Number");
        }
        else if(b>c){
            System.out.println(b +" is Larger Number");
        }
        else{
            System.out.println(c+" is Larger Number");
        }
        sc.close();
    }
}
