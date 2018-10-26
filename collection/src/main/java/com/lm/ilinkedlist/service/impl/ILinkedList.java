package com.lm.ilinkedlist.service.impl;

import com.lm.ilinkedlist.service.IList;

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
        checkEntryIsNull(e);

        if (size == 0) {
            head = new Entry(e, null, null);
            last = head;
        } else {
            Entry entry = new Entry(e, null, null);
            last.next = entry;
            entry.pre = last;
        }

        size++;
    }

    @Override
    public void remove(Object e) {
        checkEntryIsNull(e);
    }

    public void addFirst(Object e) {
        checkEntryIsNull(e);
        Entry entry = new Entry(e, null, null);
        head.pre = entry;
    }

    public void addLast(Object e) {
        checkEntryIsNull(e);
        Entry entry = new Entry(e, null, null);
        add(e);
    }


    public Entry getEntry(int index) {
        if (index >= size) {
            return null;
        }

        Entry entry = head;
        int i = 0;
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
    public boolean equals(Object obj) {
        return super.equals(obj);

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder().append("List:");
        for(int i = 0;i<size; i++){
            stringBuilder.append(this.get(i));
        }
        return stringBuilder.toString();
    }
}

class Entry {
    Object value;
    Entry pre;
    Entry next;

    public Entry(Object value, Entry pre, Entry next) {
        super();
        this.value = value;
        this.pre = pre;
        this.next = next;
    }
}