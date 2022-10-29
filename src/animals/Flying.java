package animals;

import java.util.Objects;

public final class Flying extends Birds {
    private final String movementType;

    public Flying(String name, int age, String habitat, String movementType) {
        super(name, age, habitat);
        this.movementType = ValidationUtils.validOrDefault(movementType, " не корректное значение ");
    }

    public String getMovementType() {
        return movementType;
    }

    public void fly() {
        System.out.println(" летать ");
    }

    @Override
    public void eat() {
        System.out.println(" кушать животную и растительную пищу ");
    }

    public void move() {
        System.out.println(" перемещаться по воздуху ");
    }

    @Override
    public String toString() {
        return "Flying{" +
                "movementType='" + movementType + '\'' +
                ", habitat='" + habitat + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying flying = (Flying) o;
        return movementType.equals(flying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movementType);
    }
}
