import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  m = sc.next().charAt(0);
        if(m=='A' || m=='a' || m=='E' ||m=='e' ||m=='O' ||m=='o' ||m=='I' ||m=='i' ||m=='U' ||m=='u' ){
            System.out.println("Vowel");
    
        }
        else{
            System.out.println("Consonant");
        }
        
        
    }
}