package datalayer;
import products.Product;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 * Класс для для чтения, создания товаров, реализующий интерфейс {@link BaseProductRepository}
 * @author Дарья Герасимович
 */
public class XmlProductRepository implements BaseProductRepository {
    /**
     * Поле путь
     */
    private final String path;
    /**
     * Конструктор - создание нового объекта
     * @see XmlProductRepository#XmlProductRepository()
     */
    public XmlProductRepository() {
        path = "products.xml";
    }

    /**
     * Реализация функции интерфейса для чтения всех товаров {@link XmlProductRepository}
     * @return возвращает список товаров
     */

    public ArrayList<Product> readAll()  {
        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            java.beans.XMLDecoder xmlDecoder = new java.beans.XMLDecoder(fileInputStream);
            var products = xmlDecoder.readObject();
            xmlDecoder.close();
            return (ArrayList<Product>)products;
        }
        catch (FileNotFoundException ex){
            return new ArrayList<>();
        }
    }

    /**
     * Реализация процедуры интерфейса для создания товаров {@link XmlProductRepository}
     */
    public void create(ArrayList<Product> products) {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            java.beans.XMLEncoder   xmlEncoder = new java.beans.XMLEncoder(fileOutputStream);
            xmlEncoder.writeObject(products);
            xmlEncoder.close();
        }
        catch(Exception ex){
        }
    }
}
