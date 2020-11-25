package singleton;

public class SingletonFactory{

    private static final SingletonFactory INSTANCE = new SingletonFactory();

    private String value;

    private SingletonFactory(){

    }

    public static SingletonFactory getInstance(){
        return INSTANCE;
    }

    public void setValue(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}