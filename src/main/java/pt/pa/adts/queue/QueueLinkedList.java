package pt.pa.adts.queue;

/**
 * This class must implement the Queue interface
 * @param <T>
 */
public class QueueLinkedList<T> implements Queue<T> {

    private ListNode header, trailer;
    private int size;

    public QueueLinkedList() {
        //TODO: construtor deve inicializar uma fila vazia
        header = new ListNode(null, null, null);
        trailer = new ListNode(null, null, null);

        header.next = trailer;
        trailer.prev = header;
        size = 0;
    }

    //TODO: implementar métodos da interface à custa da estrutura de dados fornecida
    @Override
    public void enqueue(T elem) throws QueueFullException, NullPointerException {
        if(isEmpty()){
            header = new ListNode(elem, null, trailer);
            trailer = new ListNode(elem, header, null);
            size++;
            return;
        }

        System.out.println("HEADER:" + header.element);
        trailer.next = new ListNode(elem, trailer, null);
        trailer = trailer.next;

        System.out.println("trailer inserted: " + trailer.element);

        size++;
    }

    @Override
    public T dequeue() throws QueueEmptyException {
        if(isEmpty())
            throw new QueueEmptyException();

        T dequeuedElement = null;

        System.out.println("Header: " + header.element);

        //size--;
        return dequeuedElement;
    }

    @Override
    public T front() throws QueueEmptyException {
        if(isEmpty())
            throw new QueueEmptyException();

        return header.element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return header == null;
    }

    @Override
    public void clear() {
        while(!isEmpty()){
            dequeue();
        }
    }

    private class ListNode {
        private T element;
        private ListNode next;
        private ListNode prev;

        public ListNode(T element, ListNode prev, ListNode next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
