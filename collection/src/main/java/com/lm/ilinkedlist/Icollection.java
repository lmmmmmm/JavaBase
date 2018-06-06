package com.lm.ilinkedlist;

public interface Icollection {

    void add(Object e);

    void remove(Object e);

    int size();

    boolean isEmpty();

    boolean contains(Object key);
}
