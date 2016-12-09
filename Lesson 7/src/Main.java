import no.hierarcy.*;
import no.hierarcy.Developer;

/**
 * Created by vig on 10/24/16.
 */
public class Main {
    public static void main(String[] args) {
        /*Developer vasya = new Trainee();
        vasya.setName("Vasya");
        vasya.setSalary(400d);

        Developer petya = new Middle();
        vasya.setName("Mr.Petya");
        vasya.setSalary(300d);

        Developer dev = new Developer(); // все проверки лучше писать в методе родители и все проверки в наследуемых, чтобы не затрагивать методы родителей
        dev.setName("D");
        dev.setSalary(20d);

        System.out.println(vasya);
        System.out.println(petya); // This is Petya with salary 300
        System.out.println(dev);*/ //This is D
        Developer d = new Developer();
        Trainee t = new Trainee();
        Middle m = new Middle();
        Developer t1 = new Trainee();
        Developer m1 = new Middle();
        Trainee m2 = new Middle();

        max(d, d);
        max(d, t);
        max(d, m);
        max(m1, m);
        max(t, t1);
        max(t1, m2);
        max(m, d);



    Developer[] developers = new Developer[10];

        Trainee vasya = new Trainee();
        vasya.setName("Vasya");
        vasya.setSalary(400d);
        vasya.setKnowledgeOfJavaBasic(true);
        vasya.setKnowledgeOfJavaCollection(true);
        vasya.setKnowledgeOfServletApi(false);
        vasya.setKnowledgeOfSql(true);

        Developer vasya = new Trainee();
        vasya.setName("Vasya");
        vasya.setSalary(400d);
        System.out.println(vasya);
        System.out.println("--------");

        Developer petya = new Developer();
        petya.setName("Mr. Petya");
        petya.setSalary(300d);
        System.out.println(petya);
        System.out.println("--------");


        developers[0] = vasya;
        Developer d = developers[0];
        Trainee devVasya = (Trainee) d;
        boolean isTrainee = d instanceof Trainee;
        boolean isMiddle = d instanceof Middle;

        System.out.println(isMiddle + " " + isTrainee);
        System.out.println(d.getClass().getName());


        int m = 0;
        m = max(2, 3);
        m = max(2d, 3);
        m = max(2, 3, 4);
    }
}
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        return max(a, max(b, c));
    }

    public static int max(double a, int b) {
        return b;
    }

    public static no.hierarcy.Developer max(Developer developer,
                                            Developer developer2) {
        System.out.println("1");
        return developer;
    }

    public static Developer max(Trainee developer,
                                Developer developer2) {
        System.out.println("2");
        return developer;
    }

    public static Developer max(Middle developer,
                                Developer developer2) {
        System.out.println("3");
        return developer;
    }

    public static Developer max(Developer developer,
                                Middle developer2) {
        System.out.println("4");
        return null;
    }
    public static Developer max(Middle developer,
                                Middle developer2) {
        System.out.println("5");
        return null;
    }

}
