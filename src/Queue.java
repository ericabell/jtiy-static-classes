import java.util.List;

public class Queue {

    // write a class that uses only static variables and static methods that is a queue
    // uses an array of length 10 to hold the values in the queue
    // add method puts value at end of the queue
    // remove method removes from front of queue and returns that value,
    //   and after removing,  all the cells shift to the front


    // ADVENTURE
    // how can you guarantee that no instances of a class can be created? Make
    //   this change to the queue class
    //
    // EPIC
    // Write a new singleton queue that uses a single instance of the queue class
    //   all the variables and methods change from being static to instances

    private static int[] theQueue = new int[10];
    private static int end = 0;

    public static void addNumberToQueue(int number) {
        // insert the number
        theQueue[end] = number;

        // increment pointer to end of queue
        end += 1;
    }

    public static int removeNumberFromQueue() {
        // save the value so we can return it
        int temp = theQueue[0];

        // delete [0] and shift other elements down by 1
        for(int i=1; i<=end; i++) {
            theQueue[i-1] = theQueue[i];
        }

        // decrement pointer by 1
        end -= 1;

        // return
        return(temp);
    }
}
