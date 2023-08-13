import java.util.Scanner;
public class A{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int m = sc.nextInt();
    int s = (int)Math.pow(x,y)%m;
        System.out.println(s);
}
}