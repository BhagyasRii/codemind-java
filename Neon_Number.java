import java.util.Scanner;
public class A{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int s = m*m;
    int c=0;
    while(s!=0){
        int r=s%10;
        c+=r;
        s=s/10;
    }
    if(c==m){
        System.out.println("Neon Number");
    }
    else{
        System.out.println("Not Neon Number");
    }
}
}