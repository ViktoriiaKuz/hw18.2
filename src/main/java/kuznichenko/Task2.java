package kuznichenko;

/**
 * В городе успешно работает ювелирный магазин,
 * так как к магазину постоянно приходят клиенты.
 * Условием работы магазина является наличие 4 клиентов,
 * также одновременно в помещении может находиться не более 5 человек (покупателей).
 * Если в магазине становиться меньше 4 покупателей магазин
 * закрывается на перерыв(10 секунд). Каждый покупатель находится в магазине
 * в промежутке от 1 до 8 сек.
 */

public class Task2 {

    public static void main(String[] args) {
        Client client = new Client();
        Client [] clients = new Client[6];

        while(true){
            for (int i = 0; i < 5; i++){
                clients[i] = new Client();

                Thread buyer = new Thread(client, "   покупатель");
                buyer.start();


                JewerlyShop jewerlyShop = new JewerlyShop(clients);


                Thread jewer = new Thread(jewerlyShop, "   магазин");
                jewer.start();

            }
        }


    }

}
