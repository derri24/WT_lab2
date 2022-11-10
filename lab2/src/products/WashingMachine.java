package products;

/**
 * Класс, описывающий стиральную машину
 * @autor Дарья Герасимович
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
     * Процедура определения объема барабана {@link WashingMachine#drumVolume}
     * @param drumVolume - объем барабана
     */
    public void setDrumVolume(int drumVolume) {
        this.drumVolume = drumVolume;
    }

    /**
     * Процедура определения количества режимов {@link WashingMachine#countOfModes}
     * @param countOfModes - количество режимов
     */

    public void setCountOfModes(int countOfModes) {
        this.countOfModes = countOfModes;
    }

    /**
     * Процедура определения энергопотребления {@link WashingMachine#energyConsumption}
     * @param energyConsumption - энергопотребление
     */

    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
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
