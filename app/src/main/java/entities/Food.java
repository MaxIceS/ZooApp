package entities;

public enum Food {

    Grass, Meat, Milk;

    private String name;

    static {
        Grass.name = "траву";
        Meat.name = "мясо";
        Milk.name = "молоко";
    }

    public String getFoodName(){
        return name;
    }
}
