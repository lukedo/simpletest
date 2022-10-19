package com.example.demo.hello;

public  class  Minsub {
//    public void main(String[] args) {
//        int i;
//        int[] s = {1, 2, 3, 8};
//        i = minSubArrayLen(2, s);
//        System.out.println(i);
//
//    }
    public static void main(String[] args) {
        int j=9;
        int[] s = {1, 2, 3, 8};
        System.out.println(minSubArrayLen(j, s));
    }
    public static int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        int j = 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        while (j < nums.length) {
            sum += nums[j];
            while (sum >= s) {
                res = Math.min(res, j - i + 1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}

