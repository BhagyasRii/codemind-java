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
        int sol=0;
        for(int i=x+1;i>x;i++){
            if(prime(i)==1 && pal(i)==1 ){
                sol = i;
                break;
            }
        }
        System.out.println(sol);
        
        
    }
}