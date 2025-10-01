package pt.pa.adts;

import pt.pa.adts.queue.QueueLinkedList;

public class Main {
  public static void main(String[] args) {

    QueueLinkedList<Integer> list = new QueueLinkedList<>();

    list.enqueue(1);
    list.enqueue(2);
    list.enqueue(3);
    list.enqueue(4);
    list.enqueue(5);

  }
}