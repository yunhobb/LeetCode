class Solution {
    public boolean isPalindrome(String s) {

        // 정렬 및 파싱
        String lowerStrings = s.toLowerCase();
        String removedStrings = lowerStrings.replaceAll("[^a-z0-9]", "");

        int startIndex = 0;
        int endIndex = removedStrings.length() - 1;
        
        // 비교
        while (startIndex < endIndex) {
            if (removedStrings.charAt(startIndex) != removedStrings.charAt(endIndex)) {
                return false;
            }  else {
                startIndex++;
                endIndex--;
            }
        }

        return true;
    }
}