public class Problem20 {
    public static void main(String[] args) {
        int n=9;
        for(int j=0;j<n;j++){
        for(int i=1;i<n+1;i++){
            System.out.print(" ");
            if(i>=n-j)
             System.out.print(j+i-n+1);
            else
             System.out.print(" ");
            //System.out.print("");
        }
        for(int i=n-1;i>0;i--){
            if(i>=n-j)
             System.out.print(" "+(j+i-n+1));
            else
             System.out.print(" ");
            //System.out.print("");
        }
        System.out.println();}
    }
}
