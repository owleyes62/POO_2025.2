
import java.util.ArrayList;

public class Animal {
    long id;
    String name;
    int age;
    double weight;
    ArrayList<String> abilities;

    String sound() {
        return "Some generic animal sound";
    }

    String PerformAbility(String abi){
        if(abilities.contains(abi)){
            return name + " performs " + abi;
        } else {
            return name + " does not have the ability: " + abi;
        }
    }
}
