package theater;

public class Play {

    /**
     * This class represents a play.
     * @param name The name of the play.
     * @param type The genre of the play.
     */
    private String name;
    private String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
