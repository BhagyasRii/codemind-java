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
public static int pal(int x){
    int s=0,t=x;
    while(x!=0){
        int r=x%10;
        s=s*10+r;
        x=x/10;
    }
    if(t==s){
        return 1;
    }
    return -1;
}
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