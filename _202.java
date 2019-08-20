package com.qiujf.leetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: qjf
 * @Date: 2019/8/20 21:49
 * @Version 1.0
 */
public class _202 {
    public static void main(String[] args){
        isHappy(19);
    }

    public static boolean isHappy(int n) {
        int num =0;
        int temp =0;
        Set<Integer> sets =new HashSet<>();
        while(n!=1){
            while(n!=0){
                temp =n%10;
                num+=temp*temp;
                n/=10;
            }
            n =num;
            num =0;
            if(sets.contains(n))
                return false;
            else
                sets.add(n);
        }
        return true;
    }
}
