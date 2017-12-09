/**
 * Created by Administrator on 2017/11/25 0025.
 */
public class Square {


    public static void main(String[] args) {
        for (int x = 1; x <= 1000; x++) {
            calculate(x * x);
            System.out.println("=====================");
        }
    }

    private static void calculate(int x) {
        for (int t = 0; (t * t) <= (x >> 1); t++) {
            int y = x - t * t;
            int a = (int) Math.sqrt(y);
            if (a * a == y) {
                System.out.println((int) Math.sqrt(x) + "^2 = " + t + "^2 + " + a + "^2");
            }
        }
    }


}
