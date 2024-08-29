public class Deadline extends Task {
    protected String by;

    public Deadline(String description, String by) {
        // Constructor for Deadline class
        super(description);
        this.by = by;
    }
    @Override
    public String toString() {
        // Add a [D] at the front of task description (parent class)
        return "[D]" + super.toString() + " (by: " + by + ")";
    }

    public String saveFormat() {
        String temp;
        if (isDone) {
            temp = "1";
        } else {
            temp = "0";
        }
        return "D | " + temp + " | " + description + " | " + by;
    }
}
