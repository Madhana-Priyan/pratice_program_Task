import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr your Age :");
        int Age = sc.nextInt();
        if (Age>17) {
            System.out.println("Your Eligible for Vote");   
        }
        else{
            System.out.println("Your Not Eligible for Vote");
        }
        sc.close();
    }
}
