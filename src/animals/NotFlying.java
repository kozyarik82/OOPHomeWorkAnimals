package animals;

import java.util.Objects;

public final class NotFlying extends Birds {
    private final String movementType;

    public NotFlying(String name, int age, String habitat, String movementType) {
        super(name, age, habitat);
        this.movementType = ValidationUtils.validOrDefault(movementType, " не корректное значение ");
    }

    public String getMovementType() {
        return movementType;
    }

    public void walk() {
        System.out.println(" гулять ");
    }

    public void eat() {
        System.out.println(" кушать растительную и животную пищу ");
    }

    public void move() {
        System.out.println(" перемещаться по суше ");
    }

    @Override
    public String toString() {
        return "NotFlying{" +
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
        NotFlying notFlying = (NotFlying) o;
        return movementType.equals(notFlying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movementType);
    }
}
