class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = new char[s.length()];
        char[] arr2 = new char[t.length()];
        HashMap<Character,Integer> map1= new HashMap<>();
        HashMap<Character, Integer> map2= new HashMap<>();
        char letter ;

        arr1=s.toCharArray();
        arr2=t.toCharArray();

        //letters and frequencies of word s
        if(s.length()!=t.length())
         return false;

        for ( char c : arr1 ) {
            if(map1.containsKey(c))
               map1.put(c,map1.get(c)+1);
            else
                map1.put(c,1);
        }
         //letters and frequencies of word t

        for ( char c : arr2 ) {
            if(map2.containsKey(c))
               map2.put(c,map2.get(c)+1);
            else
                map2.put(c,1);
        }

        for(int i = 0 ; i < s.length(); i ++){
            letter = arr1[i];
            if(!map1.get(letter).equals(map2.get(letter)))
             return false;
        }
        return true ;
    }
    
}
