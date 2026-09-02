class Solution {
    public boolean isPalindrome(String s) {
      String result="";
      for(char c:s.toCharArray()){
        if(Character.isLetter(c)||Character.isDigit(c)){
            result=result+c;
        }
      }
      result=result.toLowerCase();
        int a =0;
        int b=result.length()-1;
        while(a<=b){
            if(result.charAt(a)!=result.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }   
}
     
