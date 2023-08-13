import java.util.Scanner;
public class A{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    for(int k=0;k<m;k++){
        int x = sc.nextInt();
        int s=1;
        for(int i=1;i<=x;i++){
            s=s*i;
        }
        System.out.println(s);
    
    }   
}
    
}