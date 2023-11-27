import java.util.List;
import java.util.Scanner;

public class Mercader extends Vendedor{
    private final static int max_size_invent = 7;
    private final static int impuesto = 4;
    private final static int desgaste = 0;

    public Mercader(List<Item> item_venta) {
        super(item_venta, max_size_invent);
    }

    @Override
    public Item ventaItem(int impuesto, int new_desgaste) {
        impuesto = Mercader.impuesto;
        new_desgaste = Mercader.desgaste;
        return super.ventaItem(impuesto, new_desgaste);
    }
}
