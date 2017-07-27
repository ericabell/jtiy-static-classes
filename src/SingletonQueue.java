public class SingletonQueue {
    private Queue queue1 = new Queue();

    public void addNumberToQueue(int number) {
        queue1.addNumberToQueue(number);
    }

    public int removeNumberFromQueue() {
        return queue1.removeNumberFromQueue();
    }
}
