class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length())
              .append('#')
              .append(str);
        }

        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < s.length()) {
            int delimiter = s.indexOf('#', i);

            int len = Integer.parseInt(s.substring(i, delimiter));

            int start = delimiter + 1;
            int end = start + len;

            result.add(s.substring(start, end));

            i = end;
        }

        return result;
    }
}
