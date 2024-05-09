/*
    * Problem: 1. Two Sum
    * Source: https://leetcode.com/problems/two-sum/
*/

public class P1
{
    public static void main(String[] args)
    {
    }

    public static int[] two_sum(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    return new int[] {i, j};
                }
            }
        }
        return nums;
    }
}