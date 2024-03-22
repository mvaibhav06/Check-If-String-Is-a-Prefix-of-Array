public class StringPrefix {
    public static boolean isPrefixString(String s, String[] words) {
        int p = 0;
        int len = 0;

        for(int i=0; i<words.length; i++){
            String temp = words[i];
            len += temp.length();
            for(int j=0; j<temp.length(); j++){
                if(temp.charAt(j) == s.charAt(p)){
                    p++;
                    if(p>s.length()-1 && p==len){
                        return true;
                    }else if(p>s.length()-1 && p<len){
                        return false;
                    }
                }else{
                    return p>0 && p==len;
                }
            }
        }
        if(p < s.length() && len<s.length() && p>0) return false;
        return p>0;
    }

    public static void main(String[] args) {
        System.out.println(isPrefixString("a",new String[]{"aa","aaaa","banana"}));
    }
}
