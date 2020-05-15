package org.wecancodeit.fizzbuzz;


public class FizzBuzz {

    public String say(int number) {
        String name = "";
        if (number < 0) {
            return "Please select a positive number";
        }
        name += returnStrIfDivisibleBy(number, 3, "Fizz");
        name += returnStrIfDivisibleBy(number, 5, "Buzz");
        name += returnStrIfDivisibleBy(number, 11, "BANG");
        if (name.length() == 0) {
            return "" + number;
        } else {
            return name;
        }
    }

    public String returnStrIfDivisibleBy(int i, int number, String str) {
        if ((i % number) == 0) {
            return str;
        } else {
            return "";
        }
    }
}
