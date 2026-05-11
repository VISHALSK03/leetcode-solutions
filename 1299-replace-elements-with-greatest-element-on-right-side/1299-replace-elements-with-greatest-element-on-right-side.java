class Solution {
    public int[] replaceElements(int[] arr) {
       int a=arr.length-1;
       int arr1[]= new int[a+1];
       int b=-1;
       for(int i=a;i>=0;i--){
        arr1[i]=b;
        if(arr[i]>b){
            b=arr[i];
        }
       } 
       return arr1;
       }
      
}