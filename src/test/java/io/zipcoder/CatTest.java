package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void constructorTest() {
        // given
        Integer expectedAge = 10;
        String expectedName = "Fluffball";

        // when
        Cat cat = new Cat(expectedName,expectedAge);
        Integer actualAge = cat.getAge();
        String actualName = cat.getName();

        // then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void speakTest() {
        // given
        String expected = "Meow";

        // when
        Cat cat = new Cat("Jinx",16);
        String actual = cat.speak();
        // then
        Assert.assertEquals(expected, actual);
    }
}
