import java.util.Scanner;
public class A{
    public static int prime(int x){
        int c=0;
        if(x==1){
            return -1;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                return -1;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        if(prime(n1)==1)
        System.out.println("prime");
        else System.out.println("not a prime");
    }
}