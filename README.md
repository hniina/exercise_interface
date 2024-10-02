# exercise_interface

Software Architecture. Interfaces exercise:

1.	Implement a class Person that:
a.	Stores both name and surname.
b.	Has a method to print the name and surname to the screen.

2.	Implement a class Sorter that it is able to sort an array of Persons (Person[]). It must:
a.	Have a method that receives an array of Person
b.	Sort the array by surname, name.
c.	Use a simple algorithm like:
i.	https://en.wikipedia.org/wiki/Bubble_sort
ii.	https://en.wikipedia.org/wiki/Insertion_sort


3.	Implement a Program that uses the Sorter to sort an array of 5 persons.

4.	Implement a class Rectangle that:
a.	Stores its width and the height
b.	Has a method to calculate its area

5.	Draw a diagram of the current classes of the system

6.	Which modifications you have to do to make the Sorter class capable of sorting both Rectangles and Persons? 
a.	Rectangles must be sorted by its area.
b.	Which element of your design enables the class Sorter and its sort method to accept both Persons and Rectangles?
c.	Draw a new diagram with the proposed changes before trying to implement it.
d.	DO NOT CONTINUE READING UNTIL YOU HAVE A CLEAR IDEA OF HOW TO IMPLEMENT IT !!

 
7.	This element must have a method that receives two objects and return a boolean indicating if the second is bigger or not (in sort order) than the the first object. Make sure that your design follows this tip.

8.	Implement your design and make a program that sorts an array of 5 Persons and other array of 5 Rectangles.

9.	Your solution should be similar to the one, already present in standard Java. Have a look at the following documents:
a.	https://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html
b.	https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#sort(java.util.List)

10.	Implement your program to sort Persons and Rectangles by using the Comparable interface and the Collections class. 




