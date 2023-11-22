/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2luis;

/**
 *
 * @author andre
 */
public class BinaryHeap {
    public Documento[] heap;
    public int size;
    private int capacity;

    public BinaryHeap() {
        this.capacity = 250;
        this.size = 0;
        this.heap = new Documento[capacity];
    }

public void insert(String t, int s, String y, int c) {
    Documento doc = new Documento(t,s,y, c);
    if (size == capacity) {
        throw new IllegalStateException("El montículo está lleno");
    }

    size++;
    int currentIndex = size - 1;
    heap[currentIndex] = doc;

    while (currentIndex != 0 && heap[parentIndex(currentIndex)].time > heap[currentIndex].time) {
        swap(currentIndex, parentIndex(currentIndex));
        currentIndex = parentIndex(currentIndex);
    }
}

public Documento deleteMin() {
    if (size == 0) {
        return null;
    }

    if (size == 1) {
        size--;
        return heap[0];
    }

    Documento root = heap[0];
    heap[0] = heap[size - 1];
    size--;
    heapify(0);

    return root;
}

private void heapify(int index) {
    int smallest = index;
    int leftChild = leftChildIndex(index);
    int rightChild = rightChildIndex(index);

    if (leftChild < size && heap[leftChild].time < heap[smallest].time) {
        smallest = leftChild;
    }

    if (rightChild < size && heap[rightChild].time < heap[smallest].time) {
        smallest = rightChild;
    }

    if (smallest != index) {
        swap(index, smallest);
        heapify(smallest);
    }
}

private int parentIndex(int index) {
    return (index - 1) / 2;
}

public int leftChildIndex(int index) {
    return (2 * index) + 1;
}

public int rightChildIndex(int index) {
    return (2 * index) + 2;
}

private void swap(int index1, int index2) {
    Documento temp = heap[index1];
    heap[index1] = heap[index2];
    heap[index2] = temp;
}

public void delete_document(Documento doc){
    if(this.heap[0].time == doc.time && this.heap[0].title.equals(doc.title)){
        this.deleteMin();
    }else{
        if(this.heap[0]!= null){
        Documento aux = this.deleteMin();
        this.delete_document(doc);
        this.insert(aux.title, aux.size,aux.type, aux.time);}
        
    }
}

public String print(String binaryPrint){
    Documento aux = this.deleteMin();
    if(aux!= null){
        binaryPrint += aux.title + "\n";
        binaryPrint = print(binaryPrint);
        this.insert(aux.title, aux.size,aux.type, aux.time);}
    return binaryPrint;
}

}


