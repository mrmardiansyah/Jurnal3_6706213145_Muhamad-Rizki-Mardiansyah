public class List<T> {
    T data;
    List<T> next;

    public List(T object) {
        data = object;
        this.next = null;
    }

    public T getData(){
        return data;
    }
}
