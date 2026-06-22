class Solution {
    public int[] replaceElements(int[] arr) {
        int j = 0 ;
      for (int i = arr.length ; i < 0 ;i++){
        if(i!=arr.length-1){
        while(arr[i]>arr[j]){
            arr[j]=arr[i];
            j++;
        }
        }
      }  
      arr[arr.length-1]=-1;
      return arr;
    }
    
}