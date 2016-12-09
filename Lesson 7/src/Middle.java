/**
 * Created by vig on 10/24/16.
 */
public class Middle extends Trainee {
    private boolean knowledgeOfPatterns;

    public boolean isKnowledgeOfPatterns() {
        return knowledgeOfPatterns;
    }

    public void setKnowledgeOfPatterns(boolean knowledgeOfPatterns) {
        this.knowledgeOfPatterns = knowledgeOfPatterns;

    }

    public double getSalary() {
        return 400;
    }

    public  void setName(String name) {
        System.out.println("Inside Middle");
        if (name.startsWith("Mr.")){
            super.setName(name);
        } else {
            System.out.println("Middle should be a Boss");
        }

    }
    }
