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

        queue1.addNumberToQueue(8);
        queue1.addNumberToQueue(9);

        System.out.println(queue1.removeNumberFromQueue());
        System.out.println(queue1.removeNumberFromQueue());

    }
}
