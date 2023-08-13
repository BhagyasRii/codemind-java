import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count=2,a=0,b=1,c;
        System.out.printf("%d %d ",a,b);
        while(count!=x){
            c=a+b;
            a=b;
            b=c;
            System.out.printf("%d ",c);
            count++;
        }
        
        
    }
}