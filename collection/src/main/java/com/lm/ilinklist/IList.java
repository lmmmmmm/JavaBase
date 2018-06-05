package com.lm.ilinklist;

public interface IList extends Icollection {

    @Override
    int size();

    /**
     * 根据元素查找元素在列表中的位置
     *
     * @param e 元素
     * @return 索引
     */
    int indexOf(Object e);

    /**
     * 根据元素下表得到元素
     *
     * @param index 索引
     * @return 元素
     */
    Object get(int index);

    /**
     * 给制定位置添加元素
     *
     * @param e     元素
     * @param index 索引
     */
    void add(Object e, int index);

    @Override
    boolean contains(Object o);

    @Override
    void add(Object e);


}
