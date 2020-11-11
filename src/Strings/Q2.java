package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    //check whether Two STrings are anagrams of each other or not
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        System.out.println(areAnagram(s1,s2));
        System.out.println(areAnagramImproved(s1,s2));


    }

    //This is a Naive method to check for Anagram or not
    //It takes O(nlogn)
    public static boolean areAnagram(String s1,String s2){
        if (s1.length()!=s2.length()){
            return false;
        }
        char[] a1=s1.toCharArray();
        Arrays.sort(a1);
        s1=new String(a1);
        char[] a2=s2.toCharArray();
        Arrays.sort(a2);
        s2=new String(a2);
        return s1.equals(s2);
    }
    //Improved techniqueusing a count array
    public static boolean areAnagramImproved(String s1,String s2){
        if (s1.length()!=s2.length()){
            return  false;
        }
        int CHAR=256;
        int[] count=new int[CHAR];
        for (int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i=0;i<CHAR;i++){
            if (count[i]!=0){
                return false;
            }
        }
        return true;

    }
}
