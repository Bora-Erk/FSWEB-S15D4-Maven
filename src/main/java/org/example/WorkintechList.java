package org.example;

import java.util.ArrayList;
import java.util.Collections;


public class WorkintechList<E extends Comparable<? super E>> extends ArrayList<E> {

    @Override
    public boolean add(E e) {
        if (!this.contains(e)) {
            return super.add(e);
        }
        return false;
    }


    public void sort() {
        Collections.sort(this);
    }


    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        if (removed) {
            sort();
        }
        return removed;
    }
}

