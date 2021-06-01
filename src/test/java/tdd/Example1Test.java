package tdd;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class Example1Test {
    Example1 e = new Example1();
    Service serviceObj = mock(Service.class);
    Dbo dbObj = mock(Dbo.class);

    @Test
    public void addition_of_two_numbers() {
        var output = e.add(1, 2);
        assertEquals(3, output);
    }

    @Test
    public void is_number_divisible() {
        Throwable exception = assertThrows(ArithmeticException.class, () -> e.divide(12, 0));
        assertEquals("/ by zero", exception.getMessage());

        float divideOutput = e.divide(12, 3);
        assertEquals(4, divideOutput);
    }

    @Test
    public void is_valid_user_name() {
        boolean output = e.validateUserName("abc");
        boolean output2 = e.validateUserName("abc@domain.com");
        boolean output3 = e.validateUserName("abc@domain.no");
        boolean output4 = e.validateUserName("abc3.no");

        assertFalse(output);
        assertTrue(output2);
        assertTrue(output3);
        assertFalse(output4);
    }

    @Test
    public void test_Mock() {
        Mockito.when(serviceObj.getData()).thenReturn("Mocked data string");
        System.out.println(serviceObj.getData());
        assertEquals("Mocked data string", serviceObj.getData());
    }

    @Test
    public void test_Mock_db() {
        Mockito.when(dbObj.getData()).thenReturn(new ArrayList<>() {{
            add("value12");
            add("value22");
        }});
        Service serviceNewObj = new Service(dbObj);
        System.out.println(serviceNewObj.getDbData());
        assertTrue(serviceNewObj.getDbData().contains("value22"));
    }
}
