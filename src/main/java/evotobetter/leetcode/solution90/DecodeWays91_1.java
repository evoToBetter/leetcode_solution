package evotobetter.leetcode.solution90;

public class DecodeWays91_1 implements DecodeWays91 {
    @Override
    public int numDecodings(String s) {
        int ways=0;
        if(s.length()>0&&s.charAt(0)=='0'){
            return 0;
        }
        if(s.length()==0||s.length()==1){
            return 1;
        }
        if(s.length()>1){
            ways+=numDecodings(s.substring(1));
            if(((s.charAt(0)-'0')*10+s.charAt(1)-'0')<=26){
                ways+=numDecodings(s.substring(2));
            }
        }
        return ways;
    }

}
