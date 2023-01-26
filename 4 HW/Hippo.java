/**
 * This class represents the information of a Hippo pet that is a child class of Pet.
 * @author hchoi395
 * @version 11.0.13
 */
public class Hippo extends Pet {
    private int buff;
    /**
     * This is a Hippo constructor that takes in 3 parameters.
     * @param health int parameter that represents the Hippo's health.
     * @param attack int parameter that represents the Hippo's attack.
     * @param buff int parameter that represents how much the Hippo will be buffed.
     */
    public Hippo(int health, int attack, int buff) {
        super(health, attack);
        if (buff >= 0) {
            this.buff = buff;
        } else {
            this.buff = 0;
        }
    }
    /**
     * This is a Hippo constructor that takes in no parameters.
     */
    public Hippo() {
        this(7, 4, 2);
    }
    /**
     * Getter method for buff.
     * @return int representing buff is returned.
     */
    public int getBuff() {
        return buff;
    }
    /**
     * Setter method for buff.
     * @param buff int parameter that will be set as buff.
     */
    public void setBuff(int buff) {
        this.buff = buff;
    }
    /**
     * Method that buffs the hippo when it gets faints another pet.
     */
    public void getBuffed() {
        setHealth(getHealth() + buff);
        setAttack(getAttack() + buff);
    }
    @Override
    public void attackPet(Pet pet) {
        pet.getAttacked(this.getAttack());
        if (pet.hasFainted()) {
            getBuffed();
        }
    }
    @Override
    public String toString() {
        return String.format("Hippo:%s/%d", super.toString(), buff);
    }
}
