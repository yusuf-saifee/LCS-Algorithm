package com.saifee;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String source = "Yusuf Saifee";
        String target = "Saifee Yusuf";

        char[] sourceWords = source.toCharArray();
        char[] targetWords = target.toCharArray();

        System.out.println("Print LCS: "+ Arrays.toString(LCS(sourceWords, targetWords,sourceWords.length, targetWords.length)));
    }

    public static char[] LCS(char[] sourceWords, char [] targetWords, int m, int n) {
        int[][] lCSTable = new int[m+1][n+1];
        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {
                if (i == 0 || j == 0) {
                    lCSTable[i][j] = 0;
                }
                else if (sourceWords[i-1] == targetWords[j-1]) {
                    lCSTable[i][j] = 1 + lCSTable[i - 1][j - 1];
                }
                else
                    lCSTable[i][j] = Math.max(lCSTable[i - 1][j], lCSTable[i][j - 1]);
            }
        }

        //Print LCS Words
        int k = m;
        int l = n;
        int index = lCSTable[m][n];
        System.out.println("LCS Length: " + index);
        char[] lcsChars = new char[index];

        /*
        // This is also a way to print LCS by comparing the particular indices length in LCS Table. If it is not match with
        // previous row & column indices that means it is addition of diagonal indices' length.
        // i.e. Diagonal direction, store that word when direction is diagonal.
        while (k > 0 && l > 0){
             int currentVal = lCSTable[k][l];
             if(currentVal != lCSTable[k-1][l] && currentVal != lCSTable[k][l-1]){
                 lcsChars[index-1] = sourceWords[k-1]; // Table indices starts with 1 but source indices starts with 0.
                 index --;
                 k--;
                 l--;
             }
             else if(currentVal == lCSTable[k-1][l]){
                 k--;
             }
             else {
                 l--;
             }
        }*/

        // This approach compares the words and if it matches then moves at diagonal element else either moves at row
        // direction or column direction based on max value.
        while (k > 0 && l > 0){
            if(sourceWords[k-1] == targetWords[l-1]){
                lcsChars[index-1] = sourceWords[k-1];
                index --;
                k--;
                l--;
            }
            else if(lCSTable[k-1][l] > lCSTable[k][l-1]){
                k--;
            }
            else
                l--;
        }
        return lcsChars;
    }
}
