package Chapter10.Opg10_9;

public class Main {
    public static void main(String[] args) {
        //Making a new object from the constructor named Datamatiker.
        Course course1 = new Course("Datamatiker");
        //Adding 3 new student objects.
        course1.addStudent("Carla");
        course1.addStudent("Erik");
        course1.addStudent("Emil");
        //Displaying course name.
        System.out.println("Course name: " + course1.getCourseName());
        //Displaying number of students on course.
        System.out.println("Number of students on course: " + course1.getNumberOfStudents());
        //Using a for loop to display all students on course by name.
        System.out.print("Students on the course: ");
        String[] students1 = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students1[i] + ", ");
        course1.clear(); //clearing course.
        //Displaying that the course gets cleared.
        System.out.println("\nClearing course!");
        //Displaying number of students on course right after clear. (0)
        System.out.println("Number of students on course: " + course1.getNumberOfStudents());
        //Adding new students.
        System.out.println("Adding some students");
        course1.addStudent("Emi");
        course1.addStudent("Eri");
        course1.addStudent("Carl");
        //Displaying new students on course. And displaying their name and number of students on course.
        System.out.println("Number of students on course: " + course1.getNumberOfStudents());
        System.out.print("Students on the course: ");
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students1[i] + ", ");
        //Displaying that a student gets removed.
        System.out.println("\nRemoving student from course");
        //Dropping student named Carl from the course.
        course1.dropStudent("Carl");
        //Displaying new number of students on course by their name.
        System.out.print("Students on the course: ");
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students1[i] + ", ");
    }
}

