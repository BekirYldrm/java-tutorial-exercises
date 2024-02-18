package genericsInJava;

import java.util.ArrayList;

public class MyCustomList <T extends Number>  { 
	
	  ArrayList<T> list = new ArrayList<>();
	 
	
	
	
	// behavior
	  
	  public T get(int index) {
		  return  list.get(index); 
	  }
	public void addElement(T element) {
		list.add(element);
	}
	
	public void removeElement(T element) {
		list.remove(element);
	}
	
	public String toString() {
		return list.toString();
	}

}
