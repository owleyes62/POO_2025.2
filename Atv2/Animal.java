
import java.util.ArrayList;
abstract class Animal {
    protected long id;
    protected String name;
    protected int age;
    protected double weight;
    protected ArrayList<String> abilities;

    public Animal(long id, String name, int age, double weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.abilities = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Método abstrato para som
    public abstract String sound();

    // Verificar habilidade
    public String performAbility(String ability) {
        if (abilities.contains(ability)) {
            return name + " can " + ability;
        } else {
            return name + " can't " + ability;
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + name + " | Idade: " + age + " | Peso: " + weight;
    }
}
