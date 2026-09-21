class Solution {
    public String encode(List<String> strs) {
        StringBuilder strBuilder = new StringBuilder();
        for (String str : strs) {
            strBuilder.append(str.length()).append("#");
            strBuilder.append(str);
        }
        String s = strBuilder.toString();
        return s;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int delimiter = str.indexOf('#', i);

            int length = Integer.parseInt(str.substring(i, delimiter));
        
            int j = delimiter + 1;

            StringBuilder builder = new StringBuilder();

            while (length-- > 0) {
                builder.append(str.charAt(j++));
            }

            result.add(builder.toString());
            i = j;
        }
        return result;
    }
}
