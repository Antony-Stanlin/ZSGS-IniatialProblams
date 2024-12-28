public class Problem3 {
    public static void main(String a[]){
        int start=101,n=4,total=20;
        
        for(int i=0;i<n;i++){
            System.out.println("Group "+(i+1));

            for(int j=0;j<total/n;j++)
                System.out.println(start+i+(total/n-1)*j);
            
            System.out.println();
        }
    }
}
