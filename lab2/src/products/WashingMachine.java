package products;

/**
 * Класс, описывающий стиральную машину
 * @author Дарья Герасимович
 */
public class WashingMachine extends Product {
    /**
     * Поле объем барабана
     */
    private int drumVolume;
    /**
     * Поле количество режимов
     */
    private int countOfModes;
    /**
     * Поле энергопотребление
     */
    private int energyConsumption;
    /**
     * Поле потребление воды
     */
    private int waterConsumption;

    /**
     * Функция получения объема барабана {@link WashingMachine}
     */
    public int getDrumVolume() {
        return drumVolume;
    }

    /**
     * Процедура определения объема барабана {@link WashingMachine#drumVolume}
     * @param drumVolume - объем барабана
     */
    public void setDrumVolume(int drumVolume) {
        this.drumVolume = drumVolume;
    }


    /**
     * Функция получения количества режимов {@link WashingMachine}
     */
    public int getCountOfModes() {
        return countOfModes;
    }

    /**
     * Процедура определения количества режимов {@link WashingMachine#countOfModes}
     * @param countOfModes - количество режимов
     */
    public void setCountOfModes(int countOfModes) {
        this.countOfModes = countOfModes;
    }

    /**
     * Функция получения энергопотребления {@link WashingMachine}
     */
    public int getEnergyConsumption() {
        return energyConsumption;
    }

    /**
     * Процедура определения энергопотребления {@link WashingMachine#energyConsumption}
     * @param energyConsumption - энергопотребление
     */
    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    /**
     * Функция получения потребления воды {@link WashingMachine}
     */
    public int getWaterConsumption() {
        return waterConsumption;
    }

    /**
     * Процедура определения потребления воды {@link WashingMachine#waterConsumption}
     * @param waterConsumption - потребление воды
     */
    public void setWaterConsumption(int waterConsumption) {
        this.waterConsumption = waterConsumption;
    }


    /**
     * Функиция приведения стиральной машины к строке {@link WashingMachine}
     */
    @Override
    public String toString() {
        return "\nName: " + this.getName() +
                "\nPrice: " + this.getPrice() +
                "\nCount of modes: " + this.countOfModes +
                "\nDrum volume: " + this.drumVolume +
                "\nEnergy consumption: " + this.energyConsumption +
                "\nWater consumption: " + this.waterConsumption;
    }

}
