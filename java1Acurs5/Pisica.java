public class Pisica {
    // singleton sincronizata lazy
    
    private Pisica() {
    }
    
    private final static class SingletonHolder {
        public final static Pisica SINGLETON = new Pisica();
    }
    
    
    public static Pisica getInstance() {
        return SingletonHolder.SINGLETON;
    }
}