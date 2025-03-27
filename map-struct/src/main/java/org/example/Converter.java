package org.example;

@FunctionalInterface
public interface Converter<R,T> {

    abstract R convert(T t);
}
