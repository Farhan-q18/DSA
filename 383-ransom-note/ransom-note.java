import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int s1 = ransomNote.length();
        int s2 = magazine.length();
        int freq1[] = new int[26];
        int freq2[] = new int[26];

        for(int i=0;i<s1;i++){
            freq1[ransomNote.charAt(i)-'a']++;
        }
        for(int j=0;j<s2;j++){
            freq2[magazine.charAt(j)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i] > freq2[i]){
                return false;
            }
        }
        return true;

    }
}