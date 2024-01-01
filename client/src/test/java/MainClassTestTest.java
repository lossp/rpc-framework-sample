import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainClassTestTest {
    private MainClassTest mainClassTest = new MainClassTest();
    @Test
    public void should_return_test_string() {
        // given & when
        String s = mainClassTest.justTest();
        // then
        assertEquals(s, "just-test");
    }
}