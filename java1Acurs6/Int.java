public class Int {
    int x;
    public Int(int x) {
        this.x = x;
    }
    
    public int hashCode() {
        return x % 11;
    }
}