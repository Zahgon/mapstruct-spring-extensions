package org.mapstruct.extensions.spring.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Wheels implements Iterable<Wheel> {

    private List<Wheel> wheelsList = new ArrayList<>();

    public List<Wheel> getWheelsList() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setWheelsList(List<Wheel> wheelsList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void add(final Wheel wheel) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Iterator<Wheel> iterator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void forEach(Consumer<? super Wheel> action) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Spliterator<Wheel> spliterator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
