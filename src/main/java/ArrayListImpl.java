public class ArrayListImpl<E> implements List<E> {

	private Object[] data= new Object[10];

	@Override
	public void add(int index, E value) {
		if (index < 0 || index >= data.length)
			throw new IndexOutOfBoundsException();
		data[index] = value;
	}

	@Override
	public E get(int index) {
		if (index < 0 || index >= data.length)
			throw new IndexOutOfBoundsException();
		return (E) data[index];
	}

	@Override
	public int indexOf(E value) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public E remove(int index) {
		E el = get(index);
		add(index, null);
		return el;
	}

	@Override
	public int size() {
		return data.length;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < data.length; i++) {
			sb.append(i + " -> " + String.valueOf(data[i])+"; ");
		}
		return sb.append("]").toString();
	}

}
