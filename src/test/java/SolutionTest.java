import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    public void calculateRepeatValuesTest1(){
        Collection<Integer> bbbbb = solution.calculateRepeatValues("bbbbb").values();
        int bbbbbInteger = bbbbb.stream().findFirst().get();
        Assertions.assertEquals(5, bbbbbInteger);
    }


    @Test
    public void calculateRepeatValuesTest2(){
        String result = solution.calculateRepeatValues("bbbbba").entrySet().toString();
        Assertions.assertEquals("[a=1, b=5]", result);
    }


    @Test
    public void calculateRepeatValuesTest3(){
        String result = solution.calculateRepeatValues("aabb ba f").entrySet().toString();
        Assertions.assertEquals("[a=3, b=3, f=1]", result);
    }
}
