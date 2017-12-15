# Password entropy

### Learning objectives
This exercise is designed to help you learn about (and assess whether you have learned about):
* How to understand a problem.
* How to write an algorithm for solving a problem.
* How to write a simple program in Java using variables, conditions, loops, and terminal output.
* How to create test cases that can be used to verify the correctness of an algorithm.

As a practical matter, this exercise will help you become comfortable with the various policies (including submission policies and grading policies) that you must comply with while working on them and the various tools you will use while working on them.

Lastly, this exercise will give you a better understanding and appreciation for password entropy.

### Background
Have you ever wondered why many websites have password requirements like:
* be a minimum of 8 and a maximum of 16 characters
* must contain at least one
  * upper-case letter,
  * lower-case letter,
  * number, and
  * special character: ! $ / % @ #

They are an attempt to prevent the use of passwords that are easy to guess. The underlying idea is to increase the amount of entropy in user selected passwords. Entropy is a measure of the randomness of the space of possible passwords that could be generated using the above rules.

&#8721;

``` java
package password;

public class Main
{
  public static void main(String [] args)
  {
    /* Write code here to compute the time it would take to brute-force search for a
     * password. */
  }
}
```

## Disclaimer
The program that you develop for this exercise should **NOT** be considered a measure of the strength of a particular password. An obvious example would be the password '*P@ssw0rd*', whose entropy would be computed as XXXXX, but in practice would be among the first passwords checked by any cracker worth their salt.
