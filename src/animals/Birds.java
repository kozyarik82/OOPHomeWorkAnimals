package animals;

public class Birds extends Animals {
    protected String habitat;

    public Birds(String name, int age, String habitat) {
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
        System.out.println(" кушать животную и растительную пищу ");
    }

    @Override
    public void sleep() {
        System.out.println(" спать ");
    }

    @Override
    public void move() {
        System.out.println(" перемещаться на суше и в воздухе ");

    }
}
