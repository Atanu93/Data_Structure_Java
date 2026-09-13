package OOPs;

public class StudentClass {

    public static void main(String[] args) {
        // Student s2 = new Student("Ayantika Mal", 56, 76.5);
        // System.out.println(s2.name);
        // System.out.println(s2.rollNo);
        // Student s5 = new Student();
        // s5.name = "Suman";
        // s5.rollNo = 56;
        // s5.percent = 98.3;
        // s5.schoolName = "DPS"; //getting errors
        // System.out.println(s5.schoolName);
        // System.out.println(s5.noOfStudents);

        Student s3 = new Student("Dipon", 23, 56.8);

        Student s2 = new Student("Atanu", 13, 46.8);

        // Student s1 = new Student("Rahul", 63, 86.8);
        System.out.println(Student.getNoOfStudents());
        System.out.println(s3.name);
        // System.out.println(s5.noOfStudents);
        s2.name = "Atanu Manna";
        s2.percent = 89.5;
        // s2.rollNo //private access
        // System.out.println(s2.getRollNo());

        s2.setRollNo(67);
    }
}

// To resolve private property we use Getters And Setters
/*
 * constructor is a special type of method that is used to initialize the
 * object. It is called when an object of a class is created. It can be used to
 * set initial values for object attributes. It has the same name as the class
 * and does not have a return type.
 */
// initialization => Student s2 = new Student("Arpan", 45, 78.9);

// This keyword in constructor
// final keyword
// static keyword -> used if we want to access a func in the class through just
// classname func without creating obj
