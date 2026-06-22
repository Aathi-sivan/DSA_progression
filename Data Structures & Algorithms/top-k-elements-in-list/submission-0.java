import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int count = 1;
        HashMap <Integer , Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < nums.length-1 ; i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        //creating bucket for each frequency
        HashMap<Integer,List<Integer>> bucket = new HashMap<>();
        for(int i = 1 ; i <=nums.length ; i++){
            bucket.put(i, new ArrayList<Integer>());

        }
        // entrySet is a keyWord used to iterate over key-value as a pair 
        //similarly collections can be iterated using forEach loop 
        // map.Entry<Integer , Integer> is defining the datatype of key-value;
        for( map.Entry<Integer,Integer> entry : map.entrySet()){
            bucket.computeIfAbsent(entry.getValue(), f -> new ArrayList<>()).add(entry.getKey());

        }
        int[]result = new int[k];
        int index = 0 ; 
        for (int freq = nums.length; freq >= 1 && index < k; freq--) {
            // check for existance 
        if (bucket.containsKey(freq)) {
        for (int num : bucket.get(freq)) {
            result[index++] = num;
            if (index == k) break;
        }
    }
}

    }
}
