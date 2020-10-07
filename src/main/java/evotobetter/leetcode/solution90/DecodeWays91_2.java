package evotobetter.leetcode.solution90;

public class DecodeWays91_2 implements DecodeWays91 {
    @Override
    public int numDecodings(String s) {
        if(s.charAt(0)=='0'){
            return 0;
        }
        int wayNum=0;
        for(int i=0; i<s.length();){
            if(s.charAt(i)=='0'){
                return 0;
            }
            if(i+2<s.length()){
                if(s.charAt(i+1)=='0'){
                    if((s.charAt(i)-'0')<=2){
                        i+=2;
                    }else{
                        return 0;
                    }
                }else if(s.charAt(i+2)=='0'){
                    if((s.charAt(i+1)-'0')<=2){
                        i+=3;
                    }else{
                        return 0;
                    }
                }else{
                    if((s.charAt(i)-'0')*10+(s.charAt(i+1)-'0')<=26){
                        wayNum++;
                    }
                    if((s.charAt(i+1)-'0')*10+(s.charAt(i+2)-'0')<=26){
                        wayNum++;
                    }
                    i+=3;
                }
            }else{
                if(i+1<s.length()){
                    if((s.charAt(i)-'0')*10+(s.charAt(i+1)-'0')<=26){
                        wayNum++;
                        i=i+1;
                    }
                    if(s.charAt(i)=='0'){
                        i=i+1;
                        wayNum--;
                        continue;
                    }
                }else{
                    i+=1;
                }
            }
        }
        wayNum++;
        return wayNum;
    }
}
