package pro.kensait.designpattern.lesson04.decorator.provider;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class ProductList implements List<Product> {
    protected List<Product> input;

    public ProductList() {
    }

    public ProductList(List<Product> input) {
        super();
        this.input = input;
    }

    @Override
    public int size() {
        return input.size();
    }

    @Override
    public boolean isEmpty() {
        return input.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return input.contains(o);
    }

    @Override
    public Iterator<Product> iterator() {
        return input.iterator();
    }

    @Override
    public Object[] toArray() {
        return input.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return input.toArray(a);
    }

    @Override
    public boolean add(Product e) {
        return input.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return input.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return input.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Product> c) {
        return input.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Product> c) {
        return input.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return input.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return input.retainAll(c);
    }

    @Override
    public void clear() {
        input.clear();
    }

    @Override
    public Product get(int index) {
        return input.get(index);
    }

    @Override
    public Product set(int index, Product element) {
        return input.set(index, element);
    }

    @Override
    public void add(int index, Product element) {
        input.add(index, element);
    }

    @Override
    public Product remove(int index) {
        return input.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return input.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return input.lastIndexOf(o);
    }

    @Override
    public ListIterator<Product> listIterator() {
        return input.listIterator();
    }

    @Override
    public ListIterator<Product> listIterator(int index) {
        return input.listIterator(index);
    }

    @Override
    public List<Product> subList(int fromIndex, int toIndex) {
        return input.subList(fromIndex, toIndex);
    }
}