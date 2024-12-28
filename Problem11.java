public class Problem11 {
    public static void main(String[] args) {
        String s="a3n5c",s1="",temp="";
        for(int i=0;i<s.length();i++){

            if(Character.isDigit(s.charAt(i)))
             temp+=s.charAt(i);

            else if(Character.isLetter(s.charAt(i))){
                if(temp.length()>0){
                    char c=s1.charAt(s1.length()-1);

                    for(int j=0;j<Integer.parseInt(temp);j++)
                        s1+=c;
                        
                    temp="";
                }
                s1+=s.charAt(i);
            }
                
        }
        System.out.println(s1);
    }
}
