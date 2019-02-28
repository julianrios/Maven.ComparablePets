package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void constructorTest() {
        // given
        Integer expectedAge = 10;
        String expectedName = "Ace";

        // when
        Dog dog = new Dog(expectedName,expectedAge);
        Integer actualAge = dog.getAge();
        String actualName = dog.getName();

        // then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void speakTest() {
        // given
        String expected = "Bark";

        // when
        Dog dog = new Dog("Tank",16);
        String actual = dog.speak();
        // then
        Assert.assertEquals(expected, actual);
    }
}
