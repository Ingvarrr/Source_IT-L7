/**
 * Created by vig on 10/24/16.
 */
public class Developer {
    private String name;
    protected double salary;

    private void overrideMe1() {
        System.out.println("1");
    }

    protected void overrideMe2() {
        System.out.println("2");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return 0;
    }

    public void setSalary(double salary) {
        System.out.println("Inside dev");
        this.salary = salary;
    }
    public String toString(){
        overrideMe1();
        overrideMe2();
        return "This is" + name + " with salary" + salary;
    }
    }



