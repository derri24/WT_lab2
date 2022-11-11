package businesslogiclayer;
import datalayer.BaseProductRepository;
import datalayer.XmlProductRepository;
import products.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Класс для работы с товарами, реализующий интерфейс {@link BaseProductService}
 * @author Дарья Герасимович
 */
public class ProductService implements BaseProductService {
    /** Поле списка продуктов */
    private final ArrayList<Product> products;

    /**
     * Конструктор - создание нового объекта
     * @see ProductService#ProductService()
     */
    public ProductService() {
        BaseProductRepository baseProductRepository = new XmlProductRepository();
        products = baseProductRepository.readAll();
    }

    /**
     * Реализация функции интерфейса для нахождения всех чайников {@link ProductService}
     * @return возвращает список чайников
     */
    @Override
    public ArrayList<Kettle> findAllKettles() {
        ArrayList<Kettle> kettles = new ArrayList<>();
        for (var product : products)
            if (product instanceof Kettle)
                kettles.add((Kettle) product);
        return kettles;
    }

    /**
     * Реализация функции интерфейса для нахождения самого дешевого товара {@link ProductService}
     * @return возвращает самый дешевый товар
     */
    @Override
    public Product findCheapestProduct() {
        int minPrice = Integer.MAX_VALUE;
        Product cheapestProduct = new Product();
        for (var product : products) {
            if (minPrice > product.getPrice()) {
                minPrice = product.getPrice();
                cheapestProduct = product;
            }
        }
        return cheapestProduct;
    }

}
