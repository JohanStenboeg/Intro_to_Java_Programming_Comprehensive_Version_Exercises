package Chapter10.Opg10_9;

public class Course {
    //Deklareing variables and setting up an array.
    private String courseName;
    private String[] students = new String[100]; //array with a 100 spaces.
    private int numberOfStudents;
    //Making a constructor for making a new course.
    public Course(String courseName) {
        this.courseName = courseName;
    }
    //Method for adding students requireing a name to a course.
    public void addStudent(String studentName) {
        if (numberOfStudents == students.length) {
            String[] targetArray = new String[students.length + 1];
            for (int i = 0; i < students.length; i++) {
                targetArray[i] = students[i];
            }
        }
        students[numberOfStudents] = studentName;
        numberOfStudents++;
    }
    //Making a getter for getting students on course.
    public String[] getStudents() {
        return students;
    }
    //Making a getter for getting number of students on course.
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    //Making a getter for getting course name.
    public String getCourseName() {
        return courseName;
    }
    //Making a method for dropping students by name, which also reduces number of students by 1.
    public void dropStudent(String studentName) {
        students[numberOfStudents] = studentName;
        numberOfStudents--;
    }
    //Removes all students from course.
    public int clear() {
        numberOfStudents = 0;
        return numberOfStudents;
    }
}
