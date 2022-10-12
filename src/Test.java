import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Drumstyle92
 * Class containing the heart of the program.
 */
public class Test {
    /**
     *
     * @param args Fundamental parameter of the main.
     * main method which we have a List, an ArrayList and an ArrayList to array conversion.
     */
    public static void main(String[] args){
// Created a non-mutable String list.
        List<String> cityNames = Arrays.asList("Campobasso","Isernia","Termoli");
        cityNames.set(1," Tegucigalpa ");

        System.out.println("------------------------------ArrayListNonMutabile--------------------------------------");
        System.out.println(cityNames);
// Created an empty mutable list.
        List<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marco");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add( "Tarquinio il Superbo");
        System.out.println("------------------------------ArrayListVuotoMutabile------------------------------------");
        System.out.println(kingsOfRome);
// Conversion from ArrayList to Array.
        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6] = "Lucius Tarquinius SuperCar";
        System.out.println("------------------------------Array-----------------------------------------------------");
        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}
