/**
 * Class that represents a invalid course exception.
 * @author hchoi395
 * @version 11.0.13
 */
public class InvalidCourseException extends RuntimeException {
    /**
     * InvalidCourseException constructor with 1 parameter.
     * @param message String parameter for message that will show up.
     */
    public InvalidCourseException(String message) {
        super(message);
    }
    /**
     * InvalidCourseException default constructor.
     */
    public InvalidCourseException() {
        super("Invalid course type!");
    }
}