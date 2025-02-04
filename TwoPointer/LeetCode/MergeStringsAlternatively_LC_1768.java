package dsa_learning.twoPointer.leetCode;

public class MergeStringsAlternatively_LC_1768 {

    public static void main(String [] args){

        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));
    }

    public static String mergeAlternately(String word1, String word2){
        int len1 = word1.length();
        int len2 = word2.length();
        String[] word3 = new String[len1 + len2];
        int loopIterator = len1 + len2;
        int i = 0, j = 0, k = 0;
        while (loopIterator-- > 0) {
            // If word2 has exhausted, then word3 will surely contain all the remaining from word1
            // OR
            // If word2 still has remaining string then we have to check if word1 string length is
            // greater than 0 or not && the index of the word3 should be divisible by 2(since
            // it's conclusive from the qn that word1 letters are stored at even places in word3)
            if (len2 == 0 || (len1 > 0 && k % 2 == 0)) {
                word3[k] = String.valueOf(word1.charAt(i));
                i++;
                len1--;
            } else if (len1 == 0 || (len2 > 0 && k % 2 != 0)) {
                word3[k] = String.valueOf(word2.charAt(j));
                len2--;
                j++;
            }
            k++;
        }
        String s = "";
        for (i = 0; i <= word3.length - 1; i++) {
            s = s + word3[i];
        }
        return s;
    }
}
