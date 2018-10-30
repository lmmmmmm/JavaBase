package com.lm.ilinkedlist.service.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lming.41032@gmail.com
 * @date 18-10-26 下午11:28
 */
public class ILinkedListTest {

    private ILinkedList iLinkedList = new ILinkedList();

    @Before
    public void setListInfo(){
        iLinkedList.add(0);
        iLinkedList.add(1);
        iLinkedList.add(2);
        iLinkedList.add(3);
    }

    @Test
    public void size() {
        assertEquals(4,iLinkedList.size());
    }


    @Test
    public void isEmpty( ) {
        assertTrue(!iLinkedList.isEmpty());
    }

    @Test
    public void indexOf() {
       // assertEquals(3,iLinkedList.indexOf(2));
    }

    @Test
    public void get() {
    }

    @Test
    public void add() {
    }

    @Test
    public void contains() {
        assertTrue(iLinkedList.contains(0));
    }


    @Test
    public void remove() {
    }

    @Test
    public void addFirst() {
        iLinkedList.addFirst(-1);
        assertEquals(-1,iLinkedList.get(0));
    }

    @Test
    public void addLast() {
       // iLinkedList.addLast(100);
       // assertEquals(100,iLinkedList.get(iLinkedList.size()-1));
    }

    @Test
    public void toStringTest(){
      //  System.out.println(iLinkedList.toString());
    }
}
