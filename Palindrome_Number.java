import java.util.Scanner;
public class A{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int l = sc.nextInt();
      for(int i=0;i<l;i++){
      int n  = sc.nextInt();
      if(n<0){
          System.out.println("False");
        
      }
      else{
          int s=0,t=n;
          while(n!=0){
              int r=n%10;
              s=s*10+r;
               n=n/10;
          }
          if(s==t)
          {
              System.out.println("True");
          }
          else{
              System.out.println("False");
          }
      }
    }
    }
}