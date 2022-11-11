package products;

/**
 * Класс, описывающий товар
 * @author Дарья Герасимович
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

    /**
     * Функция определения цены {@link Product}
     */
    public void setPrice(int price) {
         this.Price = price;
    }

    /**
     * Функция определения названия {@link Product}
     */
    public void setName(String name) {
        this.Name = name;
    }
}
