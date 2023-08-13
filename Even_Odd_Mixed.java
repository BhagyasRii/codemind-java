import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int e=0,o=0;
        while(m!=0){
            int r=m%10;
            if(r%2==0){
                e++;
            }
            else{
                o++;
            }
            m=m/10;
        }
        if(e!=0 && o!=0){
            System.out.println("Mixed");
        }
        else if(e!=0 && o==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}