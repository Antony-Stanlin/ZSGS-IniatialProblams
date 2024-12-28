public class Problem22 {
    public static void main(String[] args) {
        int n=9;
        for(int j=0;j<n;j++){
        for(int i=n;i>0;i--){
            if(i<=n-j)
             System.out.print("* ");
            else
             System.out.print(" ");
            //System.out.print("");
        }
        System.out.println();}
    }
}
