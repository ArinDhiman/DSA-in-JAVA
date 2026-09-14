class Solution {
    public String countAndSay(int n) {
        String str = "1";
        for (int k = 1; k < n; k++) {
            String next = "";
            int i = 0;
            while (i < str.length()) {
                int j = i;
                while (j < str.length() &&
                       str.charAt(i) == str.charAt(j)) {
                    j++;
                }
                int count = j - i;
                next = next + count + str.charAt(i);
                i = j;
            }
            str = next;
        }
        return str;
    }
}