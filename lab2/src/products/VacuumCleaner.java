package products;

/**
 * Класс, описывающий пылесос
 * @autor Дарья Герасимович
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
     * Процедура определения цвета пылесоса {@link VacuumCleaner#color}
     * @param color - количество режимов
     */
    public void setColor(String color) {
        this.color = color;
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
    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
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
