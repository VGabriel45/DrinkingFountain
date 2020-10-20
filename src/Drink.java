public abstract class Drink {

    private DrinkSize drinkSize;
    private int liters;

    public Drink(DrinkSize drinkSize, int liters) {
        this.drinkSize = drinkSize;
        this.liters = liters;
    }

    public void addDrink(){}

    public DrinkSize getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(DrinkSize drinkSize) {
        this.drinkSize = drinkSize;
    }

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }
}
