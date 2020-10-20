public class Cup {

    private int volume;
    private int levelOfWater;
    private Drink drink;

    public Cup(int volume){}

    public Cup(int volume, int levelOfWater, Drink drink) {
        this.volume = volume;
        this.levelOfWater = levelOfWater;
        this.drink = drink;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getLevelOfWater() {
        return levelOfWater;
    }

    public void setLevelOfWater(int levelOfWater) {
        this.levelOfWater = levelOfWater;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}
