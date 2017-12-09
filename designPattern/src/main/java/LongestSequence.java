/**
 * Created by Administrator on 2017/11/25 0025.
 */
public class LongestSequence {



    public static int longestSequence(int[] seq) {
        int longestAsc = findLongestAsc(seq, 1);
        int longestDesc = findLongestAsc(seq, 0);
        return longestAsc > longestDesc ? longestAsc : longestDesc;

    }

    private static int findLongestAsc(int[] seq, int type) {
        int longest = 1;
        int result = 1;
        for (int x = 1; x < seq.length; x++) {
            if ((seq[x] > seq[x - 1] && type == 1) || (seq[x] < seq[x - 1] && type == 0)) {
                longest++;
                if (result < longest) {
                    result = longest;
                }
            } else {
                longest = 1;
            }
        }
        return result;
    }



}
