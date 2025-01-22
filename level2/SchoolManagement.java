package level2;

import java.util.ArrayList;
import java.util.List;

// Course Class
class Course {
    private String courseName;
    private List<Student> students;
//constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }
//enroll student method
    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.enrollInCourse(this);
            System.out.println("Student " + student.getName() + " enrolled in course " + courseName);
        }
    }

    public void listStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
//get method
    public String getCourseName() {

        return courseName;
    }
}

// Student Class
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void listCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

// School Class
class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void listStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

// Main Class to demonstrate the relationships
public class SchoolManagement {
    public static void main(String[] args) {
        School school = new School("Dav");

        Student Nishu = new Student("Nishu");
        Student Nisha = new Student("Nisha");

        school.addStudent(Nishu);
        school.addStudent(Nisha);

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        math.enrollStudent(Nishu);
        science.enrollStudent(Nishu);
        science.enrollStudent(Nisha);

        // Display courses for each student
        Nishu.listCourses();
        Nisha.listCourses();

        // Display students in each course
        math.listStudents();
        science.listStudents();

        // Display all students in the school
        school.listStudents();
    }
}
