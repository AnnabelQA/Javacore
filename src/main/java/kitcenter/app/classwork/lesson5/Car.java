package kitcenter.app.classwork.lesson5;

/**
 * Created by annabilous on 5/6/17.
 */
public class Car {

    private String name;

    private Integer speed;

    public Car(String name){
        this.name = name;
        speed = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String showSpeed() {
        StringBuilder builder = new StringBuilder();
        builder.append("Car ")
                .append(name)
                .append(" is moving with the speed: ")
                .append(speed);
        return builder.toString();
    }
}
