package datalayer;
import products.Product;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Интерфейс для чтения, создания товаров
 * @autor Дарья Герасимович
 */
public interface BaseProductRepository {
     /**
      * Функция интерфейса чтения всех товаров {@link BaseProductRepository}
      * @return возвращает список товаров
      */
     ArrayList<Product> readAll() throws FileNotFoundException;
     /**
      * Процедура интерфейса создания товаров {@link BaseProductRepository}
      */
     void create(ArrayList<Product> products) throws FileNotFoundException;
}
