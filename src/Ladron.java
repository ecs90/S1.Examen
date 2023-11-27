import java.util.List;
import java.util.Scanner;

public class Ladron extends Vendedor{
    private final static int max_size_invent = 3;
    private final static int impuesto = 0;
    private final static int desgaste = 25;

    public Ladron(List<Item> item_venta) {
        super(item_venta, max_size_invent);
    }

    @Override
    public Item ventaItem(int impuesto, int new_desgaste) {
        impuesto = Ladron.impuesto;
        new_desgaste = Ladron.desgaste;
        return super.ventaItem(impuesto, new_desgaste);
    }
}
