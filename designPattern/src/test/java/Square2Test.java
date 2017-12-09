import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * Created by Administrator on 2017/11/25 0025.
 */
public class Square2Test {


    @Test
    public void countPoints() throws Exception {
        int countPoints = Square2.countPoints(5);
        System.out.println(countPoints);
    }

    @Test
    public void test() {
        Map<Integer, Integer> map = new HashMap<>();
        change(map);
        System.out.println("a " + map.getClass().getName());
        Set<Integer> keySet = map.keySet();
        for (Integer x : keySet) {
            Integer integer = map.get(x);
            System.out.println(x + "=" + integer);
        }

    }

    private void change(Map map) {
        map = new HashMap<Integer, String>();
        System.out.println("b " + map.getClass().getName());
        map.put(null, null);
        map.put(6, "apple");
    }

}
