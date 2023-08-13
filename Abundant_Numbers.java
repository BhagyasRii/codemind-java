import java.util.Scanner;
public class A{
    public static int factor(int x){
    int c=0;
    for(int i=1;i<x;i++){
        if(x%i==0){
            c+=i;
        }
    }
    return c;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(factor(x)>x){
        System.out.println("True");
    }
    else{
        System.out.println("False");
    }
    }
}