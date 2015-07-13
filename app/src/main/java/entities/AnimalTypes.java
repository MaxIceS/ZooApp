package entities;

public enum AnimalTypes {

    Dog, Cat, Wolf, Fox, Cow, Hare, Horse;

    private String title;

    static {
        Dog.title = "собака";
        Cat.title = "кот";
        Wolf.title = "волк";
        Fox.title = "лиса";
        Cow.title = "корова";
        Hare.title = "заяц";
        Horse.title = "лошадь";
    }

    public String getTitle(){
        return title;
    }
}
