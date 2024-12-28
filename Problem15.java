import java.util.Arrays;

public class Problem15 {
    public static void main(String[] args) {
        int k=0;
        int a[]={2,4,5,6,7,9,10,13,2,3,4,5,6,7,8,9,11,15};
        int n[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            if(!isContain(n, a[i]))
                n[k++]=a[i];
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(n,0,k)));
    }
    public static boolean isContain(int a[],int n){
        for(int i:a)
            if(i==n)
             return true;
        return false;
    }
}
