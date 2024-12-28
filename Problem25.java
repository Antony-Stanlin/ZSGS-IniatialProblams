public class Problem25 {
    public static void main(String[] args) {
        String number="12345";
        for(int j=0;j<number.length();j++){
            for(int i=0;i<number.length();i++){
                if(i==j || i==number.length()-j-1)
                 System.out.print(number.charAt(i));
                else 
                 System.out.print(" ");
            }
            System.out.println();
        }
    }
}
