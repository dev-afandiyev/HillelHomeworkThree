package utils;

import java.util.Arrays;

public class AnagramChecker {

    private char[] sArray;
    private char[] tArray;

    public void isAnagram(String s, String t) {
        sArray = s.toCharArray();
        tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        getResult(s, t, Arrays.equals(sArray, tArray));
    }

    private void getResult(String s, String t, boolean result) {
        System.out.println("\n" + "Input: s = \"" + s + "\", t = \"" + t + "\"\nOutput: " + result);
    }

}