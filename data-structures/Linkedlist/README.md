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
![](../resources/appendLinkedlist.PNG)
![](../resources/insertAfter.PNG)
![](../resources/insertBefore.PNG)


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

# linked-list-kth Summary
<!-- Description of the challenge -->

## Whiteboard Process
<!-- Embedded whiteboard image -->
![](../resources/returnnum.PNG)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
loop through linkedlist until from the end and return the node’s value that is `k` places


## Solution
<!-- Show how to run your code, and examples of it in action -->

linked.append(60);
linked.append(70);
linked.append(80);
System.oyt.println("the node is "+ linked.returnNum(2));
System.oyt.println("the node is "+ linked.returnNum(4));
System.oyt.println("the node is "+ linked.returnNum(-3));


result: the node is 70
result: the node is -1
result: the node is 0

# Test

LinkedList linked = new LinkedList();
@Test void kGreaterLength() {
linked.insert(2);
linked.append(4);
linked.append(3);
linked.append(5);
int expect = -1 ;
int x=  linked.returnNum(5);
assertEquals(expect ,x);
}

@Test void kEqualLength(){
linked.insert(2);
linked.append(4);
linked.append(3);
linked.append(5);
int expect = 2;
int x=  linked.returnNum(4);
assertEquals(expect,x);
}

@Test void negativeK(){
linked.insert(2);
linked.append(4);
linked.append(3);
linked.append(5);
int expect = 0;
int x=  linked.returnNum(-1);
assertEquals(expect,x);
}

@Test void oneNode(){
linked.insert(5);
int expect = 5;
int x=  linked.returnNum(1);
assertEquals(expect,x);
}

@Test void happyPath(){
linked.insert(2);
linked.append(4);
linked.append(9);
linked.append(6);
linked.append(8);
int expect = 9;
int x=  linked.returnNum(3);
assertEquals(expect,x);
}




