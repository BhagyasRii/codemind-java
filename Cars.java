import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int x = sc.nextInt();
        if(n2<n1){
            System.out.println("-1");
        }
        else{
            int m = ((x+n1)/n2)+1;
            System.out.println(m);
        }
        
        
        
    }
}