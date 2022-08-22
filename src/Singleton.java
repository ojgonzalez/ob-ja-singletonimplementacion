import java.util.ArrayList;

public class Singleton {

    private static Singleton singleton;

    private static ArrayList<Double> numberLIst;

    private Singleton(){
        numberLIst = new ArrayList<>();
        for(int nCounter = 0; nCounter <= 9; nCounter++){
            numberLIst.add(Math.random());
        }
    }

    public static Singleton getInstance(){

        if (singleton == null){
            singleton = new Singleton();
        }


        System.out.println(numberLIst);

        System.out.println(singleton);
        return singleton;
    }

}
