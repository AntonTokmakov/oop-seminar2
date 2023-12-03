package GbList;

/***
 *
 * @param <T>
 */
public interface GbList<T> {
    /***
     * ДОбавляет в конец колекции item тип T
     * @param item
     * @return this
     */
    GbList<T> add(T item);
    T get(int index);
    GbList<T> remove(int index);
    boolean update(T item, int index);
    int size();
    boolean isEmpty();

}
