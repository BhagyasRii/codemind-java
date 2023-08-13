import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Hurl = sc.nextInt();
        int Spin = sc.nextInt();
        int Speed = sc.nextInt();
        if(Hurl>50 && Spin>60 && Speed>100){
            System.out.println("10");
        }
        else if(Hurl>50 && Spin>60 ){
            System.out.println("9");
        }
        else if(Spin>60 && Speed>100){
            System.out.println("8");
        }
        else if(Hurl>50  && Speed>100){
            System.out.println("7");
        }
        else if(Hurl>50 || Spin>60 || Speed>100){
            System.out.println("6");
        }
        else{
            System.out.println("5");
        }
        
    }
}