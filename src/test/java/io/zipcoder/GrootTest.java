package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class GrootTest {
    @Test
    public void constructorTest() {
        // given
        Integer expectedAge = 100;
        String expectedName = "Groot";

        // when
        Groot groot = new Groot(expectedName,expectedAge);
        Integer actualAge = groot.getAge();
        String actualName = groot.getName();

        // then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void speakTest() {
        // given
        String expected = "I am Groot";

        // when
        Groot groot = new Groot("Groot",5);
        String actual = groot.speak();
        // then
        Assert.assertEquals(expected, actual);
    }
}
