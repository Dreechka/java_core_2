package lesson_4.intermediate;

public class Workman {
    private final String name;
    private int jornal;
    private Warehouse warehouse;

    public Workman(String name, Warehouse warehouse) {
        this.name = name;
        this.warehouse = warehouse;
        jornal = 0;
    }

    public String getName() {
        return name;
    }

    public int getJornal() {
        return jornal;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void messUpGoods() {
        if (warehouse.getAvailableProduct() > 0) {
            System.out.println("Рабочий " + getName() + ": Ура я испортил водку!" + " товара доступно: " + warehouse.getAvailableProduct());
            warehouse.setAvailableProduct(warehouse.getAvailableProduct() - 1);
            jornal++;
        } else
            System.out.println(warehouse.getGoods() + " закончилась!");
    }

}
