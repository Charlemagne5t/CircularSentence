class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] s = sentence.split(" ");
        if (s.length == 1) return s[0].charAt(0) == s[0].charAt(s[0].length() - 1);

        for (int i = 0; i < s.length; i++) {
            int j = i + 1;
            if (j == s.length) {
                j = 0;
            }
            if (s[i].charAt(s[i].length() - 1) != s[j].charAt(0)) {
                return false;
            }
        }
        return true;
    }
}