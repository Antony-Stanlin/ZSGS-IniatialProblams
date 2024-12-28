public class Problem21 {
    public static void main(String[] args) {
        int n=11;
        for(int j=0;j<n;j++){
        for(int i=1;i<n+1;i++){
            System.out.print(" ");
            if(i>=n-j)
             System.out.print(i);
            else
             System.out.print(" ");
            //System.out.print("");
        }
        for(int i=n-1;i>0;i--){
            if(i>=n-j)
             System.out.print(" "+i);
            else
             System.out.print(" ");
            //System.out.print("");
        }
        System.out.println();}
    }
}
