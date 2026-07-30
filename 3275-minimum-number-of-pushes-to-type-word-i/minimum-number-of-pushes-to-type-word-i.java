class Solution {
    public int minimumPushes(String word) {
        int result = 0;
        int n = word.length();
        for(int i=0;i<n;i++){
            result += (i/8) + 1;    //pehle sb m traverse kro or sbko single word dedo fir agar sab place fil hojaye to + 1 krdo or return krdo for eg agar number 8 h toh hr ek number m word gaya or agar uska max limit reach hogaya toh fir + 1 add krdenge;
        }
        return result;
        
    }
}