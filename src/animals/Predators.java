package animals;

import javax.lang.model.element.VariableElement;
import java.util.Objects;

public final class Predators extends Mammals {
    private final String typeOfFood;

    public Predators(String name, int age, String habitat, float travelSpeed, String typeOfFood) {
        super(name, age, habitat, travelSpeed);
        this.typeOfFood = ValidationUtils.validOrDefault(typeOfFood," не корретное значение ");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void hunt() {
        System.out.println(" охотиться ");
    }

    public void eat() {
        System.out.println(" кушать животную пищу ");
    }

    public void move() {
        System.out.println(" перемещаться в воде и на суше ");
    }

    @Override
    public String toString() {
        return "Predators{" +
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
        Predators predators = (Predators) o;
        return typeOfFood.equals(predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }
}
