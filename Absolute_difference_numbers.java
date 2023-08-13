import java.util.Scanner;
public class A{
    public static int pal(int x){
    int s=0;
    while(x!=0){
        int r = x%10;
        s = s*10+r;
        x=x/10;
    }
    return s;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int fd  = n%((int)Math.pow(10,x));
        int m = pal(n);
        int ld = m%((int)Math.pow(10,x));
        int ldd = pal(ld);
        System.out.println(Math.abs(fd-ldd));
        //System.out.println(ldd);
        
    }
}