package HashMap;

import java.util.LinkedList;

public class Implementation {
    static class MyHashMap<K, V>{
        public static final int Default_capacity=4;
        public static final float Default_loadfactor=.75f;
        private class Node{
            K key;
            V val;
            Node(K key, V val){
                this.key=key;
                this.val=val;
            }

        }
        private int n; // no. of entries in the map;
        private LinkedList<Node>[] buckets; // array of linkedlist
        public MyHashMap(){
            initBuckets(Default_capacity);
        }
        private int searchInBucket(LinkedList<Node> ll, K key){ // traverse the ll and looks for a node with key, if found returns the index else returns null.
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            } return -1;
        }
        private void initBuckets(int N){
            buckets=new LinkedList[N];
            for(int i=0;i< buckets.length;i++){
                buckets[i]= new LinkedList<>();
            }
        }
        public int capacity(){
            return buckets.length;
        }
        public float load(){
            return (n*1.0f)/ buckets.length;
        }
        private int Hashfunc(K key){
            int hc= key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }
        private void rehash(){
            LinkedList<Node>[] oldBuckets= buckets;
            n=0;
            initBuckets(oldBuckets.length * 2);
            for( var bucket: oldBuckets){
                for(var node: bucket){
                    put(node.key, node .val);
                }
            }
        }

        public int size(){ // return no. of entries in map
            return n;
        }
        public void put(K key, V val){
            int bi=Hashfunc(key);
            LinkedList<Node> currBucket= buckets[bi];
            int ei= searchInBucket(currBucket,key);
            if(ei==-1){
                Node node= new Node(key,val);
                currBucket.add(node);
                n++;
            } else{ // update case
                Node currNode= currBucket.get(ei);
                currNode.val=val;
            }
            if(n>= buckets.length * Default_loadfactor){ // threshold value =  current capacity *  load factor
                rehash();
            }
        }
        public V get(K key){
            int bi=Hashfunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei=searchInBucket(currBucket,key);
            if(ei!=-1){ // key exists
                Node currNode= currBucket.get(ei);
                return currNode.val;
            } return null;
        }
        public V remove(K key){
            int bi=Hashfunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei=searchInBucket(currBucket,key);
            if(ei!=-1){ // key exists
                Node currNode =  currBucket.get(ei);
                V val= currNode.val;
                currBucket.remove(ei); // not the recursive call, yeh wala inbuilt function h java ka
                n--;
                return val;
            } return null;

        }

    }
    public static void main(String[] args) {
        MyHashMap<String, Integer> mp= new MyHashMap<>();
        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);
        mp.put("d",4);
        mp.put("x",6);
        mp.put("y",7);
        System.out.println("size "+ mp.size());
        mp.put("c",30);
        System.out.println(mp.get("a"));
        System.out.println(mp.get("e"));
        System.out.println(mp.remove("c"));
        System.out.println(mp.size());
        System.out.println(mp.capacity());
        System.out.println(mp.load());

    }
}
