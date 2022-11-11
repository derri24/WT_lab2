package businesslogiclayer;
import products.Kettle;
import products.Product;
import java.util.ArrayList;

/**
 * Интерфейс для работы с товарами
 * @author Дарья Герасимович
 */
public interface BaseProductService {
    /**
     * Функция интерфейса для нахождения всех чайников {@link BaseProductService}
     * @return возвращает список чайников
     */
    ArrayList<Kettle> findAllKettles();

    /**
     * Функция интерфейса для нахождения самого дешевого товара {@link BaseProductService}
     * @return возвращает самый дешевый товар
     */
    Product findCheapestProduct();
}
