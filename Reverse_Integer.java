import java.util.Scanner;
public class A{
    public static int rev(int x){
    int s=0,t=x;
    while(x!=0){
        int r = x%10;
        s = s*10+r;
        x=x/10;
    }
    return s;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
    int s=0,t=0;
    System.out.println(rev(x));
}
}