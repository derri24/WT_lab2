package products;

/**
 * Класс, описывающий холодильник
 * @author Дарья Герасимович
 */
public class Fridge extends Product {
    /**
     * Поле высота
     */
    private int height;
    /**
     * Поле ширина
     */
    private int width;
    /**
     * Поле вес
     */
    private int weight;
    /**
     * Поле уровень шума
     */
    private int noiseLevel;

    /**
     * Функция получения высоты {@link Fridge}
     */
    public int getHeight() {
        return height;
    }

    /**
     * Процедура определения высоты холодильника {@link Fridge#height}
     * @param height - высота холодильника
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Функция получения ширины {@link Fridge}
     */
    public int getWidth() {
        return width;
    }

    /**
     * Процедура определения ширины холодильника {@link Fridge#width}
     * @param width - ширина холодильника
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Функция получения веса {@link Fridge}
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Процедура определения веса холодильника {@link Fridge#weight}
     * @param weight - вес холодильника
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Функция получения уровня шума {@link Fridge}
     */
    public int getNoiseLevel() {
        return noiseLevel;
    }

    /**
     * Процедура определения уровня шума {@link Fridge#noiseLevel}
     * @param noiseLevel - уровень шума
     */
    public void setNoiseLevel(int noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    /**
     * Функиция приведения холодильника к строке {@link Fridge}
     */
    @Override
    public String toString() {
        return "\nName: " + this.getName() +
                "\nPrice: " + this.getPrice() +
                "\nHeight: " + this.height +
                "\nWidth: " + this.width +
                "\nWeight: " + this.weight +
                "\nNoise level: " + this.noiseLevel;
    }

}
