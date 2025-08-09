class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0;i<numRows;i++){
              ArrayList<Integer> rows = new ArrayList<>();
               rows.add(1);
               //middle nums :
              for(int j=1; j<i;j++){
                rows.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
              }  
            if(i>0){
                rows.add(1);
            }
           triangle.add(rows); 
      
        }
        return triangle;
    
    }
}