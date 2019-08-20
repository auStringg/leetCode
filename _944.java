package com.qiujf.leetCode;

/**
 * @Author: qjf
 * @Date: 2019/8/20 16:35
 * @Version 1.0
 */
public class _944 {

    public static void main(String[] args){
        String[] A =new String[]{"zyx","wvu","tsr"};
        System.out.println(minDeletionSize(A));
    }

    public static int minDeletionSize(String[] A) {
        int alen =A.length;
        int slen =A[0].length();
        int dlen =0;

        for(int i=0;i<slen;i++){
            for(int j=0;j<alen-1;j++){
                if(A[j].charAt(i)>A[j+1].charAt(i)){
                    dlen++;
                    break;
                }
            }
        }
        return dlen;
    }
}
