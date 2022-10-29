package animals;

import java.sql.SQLOutput;

public class Mammals extends Animals {
    protected String habitat;
    protected final float travelSpeed;

    public Mammals(String name, int age, String habitat, float travelSpeed) {
        super(name, age);
        setHabitat(habitat);
        if (travelSpeed < 0) {
            this.travelSpeed = 0;
        } else {
            this.travelSpeed = travelSpeed;
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = ValidationUtils.validOrDefault(habitat, " не корректное значение ");
    }

    public float getTravelSpeed() {
        return travelSpeed;
    }

    @Override
    public void eat() {
        System.out.println(" кушать растительную и животную пищу ");
    }

    @Override
    public void sleep() {
        System.out.println(" спать ");
    }

    @Override
    public void move() {
        System.out.println(" перемещаться в воде или на суше ");
    }

    public void walk() {
        System.out.println(" гулять ");
    }

}
