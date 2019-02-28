package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author leon on 03/02/2019.
 */
public class IOConsoleTest {
    private IOConsole console;
    @Test
    public void test1() {
        String outputString = "The quick brown fox";
        test(outputString);
    }

    @Test
    public void test2() {
        String outputString = "The quick %s fox";
        String[] stringArguments = {"brown"};
        test(outputString, stringArguments);
    }

    @Test
    public void test3() {
        String outputString = "The %s %s fox";
        String[] stringArguments = {"quick", "brown"};
        test(outputString, stringArguments);
    }

    @Test
    public void test5() {
        String outputString = "Over the lazy dog";
        test(outputString);
    }

    @Test
    public void test6() {
        String outputString = "Over the %s dog.";
        String[] stringArguments = {"lazy"};
        test(outputString, stringArguments);
    }

    @Test
    public void test7() {
        String outputString = "Over the %s %s.";
        String[] stringArguments = {"lazy", "dog"};
        test(outputString, stringArguments);
    }

    @Test
    public void test8() {
        String outputString = "The quick brown fox";
        test(outputString);
    }

    @Test
    public void test9() {
        String outputString = "The quick %s fox";
        String[] stringArguments = {"brown"};
        test(outputString, stringArguments);
    }

    @Test
    public void test10() {
        String outputString = "The %s %s fox";
        String[] stringArguments = {"quick", "brown"};
        test(outputString, stringArguments);
    }

    @Test
    public void test11() {
        String outputString = "Over the lazy dog";
        test(outputString);
    }

    @Test
    public void test12() {
        String outputString = "Over the %s dog.";
        String[] stringArguments = {"lazy"};
        test(outputString, stringArguments);
    }

    @Test
    public void test13() {
        String outputString = "Over the %s %s.";
        String[] stringArguments = {"lazy", "dog"};
        test(outputString, stringArguments);
    }

    private void test(String outputString, String... stringArguments) {
        // Given
        String expected = String.format(outputString, stringArguments) + "\n";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        IOConsole console = new IOConsole(System.in, new PrintStream(outputStream));

        // When
        console.println(outputString, stringArguments);
        String actual = outputStream.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test14() {
        test("0");
    }

    @Test
    public void test15() {
        test("1");
    }

    private void test(String input) {
        // Given
        String expected = input;
        this.console = getConsoleWithBufferedInput(input);

        // When
        String actual = console.getStringInput("");

        // Then
        Assert.assertEquals(actual, expected);
    }

    private IOConsole getConsoleWithBufferedInput(String inputString) {
        byte[] inputBytes = inputString.getBytes();
        ByteArrayInputStream inputByteArray = new ByteArrayInputStream(inputBytes);
        Scanner scanner = new Scanner(inputByteArray);
        IOConsole console = new IOConsole(scanner, System.out);
        return console;
    }
}