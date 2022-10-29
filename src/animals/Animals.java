package animals;

public abstract class Animals {
    protected final String name;
    protected final int age;

    public Animals(String name, int age) {
        this.name = ValidationUtils.validOrDefault(name," не корректное значение ");
        if (age < 0) {
            this.age = 0;
        }else{
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
