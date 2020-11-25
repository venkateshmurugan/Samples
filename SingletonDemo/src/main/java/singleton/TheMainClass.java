package singleton;

public class TheMainClass{

    public static void main(String args[]){

        System.out.println("Welcome to Singleton Demo...");

        SingletonField sg = SingletonField.INSTANCE;

        sg.setValue("Instance One");

        System.out.println("Set Singleton Instance 1 with the Value of -> " + sg.getValue());

        SingletonField sg2 = SingletonField.INSTANCE;

        System.out.println("get value from Singleton Instance 2 ->" + sg2.getValue());

        System.out.println("Trying out Singleton Factory");

        SingletonFactory sf = SingletonFactory.getInstance();

        sf.setValue("SingletonFactory Instance One");

        System.out.println("Set Singleton Factory Instance 1 with the Value of -> " + sf.getValue());

        SingletonFactory sf2 = SingletonFactory.getInstance();

        System.out.println("get value from Singleton Instance 2 ->" + sf2.getValue());

        System.out.println("Trying out Singleton Lazy Serializable Factory");

        SingletonLazySerializableFactory slsf = SingletonLazySerializableFactory.getInstance();

        slsf.setValue("SingletonLazySerializableFactory Instance One");

        System.out.println("Set Singleton Lazy Serializable Factory Instance 1 with the Value of -> " + slsf.getValue());

        SingletonLazySerializableFactory slsf2 = SingletonLazySerializableFactory.getInstance();

        System.out.println("get value from Singleton Lazy Serializable Instance 2 ->" + slsf2.getValue());

         System.out.println("Trying out Singleton Enum");

        SingletonEnum se = SingletonEnum.INSTANCE;

        se.setValue("Singleton Enum Instance One");

        System.out.println("Set Singleton Enum Instance 1 with the Value of -> " + se.getValue());

        SingletonEnum se2 = SingletonEnum.INSTANCE;

        System.out.println("get value from Singleton Enum 2 ->" + se2.getValue());
    }
}