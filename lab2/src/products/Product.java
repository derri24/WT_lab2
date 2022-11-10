package products;

/**
 * Класс, описывающий товар
 * @autor Дарья Герасимович
 */
public class Product {
    /**
     * Поле цена
     */
    private int Price;
    /**
     * Поле имя
     */
    private String Name;

    /**
     * Функция получения цены {@link Product}
     */
    public int getPrice() {
        return Price;
    }

    /**
     * Функция получения названия {@link Product}
     */
    public String getName() {
        return Name;
    }
}
