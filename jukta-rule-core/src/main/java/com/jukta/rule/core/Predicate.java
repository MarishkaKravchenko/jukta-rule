package com.jukta.rule.core;

/**
 * @since 1.0
 */
public interface Predicate<T> {

    boolean eval(T t);

    int getRank();

}
