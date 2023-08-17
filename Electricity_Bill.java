import java.util.Scanner;
public class A{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String m = sc.nextLine();
        int unit = sc.nextInt();
        double charge = 0,total=0;
        if(unit<=199){
            charge = unit*1.20;
        }
        else if(unit>=200 && unit<400){
            charge = unit*1.50;
        }
        else if(unit>=400 && unit<600){
            charge = unit*1.80;
        }
        else if(unit>=600){
            charge = unit*2.00;
        }
        if(charge>400){
            total = charge + charge*0.15;
        }
        else{
            total = charge+100;
        }
        System.out.printf("%.2f",total);
    }
}