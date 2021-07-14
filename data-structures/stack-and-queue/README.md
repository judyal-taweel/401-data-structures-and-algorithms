# Challenge Summary
<!-- Description of the challenge -->
create function called validate brackets with string argument and Return boolean
representing whether or not the brackets in the string are balanced


## Whiteboard Process
<!-- Embedded whiteboard image -->
![](C:\Users\LENOVO\Documents\challenges\401-data-structures-and-algorithms\data-structures\stack-and-queue\app\src\main\java\stack\and\queue\brackets.PNG)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Time: O(n)
Space: O(n)

## Solution
<!-- Show how to run your code, and examples of it in action -->

brackets.correctBrackets("{{")

result: false

brackets.correctBrackets("{{}}")

result: true

brackets.correctBrackets("")

result: true

brackets.correctBrackets("{(]}")

result: false

