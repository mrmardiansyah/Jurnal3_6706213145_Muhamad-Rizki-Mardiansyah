import java.util.NoSuchElementException;

public class LinkedList<T> {
    private List<T> firstNode;
    private List<T> lastNode;
    private String name;


    public LinkedList(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    public String intToString(int data){ //method untuk mengubah tipe data integer ke String
        int dataInt = data;
        String fusion = String.valueOf(dataInt);
        return fusion;
    }

    public LinkedList(){
        this("Linked List");
    }

    public boolean isEmpty(){ //Method untuk mencek jika isinya kosong

        return firstNode == null;
    }

    public void insertAtFront(T insertItem){ //method untuk memasukan data dari depan
        List newNode = new List(insertItem);

        if (isEmpty()){
            firstNode = lastNode = new List<T>(insertItem);
        } else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    public void insertAtBack(T insertItem){ //method untuk memasukan data dari belakang
        List newNode = new List(insertItem);

        if (isEmpty()){
            firstNode = lastNode = new List<T>(insertItem);
        } else{
            lastNode.next = newNode;
            lastNode = newNode;

        }
    }

    public T removeFromFront(LinkedList<Pegawai> pegawai) throws NoSuchElementException{ //Method untuk menghapus data dari depan

        Object removeItem = null;
        if (isEmpty()){
            throw new NoSuchElementException(name + "is empty");
        }

        removeItem = firstNode.data;

        if (firstNode.equals(lastNode)){
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.next;
        }

        return (T) removeItem;
    }

    public T removeFromBack(LinkedList<Pegawai> pegawai) throws NoSuchElementException { //Method untuk menghapus data dari belakang
        if (isEmpty()){
            throw new NoSuchElementException(name + "is empty");
        } else{
            List<T> current = firstNode;
        }

        T removedItem = lastNode.data;

        if (firstNode == lastNode){
            firstNode = lastNode = null;
        } else {
            List<T> current = firstNode;

            while (current.next != lastNode){
                current = current.next;
            }

            lastNode = current;
            current.next = null;
        }

        return removedItem;
    }

    public void print(){ //Method untuk mencetak data
        if (isEmpty()){
            System.out.printf("Empty %s%n", name);
            return;
        }

        System.out.printf("This %s is : %n", name);
        List<T> current = firstNode;

        while (current != null){
            System.out.printf("%s", current.data);
            current = current.next;
        }

        System.out.println();
    }
}
