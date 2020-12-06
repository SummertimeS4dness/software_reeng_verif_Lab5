package sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UtilsTest {

    @Test
    void testConcatWords() {
        String result = Utils.concatWords("words");
        Assertions.assertEquals("words", result);
    }

    @Test
    void testComputeFactorial() {
        String result = Utils.computeFactorial(1);
        Assertions.assertEquals("1", result);
    }

    @Test
    void testNormalizeWord() {
        String result = Utils.normalizeWord("word");
        Assertions.assertEquals("word", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme