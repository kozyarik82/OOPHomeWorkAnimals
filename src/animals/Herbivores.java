package animals;

import java.util.Objects;

public final class Herbivores extends Mammals{

    private final String typeOfFood;

    public Herbivores(String name, int age, String habitat, float travelSpeed, String typeOfFood) {
        super(name, age, habitat, travelSpeed);
        this.typeOfFood = ValidationUtils.validOrDefault(typeOfFood, " не корректное значение ");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void graze() {
        System.out.println(" пастись ");
    }

    public void eat() {
        System.out.println(" кушать траву ");
    }

    public void move() {
        System.out.println(" перемещаться по суше ");
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", habitat='" + habitat + '\'' +
                ", travelSpeed=" + travelSpeed +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores that = (Herbivores) o;
        return typeOfFood.equals(that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }
}
