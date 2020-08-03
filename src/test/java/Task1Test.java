import com.geekbrains.Task1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.logging.*;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class Task1Test {
    private static final Logger logger = Logger.getLogger(Task1.class.getName());

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,2,5,4,3,7,2}, new int[]{1,7}, "Case 1"},
                {new int[]{7,3,5,8,2,1}, new int[]{1,3}, "Case 2"},
                {new int[]{4,2,9}, new int[]{2,9}, "Case 3"}
        });
    }

    private int[] arrOriginal;
    private int[] arrExpected;
    private String message;

    public Task1Test(int[] arrOriginal, int[] arrExpected, String message) {
        this.arrOriginal = arrOriginal;
        this.arrExpected = arrExpected;
        this.message = message;
    }

    @Test
    public void task1() {
        logger.info (message+": отправили массив: "+ Arrays.toString(arrOriginal)+" получили массив: "+ Arrays.toString(arrExpected));
        assertArrayEquals("Заданный нами массив должен совпадать с полученным", arrExpected, Task1.process(arrOriginal));
    }

    @Test(expected = RuntimeException.class)
    public void testExceptionTask1() {
       logger.info("Тест на появление RuntimeException");
        Task1.process(new int[]{1,2,3});
    }
}
