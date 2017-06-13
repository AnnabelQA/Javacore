package kitcenter.app.homework.lesson13;

/**
 * Created by annabilous on 6/13/17.
 */
public class Human {
    private int age;
    private String name;

    public Human() {
    }

    public Human(int age, String name) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (1 <= age && age <= 120) {
            this.age = age;
            System.out.println("New age is set");
        } else {
            System.out.println("Age is invalid");
        }
    }

}
