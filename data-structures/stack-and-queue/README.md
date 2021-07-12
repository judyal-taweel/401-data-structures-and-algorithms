# Challenge Summary
<!-- Description of the challenge -->

Create a class called AnimalShelter which holds only dogs and cats.
The shelter operates using a first-in, first-out approach.


## Whiteboard Process
<!-- Embedded whiteboard image -->
![](C:\Users\LENOVO\Documents\challenges\401-data-structures-and-algorithms\data-structures\stack-and-queue\app\src\main\java\stack\and\queue\Animals.PNG)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
space: O(1)
time: O(1)

## Solution
<!-- Show how to run your code, and examples of it in action -->

enqueue:

Animal animal = new Animal("cat");

Animal animal1 = new Animal("dog");

Animal animal2 = new Animal("monkey");

animal.enqueue(animal.getKind());
animal.enqueue(animal1.getKind());
animal.enqueue(animal2.getKind());

Result: {cat} ->{dog} ->Null

dequeue: 

System.out.println( animal.deQueue("dog"));

Result: {cat} ->Null



