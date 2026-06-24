# LEVEL 1 COLLECTIONS

## EXERCISE 1 DUPLICATES
This Java application explores two of the most common Java collections: ArrayList and HashSet.
The goal is to understand how to add and modify elements, and observe how each collection behaves when duplicates are 
introduced.

### STRUCTURE
```text
level1Exe1/
├── Main.java
└── Month.java
```
**Month**
* `name`
* `toString()`
* `equals()` and `hashCode()`

**Main**
Creates a list of months, inserts a missing one at a specific position, converts the list to a HashSet,
and traverses the collections using a for-each loop and an Iterator. 

### TESTING
First, 11 `Month` objects are added to an ArrayList, leaving out "August".
Output: [January, February, March, April, May, June, July, September, October, November, December]

August is inserted at index 7, in the correct position.
Output: [January, February, March, April, May, June, July, August, September, October, November, December]

The ArrayList is converted to a HashSet. Since this doesn't guarantee order, the elements are displayed in a different order.
Output: HashSet: [December, April, June, August, ...] 
Output: Number of elements: 12

To test duplicate behavior, a `new Month("January")` is added to the HashSet before overriding `equals()` and `hashCode()`.
Since Java compares objects by memory address by default, the new object is treated as a different element and is accepted.
Output: New number of elements: 13

After overriding `equals()` and `hashCode()` in Month to compare by name, the same test is repeated.
Now the HashSet correctly identifies the duplicate and rejects it.
Output: New number of elements: 12

Finally, the collections are traversed using a for-each loop and an Iterator, showing the same elements
but confirming that ArrayList preserves insertion order while HashSet doesn't.

### CONCLUSIONS
ArrayList maintains insertion order and allows duplicates. HashSet does not allow duplicates and does not guarantee order.
Without overriding `equals()` and `hashCode()`, Java compares objects by memory address,so two Month objects with the same 
name are treated as different elements by HashSet. 
Once `equals()` and `hashCode()` are overridden to compare by name, duplicates are correctly detected and rejected.
The for-each loop is simpler and more readable for basic traversal, while the Iterator provides more control over the iteration process.


## EXERCISE 2 LIST ITERATOR
In this exercise the goal is manipulate a List and the use of `ListIterator` to traverse a list in reverse order.

### STRUCTURE
``` text 
Level1Exe2/
├── Main.java
└── ManageList.java
```

**ManageList**
* `createList`(int... numbers) — creates and fills a list from the given values
* `reverseList`(List<Integer> originalList) — returns a new list with the elements in reverse order using a `ListIterator`


**Main**
Calls `ManageList` to create the original list and get the reversed one, then prints both results.

### TESTING
`ListManager.createList()` is called with values from 0 to 10.
Output: Original: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

`ListManager.reverseList()` creates a `ListIterator` positioned at the end of the original list using `listIterator(originalList.size())`.
It traverses the list backwards using `hasPrevious()` and `previous()`, adding each element to a new list.
Output: Reversed: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

### CONCLUSIONS
`ListIterator` extends `Iterator` and allows traversal in both directions, making it the right tool for reading a list in 
reverse without modifying the original.
Positioning the cursor at `list.size()` places it after the last element, so the first call to `previous()` returns the last element.
Separating the list logic into `ManageList` keeps Main clean and focused only on orchestrating the program.
Both the parameter and return type of `reverseList()` are declared as `List<Integer>` instead of `ArrayList<Integer>`, following 
the good practice of programming against the interface rather than the implementation.

