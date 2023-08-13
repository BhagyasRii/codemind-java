import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[101];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int l = sc.nextInt();
    int  m=ar[0];
    for(int i=0;i<n;i++)
    {
        if(ar[i]>m)
        {
            m=ar[i];
        }
    }
    for(int i=0;i<n;i++)
    {
        if(ar[i]+l>=m)
        {
            System.out.printf("True ");
        }
        else
        {
            System.out.printf("False ");
        }
    }
        
        
        
    }
}