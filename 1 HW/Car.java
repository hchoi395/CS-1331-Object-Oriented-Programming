public class Car {
    private int year;
    private String make;
    private String model;
    private String color;
    private int conditionCategory;
    private boolean isRestored;
    public Car(int year, String make, String model, String color, int conditionCategory) {
        this.setYear(year);
        this.setMake(make);
        this.setModel(model);
        this.setColor(color);
        this.setConditionCategory(conditionCategory);
        if (this.conditionCategory >= 90 && this.conditionCategory <= 100) {
            System.out.println("Perfect");
        } else if (this.conditionCategory >= 80 && this.conditionCategory <= 89) {
            System.out.println("Excellent");
        } else if (this.conditionCategory >= 70 && this.conditionCategory <= 79) {
            System.out.println("Fine");
        } else if (this.conditionCategory >= 60 && this.conditionCategory <= 69) {
            System.out.println("Very Good");
        } else if (this.conditionCategory >= 50 && this.conditionCategory <= 59) {
            System.out.println("Good");
        } else if (this.conditionCategory >= 40 && this.conditionCategory <= 49) {
            System.out.println("Driver");
        } else {
            setConditionCategory(80);
            System.out.println("Excellent");
        }
        getIsRestored();
    }
    public Car(int year, String make, String model) {
        this(year, make, model, "blue", 80);
    }
    public Car() {
        this(1960, "Jaguar", "E-Type", "silver", 89);
    }
    public int getYear() {
        return year;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getConditionCategory() {
        return conditionCategory;
    }
    public boolean getIsRestored() {
        if (conditionCategory >= 90 && conditionCategory <= 100) {
            isRestored = true;
        } else {
            isRestored = false;
        }
        return isRestored;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setConditionCategory(int conditionCategory) {
        this.conditionCategory = conditionCategory;
    }
}