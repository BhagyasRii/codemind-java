import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1,c=a+b,d=0;
        for(int i=0;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            if(c==n){
                d=1;
            }
        }
        if(d==1) System.out.println("True");
        else System.out.println("False");
    }   
}