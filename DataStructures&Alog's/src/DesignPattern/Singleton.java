package DesignPattern;

/**
 * Created by kunal on 4/19/18.
 *
 * Singleton pattern with MultiThreading
 *
 * Link:https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 */
public class Singleton {

    //Make this volatile otherwise other thread might see a half initialized instance of Singleton
    private static volatile  Singleton instance;

    //Prevents instantiation from other classes
    private Singleton(){}

    public static Singleton getInstance(){
        if(instance ==null)
            instance = new Singleton();
        return instance;
    }

    //The problem in above approach is that it is not thread safe. If two or more threads in parallel try to getInstance,
    //it will create multiple instances


    //Method2
    public static synchronized  Singleton getInstanceTS() {

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /*
    * The above method is thread safe but it has cost that the whole method is synchronized even though we just need to make
    * instance creation part sync.
    * */

    //Method 3
    public static Singleton getInstanceDC() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if(instance == null)
                    instance = new Singleton();
            }

        }
        return instance;
    }

    //Above method is thread safe with double lock

    //Method 4 = statc inner class implementataion

    private static class SingletonInner{

        private static final Singleton INSTANCE = new Singleton();

        public static Singleton getInstance(){
            return SingletonInner.INSTANCE;
        }
    }
}
