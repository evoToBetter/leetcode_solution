package evotobetter.leetcode.solution80;

import java.util.Arrays;

public class MergeSortedArray88_1 implements MergeSortedArray88 {
    @Override
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            return;
        }
        int pos1=0;
        int pos2=0;
        while(pos1<m){
            if(nums2[pos2]>=nums1[pos1]){
                pos1++;
            }else{
                int tmp=nums1[pos1];
                nums1[pos1]=nums2[pos2];
                nums2[pos2]=tmp;
                Arrays.sort(nums2);
                pos1++;
            }
        }
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
    }
}
