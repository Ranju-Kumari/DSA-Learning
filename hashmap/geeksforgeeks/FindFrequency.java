package dsa_learning.hashmap.geeksforgeeks;

public class FindFrequency {
        public static int findFrequency(int arr[], int x) {
            // using freq array to store the frequencies of given elements
            int [] freq = new int[(int)Math.pow(10,4)];

            for(int i=0;i<=arr.length-1;i++){
                freq[i]=0;
            }

            for(int j=0;j<=arr.length-1;j++){
                freq[arr[j]]= freq[arr[j]]+1;
            }

            return freq[x];

        }

}
