class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastseen = new int[128];
        Arrays.fill(lastseen,-1);
        int maxLen = 0;
        int start = 0;

        for(int end = 0; end<s.length();end++){
            char c = s.charAt(end);
            
            if(lastseen[c] >= start){
                start = lastseen[c] + 1;
            }
            lastseen[c] = end;
            maxLen = Math.max(maxLen,end - start + 1);

            // int windowSize = end-start+1;
            // if(windowSize>maxLen){
            //     maxLen = windowSize;
            // }
        }
        return maxLen;
        
    }
}