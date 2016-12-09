/**
 * Created by vig on 10/24/16.
 */
public class Trainee extends Developer {
    private boolean knowledgeOfJavaBasic;
    private boolean knowledgeOfJavaCollection;
    private boolean knowledgeOfSql;
    private boolean knowledgeOfServletApi;

    public boolean isKnowledgeOfJavaBasic() {
        return knowledgeOfJavaBasic;
    }

    public double getSalary() {
        return 200;
    }

    public void setKnowledgeOfJavaBasic(boolean knowledgeOfJavaBasic) {
        this.knowledgeOfJavaBasic = knowledgeOfJavaBasic;
    }

    public boolean isKnowledgeOfJavaCollection() {
        return knowledgeOfJavaCollection;
    }

    public void setKnowledgeOfJavaCollection(boolean knowledgeOfJavaCollection) {
        this.knowledgeOfJavaCollection = knowledgeOfJavaCollection;
    }

    public boolean isKnowledgeOfSql() {
        return knowledgeOfSql;
    }

    public void setKnowledgeOfSql(boolean knowledgeOfSql) {
        this.knowledgeOfSql = knowledgeOfSql;
    }

    public boolean isKnowledgeOfServletApi() {
        return knowledgeOfServletApi;
    }

    public void setKnowledgeOfServletApi(boolean knowledgeOfServletApi) {
        this.knowledgeOfServletApi = knowledgeOfServletApi;
    }
    public void setName(String name) {
        System.out.println("inside Trainee");
        if(name != null) {
            super.setName(name);
        }
        }
    private void overrideMe1() {
        System.out.println("1");
    }

    protected void overrideMe2() {
        System.out.println("2");
    }
    }
