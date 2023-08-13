import java.util.Scanner;
public class a{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = m*(m-1)/2;
        System.out.println(n);
    }
}