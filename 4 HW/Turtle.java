/**
 * This class represents the information of a Turtle pet which is a child class of Pet.
 * @author hchoi395
 * @version 11.0.13
 */
public class Turtle extends Pet {
    private boolean melonArmor;
    /**
     * This is a Turtle constructor that takes in 3 parameters.
     * @param health int parameter that represents the Turtle's health.
     * @param attack int parameter that represents the Turtle's attack.
     * @param melonArmor boolean parameter that represents whether or not the armor exists.
     */
    public Turtle(int health, int attack, boolean melonArmor) {
        super(health, attack);
        this.melonArmor = melonArmor;
    }
    /**
     * This is a Turtle constructor that takes in no parameters.
     */
    public Turtle() {
        this(4, 2, true);
    }
    /**
     * Getter method for melon armor.
     * @return returns a boolean depending on whether or not the armor exists.
     */
    public boolean getMelonArmor() {
        return melonArmor;
    }
    /**
     * Setter method for melon armor.
     * @param melonArmor takes in a boolean parameter that represents whether the armor exists.
     */
    public void setMelonArmor(boolean melonArmor) {
        this.melonArmor = melonArmor;
    }
    @Override
    public void getAttacked(int damage) {
        if (melonArmor) {
            if (damage < 20) {
                super.getAttacked(0);
            } else if (damage >= 20) {
                super.getAttacked(damage - 20);
            }
            setMelonArmor(false);
        } else {
            super.getAttacked(damage);
        }
    }
    @Override
    public String toString() {
        return String.format("Turtle:%s/%s", super.toString(), melonArmor);
    }
}
