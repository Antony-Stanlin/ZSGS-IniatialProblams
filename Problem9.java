public class Problem9 {
    public static void main(String[] args) {
        int n=56789,r=0;
    
    while(n>0){
        r=r*10+(n%10);
        n/=10;
    }
    System.out.println(r);
    }
}
    
