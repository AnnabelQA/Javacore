package kitcenter.app.classwork.lesson7;

/**
 * Created by annabilous on 5/13/17.
 */
public class HowManyEven {
    int counter = 0;
    public void countEven(){

    for (int i = 0; i < 20; i++){
        if(i%2==0){
            counter ++;
        }
    }
    System.out.println(counter);
}
}
