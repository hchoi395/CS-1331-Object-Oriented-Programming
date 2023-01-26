/**
 * Class that extends Course and represents computer science and its information.
 * @author hchoi395
 * @version 11.0.13
 */
public class ComputerScience extends Course {
    private String language;
    /**
     * ComputerScience constructor that takes in 4 parameters.
     * @param courseName String parameter that represents course.
     * @param id int parameter that represents the id.
     * @param professorName String parameter that represents the professor's name.
     * @param language String parameter that represents code language.
     * @throws IllegalArgumentException throws IllegalArgumentException.
     */
    public ComputerScience(String courseName, int id, String professorName, String language)
        throws IllegalArgumentException {
        super(courseName, id, professorName);
        if (language != null && !language.equals("")) {
            this.language = language;
        } else {
            throw new IllegalArgumentException();
        }
    }
    @Override
    public String toString() {
        return String.format("ComputerScience,%s,%s", super.toString(), language);
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other instanceof ComputerScience) {
            ComputerScience temp = (ComputerScience) other;
            return super.equals(other) && this.language.equals(temp.language);
        }
        return false;
    }
}
