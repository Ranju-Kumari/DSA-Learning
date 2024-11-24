public class ValidPalindrom_Leetcode125 {

    public static void main(String []args){

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        String s2 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");

        int length = s2.length();
        for(int i =0;i<length/2;i++){
            if(!(s2.charAt(i)==s2.charAt(length-i-1))){
                return false;
            }
        }
        return true;
    }

}
