package products;

/**
 * Класс, описывающий чайник
 * @author Дарья Герасимович
 */
public class Kettle extends Product {

    /**
     * Поле материал
     */
    private String material;
    /**
     * Поле цвет
     */
    private String color;

    /**
     * Поле тип
     */
    private String type;

    /**
     * Поле объем
     */
    private int volume;

    /**
     * Функция получения материала {@link Kettle}
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Процедура определения материала {@link Kettle#material}
     * @param material - материал
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Функция получения цвета {@link Kettle}
     */
    public String getColor() {
        return color;
    }
    /**
     * Процедура определения цвета {@link Kettle#color}
     * @param color - цвет
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Функция получения типа чайника {@link Kettle}
     */
    public String getType() {
        return type;
    }

    /**
     * Процедура определения типа чайника {@link Kettle#type}
     * @param type - тип чайника
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Функция получения оъема {@link Kettle}
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Процедура определения объема {@link Kettle#volume}
     * @param volume - объем
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * Функиция приведения чайника к строке {@link Kettle}
     */
    @Override
    public String toString() {
        return "\nName: " + this.getName() +
                "\nPrice: " + this.getPrice() +
                "\nType: " + this.type +
                "\nMaterial: " + this.material +
                "\nColor: " + this.color +
                "\nVolume: " + this.volume;
    }

}
