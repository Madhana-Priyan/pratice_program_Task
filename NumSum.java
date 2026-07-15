import java.util.Scanner;
public class NumSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr your strating number :");
        long st=sc.nextLong();
        System.out.println("Enetr your limit :");
        long end=sc.nextLong();
        long sum =0;
        for(long i=st;i<=end;i++){
            sum+=i;
        }
        System.out.println("From "+ st+" to "+end+" sum is "+sum);
        sc.close();      
    }
}
