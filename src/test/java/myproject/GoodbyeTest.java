package myproject;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodbyeTest {

    @Test
    public void t() {
        assertEquals("goobye", Goodbye.say());
    }

}
