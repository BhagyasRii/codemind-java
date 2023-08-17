import java.util.Scanner;
public class A{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        
        if(c>='A' && c<='Z'){
            System.out.println("uppercase alphabet");
        }
        else if(c>='a' && c<='z'){
            System.out.println("lowercase alphabet");
        }
        else
        System.out.println("not an alphabet");
    }
}