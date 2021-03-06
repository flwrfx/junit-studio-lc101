package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
//        int index = 0;
//        int leftBracketLastIndex = 0;
//        int rightBracketLastIndex = 0;

        for (char ch : str.toCharArray()) {
            if (brackets >= 0) {
                if (ch == '[') {
                    brackets++;
                } else if (ch == ']') {
                    brackets--;
                }//ifs
            } else {
            return false;
            }
                //get ch index, check if any given ] is after a [

            }//for


//        for (char ch : str.toCharArray()) {
//            if (ch == '[') {
//                leftBracketLastIndex = index;
//                if (leftBracketLastIndex > rightBracketLastIndex){
//                brackets++;}
//            } else if (ch == ']') {
//                rightBracketLastIndex = index;
//                if (rightBracketLastIndex < leftBracketLastIndex){
//                brackets--;}
//            }//ifs
//            index++;
//            //get ch index, check if any given ] is after a [
//
//        }//for

        return brackets == 0;
    }
}
