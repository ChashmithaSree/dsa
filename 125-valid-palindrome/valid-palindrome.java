class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reverse = new StringBuilder(cleaned).reverse().toString();
        if(cleaned.equals(reverse)){
            return true;
        }
        return false;
    }
}