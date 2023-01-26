/**
 * This class represents the information of a Skunk pet which extends Pet.
 * @author hchoi395
 * @version 11.0.13
 */
public class Skunk extends Pet {
    private int numSpray;
    /**
     * Skunk constructor that takes in 3 parameters.
     * @param health int parameter that represents the pet's health.
     * @param attack int parameter that represents the pet's attack.
     * @param numSpray int parameter that represents how many sprays left.
     */
    public Skunk(int health, int attack, int numSpray) {
        super(health, attack);
        if (numSpray >= 0) {
            this.numSpray = numSpray;
        } else {
            this.numSpray = 0;
        }
    }
    /**
     * Skunk constructor that takes in no parameters.
     */
    public Skunk() {
        this(5, 3, 1);
    }
    /**
     * Getter method for numSpray.
     * @return int representing the number of sprays left.
     */
    public int getNumSpray() {
        return numSpray;
    }
    /**
     * Setter method for numSpray.
     * @param numSpray int parameter that will be set as the numSpray.
     */
    public void setNumSpray(int numSpray) {
        this.numSpray = numSpray;
    }
    /**
     * Method that stores information about what happens when a pet is sprayed.
     * @param pet Pet parameter that represents the pet getting sprayed.
     */
    public void sprayPet(Pet pet) {
        pet.setHealth(pet.getHealth() * 2 / 3);
        pet.setAttack(pet.getAttack() * 2 / 3);
        numSpray--;
    }
    @Override
    public void attackPet(Pet pet) {
        if (numSpray > 0) {
            sprayPet(pet);
        }
        pet.getAttacked(this.getAttack());
    }
    @Override
    public String toString() {
        return String.format("Skunk:%s/%d", super.toString(), numSpray);
    }
}
