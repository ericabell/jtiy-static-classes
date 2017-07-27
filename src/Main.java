public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Begin:");

        // create a Queue
        Queue queue1 = new Queue();

        // add a value to the queue
        queue1.addNumberToQueue(4);
        queue1.addNumberToQueue(5);
        queue1.addNumberToQueue(6);
        queue1.addNumberToQueue(7);

        // remove and print it
        System.out.println(queue1.removeNumberFromQueue());
        System.out.println(queue1.removeNumberFromQueue());
        System.out.println(queue1.removeNumberFromQueue());

        // add more numbers
        queue1.addNumberToQueue(8);
        queue1.addNumberToQueue(9);

        // remove some numbers and print them
        System.out.println(queue1.removeNumberFromQueue());
        System.out.println(queue1.removeNumberFromQueue());


        // ADVENTURE: check to make sure that when you try to create another
        // Queue, you just get back a reference the first queue created
        Queue queue2 = new Queue();

        // add more numbers
        queue1.addNumberToQueue(8);
        queue1.addNumberToQueue(9);

        // remove some numbers and print them
        System.out.println(queue1.removeNumberFromQueue());
        System.out.println(queue1.removeNumberFromQueue());


        // EPIC
        System.out.println("EPIC MODE");

        SingletonQueue queue3 = new SingletonQueue();

        queue3.addNumberToQueue(14);
        queue3.addNumberToQueue(15);
        queue3.addNumberToQueue(16);

        System.out.println(queue3.removeNumberFromQueue());
        System.out.println(queue3.removeNumberFromQueue());
        System.out.println(queue3.removeNumberFromQueue());
        System.out.println(queue3.removeNumberFromQueue());

    }
}
