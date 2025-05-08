class Solution {

    // must find a better solution

    public boolean isPalindrome(int x) {

        String number = String.valueOf(x);

        for(int i = 0, j = number.length() - 1; i < number.length() / 2; i++,j--){
            String nb1 = String.valueOf(number.charAt(i));
            String nb2 = String.valueOf(number.charAt(j));
            try{
                if(Integer.parseInt(nb1) != Integer.parseInt(nb2)) {
                    return false;
                }
            }
            catch(NumberFormatException e) { // not a  numeric character
                return false;
            }
        }
        
        return true;

    }

}