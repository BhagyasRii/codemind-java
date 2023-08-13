import java.util.Scanner;
public class a{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s = sc.nextInt();
        int l = sc.nextInt();
        System.out.println(m*s*l*2*512);
    }
}