class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sArr = new int[26];

        for (char c : s.toCharArray()) {
            sArr[c - 'a']++;
        }

        int[] tArr  = new int[26];

        for (char cc : t.toCharArray()) {
            tArr[cc - 'a']++;
        }

        return Arrays.equals(sArr,tArr);
    }
}