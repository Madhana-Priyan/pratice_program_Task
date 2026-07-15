import java.util.Scanner;
public class PrintNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Limit of the Number Print :");
        int limit=sc.nextInt();
        for(int i=0;i<=limit;i++){
            System.out.print(i+" ");
        }
        sc.close();
    }

}
