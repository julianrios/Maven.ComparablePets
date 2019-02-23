package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ApplicationTest {

//    @Test
//    public void addPetsTest() {
//        // given
//        String outputString = "How many pets do you have?";
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        IOConsole console = new IOConsole(System.in, new PrintStream(outputStream));
//        Integer expected = 1;
//
//        // when
//        Integer actual = console.getIntegerInput(outputString);
//
//        // then
//        Assert.assertEquals(expected,actual);
//    }
//
//    @Test
//    public void typeOfPetTest() {
//        // given
//        String outputString = "What kind of pet do you have?";
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        IOConsole console = new IOConsole(System.in, new PrintStream(outputStream));
//        String expected = "dog";
//
//        // when
//        String actual = console.getStringInput(outputString);
//
//        // then
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void nameOfPetTest() {
//        // given
//        String outputString = "What is the name of your pet?";
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        IOConsole console = new IOConsole(System.in, new PrintStream(outputStream));
//        String expected = "Fido";
//        Pet pet = new Pet(expected,0);
//
//        // when
//        String actual = Pet.getName();
//
//        // then
//        Assert.assertEquals(expected, actual);
//    }


    @Test
    public void startTest() {
        // given
        Application application = new Application();
        Dog d = new Dog("Max", 10);
        Groot groot = new Groot("Groot", 10);

        List<Pet> givenPetArrayList = new ArrayList<>();
        givenPetArrayList.add(d);
        givenPetArrayList.add(groot);

        // when
        List<Pet> actualPetArrayList = application.start();

        // given
        Assert.assertEquals(givenPetArrayList, actualPetArrayList);
    }

    @Test
    public void printListTest() {
        // given
        Application application = new Application();
        Dog d = new Dog("Max", 10);
        Groot groot = new Groot("Groot", 10);

        List<Pet> petArrayList = new ArrayList<>();
        petArrayList.add(d);
        petArrayList.add(groot);
        String expected = "Name: Groot. Speak: I am Groot\nName: Max. Speak: Bark\n";

        // when
        String actual = application.printPetList(petArrayList);

        // then
        Assert.assertEquals(expected, actual);
    }


}
