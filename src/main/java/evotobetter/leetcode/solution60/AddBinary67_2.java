package evotobetter.leetcode.solution60;

public class AddBinary67_2 implements AddBinary67 {
    @Override
    public String addBinary(String a, String b) {
        int extra=0;
        int i= a.length()-1;
        int j=b.length()-1;
        StringBuilder sb= new StringBuilder();
        while(i>=0||j>=0){
            int count=extra;
            if(i>=0){
                count+=a.charAt(i--)-'0';
            }
            if(j>=0){
                count+=b.charAt(j--)-'0';
            }
            extra=count/2;
            sb.append(count%2);
        }
        if(extra!=0){
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
