package objectOriented;

public class Student {
    /*states - are properties of an object / class attribute*/
    public String name;
    private int age;
    private String color;
    private char sex;

    //empty constructor
    public Student() {
    }

    //full constructor
    public Student(String name, int age, String color, char sex) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
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
}
