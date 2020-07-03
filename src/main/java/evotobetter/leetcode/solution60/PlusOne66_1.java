package evotobetter.leetcode.solution60;

import java.util.Arrays;

public class PlusOne66_1 implements PlusOne66 {
    @Override
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9){
            digits[digits.length-1]+=1;
        }else{
            int pos=digits.length-1;
            while(pos>=0){
                if(digits[pos]==9){
                    digits[pos]=0;
                    pos--;
                }else{
                    digits[pos]+=1;
                    break;
                }
            }
            if(pos==-1){
                digits=new int[digits.length+1];
                digits[0]=1;
            }
        }
        return digits;
    }
}
