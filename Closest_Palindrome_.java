import java.util.Scanner;
public class A{
    public static int pal(int x){
    int s=0,t=x;
    while(x!=0){
        int r = x%10;
        s = s*10+r;
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
    int ap=0,bp=0;
    for(int i=x+1;i>x;i++){
        if(pal(i)==1){
            ap = i;
            break;
        }
    }
    for(int i=x-1;i>0;i--){
        if(pal(i)==1){
            bp = i;
            break;
        }
    }
    int ad = Math.abs(x-ap);
    int bd = Math.abs(x-bp);
    if(ad<bd){
        System.out.println(ap);
    }
    else if(ad == bd){
        System.out.printf("%d %d",bp,ap);
    }
    else{
        System.out.println(bp);
    }
    
    }
}