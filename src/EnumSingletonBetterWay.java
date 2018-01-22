public enum EnumSingletonBetterWay {

    INSTANCE;

    public static void doSomething(){
        //do something
    }
}

/*
We can use Enum to implement Singleton design pattern as Java ensures that any enum value is instantiated only once in a Java program.
Since Java Enum values are globally accessible, so is the singleton.
The drawback is that the enum type is somewhat inflexible; for example, it does not allow lazy initialization.

 */
