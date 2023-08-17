import java.util.Scanner;
public class A{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c=='V'){
            System.out.println("Violet");
        }
        else if(c=='I'){
            System.out.println("Indigo");
        }
        else if(c=='B'){
            System.out.println("Blue");
        }
        else if(c=='G'){
            System.out.println("Green");
        }
        else if(c=='Y'){
            System.out.println("Yellow");
        }
        else if(c=='O'){
            System.out.println("Orange");
        }
        else if(c=='R'){
            System.out.println("Red");
        }
        else{
            System.out.println("-1");
        }
    }
}