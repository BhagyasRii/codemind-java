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
    if(pal(x)==1){
        System.out.println("True");
    }
    else{
        System.out.println("False");
    }
}
}