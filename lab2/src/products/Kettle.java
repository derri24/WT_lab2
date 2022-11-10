package products;

/**
 * Класс, описывающий чайник
 * @autor Дарья Герасимович
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
     * Процедура определения материала {@link Kettle#material}
     * @param material - материал
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Процедура определения цвета {@link Kettle#color}
     * @param color - цвет
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Процедура определения типа чайника {@link Kettle#type}
     * @param type - тип чайника
     */
    public void setType(String type) {
        this.type = type;
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
