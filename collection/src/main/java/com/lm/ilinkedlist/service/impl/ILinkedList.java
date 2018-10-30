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
            //TODO 插入逻辑
            Entry entry = new Entry(e, null, null);
            Entry temp = last;
            //将新增的元素作为last
            last = entry;
            //新增的元素前一个是last
            last.pre = temp;
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
        //要插入的值变成header,原来的header变为要插入的值后面的元素
        Entry temp = head;
        head = entry;
        head.next = temp;
    }

    public void addLast(Object e) {
        checkEntryIsNull(e);
        Entry entry = new Entry(e, null, null);
        add(e);
    }


    public Entry getEntry(int index) {
        //要查找的元素位置大于链表长度
        if (index > size || index <0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == size) {
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