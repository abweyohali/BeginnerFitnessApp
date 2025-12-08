public class ProgramEngine {

    private Exercise[] lightExercises;
    private Exercise[] strengthExercises;
    private Exercise[] cardioExercises;

    // Loads exercises on creation
    public ProgramEngine() {
        loadExercises();
    }

    // Fills arrays with sample exercises
    public void loadExercises() {
        lightExercises = new Exercise[3];
        strengthExercises = new Exercise[3];
        cardioExercises = new Exercise[3];

        lightExercises[0] = new Exercise("5-minute walk", "light", 1);
        lightExercises[1] = new Exercise("Neck stretch", "light", 1);
        lightExercises[2] = new Exercise("Arm circles", "light", 1);

        strengthExercises[0] = new Exercise("Wall push-ups", "strength", 1);
        strengthExercises[1] = new Exercise("Bodyweight squat", "strength", 2);
        strengthExercises[2] = new Exercise("Glute bridge", "strength", 1);

        cardioExercises[0] = new Exercise("March in place 1 min", "cardio", 1);
        cardioExercises[1] = new Exercise("10 jumping jacks", "cardio", 2);
        cardioExercises[2] = new Exercise("Light jog in place", "cardio", 2);
    }

    // Returns a simple placeholder suggestion for Phase 2
    public Exercise getDailySuggestion(User u) {
        return lightExercises[0];
    }
}
