public interface List<E>  {

    void add(int index, E value);

    E get(int index);

    int indexOf(E value);

    E remove(int index);

    int size();

}
