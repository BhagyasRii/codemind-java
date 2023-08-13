import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
    int s=0,t=0;
    while(x!=0){
        int r = x%10;
        if(r>t){
            t=r;
        }
        x=x/10;
    }
    System.out.println(t);
}
}