package no.hierarcy;

/**
 * Created by vig on 10/24/16.
 */
public class Developer {
    private String name;
    private double salary;

    private Skill[] skills;

    public boolean hasSkill(String skillName)  {
        for(Skill skill : this.skills) {
            if(skillName.equals(skill.getName())) {
                return skill.isHasSkill();
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Skill[] getSkills() {
        return skills;
    }

    public void setSkills(Skill[] skills) {
        this.skills = skills;
    }
}
