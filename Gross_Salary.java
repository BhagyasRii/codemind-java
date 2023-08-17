import java.util.Scanner;
public class A{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        double da=0,hra=0;
        if(p<=10000 ){
            da = (80*p)/100.0;
            hra = (20*p)/100.0;
        }
        else if(p<=20000){
            da = (90*p)/100.0;
            hra = (25*p)/100.0;
        }
        else{
            da = (95*p)/100.0;
            hra = (30*p)/100.0;
        }
        double gross = p+da+hra;
        System.out.printf("%.2f",gross);
    }
}