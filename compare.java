import java.util.Scanner;
public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        double a = sc.nextDouble();
        System.out.println("Enter the Second Number : ");
        double b = sc.nextDouble();
        if(a>b){
            System.out.println(a + " is Greater than "+b);
        }
        else{
            System.out.println(b + " is Greater than "+a);
        }
        sc.close();
        }
}
