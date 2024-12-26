package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTask_1
{
    @Test
    public void Test()
    {
        double[] roots;
        task_1 testTwo = new task_1(1,-3,2);
        roots = testTwo.execute();
        assertArrayEquals(
                new double[]{2.0,1.0},
                roots,
                "Корни должны быть 2.0 и 1.0"
        );
        task_1 testOne = new task_1(1,-2,1);
        roots = testOne.execute();
        assertArrayEquals(
                new double[]{1.0},
                roots,
                "Корень должен быть 1.0"
        );
        task_1 testNone = new task_1(1,0,1);
        roots = testNone.execute();
        assertEquals(
                0,
                roots.length,
                "Корней не должно быть"
        );
        assertThrows(IllegalArgumentException.class, () -> 
                new task_1(0, 2, 1),
                "Должно выбрасываться исключение, если a == 0"
        );

    }
}
