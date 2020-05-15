package org.wecancodeit.fizzbuzz;

public class FizzBuzzApplication {
    public static void main(String[] args) {
        FizzBuzz fizzBuzzGame = new FizzBuzz();
        for (int i = 1; i<=546; i++) {
            System.out.println(fizzBuzzGame.say(i));
        }
    }
}
