package singleton;

public class SingletonLazySerializableFactory{

    private static SingletonLazySerializableFactory INSTANCE = null;

    private String value;

    private SingletonLazySerializableFactory(){

    }

    public static SingletonLazySerializableFactory getInstance(){
        
        if(INSTANCE == null){
            synchronized(SingletonLazySerializableFactory.class){
                if(INSTANCE == null){
                    INSTANCE = new SingletonLazySerializableFactory();
                }
            }
        }

        return INSTANCE;
    }

    public Object readResolve()
    {
        return INSTANCE;
    }

    public void setValue(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}