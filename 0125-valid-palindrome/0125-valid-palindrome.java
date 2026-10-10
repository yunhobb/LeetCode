class Solution {
    public boolean isPalindrome(String s) {
        int startIdx = 0;
        int endIdx = s.length() - 1;

        while (startIdx < endIdx) {
            char startChar = s.charAt(startIdx);
            char endChar = s.charAt(endIdx);

            if (!Character.isLetterOrDigit(startChar)) {
                startIdx++;
                continue;
            }

            if (!Character.isLetterOrDigit(endChar)) {
                endIdx--;
                continue;
            }

            if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                return false;
            }

            startIdx++;
            endIdx--;
        }

        return true;
    }
}