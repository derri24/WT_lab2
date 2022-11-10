import businesslogiclayer.BaseProductService;
import businesslogiclayer.ProductService;
import products.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Класс для отображения списка чайников и самого дешевого товара
 * @autor Дарья Герасимович
 */
public class Application {
    /**
     * Процедура печати продукта {@link Application}
     */
    private static void printProduct(Product product) {
        System.out.println(product.toString());
    }

    /**
     * Процедура печати списка чайников {@link Application}
     */
    private static void printKettles(ArrayList<Kettle> products) {
        for (var product : products)
            System.out.println(product.toString());
    }

    /**
     * Главная процедура приложения {@link Application}
     */
    public static void main(String[] args) throws FileNotFoundException {
        BaseProductService baseProductService = new ProductService();

        var kettles = baseProductService.findAllKettles();
        var cheapestProduct = baseProductService.findCheapestProduct();

        System.out.println("\nCHEAPEST PRODUCT: ");
        printProduct(cheapestProduct);

        System.out.println("\nKETTLES: ");
        printKettles(kettles);
    }
}
