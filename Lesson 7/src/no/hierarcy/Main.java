package no.hierarcy;

/**
 * Created by vig on 10/24/16.
 */
public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setName("Vasya");
        developer.setSalary(200d);

        Skill[] vasyaSkills = new Skill[4];
        vasyaSkills[0] = new Skill("java basic", true);
        vasyaSkills[1] = new Skill("c++", true);
        vasyaSkills[2] = new Skill("sql", true);
        vasyaSkills[3] = new Skill("c#", true);
        developer.setSkills(vasyaSkills);

        System.out.println(developer.hasSkill("c#"));
        System.out.println(developer.hasSkill("ruby"));


}//это все называется "композиция" ! (в этом пакете)
