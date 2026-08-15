package OOPs;

public class Student {
    // public String name; // default - lies in same package
    // private int rollNo;
    // // int rollNo;
    // double percent;

    String name;
    int rollNo;
    double percent;
    final String schoolName = "Thakuranichak Union High School"; // use of final keyword
    // default constructor
    private static int noOfStudents;

    public Student() {

    }

    public static int getNoOfStudents() {
        return noOfStudents;
    }

    // user Constructor
    public Student(String n, int roll, double p) {
        name = n;
        rollNo = roll;
        percent = p;
        noOfStudents ++;
    }

    public int getRollNo() { // getter
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo; // This keyword is used to refer to the current object. It is used to eliminate
                              // the confusion between class attributes and parameters with the same name.
    }
}
