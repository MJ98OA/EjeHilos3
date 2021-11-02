public class Clientes extends Thread {

    int itemcli = Item.precios();
    String precio = Item.item();

    @Override
    public void run() {

        try {

            Thread.sleep(1000);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}