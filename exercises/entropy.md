# Password entropy

#### Learning objectives
This exercise is designed to help you learn about (and assess whether you have learned about):
* How to understand a problem.
* How to write an algorithm for solving a problem.
* How to write a simple program in Java using variables, conditions, loops, and terminal output.
* How to create test cases that can be used to verify the correctness of an algorithm.

As a practical matter, this exercise will help you become comfortable with the various policies (including submission policies and grading policies) that you must comply with while working on them and the various tools you will use while working on them.

Lastly, this exercise will give you a better understanding and appreciation for password entropy.

#### Background
Have you ever wondered why many websites have password requirements like:
* be a minimum of 8 and a maximum of 16 characters
* must contain at least one
  * upper-case letter,
  * lower-case letter,
  * number, and
  * special character: ! $ / % @ #
  
They are an attempt to prevent users from choosing passwords that are easy to guess. In this context, it will not be a person guessing, but rather a machine running a cracking program, capable of thousands or millions of guesses per second. It turns out that when requirments like this are not enforced people tend to pick easily guessable passwords. According to many sources, some of the most popular passwords are:
* password
* 123456
* qwerty
* monkey
* password1

By requiring the inclusion of certain groups of characters, it prevents the use of passwords such as those listed above, at least in their most obvious form. If a cracking program is unable to quickly guess a password based on a dictionary of common passwords, it is necessary to use *brute-force* to guess the password, i.e., check all possible passwords that satisfy the requirements.

A useful exercise for any computer literate person interested in the security of their password protected identity is to determine how many possible passwords could be constructed from a given set of requirements, and how long it would take a cracking program to check all such passwords. These total number of passwords can be expressed as:

(1) C<sup>L</sup>,

where *C* is the number of in the password alphabet, and *L* is the length of the password.

This is only an indication of how strong a password is, since 

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

### Disclaimer
The program that you develop for this exercise should **NOT** be considered a measure of the strength of a particular password. An obvious example would be the password '*P@ssw0rd*', whose entropy would be computed as XXXXX, but in practice would be among the first passwords checked by any cracker worth their salt.
