package set_17;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class LRU_Cache{
	private int MAX_SIZE=0;
	private HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	private LinkedList<Integer> queue=new LinkedList<Integer>();
		
	LRU_Cache(int n){
			MAX_SIZE=n;
			queue=new LinkedList<Integer>();
			map=new HashMap<Integer,Integer>(MAX_SIZE);
		}
//____________________________________________________________________	
//	__________________________________________________________________
	
	void setKey(int key,int value){
			if(!map.containsKey(key)){
				if(map.size()>=MAX_SIZE) {
					queue.pollLast();
					queue.addFirst(key);
				}
				else{
					update(key,value);
				}
			}
			else{
				update(key,value);
			}
		}
//_________________________________________________________________
	
	void update(int key,int value){
			map.put(key, value);
			if(queue.contains(key)){
				queue.remove(queue.indexOf(key));
				queue.addFirst(key);
			}
			else{
				queue.addFirst(key);
			}
		}
//_______________________________________________________________________
//_______________________________________________________________________
	
	public static void main(String[] args) {
			LRU_Cache ch=new LRU_Cache(5);

			ch.setKey(1, 10);
			ch.setKey(2, 10);
			ch.setKey(3, 10);
			ch.setKey(1, 10);
			ch.setKey(3, 20);
		
			ListIterator<Integer> itr=ch.queue.listIterator();
			while(itr.hasNext()){
				System.out.println(itr.next()+" ");
			}
		}
}
