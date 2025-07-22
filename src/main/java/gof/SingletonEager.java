package gof;

public class SingletonEager {
    private static SingletonEager instance;

    private SingletonEager() {
        super();
    }
    public static SingletonEager getInstance() {
        return  instance;
    }
}
