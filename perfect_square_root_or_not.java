import java.util.Scanner;
public class A{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int s = (int)Math.sqrt(x);
    if(s*s==x){
        System.out.println("True");
    }
    else{
        System.out.println("False");
    }
    
}
}