class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int j = 0;
        int i = 1;
        while (i < n) {
            if (s.charAt(i)==s.charAt(j)) {
                lps[i] =j+1;
                i++;
                j++;
            } else {
                if (j>0) {
                    j =lps[j - 1];
                } else {
                    lps[i] =0;
                    i++;
                }
            }
        }
        int length =lps[n - 1];
        return s.substring(0, length);
    }
}