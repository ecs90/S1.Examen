import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Vendedor crearVendedor(List<Item> itemsL, List<Item> itemsM, List<Item> itemsC){
        Vendedor vendedor = null;
        boolean flag = true;
        while (flag)
        {
            Scanner sc1 = new Scanner(System.in);
            int select = sc1.nextInt();
            switch (select) {
                case 1:
                    vendedor = new Ladron(itemsL);
                    flag = false;
                    break;
                case 2:
                    vendedor = new Mercader(itemsM);
                    flag = false;
                    break;
                case 3:
                    vendedor = new Campesino(itemsC);
                    flag = false;
                    break;
                default:
                    System.out.println("Elije entre 1 y 3 segun:");
                    System.out.println("1- Ladron;\n2- Mercader;\n3-Campesino.");
            }
        }
        return vendedor;
    }
    public static void main(String[] args) {
        List<Item> itemsM = new ArrayList<>();
        List<Item> itemsL = new ArrayList<>();
        List<Item> itemsC = new ArrayList<>();

        Item manzana = new Item("Manzana", "Comestible", 0.5F, 3);
        //Desgaste = 3 -> Esta mordida jeje
        itemsM.add(manzana);
        manzana.setDesgaste(0);
        itemsL.add(manzana);
        Item cuchillo = new Item("Cuchillo", "Ataque", 10, 15);
        itemsL.add(cuchillo);
        Item flor = new Item("Flor", "Oculto", 99.35F, 0);
        itemsC.add(flor);

        System.out.println("Bienvenido! \nLo primero que haremos sera crear un nuevo vendedor.");
        System.out.println("Que tipo de vendedor quieres crear?");
        System.out.println("1- Ladron;\n2- Mercader;\n3-Campesino.");
        System.out.println("Por favor, ingrese el valor correspondiente al vendedor");

        Vendedor vendedor1 = crearVendedor(itemsL, itemsM, itemsC);

        System.out.println("Crea un segundo vendedor, mejor si es de otro tipo");
        Vendedor vendedor2 = crearVendedor(itemsL, itemsM, itemsC);

        //Con un poco mas de tiempo hacia un dialogo de compra/venta y seleccion de item
        vendedor1.comprarItem(vendedor2.ventaItem(0,0));

    }
}