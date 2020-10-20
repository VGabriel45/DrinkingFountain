import java.util.ArrayList;

public class DrinkingDistributor {

    private ArrayList<Drink> drinks = new ArrayList<>();
    private static Cup cup;

    public DrinkingDistributor(ArrayList<Drink> drinks, Cup cup) {
        this.drinks = drinks;
        this.cup = cup;
    }

    public void checkCup(){
        if (cup == null){
            cup = new Cup(3);
        }
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<Drink> drinks) {
        this.drinks = drinks;
    }

    public static Cup getCup() {
        return cup;
    }

    public void setCup(Cup cup) {
        this.cup = cup;
    }
}
