package ProductManage;

import java.util.Random;

public class Producer implements Runnable {
    private Storage storage;

    public Producer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        int i = 0;
        Random r = new Random();

        while (i < 10) {
            i++;
            Product product = new Product(i, "产品：" + r.nextInt(100));
            storage.push(product);
        }
    }
}
