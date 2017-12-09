/**
 * Created by Administrator on 2017/11/25 0025.
 */
public class Square2 {


    public static int countPoints(int rSquare) {
        long r = rSquare;
        long square = r * r;
        long halfSquare = square >> 1;
        int result = 4;
        for (long x = r - 1;; x--) {
            long xSquare = x * x;
            if (xSquare <= halfSquare) {
                break;
            }
            long ySquare = square - xSquare;
            long y = (long) Math.sqrt(ySquare);
            if (y * y == ySquare) {
                result += 8;
            }
        }
        return result;
    }

}
