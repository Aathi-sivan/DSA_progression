class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        int strsLength = strs.length ;
        for(int i = 0 ; i < strsLength ; i ++){
            int[] key = new int [26];
            char[] letters = strs[i].toCharArray();
            int letterLength = letters.length;
            for (int j =0 ; j < letterLength ; j ++){
                key[letter[j]-'a']++;
            }
            String newKey = Arrays.toString(key);
            map.computeIfAbsent(newKey,Key->new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
