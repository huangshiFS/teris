package dto;

public class Player {
    private String name;
    private int point;

    public Player(String name, int point) {
        super();
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

}
