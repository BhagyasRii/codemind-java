import java.util.Scanner;
public class A{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a==b && b==c && c==b){
            System.out.println("Equilateral triangle");
        }
        else if(a==b || a==c || b==c ){
            System.out.println("Isosceles triangle");
        }
        else{
            System.out.println("Scalene triangle");
        }
    }
}