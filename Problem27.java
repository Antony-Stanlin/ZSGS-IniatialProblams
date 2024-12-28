public class Problem27 {
    public static void main(String[] args) {
        String string1="testing12",string2="1234";
        System.out.println(new Problem27().contain(string1, string2));
    }

    int contain(String string1,String string2){
        for(int i=0;i<=string1.length()-string2.length();i++){
            if(string1.substring(i, i+string2.length()).equals(string2))
             return i;
        }
        return -1;
    }
}
