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
    int sqnum = n*n;
    int revnum = pal(n);
    int revsqnum = revnum*revnum;
    int sqrevnum = pal(revsqnum);
    if(sqnum == sqrevnum){
        System.out.println("True");
    }
    else{
        System.out.println("False");
    }
}
}