package stringexample;

public class HeapvsStackMemory {
    public static void main(String[] args){
        int i = 1; // We are creating primitive local variable at line 2, so it’s created and stored in the stack memory.
        Object obj = new Object();// Object created in heap. obj created in stack memory
        HeapvsStackMemory mem = new HeapvsStackMemory(); // HeapvsStackMemory created in heap. But mem created in stack memory
        mem.foo(obj); // foo also created in stack memory.
    }

    private void foo(Object obj) {

        String str = obj.toString(); // Object to string created in heap memory. String created in string pool of heap.
        System.out.println(str);
    } // Stack memory becomes free.

/*
Difference between Java Heap Space and Stack Memory

Based on the above explanations, we can easily conclude following differences between Heap and Stack memory.

    1- Heap memory is used by all the parts of the application whereas stack memory is used only by one thread of execution.
    2- Whenever an object is created, it’s always stored in the Heap space and stack memory contains the reference to it.
       Stack memory only contains local primitive variables and reference variables to objects in heap space.
    3- Objects stored in the heap are globally accessible whereas stack memory can’t be accessed by other threads.
    4- Memory management in stack is done in LIFO manner whereas it’s more complex in Heap memory because it’s used globally.
       Heap memory is divided into Young-Generation, Old-Generation etc, more details at Java Garbage Collection.
    5- Stack memory is short-lived whereas heap memory lives from the start till the end of application execution.
    6- We can use -Xms and -Xmx JVM option to define the startup size and maximum size of heap memory.
       We can use -Xss to define the stack memory size.
    7- When stack memory is full, Java runtime throws java.lang.StackOverFlowError whereas if heap memory is full,
       it throws java.lang.OutOfMemoryError: Java Heap Space error.
    8- Stack memory size is very less when compared to Heap memory. Because of simplicity in memory allocation (LIFO),
       stack memory is very fast when compared to heap memory.
*/
}
