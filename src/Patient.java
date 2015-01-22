public class Patient {
	private String name,priority;
	
    public Patient(String name, int priority) {
        this.name = name;
        switch (priority) {
            case 0:
                this.priority = "Critical";
                break;
            case 1:
                this.priority = "Serious";
                break;
            case 2:
                this.priority = "Fair";
                break;
            default:
                this.priority = "Unknown";
                break;
        }
    }
    public String toString() {
        String temp = (" ")+name + "'s Condition is: " + priority;
        return temp;
    }

}