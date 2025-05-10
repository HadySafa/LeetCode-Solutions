class Solution {

    private boolean correspondsTo(char x,char y){
        if(x == '(' && y == ')') {return true;}
        else if(x == '{' && y == '}') {return true;}
        else if(x == '[' && y == ']') {return true;}
        return false;
    }

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {stack.push(s.charAt(i));}
            else if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
                if(stack.isEmpty()) {return false;}
                else {if(!correspondsTo(stack.pop(),s.charAt(i))) {return false;}}
            }
        }

        if(stack.isEmpty()){ return true; }

        return false;
        
    }

}