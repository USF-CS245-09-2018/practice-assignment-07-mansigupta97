public class ArrayList implements List {

	int size = 0;
	Object [] array = new Object[10];

	public void growArray() {
		int new_size = array.length * 2;
		Object [] newArray = new Object[new_size];
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			newArray[count] = array[i];
		}
		array = newArray;
	}

	public void add(Object object) {
		if(size == array.length) {
			growArray();
		}
		array[size] = object;
		size++;
	}

	public void add(int position, Object object) {
		if(size == array.length) {
			growArray();
		}
		for(int i = size; i > position; i--) {
			array[i] = array[i - 1];
			array[i] = position;
		}
		size++;
	}

	public Object get(int position) {
		return array[position];
	}

	public Object remove(int position) {
		Object removeItem = array[position];
		if(size == 0) {
			return removeItem;
		}
		System.out.println("------REMOVE------");
		System.out.println("position: " +  position + ", size: " + size);
		for(int i = position + 1; i < size; i++) {
			//System.out.println(size);
			array[i - 1] = array[i];
		}
		size--;
		return removeItem;
	}

	public int size() {
		return size;
	}

}