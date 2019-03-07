package imap;

/**
 * @author lming.41032@gmail.com
 * @date 18-11-4 下午9:28
 */
public interface Imap {

    int size();

    boolean isEmpty();

    boolean containsKey(Object key);

    boolean containsValue(Object value);

    Object get(Object key);

    void put(Object key, Object value);

    void remove(Object key);

}
