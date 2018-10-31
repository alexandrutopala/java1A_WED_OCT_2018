@FunctionalInterface
public interface InstrumentCuCorzi extends Instrument {
    // avem o singura metoda abstraca (canta()) venita din interfata Instrument
    @Override
    default void incanta() {
        System.out.println("Ou lala");
    }
    
    
    static void m() {
        System.out.println("metoda static in interfata");
    }
}