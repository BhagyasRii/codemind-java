import java.util.Scanner;
public class A{
    public static int prime(int x){
        if(x==1){
            return -1;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                return -1;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int d=(int) Math.log10(n1)+1;
        int c=0;
        if(prime(n1)==1){
            while(n1!=0){
                int r=n1%10;
                if(prime(r)==1){
                    c++;
                }
                n1=n1/10;
            }
            if(c==d){
                System.out.println("Mega Prime");
            }
            else{
                System.out.println("Not Mega Prime");
            }
        }
        else{
            System.out.println("Not Mega Prime");
        }
    }
}
