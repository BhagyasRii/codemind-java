import java.util.Scanner;
public class Some{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double f = 32+(c*(9/5.0));
        
        System.out.printf("%.2f",f);
        
    }
    }