# Prime Number Filtering using IntStream

Below Examples explain how we can use Functional Programming to solve the iconic Prime Number Problem

## Using IntStream to check if Number is Prime
Here we are going to implement the logic of division using IntStream

`IntStream
.rangeClosed(2 , (int) Math.sqrt(number))
.noneMatch(divisor -> number % divisor == 0);`

Let us break it down

`IntStream
.rangeClosed(2 , (int) Math.sqrt(number))`

This generates a stream of integers starting from 2 (as prime number > 1) up to the SQRT(n).
The Square Root is used because if n has a divisor larger tha SQRT(n), the corresponding small divisor must be 
smaller than SQRT(n). So, we only need to check divisor up to SQRT(n) to determine if n is divisible by any of them.
___
**Example**
1. if n =  29, SQRT(29) is 5.39 Approx. S0, divisor candidates are 2, 3, 4, 5 .  
2. if n =  100, SQRT(100) is 10. S0, divisor candidates are 2, 3, 4, ....10 .
---

`noneMatch(divisor -> number % divisor == 0);`

This method checks if none of the numbers in the stream divide n evenly. 
It returns true if no number divides n evenly (i.e., no divisors were found), meaning n is prime. 
If any divisor divides n evenly (i.e., number % divisor == 0), it returns false, meaning n is not prime.
___
**Example**
1. if n =  29, It checks if 29 % 2 == 0, 29 % 3 == 0, 29 % 4 == 0, 29 % 5 == 0.
2. if n =  18, It checks if 18 % 2 == 0 (this is true), so 18 is not prime.
---




