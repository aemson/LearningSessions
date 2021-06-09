package tdd;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;

public class Example1Test {
    Example1 eObj = new Example1();
    Service serviceObj;
    Dbo dbObj = mock(Dbo.class);

    @Before
    public void setup() {
        eObj = new Example1();
    }

    @Test
    public void addition_of_two_numbers() {
    }

    @Test
    public void is_number_divisible() {
    }

    @Test
    public void is_number_divisible_throws() {
    }

    @Test
    public void is_valid_user_email() {
    }

    @Test
    public void test_Mock_service() {
    }

    @Test
    public void test_Mock_db_service() {
    }
}











/**
 * **** Hint ****
 * add()
 * divide()
 * Throwable exception = assertThrows(ArithmeticException.class, () -> e.divide(12, 0));
 * validateUserName()
 * <p>
 * **Mock
 * mock(Service.class);
 ****/