import java.util.Scanner;
public class A{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        if(p%2!=0){
            System.out.println("weird");
        }
        else{
            if(p>=2 && p<=5){
                System.out.println("not weird");
            }
            else if(p>=6 && p<=20){
                System.out.println("weird");
            }
            else{
                System.out.println("not weird");
            }
                
        }
    }
}