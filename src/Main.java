import animals.*;

public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Газя", 2, "суша", 45, "растительная");
        Herbivores giraffe = new Herbivores("Жира", 10, "суша", 15, "растительная пища");
        Herbivores horse = new Herbivores("Лоша", 20, "суша", 45, "растительная пиша");
        Predators hyena = new Predators("Гена", 12, "суша", 10, "животная пища");
        Predators tiger = new Predators("Тигран", 7, "суша", 55, "животная пища");
        Predators bear = new Predators("Михаил", 25, "суша", 25, "животная пища");
        Amphibians frog = new Amphibians("Ляшка", 3, "вода");
        Amphibians snake = new Amphibians("Пучок", 1, "вода");
        NotFlying peacock = new NotFlying("Павлик", 6, "суша", "ножками");
        NotFlying penguin = new NotFlying("Гиви", 4, "вода", "ножками");
        NotFlying dodo = new NotFlying("Дудя", 3, "суша", "ножками");
        Flying gull = new Flying("Чуйка", 2, "суша", "по воздуху");
        Flying albatross = new Flying("Альба", 4, "суша", "по воздуху");
        Flying falcon = new Flying("Лукас", 1, "суша", "по воздуху");

        if (!gazelle.equals(giraffe)) {
            System.out.println("животные уникальны");
        }
        System.out.println(gazelle.toString());
        System.out.println(giraffe.toString());
        System.out.println(horse.toString());
        System.out.println(hyena.toString());
        System.out.println(tiger.toString());
        System.out.println(bear.toString());
        System.out.println(frog.toString());
        System.out.println(snake.toString());
        System.out.println(peacock.toString());
        System.out.println(penguin.toString());
        System.out.println(dodo.toString());
        System.out.println(gull.toString());
        System.out.println(albatross.toString());
        System.out.println(falcon.toString());


    }
}