package Class_Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MinHeap {
        private ArrayList<Integer> list;
        public MinHeap(){
            this.list=new ArrayList<>();
        }
        public void add(int data){
            this.list.add(data);
            upheapify(this.list.size()-1);
        }
        private void upheapify(int child){
            if(child==0){
                return;
            }
            int parent=(child-1)/2;
            if(this.list.get(parent)>this.list.get(child)){
                swap(parent,child);
                upheapify(parent);
            }
        }
        private void swap(int i,int j){
            int temp=this.list.get(i);
            this.list.set(i,this.list.get(j));
            this.list.set(j,temp);
        }
        public int delete() {
            if (list.isEmpty()) {
                System.out.println("list is empty");
                return -1;
            } else {
                swap(0, this.list.size()-1 );
                int ele = this.list.remove(this.list.size() - 1);
                return ele;
            }
        }
        private void downheapify(int parent){
            int leftChild=parent*2+1;
            int rightChild=parent*2+2;
            int temp=parent;
            if(leftChild<this.list.size() && this.list.get(temp)>this.list.get(leftChild)){
                temp=leftChild;
            }
            if(rightChild<this.list.size() && this.list.get(temp)>this.list.get(rightChild)){
                temp=rightChild;
            }
            if(temp!=parent){
                swap(temp,parent);
                downheapify(temp);
            }
        }
        public int get(){
            return this.list.size()>0 ? this.list.get(0) : -1;
        }
        public int size(){
            return this.list.size();
        }
        public boolean isEmpty(){
            return this.list.size()==0;
        }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap();
        heap.add(1);
        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(5);
//        System.out.println(heap.get());
//        System.out.println(heap.delete());
        while(!heap.isEmpty()){
            System.out.println(heap.delete());
        }
        PriorityQueue h = new PriorityQueue<>();
        PriorityQueue<Integer> maxh = new PriorityQueue<>(Collections.reverseOrder());
        h.offer(1);
        h.offer(2);
        h.offer(3);
        h.offer(4);
        h.offer(5);

        while(!h.isEmpty()){
            System.out.println(h.remove());
        }
    }
    
    }
