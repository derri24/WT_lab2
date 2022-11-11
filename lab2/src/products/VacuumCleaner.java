package products;

/**
 * Класс, описывающий пылесос
 * @author Дарья Герасимович
 */

public class VacuumCleaner extends Product {
    /**
     * Поле цвет
     */
    private String color;

    /**
     * Поле тип чистки
     */
    private String typeOfCleaning;

    /**
     * Поле длина шнура
     */
    private int cordLength;

    /**
     * Поле уровни фильтрации
     */
    private int filteringLevels;


    /**
     * Функция получения цвета {@link VacuumCleaner}
     */
    public String getColor() {
        return color;
    }

    /**
     * Процедура определения цвета пылесоса {@link VacuumCleaner#color}
     * @param color - количество режимов
     */
    public void setColor(String color) {
        this.color = color;
    }


    /**
     * Функция получения типа чистки {@link VacuumCleaner}
     */
    public String getTypeOfCleaning() {
        return typeOfCleaning;
    }

    /**
     * Процедура определения типа чистки {@link VacuumCleaner#typeOfCleaning}
     * @param typeOfCleaning - количество режимов
     */
    public void setTypeOfCleaning(String typeOfCleaning) {
        this.typeOfCleaning = typeOfCleaning;
    }

    /**
     * Процедура определения длины шнура {@link VacuumCleaner#cordLength}
     * @param cordLength - количество режимов
     */


    /**
     * Функция получения длины шнура {@link VacuumCleaner}
     */
    public int getCordLength() {
        return cordLength;
    }
    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    /**
     * Функция получения количества режимов {@link VacuumCleaner}
     */
    public int getFilteringLevels() {
        return filteringLevels;
    }

    /**
     * Процедура определения уровня фильтрации {@link VacuumCleaner#filteringLevels}
     * @param filteringLevels - количество режимов
     */
    public void setFilteringLevels(int filteringLevels) {
        this.filteringLevels = filteringLevels;
    }


    /**
     * Функиция приведения пылесоса к строке {@link VacuumCleaner}
     */
    @Override
    public String toString() {
        return "\nName: " + this.getName() +
                "\nPrice: " + this.getPrice() +
                "\nCord length: " + this.cordLength +
                "\nColor: " + this.color +
                "\nType of cleaning: " + this.typeOfCleaning +
                "\nFiltering levels: " + this.filteringLevels;
    }
}
