import java.util.*;
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;
        for(int i=0; i<nums.size(); i++){
            if(CountBits(i) == k){
                ans = ans + nums.get(i);
            }
        }
        return ans;
    }
    public static int CountBits(int n){
        int count = 0;
        while(n!=0){
            if((n & 1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}