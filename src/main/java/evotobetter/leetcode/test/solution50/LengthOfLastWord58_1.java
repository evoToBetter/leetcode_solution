package evotobetter.leetcode.test.solution50;

public class LengthOfLastWord58_1 implements LengthOfLastWord58 {
    @Override
    public int lengthOfLastWord(String s){
        int lastWordLength=0;
        if(s==null||s.length()==0){
            return lastWordLength;
        }
        int end=skipSpace(s.length()-1,s);
        while(end>=0&&s.charAt(end)!=' '){
            lastWordLength++;
            end--;
        }
        return lastWordLength;
    }

    private int skipSpace(int end, String s){
        int pos=end;
        while(pos>=0&&s.charAt(pos)==' '){
            pos--;
        }
        return pos;
    }
}
