class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while(right < s.length()){
            char currentchar = s.charAt(right);
            if(map.containsKey(currentchar) && map.get(currentchar)>=left){
                int lastIndex = map.get(currentchar);
                left = lastIndex + 1;
            }
            map.put(currentchar,right);
            int windowSize = right - left + 1;
            if(windowSize > maxLen){
                maxLen = windowSize;
            }
            right++;
        }
        return maxLen;
    }
}