package objectOriented;

public class Main {
    public static void main(String[] args) {
        //creating default (empty) Student object (strings are initialised to null at default and integers to 0)
        Student student1 = new Student();
        System.out.println("Student1 name = "+ student1.name);
        System.out.println(student1.getId());

        Student student2 = new Student("kofi", 2, "red");

        //Encapsulation - Getters & Setters (accessing and modifying object states or class attributes)
        student2.setAge(25);
        //new age will be 25
        System.out.println(student2.getAge());
        student2.setColor("Yellow");
        System.out.println(student2.getColor());




    }
}
