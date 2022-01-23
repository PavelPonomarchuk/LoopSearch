package ru.pponomarchuk;

import org.jetbrains.annotations.NotNull;

import java.util.TreeSet;

public class LoopSearcher {

    public static boolean isLoopDetected (@NotNull Node node){
        boolean loopDetected = false;
        TreeSet<Node> nodeTreeSet = new TreeSet<>();

        while (node.getNode() != null){
            if (nodeTreeSet.contains(node)){
                loopDetected = true;
                break;
            }
            nodeTreeSet.add(node);
            node = node.getNode();
        }
        return loopDetected;
    }
}
