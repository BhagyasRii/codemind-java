import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,s=1;
        for(int i=2;i<n;i++){
            if(n%i==0){
                s=s*i;
                a=1;
                System.out.printf("%d ",i);
            }
        }
        if(a!=1){
            System.out.println("-1");
        }
    }   
}