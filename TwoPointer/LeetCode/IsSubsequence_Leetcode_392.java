package dsa_learning.TwoPointer.LeetCode;

public class IsSubsequence_Leetcode_392 {

    public static void main(String [] args){

        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s,t));
    }

    public static boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;
        if(s.isEmpty()){
            return true;
        }
        //using two pointers to increment the iterators for the two strings
        // using pointer 'j' as the proof if we have found the whole string
        // 's' in the string 't' as a subsequenec

        // if iterator 'j' has iterated completely till the length of the string 's',
        // then subsequence is present in string 't'
        while((j<=s.length()-1) && (i<=t.length()-1)){ //

            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
            i++;
        }

        if(j==s.length()){
            return true;
        }
        else{
            return false;
        }
    }
}