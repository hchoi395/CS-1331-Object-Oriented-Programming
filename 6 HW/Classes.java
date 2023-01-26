import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.PrintWriter;
/**
 * Class that has methods that allows to read and write to database and runs things.
 * @author hchoi395
 * @version 11.0.13
 */
public class Classes {
    /**
     * Method that finds out which of the courses in a file are valid courses.
     * @param fileName String parameter for file name.
     * @return returns the ArrayList of valid courses.
     * @throws FileNotFoundException throws FileNotFoundException.
     * @throws InvalidCourseException throws InvalidCourseException.
     */
    public static ArrayList<Course> outputCourses(String fileName)
        throws FileNotFoundException, InvalidCourseException {
        ArrayList<Course> temp = new ArrayList<Course>();
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        if (file != null && file.exists()) {
            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                if (string.contains("ComputerScience")) {
                    String[] tokens = string.split(",");
                    String courseName = tokens[1];
                    int id = Integer.parseInt(tokens[2]);
                    String professorName = tokens[3];
                    String langauge = tokens[4];
                    ComputerScience cs = new ComputerScience(courseName, id, professorName, langauge);
                    temp.add(cs);
                } else if (string.contains("LabScience")) {
                    String[] tokens = string.split(",");
                    String courseName = tokens[1];
                    int id = Integer.valueOf(tokens[2]);
                    String professorName = tokens[3];
                    boolean labCoatRequired = Boolean.parseBoolean(tokens[4]);
                    LabScience ls = new LabScience(courseName, id, professorName, labCoatRequired);
                    temp.add(ls);
                } else {
                    scanner.close();
                    throw new InvalidCourseException("Invalid course entered");
                }
            }
        } else {
            scanner.close();
            throw new FileNotFoundException("File provided is either null or empty");
        }
        scanner.close();
        return temp;
    }
    /**
     * Method for writing courses and their information to a file.
     * @param fileName String parameter for file name.
     * @param list ArrayList parameter for list.
     * @return returns true or false depending on writing occurring or not.
     * @throws FileNotFoundException throws FileNotFoundException.
     */
    public static boolean writeCourses(String fileName, ArrayList<Course> list) throws FileNotFoundException {
        boolean successful = false;
        File file = new File(fileName);
        PrintWriter printWriter = new PrintWriter(file);
        if (file != null && file.exists()) {
            for (int i = 0; i < list.size(); i++) {
                Course temp = list.get(i);
                printWriter.append(temp.toString() + "\n");
                successful = true;
            }
            printWriter.close();
        } else {
            printWriter.close();
            throw new FileNotFoundException("File provided is either null or DNE");
        }
        return successful;
    }
    /**
     * Method for reading courses.
     * @param fileName String parameter for file name.
     * @param course Course parameter for course.
     * @return returns the ArrayList.
     * @throws FileNotFoundException throws FileNotFoundException.
     * @throws InvalidCourseException throws InvalidCourseException.
     */
    public static ArrayList<Integer> readCourses(String fileName, Course course)
        throws FileNotFoundException, InvalidCourseException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        Integer integer = 1;
        if (file != null && file.exists()) {
            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                if (string.equals(course.toString())) {
                    temp.add(integer);
                }
                integer++;
            }
            scanner.close();
        } else {
            scanner.close();
            throw new FileNotFoundException("File provided is either null or empty");
        }
        if (temp.size() == 0) {
            scanner.close();
            throw new InvalidCourseException("Invalid course");
        }
        return temp;
    }
    /**
     * Main method.
     * @param args args parameter.
     * @throws FileNotFoundException throws.
     * @throws IllegalArgumentException throws.
     * @throws InvalidCourseException throws.
     */
    public static void main(String[] args)
    throws FileNotFoundException, IllegalArgumentException, InvalidCourseException {
        try {
            ComputerScience cs1 = new ComputerScience("a", 10000, "Bunglore", "java");
            ComputerScience cs2 = new ComputerScience("cs1332", 20000, "Calad", "java");
            ComputerScience cs3 = new ComputerScience("cs2050", 30000, "Dack", "C");
            LabScience ls1 = new LabScience("Phys", 22110, "alpha", false);
            LabScience ls2 = new LabScience("Chem", 12110, "madscience", true);
            LabScience ls3 = new LabScience("Earth", 10010, "rocker", false);
            LabScience ls4 = new LabScience("Phys", 22110, "alpha", false);
            ComputerScience cs4 = new ComputerScience("cs 1000", 10005, "bead", "java");
            ArrayList<Course> a = new ArrayList<Course>();
            a.add(cs1);
            a.add(cs2);
            a.add(cs3);
            a.add(ls1);
            a.add(ls2);
            a.add(ls3);
            a.add(ls4);
            a.add(cs4);
            System.out.println(writeCourses("TestCourses.csv", a));
            System.out.println(outputCourses("TestCourses.csv"));
            System.out.println(readCourses("TestCourses.csv", ls1));
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        } catch (InvalidCourseException ice) {
            System.out.println(ice.getMessage());
        }
    }
}