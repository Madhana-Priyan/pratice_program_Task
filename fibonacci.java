import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Limit :");
        long Limit=sc.nextLong();
        long end=1;
        long st=0;
        for(long i=0;i<=Limit;i++){
            System.out.print(st+" ");
            long temp = st+end;
            st=end;
            end=temp;
        }
        sc.close();
    }
}
