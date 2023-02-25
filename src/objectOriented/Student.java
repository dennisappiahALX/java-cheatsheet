package objectOriented;

public final class Student {
    /*states - are properties of an object / class attribute*/
    public String name;
    private int age;
    private String color;
    private char sex;
    //static variable
    private static int id = 0; /* each object instance of the class share the static variable*/

    int min = 0; /* Instance variables are declared in a class or outside any method */

    //empty constructor
    public Student() {
        id++;
    }

    //full constructor
    public Student(String name, int age, String color, char sex) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
        id++;  //this will increase id by 1 for every object creation
    }

    //non-full constructor (sex will be set later)
    public Student(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // Behaviours - are methods of an object
    public void Eating (){
        System.out.println("eating");
    }

    public void Drinking(){
        System.out.println("drinking");
    }

    // Getters - access private states
    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    //Setters - sets the value of the class attribute / states
    public void setAge(int newAge) {
        this.age = newAge;
    }
    public void setColor(String  newColor){
        this.color = newColor;
    }

    public int getId() {
        return id;
    }
}
