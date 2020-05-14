package org.wecancodeit.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    2 Should "2"
    3 Should Say "Fizz"
    4 Should Say "4"
    5 Should Say "Buzz"
 */
public class FizzBuzzTest {
    @Test
    public void shouldInstantiate() {
        FizzBuzz underTest = new FizzBuzz();
    }

    @Test
    public void oneShouldSay1() {
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.say(1);
        //assertion
        assertEquals("1", result);
    }

    @Test
    public void twoShouldSay2() {
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.say(2);
        //assertion
        assertEquals("2", result);
    }

    @Test
    public void threeShouldSay3() {
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.say(3);
        //assertion
        assertEquals("Fizz", result);
    }

    @Test
    public void fourShouldSay4() {
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.say(4);
        //assertion
        assertEquals("4", result);
    }

    @Test
    public void fiveShouldSayBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void sixShouldSayFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(6);
        assertEquals("Fizz", result);
    }

    @Test
    public void nineShouldSayFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(9);
        assertEquals("Fizz", result);
    }

    @Test
    public void tenShouldSayBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(10);
        assertEquals("Buzz", result);
    }

    @Test
    public void fifteenShouldSayFizzBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void ThirtyShouldSayFizzBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(30);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void elevenShouldSayBang() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(11);
        assertEquals("BANG", result);
    }

    @Test
    public void TwentyTwoShouldSayBang() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(22);
        assertEquals("BANG", result);
    }

    @Test
    public void thirtyThreeShouldSayFizzBang() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(33);
        assertEquals("FizzBANG", result);
    }

    @Test
    public void fiftyFiveShouldSayBuzzBang() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(55);
        assertEquals("BuzzBANG", result);
    }

    @Test
    public void oneSixtyFiveShouldSayFizzBuzzBang() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(165);
        assertEquals("FizzBuzzBANG", result);
    }

    @Test
    public void negativeShouldWarn() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(-1);
        assertEquals("Please select a positive number", result);
    }
}
