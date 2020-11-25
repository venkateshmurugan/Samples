package singleton;

public class SingletonField{
    public static final SingletonField INSTANCE = new SingletonField();

    private SingletonField(){
        
    }

    private String value;

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }
}