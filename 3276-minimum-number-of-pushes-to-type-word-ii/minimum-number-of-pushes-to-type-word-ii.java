class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int[] freq = new int[26];
        for(char ch : word.toCharArray()){
            freq[ch - 'a']++;
        }
        Arrays.sort(freq);
        int count = 0;
        int minKey = 0;
        for(int i=25;i>=0;i--){
            int val = freq[i] * ((count/8) + 1);
            minKey += val;
            count++;
        }
        return minKey;
    }
}