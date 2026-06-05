class Student {
    int id;
    String name;
    String program;
    public Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }
}
class Instructor {
    int id;
    String name;
    String department;
    String title;
    public Instructor(int id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }
}
class Course {
    int id;
    String syllabus;
    String title;
    int credits;
    String prerequisite;
    public Course(int id, String syllabus, String title, int credits, String prerequisite) {
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }
}
class CourseOffering {
    int studentId;
    int instructorId;
    int courseId;
    String time;
    int sectionNo;
    int roomId;
    int year;
    String semester;
    public CourseOffering(int studentId, int courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }
    public CourseOffering(int studentId, int instructorId, int courseId,
                          String time, int sectionNo, int roomId,
                          int year, String semester) {

        this.studentId = studentId;
        this.instructorId = instructorId;
        this.courseId = courseId;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }
    public void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Instructor ID: " + instructorId);
        System.out.println("Course ID: " + courseId);
        System.out.println("Time: " + time);
        System.out.println("Section: " + sectionNo);
        System.out.println("Room: " + roomId);
        System.out.println("Year: " + year);
        System.out.println("Semester: " + semester);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Akash", "SWE");
        Instructor i1 = new Instructor(101, "Shawon", "SWE", "Lecturer");
        Course c1 = new Course(501, "Java Basics", "OOP", 3, "None");
        CourseOffering co1 = new CourseOffering(s1.id, c1.id);
        CourseOffering co2 = new CourseOffering(
                s1.id,
                i1.id,
                c1.id,
                "10:00 AM",
                2,
                305,
                2026,
                "Spring"
        );
        co2.display();
    }
}
