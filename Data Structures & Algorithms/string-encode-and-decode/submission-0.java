class Solution {

    public String encode(List<String> strs) {
        {
        StringBuilder letter = new StringBuilder();
        for (String words : strs) {
            letter.append(words);
            letter.append('#');
        }
        return letter.toString();
    }

    }

    public List<String> decode(String str) {
            {
       
        

        List<String> returner = new ArrayList<>();
        StringBuilder decode = new StringBuilder();

        for (char letter : str.toCharArray()) {
            if (letter != '#') {
                decode.append(letter);
            } else {
                returner.add(decode.toString());
                decode.setLength(0); 
            }
        }
        return returner;
    }
    }
}
