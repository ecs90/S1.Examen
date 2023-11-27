import java.util.List;
import java.util.Scanner;

public class Vendedor {
    private List<Item> item_venta;
    private String ciudad;

    public Vendedor(List<Item> item_venta, int value) {
        this.item_venta = item_venta;
        System.out.println("De donde es nuestro vendedor?");
        Scanner scanner1 = new Scanner(System.in);
        this.ciudad = scanner1.next();
        while(item_venta.size() > value)
        {
            System.out.println("Son demasiados items, elije cual abandonar");
            for (Item item : this.getItem_venta()) {
                System.out.println(getItem_venta().indexOf(item) + "-" + item.getNombre());
            }
            System.out.println("Inserte el numero correspondiente al item");
            Scanner scanner2 = new Scanner(System.in);
            item_venta.remove(scanner2.nextInt());
        }
    }

    public List<Item> getItem_venta() {
        return item_venta;
    }

    public void setItem_venta(List<Item> item_venta) {
        this.item_venta = item_venta;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Item ventaItem(int impuesto, int new_desgaste)
    {
        System.out.println("Que item quieres vender?");
        for (Item item : item_venta) {
            System.out.println(getItem_venta().indexOf(item) + "-" + item.getNombre());
        }
        System.out.println("Insertar el numero correspondiente al item");
        Scanner scanner = new Scanner(System.in);
        int num_item = scanner.nextInt();
        System.out.println("El precio a pagar es de " + item_venta.get(num_item).getPrecio() * impuesto);
        Item item = getItem_venta().get(num_item);
        item.setDesgaste(item.getDesgaste() + new_desgaste);
        item_venta.remove(num_item);
        return item;
    }
}
