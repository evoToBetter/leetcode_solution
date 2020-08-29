package evotobetter.leetcode.solution50;

public class LengthOfLastWord58_2 implements LengthOfLastWord58 {
    @Override
    public int lengthOfLastWord(String s){
        int lastWordLength=0;
        if(s==null||s.length()==0){
            return lastWordLength;
        }
        int end=s.length()-1;
        while(end>=0&&s.charAt(end)==' '){
            end--;
        }
        while(end>=0&&s.charAt(end)!=' '){
            lastWordLength++;
            end--;
        }
        return lastWordLength;
    }
}
