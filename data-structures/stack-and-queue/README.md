# Challenge Summary
<!-- Description of the challenge -->
Create a class called AnimalShelter which holds only dogs and cats.
The shelter operates using a first-in, first-out approach.

## Whiteboard Process
<!-- Embedded whiteboard image -->
![](C:\Users\LENOVO\Documents\challenges\401-data-structures-and-algorithms\data-structures\stack-and-queue\app\src\main\java\stack\and\queue\catdog.PNG)
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Time: O(1)
Space: O(1)

## Solution
<!-- Show how to run your code, and examples of it in action -->

enqueue:

input:
Cat cat = new Cat("cat1");
Cat cat2 = new Cat("cat2");
Dog dog = new Dog("dog1");

output:
cat1,cat2,dog1

dequeue:

input:
cat

output:
cat1

## Test
public void testAnimalShelterDequeue() {
AnimalShelter animalShelter = new AnimalShelter();
Dogs dog1 = new Dogs("Scooby");
animalShelter.enqueue(dog1);
Cats cat2 = new Cats("Garfield");
animalShelter.enqueue(cat2);
Cats cat3 = new Cats("HelloKitty");
animalShelter.enqueue(cat3);
Dogs dog4 = new Dogs("Scrappy");
animalShelter.enqueue(dog4);
assertEquals(dog1.getName(), animalShelter.dequeue("dog").getName());
assertEquals(dog4.getName(), animalShelter.dequeue("dog").getName());
}