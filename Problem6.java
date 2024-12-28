import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value:");
        int a = sc.nextInt();
        System.out.println("Enter the second value:");
        int b = sc.nextInt();
        System.out.println(++a-b--);
        System.out.println(a%b++);
        System.out.println(a*=b+5);
        int x=69>>>2;
        System.out.println(x);
        sc.close();
    }
}