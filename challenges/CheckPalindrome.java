 class CheckPalindrome {

    boolean checkPalindrome(String inputString) {
        int last = inputString.length() - 1;
        int begin =0;
        
        while (begin < last){
            if(inputString.charAt(begin) != inputString.charAt(last)){
                return false;
            }
            begin++;
            last--;
        }
        return true;
    }
 }