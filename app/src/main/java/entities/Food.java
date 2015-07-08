package entities;

/**
 * Created by Максимилиан on 08.07.2015.
 */
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
