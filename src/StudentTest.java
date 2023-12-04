public class StudentTest {

    public static void method_1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.age == st2.age && st1.course == st2.course) {
            System.out.println("Students are equal");
        } else {
            System.out.println("Students are not equal");
        }
    }


    public static void method_2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.age == st2.age) {
                if (st1.course == st2.course) {
                    System.out.println("Students are totally equal");
                } else {
                    System.out.println("The have the same name and age, but different course");
                }
            } else {
                System.out.println("Students have the same name, but different age");
            }
        } else {
            System.out.println("Different Students");
        }
    }


    public static void method_3(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.age == st2.age && st1.course == st2.course) {
            System.out.println("the same");
        } else if (st1.name.equals(st2.name) && st1.age == st2.age) {
            System.out.println("same name, same age, different course");
        } else if (st1.name.equals(st2.name) && st1.course == st2.course) {
            System.out.println("same name, different age, same course");
        } else if (st1.name.equals(st2.name)) {
            System.out.println("same name, different age, different course");
        } else if (st1.age == st2.age && st1.course == st2.course) {
            System.out.println("different name, same age, same course");
        } else if (st1.age != st2.age && st1.course == st2.course) {
            System.out.println("different name, different age, same course");
        } else if (st1.age == st2.age) {
            System.out.println("different name, same age, different course");
        } else {
            System.out.println("All are different");
        }

    }






    public static void main(String[] args) {
        Student st1 = new Student("Boris", 13, 4);
        Student st2 = new Student("Boris", 14, 4);

        method_1(st1, st2);
        method_2(st1, st2);
        method_3(st1, st2);
    }
}
