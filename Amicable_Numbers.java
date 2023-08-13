import java.util.Scanner;
public class A{
    public static int fact(int x){
        int c=0;
        for(int i=1;i<x;i++){
            if(x%i==0){
                c+=i;
            }
        }
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(fact(a)==b && fact(b)==a){
            System.out.println("Amicable");
        }
        else{
            System.out.println("Not Amicable");
        }
    }
}