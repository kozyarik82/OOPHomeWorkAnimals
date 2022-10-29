package animals;

import java.util.Objects;

public class Amphibians extends Animals {
    protected String habitat;

    public Amphibians(String name, int age, String habitat) {
        super(name, age);
        setHabitat(habitat);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = ValidationUtils.validOrDefault(habitat," не корректное значение ");
    }

    public void hunt() {
        System.out.println(" охотиться ");
    }

    @Override
    public void eat() {
        System.out.println(" кушать насекомых ");
    }

    @Override
    public void sleep() {
        System.out.println(" спать ");
    }

    @Override
    public void move() {
        System.out.println(" перемещаться в воде или на суше ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians that = (Amphibians) o;
        return habitat.equals(that.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat);
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "habitat='" + habitat + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
