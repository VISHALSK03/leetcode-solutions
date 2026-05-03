class Solution {
    public int largestAltitude(int[] gain) {
        int a=0;
        int v=0;
        for(int i=0;i<gain.length;i++){
            a=a+gain[i];
        if(a>v){
            v=a;
        }
        }
        return v;
    }
}