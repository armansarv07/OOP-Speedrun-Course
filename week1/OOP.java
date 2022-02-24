package week1;


class Human {
    String name;
    int age;
    String race;
    double height;

    Human(String name, int age, String race, double height) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.height = height;
    }

    void introduce() {
        System.out.println("Hello, motherfucker, my name is " + name);
    }

    int birthday() {
        return ++age;
    }

    void greeting(Human man) {
        this.introduce();
        System.out.println("Hello, " + man.name + " your age is " + man.age);
    }

    void description() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.height);
        System.out.println(this.race);
    }
}

class Book {
    String name;
    int pages;

    Book(String name, int pages){
        this.name = name;
        this.pages = pages;

    }   


}

public class OOP {
    public static void main(String args[]) {
        Human loser = new Human("Mal", 18, "down", 155);
        Human winner = new Human("Merey", 19, "asian", 170);
        winner = loser;
        loser.race = "shoshka";
        winner.race = "arian";
        winner.description();
        loser.description();
    }
}
