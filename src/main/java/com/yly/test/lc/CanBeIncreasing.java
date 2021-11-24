package com.yly.test.lc;

/**
 * @Description
 * @Project yly-test
 * @File com.yly.test.lc.CanBeIncreasing
 * @Date 2021/11/8 20:15:59
 * @Author bj89001
 * @Copyright（C）2021 Bybit.com Inc. All Rights Reserved.
 */

/**
 * 给你一个下标从 0 开始的整数数组 nums ，如果 恰好 删除 一个 元素后，数组 严格递增 ，那么请你返回 true ，否则返回 false 。如果数组本身已经是严格递增的，请你也返回 true 。
 * 数组 nums 是 严格递增 的定义为：对于任意下标的 1 <= i < nums.length 都满足 nums[i - 1] < nums[i] 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-one-element-to-make-the-array-strictly-increasing
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CanBeIncreasing {

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,2};
        System.out.println(canBeIncreasing(nums));
    }

    public static boolean canBeIncreasing(int[] nums) {
        int n = nums.length;
        boolean hasRemoved = false;
        int last = nums[0];
        for(int i = 1; i < n; ++i){
            // 此时要校验删除哪个元素
            if(nums[i] <= last){
                if (hasRemoved) {
                    return false;
                }
                hasRemoved = true;
                // 此时，删除nums[i - 1]不解决问题，只能删除nums[i]
                if(i > 1 && nums[i] <= nums[i - 2]){
                    last = nums[i - 1];
                    continue;
                }
            }
            last = nums[i];
        }
        return true;
    }

}
