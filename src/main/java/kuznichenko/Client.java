package kuznichenko;

import java.util.Random;

public class Client implements Runnable{


    public void run() {
        int i;
        for (i = 0; i < 8; i++) {
            try {
                System.out.println("Покупатель sleep");
                Thread.sleep(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
