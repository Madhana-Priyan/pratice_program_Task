import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :");
        long num=sc.nextLong();
        int count =0;
        for(int i=1;i<=num;i++){
            if (num%i==0) {
                count++;
            }
        }
        if(count==2){
            System.out.println(num+" is Prime Number");
        }
        else{System.out.println(num+" is Not Prime Number");}
        
        sc.close();
    }

}
