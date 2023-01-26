/**
 * This class is an abstract class that has information about a generic Pet in the auto battle game.
 * @author hchoi395
 * @version 11.0.13
 */
public abstract class Pet implements Comparable<Pet> {
    private int health;
    private int attack;
    /**
     * This is a Pet constructor that takes in 2 parameters.
     * @param health int parameter that represents the pet's health.
     * @param attack int parameter that represents the pet's attack.
     */
    public Pet(int health, int attack) {
        if (health > 0) {
            this.health = health;
        } else {
            this.health = 1;
        }
        if (attack >= 0) {
            this.attack = attack;
        } else {
            this.attack = 0;
        }
    }
    /**
     * This is a getter method for health.
     * @return returns an integer of the pet's health.
     */
    public int getHealth() {
        return health;
    }
    /**
     * This is a getter method for attack.
     * @return returns an integer of the pet's attack.
     */
    public int getAttack() {
        return attack;
    }
    /**
     * This is a setter method for health.
     * @param health int parameter that represents what the health will be set to.
     */
    public void setHealth(int health) {
        this.health = health;
    }
    /**
     * This is a setter method for attack.
     * @param attack int parameter that represents what the attack will be set to.
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }
    /**
     * This is a method that returns a boolean output depending on the health of the pet.
     * @return a boolean output depending on the fainted status.
     */
    public boolean hasFainted() {
        if (this.health <= 0) {
            return true;
        }
        return false;
    }
    /**
     * This is a method that occurs when the pet gets attacked.
     * @param damage int parameter that represents how much damage the attack will do.
     */
    public void getAttacked(int damage) {
        this.health -= damage;
    }
    /**
     * This is a method that occurs when the pet attacks another pet.
     * @param pet Pet parameter that represents the pet that will be attacked.
     */
    public void attackPet(Pet pet) {
        pet.getAttacked(this.attack);
    }
    @Override
    public String toString() {
        return attack + "/" + health;
    }
    @Override
    public int compareTo(Pet other) {
        if (other == null) {
            return 1;
        }
        return (this.health + this.attack) - (other.health + other.attack);
    }
}
