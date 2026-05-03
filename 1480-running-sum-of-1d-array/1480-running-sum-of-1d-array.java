class Solution {
    public int[] runningSum(int[] nums) {
        int [] arr= new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int a=0;
              for(int j=0;j<=i;j++){
                a=a+nums[j];
              }
              arr[i]=a;
        }
    return arr;
    }
}