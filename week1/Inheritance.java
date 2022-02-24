package week1;


class Minato {
    String hair = "yellow";
    int height = 185;
    int strength = 100;

    void ability() {
        System.out.println("Hirayshin");
    }

    void description() {
        System.out.println(this.hair);
        System.out.println(this.height);
        System.out.println(this.strength);
    }
}

class Kushina {
    String hair = "red";
    int height = 170;
    int strength = 50;

    void ability() {
        System.out.println("Chains");
    }
}

class Naruto extends Minato {
    @Override
    void description() {
        System.out.println("My name is Naruto");
        super.description();
    }

    @Override
    void ability() {
        System.out.println("Rasengan");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Naruto naruto = new Naruto();
        naruto.description();
        naruto.ability();
    }
}
