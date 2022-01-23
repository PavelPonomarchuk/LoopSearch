package ru.pponomarchuk;

public class Main {

    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();

        node1.setNode(node2);
        node2.setNode(node3);
        node3.setNode(node4);
        node4.setNode(node2);

        System.out.println(LoopSearcher.isLoopDetected(node1));
    }
}
