import java.util.*;

class Solution {
    public boolean reorderedPowerOf2(int n) {
        String target = getDigitSignature(n);

        for (int i = 0; i < 32; i++) {
            int powerOf2 = 1 << i;
            if (target.equals(getDigitSignature(powerOf2))) {
                return true;
            }
        }

        return false;
    }

    private String getDigitSignature(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        return new String(digits);
    }
}
