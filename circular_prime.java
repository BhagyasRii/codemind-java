import java.util.Scanner;
public class A{
public static int prime(int x){
    for(int i=2;i<x/2;i++){
        if(x%i==0){
            return -1;
        }
    }
    return 1;
}
public static int rev(int x){
    int s=0;
    while(x!=0){
        int r=x%10;
        s=s*10+r;
        x=x/10;
    }
    return s;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int rev = rev(x);
        if(prime(x)==1 && prime(rev)==1){
            System.out.println("circular prime");
        }
        else if(prime(x)==1 && prime(rev)==-1){
            System.out.println("prime but not a circular prime");
        }
        else if(prime(x)==-1 ){
            System.out.println("not prime");
        }
    }
}