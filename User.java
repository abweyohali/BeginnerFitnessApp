public class User {

    private String name;
    private int activityLevel; 
    private int progress;

    // Constructor initializes user information
    public User(String name, int activityLevel) {
        this.name = name;
        this.activityLevel = activityLevel;
        this.progress = 0;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getActivityLevel() {
        return activityLevel;
    }

    public int getProgress() {
        return progress;
    }

    // Increase progress when task is completed
    public void completeActivity() {
        progress++;
    }

    // Increase activity level (optional future expansion)
    public void increaseLevel() {
        if (activityLevel < 3) {
            activityLevel++;
        }
    }
}
