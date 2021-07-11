# Challenge Summary
<!-- Description of the challenge -->
Create a new class called pseudo queue.
Do not use an existing Queue.
Instead, this PseudoQueue class will implement our standard queue interface
utilize 2 Stack instances to create and manage the queue

## Whiteboard Process
<!-- Embedded whiteboard image -->
![](queue-stack.PNG)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- utilize 2 Stack instances to create and manage the queue(stack1,stack2).
- create enqueue method take an argument use to push a new node to stack1.
- create dequeue method .
- if stack1 is empty will return exception.
  if stack1 does not empty will do loop to push the top from stack1 to stack2 and do pop for each top in stack1.
- then after finish of push all nodes from stack1 to stack2 will define extractData to do pop for stack2.
- then if stack2 does not empty will do loop to push the top from stack2 to stack1 and do pop for each top in stack2.
- return extractData.
## Solution
<!-- Show how to run your code, and examples of it in action -->

### enqueue:

PseudoQueue sodo = new PseudoQueue();

sodo.enqueue(1);

sodo.enqueue(2);

sodo.enqueue(3);

sodo.tostring();

Result: {3} ->{2} ->{1} ->Null


### dequeue:

sodo.dequeue();

Result: {3} ->{2} ->Null

