public class Problem2 {
    public static void main(String a[]){
        System.out.println(and(2,2));
        System.out.println(or(2,2));
        System.out.println(xor(2,2));
        System.out.println(not(2));
    }
    public static int or(int a,int b){
        return a|b;
     }
    public static int and(int a,int b){
        return a&b;
      }

    public static int not(int a){
        return ~a;
    }

    public static int xor(int a,int b){
        return a^b;
    }
}
