/**
 * LabScience class extends Course and represents lab science classes and its information.
 * @author hchoi395
 * @version 11.0.13
 */
public class LabScience extends Course {
    private boolean labCoatRequired;
    /**
     * LabScience constructor that takes in 4 parameters.
    * @param courseName String parameter that represents the course name.
     * @param id int parameter that represents the id.
     * @param professorName String parameter that represents the professor's name.
     * @param labCoatRequired boolean parameter that represents lab coat or not.
     */
    public LabScience(String courseName, int id, String professorName, boolean labCoatRequired) {
        super(courseName, id, professorName);
        this.labCoatRequired = labCoatRequired;
    }
    @Override
    public String toString() {
        return String.format("LabScience,%s,%s", super.toString(), labCoatRequired);
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other instanceof LabScience) {
            LabScience temp = (LabScience) other;
            return super.equals(other) && this.labCoatRequired == temp.labCoatRequired;
        }
        return false;
    }
}
