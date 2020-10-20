import java.util.ArrayList;

public class Fountain {

    private static int temperature;
    private static ArrayList<Drink> drinks = new ArrayList<>();

    public Fountain(int temperature) {
        Fountain.temperature = temperature;
    }

    public void checkTemperature(){
        if (temperature > 90){
            System.out.println("Temperature over 90 ! Students cannot drink anymore !");
        }
    }

    public void changeTemperature(){
        drinks.forEach(Drink -> {
            if (Drink instanceof ColdFizzyDrink){
                setTemperature(temperature - Drink.getLiters() * -1);
            } else if (Drink instanceof ColdNormalDrink){
                setTemperature(temperature - Drink.getLiters() * -2);
            } else if (Drink instanceof HotNormalDrink){
                setTemperature(temperature + Drink.getLiters() * 3);
            }
        });
    }

    public static int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        Fountain.temperature = temperature;
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<Drink> drinks) {
        Fountain.drinks = drinks;
    }

    public static void addDrink(Drink drink){
        drinks.add(drink);
    }
}
