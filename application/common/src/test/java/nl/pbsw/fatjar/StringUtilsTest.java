package nl.pbsw.fatjar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    private final static String EMPTY_STRING = "";
    private final static String SOME_STRING = "Some String";

    @Test
    void isEmpty() {
        assertTrue(StringUtils.isEmpty(EMPTY_STRING));
    }

    @Test
    void isNotEmptyWithIsEmpty() {
        assertFalse(StringUtils.isEmpty(SOME_STRING));
    }

    @Test
    void isNotEmptyButIsEmpty() {
        assertFalse(StringUtils.isNotEmpty(EMPTY_STRING));
    }

    @Test
    void isNotEmpty() {
        assertTrue(StringUtils.isNotEmpty(SOME_STRING));
    }
}
