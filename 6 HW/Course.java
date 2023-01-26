/**
 * Abstract class that describes a course and basic information about it.
 * @author hchoi395
 * @version 11.0.13
 */
public abstract class Course {
    protected String courseName;
    protected int id;
    protected String professorName;
    /**
     * Constructor for Course with 3 parameters.
     * @param courseName String parameter that represents the course name.
     * @param id int parameter that represents the id.
     * @param professorName String parameter that represents the professor's name.
     */
    public Course(String courseName, int id, String professorName) {
        try {
            if (courseName != null && !courseName.equals("")) {
                this.courseName = courseName;
            }
            String length = Integer.toString(id);
            if (id >= 0 && length.length() == 5) {
                this.id = id;
            }
            if (professorName != null && !professorName.equals("")) {
                this.professorName = professorName;
            }
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
    @Override
    public String toString() {
        return String.format("%s,%d,%s", courseName, id, professorName);
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other instanceof Course) {
            Course temp = (Course) other;
            return this.courseName.equals(temp.courseName) && this.id == temp.id
                && this.professorName.equals(temp.professorName);
        }
        return false;
    }
}