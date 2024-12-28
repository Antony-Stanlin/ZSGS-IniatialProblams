import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
    static long sum(int n){
        long sum=1,result=0;
        for(int i=1;i<=n;i++){
            if(i==n) System.out.println(sum);
            else System.out.print(sum+"+");
            result+=sum;
            sum=sum*10+1;
            
        }
        return result;
    }
}
