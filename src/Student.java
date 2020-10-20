public class Student {

    private Drink drink;
    private Cup cup;

    public Student(){}

    public Student(Drink drink, Cup cup) {
        this.drink = drink;
        this.cup = cup;
    }

    public void drink(){
        if (!(Fountain.getTemperature() > 90)){
            System.out.println("Drinking...");
        }
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
        if (cup.getVolume() < DrinkingDistributor.getCup().getVolume()){
            System.out.println("Cup volume too small");
        } else {
            Fountain.addDrink(drink);
        }
    }

    public Cup getCup() {
        return cup;
    }

    public void setCup(Cup cup) {
        this.cup = cup;
    }
}
