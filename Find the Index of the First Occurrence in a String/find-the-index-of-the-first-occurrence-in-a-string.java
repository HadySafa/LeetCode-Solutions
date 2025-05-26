
class Solution {

    public int strStr(String haystack, String needle) {

        if(haystack.length() == 1) return haystack.equals(needle) ? 0 : -1;

        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            if(needle.equals(haystack.substring(i,i + needle.length()))) return i;
        }

        return -1;
    }
    
}