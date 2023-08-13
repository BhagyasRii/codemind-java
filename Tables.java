import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for(int i=1;i<=y;i+=2){
            System.out.println(x+" x "+i+" = "+x*i);
        }
    }
}