import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Cup cup1 = new Cup(2);
        Cup cup2 = new Cup(3);
        cup1.setVolume(2);
        student.setCup(cup1);
        student.drink();
        Fountain fountain = new Fountain(60);

        Drink hotNormalDrink = new HotNormalDrink(DrinkSize.SMALL, 1);
        Drink coldFizzyDrink = new ColdFizzyDrink(DrinkSize.MEDIUM, 3);
        Drink coldNormalDrink = new ColdNormalDrink(DrinkSize.LARGE, 5);

        DrinkingDistributor drinkingDistributor = new DrinkingDistributor(new ArrayList<>(Arrays.asList(hotNormalDrink,coldFizzyDrink,coldNormalDrink)),cup2);
        drinkingDistributor.setCup(cup2);

        student.setDrink(hotNormalDrink);
        student.setDrink(coldFizzyDrink);
        System.out.println(fountain.getDrinks());
        fountain.changeTemperature();
        System.out.println(Fountain.getTemperature());
    }
}
