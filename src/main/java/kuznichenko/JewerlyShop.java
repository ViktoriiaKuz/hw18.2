package kuznichenko;

import java.util.Arrays;

public class JewerlyShop implements Runnable{


    private final Client[] clients;

    JewerlyShop(Client[] clients){
        this.clients = clients;

    }


    public void run() {
        if(clients[4] != null) {
            System.out.println("Shop is working" + Arrays.toString(clients));
            if (clients.length > 5) {
                try {
                    System.out.println("Магазин Sleep");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
