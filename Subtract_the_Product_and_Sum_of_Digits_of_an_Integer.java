import java.util.Scanner;
public class A{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int sum = 0,pro = 1;
    while(x!=0){
        int r=x%10;
        sum+=r;
        pro*=r;
        x=x/10;
    }
    System.out.println(Math.abs(sum-pro));
}
}