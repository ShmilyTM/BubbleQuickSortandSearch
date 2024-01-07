
package model;

public class Node {

    private int[] array;
    private int size;

    public Node() {
    }

    public Node(int[] array, int size) {
        this.array = array;
        this.size = size;
    }

    public Node(int size) {
        this.size = size;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
