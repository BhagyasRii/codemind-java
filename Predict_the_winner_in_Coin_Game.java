import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x%2==0 || y%2==0){
            System.out.println("Player 1");
        }
        else{
            System.out.println("Player 2");
        }
    }
}