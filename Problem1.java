import java.util.Scanner;

public class Problem1{
    public static void main(String a[]){
        Scanner ob=new Scanner(System.in);
        char s=ob.next().charAt(0);
        System.out.print(completeAlpha(s));
    }
    
    public static String completeAlpha(char c){
        String string="";
        if(c>='a' && c<='z')c-=32;
        for(char i=c;i<='Z';i++)
         string+=i;
        return string;
    }
    
}
