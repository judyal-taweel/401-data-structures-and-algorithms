# Singly Linked List
<!-- Short summary or background information -->
Linked List is a sequence of Nodes that are connected to each other and each Node references the next Node.

## Challenge
<!-- Description of the challenge -->

create node class has two propareties data and pointer to the next node and linkedlist class has head property and has three methods insert , include , toString.


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Big O: O(1) in insert method and O(n) in include method.
## API
<!-- Description of each method publicly available to your Linked List -->
insert: method takes value and add the new node to the head.
include: method takes value and return boolean if this value included in the list.

# linked-list-insertions Summary
<!-- Description of the challenge -->

## Whiteboard Process
<!-- Embedded whiteboard image -->
![](C:\Users\LENOVO\Documents\challenges\401-data-structures-and-algorithms\data-structures\Linkedlist\lib\src\main\resources\appendLinkedlist.PNG)
![](C:\Users\LENOVO\Documents\challenges\401-data-structures-and-algorithms\data-structures\Linkedlist\lib\src\main\resources\insertBefore.PNG)
![](C:\Users\LENOVO\Documents\challenges\401-data-structures-and-algorithms\data-structures\Linkedlist\lib\src\main\resources\insertAfter.PNG)


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
looping through the linkedlist until find place for the new node.

## Solution
<!-- Show how to run your code, and examples of it in action -->
- append:
  linked.append(60);
  linked.append(70);
  linked.append(80);
  
result: 60->70->80->null

- insert before:
  linked.insertBefore(70,5); 
  
 result: 60->5->70->80->null

- insert after:
  linked.insertAfter(70,5);

result: 60->70->5->80->null



