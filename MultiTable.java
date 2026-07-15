import java.util.Scanner;
class MultiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting table: ");
        int start = sc.nextInt();
        System.out.print("Enter ending table: ");
        int end = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            for (int j = start; j <= end; j++) {
                System.out.printf("%d x %2d = %-3d\t",
                        j, i, (j * i)); }
            System.out.println(); }
        sc.close();}
} 
    

