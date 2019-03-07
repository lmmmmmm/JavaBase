package ilinkedlist.service.impl;

import ilinkedlist.service.IList;

public class ILinkedList implements IList {

    /**
     * 数组容量
     */
    private int size = 0;
    /**
     * 链表 head node
     */
    private Entry head;
    /**
     * LinkedList last node
     */
    private Entry last;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int indexOf(Object e) {

        return 0;
    }

    @Override
    public Object get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return getEntry(index).value;
    }

    @Override
    public void add(Object e, int index) {
        checkEntryIsNull(e);

    }

    @Override
    public boolean contains(Object o) {
        int i = 0;
        while (i < size) {
            if (get(i).equals(o)) {
                return true;
            }
            i++;
        }
        return false;
    }

    @Override
    public void add(Object e) {

    }

    public void add(Integer e) {
        checkEntryIsNull(e);
        Entry l = last;
        Entry entry = new Entry(e, l, null);
        last = entry;
        if (l == null) {
            head = entry;
        } else {
            l.next = entry;
        }
        size++;
    }

    @Override
    public void remove(Object o) {
        checkEntryIsNull(o);
        Integer i = (Integer) o;
        for (Entry e = head; e != null; e = e.next) {
            if (head.value.equals(i)) {
                //确定该元素位置
                Entry entry = e;
                Entry pre = e.pre;
                Entry next = e.next;
                //要删除的元素为head元素，则该元素的next为head
                if (pre == null) {
                    head = next;
                } else {
                    pre.next = next;
                    entry.pre = null;
                }
                if (next == null) {
                    last = pre;
                } else {
                    //该元素上一个元素的下一个元素为该元素的下一个元素。
                    entry.pre = next;
                    //该元素的下一个元素为null
                    entry.next = null;
                }
                //垃圾回收
                entry.value = null;
                size--;
            }

        }

    }

    public void addFirst(Integer e) {
        checkEntryIsNull(e);
        Entry entry = new Entry(e, null, null);
        //要插入的值变成header,原来的header变为要插入的值后面的元素
        Entry temp = head;
        head = entry;
        head.next = temp;
    }

    public void addLast(Object e) {
        checkEntryIsNull(e);
        add(e);
    }


    public Entry getEntry(int index) {
        //要查找的元素位置大于链表长度
        if (index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == size - 1) {
            return last;
        }
        if (index == 0) {
            return head;
        }
        // 建立一个新的实体为链表头部。
        Entry entry = head;
        int i = 1;
        while (i < index) {
            entry = entry.next;
            i++;
        }
        return entry;
    }

    private void checkEntryIsNull(Object e) {
        if (e == null) {
            throw new RuntimeException("添加的元素不能为空");
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder().append("List:");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(this.get(i));
        }
        return stringBuilder.toString();
    }
}

class Entry {
    Integer value;
    Entry pre;
    Entry next;

    public Entry(Integer value, Entry pre, Entry next) {
        super();
        this.value = value;
        this.pre = pre;
        this.next = next;
    }
}