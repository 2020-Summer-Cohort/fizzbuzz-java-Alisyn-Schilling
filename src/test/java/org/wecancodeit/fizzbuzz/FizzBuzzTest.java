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
    public void oneShouldSay1(){
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.say(1);
        //assertion
        assertEquals("1", result);
    }
    @Test
    public void twoShouldSay2(){
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.say(2);
        //assertion
        assertEquals("2", result);
    }
    @Test
    public void threeShouldSayFizz(){
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.say(3);
        //assertion
        assertEquals("Fizz", result);
    }
    @Test
    public void fourShouldSay4(){
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.say(4);
        //assertion
        assertEquals("4", result);
    }
    @Test
    public void fiveShouldSayBuzz(){
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(5);
        assertEquals("Buzz", result);
    }
    @Test
    public void sixShouldSayFizz(){
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(6);
        assertEquals("Fizz", result);
    }
    @Test
    public void nineShouldSayFizz(){
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(9);
        assertEquals("Fizz", result);
    }
    @Test
    public void tenShouldSayBuzz(){
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(10);
        assertEquals("Buzz", result);
    }
}
