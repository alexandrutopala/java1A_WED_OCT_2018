@FunctionalInterface
public interface Consumator<E> {
    public void consume(E e);
}