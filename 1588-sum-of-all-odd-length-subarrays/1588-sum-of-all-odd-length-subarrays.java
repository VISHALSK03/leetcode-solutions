class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int s=0;
        int n=arr.length;
        for(int len=1;len<=n;len+=2){
        for(int i=0;i+len<=n;i++){
            for(int j=i;j<i+len;j++){
                         s=s+arr[j];
            }

        }
            }
            return s;
    }
}