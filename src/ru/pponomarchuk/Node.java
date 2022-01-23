package ru.pponomarchuk;

import org.jetbrains.annotations.NotNull;

public class Node implements Comparable<Node>{
    private int value;
    private Node node;

    public void setValue(int value) { this.value = value; }

    public int getValue() { return value; }

    public void setNode(Node node) {
        this.node = node;
    }

    public Node getNode() {
        return node;
    }


    @Override
    public int compareTo(@NotNull Node node) {
        return Integer.compare(this.value, node.value);
    }
}
