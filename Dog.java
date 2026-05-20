// Parameterized Constructor

// Write a Java program to create a class called Dog with instance variables name and color. Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. Print the values of the variables.

// Sample Solution:

// Java Code:

class Dog {

    String name;
    String color;

    // Parameterized Constructor
    Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void display() {
        System.out.println("Dog Name: " + name);
        System.out.println("Dog Color: " + color);
    }

    public static void main(String[] args) {

        Dog d1 = new Dog("Bruno", "Black");

        d1.display();
    }
}
