class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int max=0;
        int min=0;
        List<Integer> ans= new ArrayList<>();
        int a=matrix.length;
       for(int i=0;i<a;i++){
         min=matrix[i][0];
         int col=0;
            for(int j=0;j<matrix[i].length;j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                    col=j;
                }
               
            }
             for(int k=0;k<matrix.length;k++){
                    if(min<matrix[k][col]){
                        max++;
                    }
                }
                if(max==0){
                    ans.add(min);
                   
                }
                max=0;
            
        }
         return ans;
    }
}