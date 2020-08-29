package evotobetter.leetcode.solution60;

public class AddBinary67_1 implements AddBinary67{

    @Override
    public String addBinary(String a, String b) {
        int additional=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<Math.max(a.length(),b.length());i++){
            char ca='0';
            char cb='0';
            if(i>=a.length()){
                cb=b.charAt(b.length()-1-i);
            }else if(i>=b.length()){
                ca=a.charAt(a.length()-1-i);
            }else{
                ca=a.charAt(a.length()-1-i);
                cb=b.charAt(b.length()-1-i);
            }
            if(ca==cb){
                if(additional==1){
                    sb.insert(0,1);
                    additional=0;
                }else{
                    sb.insert(0,0);
                }
                if(ca=='1'){
                 additional=1;
                }
            }else{
                if(additional==1){
                    sb.insert(0,0);
                }else{
                    sb.insert(0,1);
                    additional=0;
                }
            }
        }
        if(additional==1){
            sb.insert(0,1);
        }
        return sb.toString();
    }
}
