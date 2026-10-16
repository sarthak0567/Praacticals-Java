
class Student {
    int roll;
    String name;
    int m1, m2, m3;

    Student(int r, String n, int a, int b, int c) {
        roll = r;
        name = n;
        m1 = a;
        m2 = b;
        m3 = c;
    }

    void display() {
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Rahul", 80, 90, 85);
        Student s2 = new Student(2, "Priya", 75, 85, 90);
        Student s3 = new Student(3, "Aman", 70, 80, 75);

        s1.display();
        s2.display();
        s3.display();
    }
}
