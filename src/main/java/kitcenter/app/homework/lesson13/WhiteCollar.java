package kitcenter.app.homework.lesson13;

/**
 * Created by annabilous on 6/13/17.
 */
public class WhiteCollar extends Human {
    private String company;

    public WhiteCollar(int age, String name, String company){
        super(age, name);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if(company.matches("^[a-zA-Z\\-\\ ,]+$")){
          this.company = company;
        } else {
            System.out.println("Company name is invalid!");
        }

    }
}
