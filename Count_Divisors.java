import java.util.Scanner;
public class A{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int r = sc.nextInt();
    int k = sc.nextInt();
    int c=0;
    for(int i=m;i<=r;i++){
        if(i%k==0){
            c++;
        }
    }
    System.out.println(c);
}
}