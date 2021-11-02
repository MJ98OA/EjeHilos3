import java.util.Random;
public class Item {

    public static String item(){
        Random r=new Random();
        int min=900000;
        int articulo=r.nextInt(999999)+min;
        return "Item"+articulo;
    }

    public static int precios(){
        Random r=new Random();
        int min=1;
        int x=r.nextInt(100)+min;
        System.out.println(x);
        return x;
    }
}
