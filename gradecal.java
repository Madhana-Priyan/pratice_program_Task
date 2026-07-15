import java.util.*;;
public class gradecal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your mark :");
        float mark=sc.nextFloat();
        if(mark > 90){
            System.out.println("Your Grade is 'O'");
        }
        else if(mark>80){
            System.out.println("Your Grade is 'A+'");
        }
        else if(mark>70){
            System.out.println("Your Grade is 'A'");
        }
        else if(mark>60){
            System.out.println("Your Grade is 'B+'");
        }
        else if(mark>50){
            System.out.println("Your Grade is 'B'");
        }
        else if(mark==50){
            System.out.println("Your Grade is 'C'");
        }
        else{
            System.out.println("Your Failed in This Subject😭🤧😣");
        }

    sc.close();
    }
}
