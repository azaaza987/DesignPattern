import org.junit.Test;

/**
 * Created by Administrator on 2017/11/25 0025.
 */
public class LongestSequenceTest {



    @Test
    public void longestSequence() throws Exception {
        //int[] seq = {1, 7, 7, 8, 3, 6, 7, 2};
        int[] seq = {2, 7, 6, 3, 8, 7, 7, 1};
        int i = LongestSequence.longestSequence(seq);
        System.out.println(i);
    }

}
