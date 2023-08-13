import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = (int)Math.log10(n)+1;
        int sq = n*n;
        int last = sq%(int)(Math.pow(10,d));
        if(n==last){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not an Automorphic Number");
        }
        
        
    }
}