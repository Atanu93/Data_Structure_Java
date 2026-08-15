package OOPs;

public class Classes {

    // creating a new data type with multiple attributes
    public static class Student {
        String name;
        int rno;
        double percent;
    }

    public static class Car {
        String name;
        String type;
        int price;

    }

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.name = "BMW";
        c1.price = 4000000;
        c1.type = "Sedan";  
        




        Student x = new Student();
        x.name = "Atanu Manna";
        x.rno = 29;
        x.percent = 95;

        // System.out.println(x.name);
        // System.out.println(x.percent + 4);

        Student x2 = new Student();
        x2.name = "Taniya Manna";
        x2.rno = 34;
        x2.percent = 97.2;
    }
}
