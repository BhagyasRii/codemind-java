import java.util.Scanner;
public class A{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a,b,x,d,e;
        a = sc.nextInt();
        b = sc.nextInt();
        x = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        double c = (a+b+x+d+e)/5.0;
        if(c>=90){
            System.out.println("Grade A");
        }
        else if(c>=80){
            System.out.println("Grade B");
        }
        else if(c>=70){
            System.out.println("Grade C");
        }
        else if(c>=60){
            System.out.println("Grade D");
        }
        else if(c>=40){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");
        }
    }
}