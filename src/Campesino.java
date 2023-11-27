import java.util.List;
import java.util.Scanner;

public class Campesino extends Vendedor{
    private final static int max_size_invent = 5;
    private final static int impuesto = 2;
    private final static int desgaste = 15;

    public Campesino(List<Item> item_venta) {
        super(item_venta, max_size_invent);
    }

    @Override
    public Item ventaItem(int impuesto, int new_desgaste) {
        impuesto = Campesino.impuesto;
        new_desgaste = Campesino.desgaste;
        return super.ventaItem(impuesto, new_desgaste);
    }
}
