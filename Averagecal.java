import java.util.Scanner;
class Averagecal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range number: ");
        int n = sc.nextInt();
        double a=0;
        for(int i=0;i<n;i++){
         System.out.print("Enter number: ");
         a += sc.nextDouble();   
        }
        System.out.print("calculated average is " + (a / n));
        sc.close();
    }  
    }

