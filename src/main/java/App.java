public class App {
	public static void main(String[] args) {
		List<String> list = new ArrayListImpl<>();
		list.add(0,"test 1");
		list.add(1,"test 2");

		System.out.println(list);

		System.out.println(list.indexOf("test 2"));

		list.remove(0);

		System.out.println(list);

		LinkedList<Integer> linkedList = new LinkedListImpl<>();
		linkedList.insertFirst(1);
		linkedList.insertFirst(2);
		linkedList.insertFirst(3);
		linkedList.insertFirst(4);
		linkedList.insertFirst(5);
		linkedList.insertFirst(6);
		linkedList.insertFirst(7);
		linkedList.insertFirst(8);


		System.out.println(linkedList);
	}
}
