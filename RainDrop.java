import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%3==0){
            System.out.printf("Pling");
        }
        if(x%5==0){
            System.out.printf("Plang");
        }
        if(x%7==0){
            System.out.printf("Plong");
        }
        if(x%3!=0 && x%7!=0 && x%5!=0){
            System.out.println(x);
        }
        
        
    }
}