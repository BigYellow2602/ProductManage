package ProductManage;

public class ProductManage {
    public static void main(String[] args) throws InterruptedException {
        Storage storage = new Storage();

        Thread producer1 = new Thread(new Producer(storage),"生产者1");
        Thread producer2 = new Thread(new Producer(storage),"生产者2");
        Thread consumer1 = new Thread(new Consumer(storage),"消费者1");
        Thread consumer2 = new Thread(new Consumer(storage),"消费者2");

        producer1.start();
        producer2.start();
        Thread.sleep(100);
        consumer1.start();
        consumer2.start();
    }
}
