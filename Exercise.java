public class Exercise {

    private String name;
    private String category;
    private int difficulty;

    // Constructor for creating an exercise
    public Exercise(String name, String category, int difficulty) {
        this.name = name;
        this.category = category;
        this.difficulty = difficulty;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getDifficulty() {
        return difficulty;
    }
}
