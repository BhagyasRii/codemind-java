import java.util.Scanner;
public class A{
    public static int prime(int n){
    int s=0;
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return -1;
        }
    }
    return 1;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int ap=0,bp=0;
    for(int i=x+1;i>x;i++){
        if(prime(i)==1){
            ap = i;
            break;
        }
    }
    for(int i=x-1;i>0;i--){
        if(prime(i)==1){
            bp = i;
            break;
        }
    }
    int ad = Math.abs(x-ap);
    int bd = Math.abs(x-bp);
    if(prime(x)==1){
        System.out.println("0");
    }
    else if(ad<bd){
        System.out.println(ad);
    }
    else{
        System.out.println(bd);
    }
    
    }
}