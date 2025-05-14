package edu.scu.stackandquene;

import java.util.LinkedList;
import java.util.Queue;

public class quenetostack {
    Queue<Integer> quenein;
    public quenetostack() {
        quenein = new LinkedList<Integer>();
    }
    public void push(int x) {
        quenein.add(x);
    }
    public int pop() {
        round();
        return quenein.poll();
    }
    public int top() {
        round();
        int temp = quenein.peek();
        quenein.add(quenein.poll());
        return temp;
    }
    public boolean Empty() {
        return quenein.isEmpty();
    }
    public void round(){
        int size = quenein.size();
        for(int i = 0; i < size-1; i++){
            quenein.add(quenein.poll());
        }
    }
}
