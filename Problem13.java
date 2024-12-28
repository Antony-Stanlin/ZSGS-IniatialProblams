public class Problem13 {
    public static void main(String[] args) {
        int a[]={6,3,2,8,9,9,8,7,1,7};
        int min=a[0];
        for(int i:a)
         if(min>i)
          min=i;
        System.out.println(min);
    }
}
