import java.util.Arrays;

public class Problem14 {
    public static void main(String[] args) {
        int a[]={1,3,5,9,4,0,-9,43,42,3};
        int another[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            another[i]=a[i];
        }
        int another1[]=Arrays.copyOfRange(a, 0, a.length);
        System.out.println(Arrays.toString(another));
        System.out.println(Arrays.toString(another1));
    }
}
