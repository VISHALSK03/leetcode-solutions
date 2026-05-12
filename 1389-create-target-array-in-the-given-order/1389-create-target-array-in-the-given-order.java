class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int a =nums.length;
        int arr[]= new int[a];
        int s=0;
        for(int i=0;i<a;i++){
            for(int j=s;j>index[i];j--){
                arr[j]=arr[j-1];
            }
            arr[index[i]]=nums[i];
            s++;
        }
        return arr;
    }
}