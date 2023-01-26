public class GarageOwner {
    private String name;
    private int age;
    private int carsOwned;
    public GarageOwner(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getCarsOwned() {
        return carsOwned;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCarsOwned(int carsOwned) {
        this.carsOwned = carsOwned;
    }
}
