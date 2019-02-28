package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void constructorTest() {
        // given
        Integer expectedAge = 0;
        String expectedName = "";

        // when
        Pet pet = new Pet(expectedName,expectedAge);
        Integer actualAge = pet.getAge();
        String actualName = pet.getName();

        // then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void getNameTest() {
        // given
        String expectedName = "Ted";

        // when
        Pet pet = new Pet(expectedName,0);
        String actualName = pet.getName();

        // then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getAgeTest() {
        // given
        Integer expectedAge = 10;

        // when
        Pet pet = new Pet("",expectedAge);
        Integer actualAge = pet.getAge();

        // then
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void speakTest() {
        // given
        String expected = null;

        // when
        Pet pet = new Pet("",0);
        String actual = pet.speak();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compareToTest() {
        // given
        String expectedName = "Bob";
        String otherPetName = "Cali";
        Integer expected = -1;
        Pet pet = new Pet(expectedName,0);
        Pet otherPet = new Pet(otherPetName,0);

        // when
        Integer actual = pet.compareTo(otherPet);
        // then
        Assert.assertEquals(expected, actual);
    }
}
