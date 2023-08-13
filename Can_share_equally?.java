import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if((n1%2==0 && n1!=0) || (n1==0 && n2%2==0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
        
        
    }
}