package entities;

public enum Color {

    Red, Green, Black, White;

    private String color;

    static {
        Red.color = "красный";
        Green.color = "зеленый";
        Black.color = "черный";
        White.color = "белый";
    }

    public String newGetColor(){
        return color;
    }
}
