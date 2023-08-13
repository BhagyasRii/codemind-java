import java.util.Scanner;
public class A{
    public static int dis(int x){
    int d =(int) Math.log10(x)+1;
    int c=0;
    while(x!=0){
        int r = x%10;
        c = c+(int)Math.pow(r,d--);
        x=x/10;
    }
    return c;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x==dis(x)){
        System.out.println("True");
    }
    else{
        System.out.println("False");
    }
    }
}
