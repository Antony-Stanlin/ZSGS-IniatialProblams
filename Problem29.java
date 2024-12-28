import java.util.Scanner;
class Problem29{
    public static void main(String[]args){
        new Problem29().initial();
    }
    public void initial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int range = sc.nextInt();
        printPattern(range);
        sc.close();
    }
    private void printPattern(int range){
        printBorder(range);        
        for(int i=0;i<range/2;i++){
            System.out.println("*");
        }
        printBorder(range);
    }
    private void printBorder(int range){
        for(int i=0;i<range;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}