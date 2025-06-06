class Solution {
    
    public String longestCommonPrefix(String[] strs) {

        String prefix = "";

        // get the max length of the common prefix
        int shortestString = strs[0].length();
        int indexOfhortestString = 0;
        for(int i = 1; i < strs.length; i++){
            if(strs[i].length() < shortestString) {
                shortestString = strs[i].length();
                indexOfhortestString = i;
            }
        }

        for(int i = 0; i < shortestString; i++){
            char currentChar = strs[indexOfhortestString].charAt(i);
            for(int j = 0; j < strs.length; j++){
                if(strs[j].charAt(i) != currentChar) return prefix;
            }
            prefix += currentChar;
        }
        
        return prefix;

    }

}