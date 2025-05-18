class Solution {

    public int[] plusOne(int[] digits) {

        int index = digits.length - 1;
        
        while(index >= 0){
            // only increment the last digit
            if(digits[index] < 9){
                digits[index]++;
                return digits;
            }
            // if digit is 9, set it to 0 & increment the one before
            digits[index] = 0;
            index--;
        }

        int [] newDigits = new int[digits.length + 1];

        newDigits[0] = 1;

        for(int i = 0; i < digits.length; i++) newDigits[i+1] = digits[i];

        return newDigits;

    }

}