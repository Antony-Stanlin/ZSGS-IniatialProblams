import java.util.Arrays;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s[]=str.split(" ");
        str="";
        for(int i=s.length-1;i>=0;i--){
            if(i==0)
                str+=s[i];
            else
                str+=s[i]+" ";
        }
        System.out.println(str);
        sc.close();
    }
}
