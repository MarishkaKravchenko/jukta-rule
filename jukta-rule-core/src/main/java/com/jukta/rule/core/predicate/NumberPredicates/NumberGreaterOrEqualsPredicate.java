package com.jukta.rule.core.predicate.NumberPredicates;

import com.jukta.rule.core.Predicate;

public class NumberGreaterOrEqualsPredicate implements Predicate<String> {

    private String value;

    public NumberGreaterOrEqualsPredicate(String value) {
        this.value = value;
    }

    @Override
    public boolean eval(String s) {
        return Integer.parseInt(value) <= Integer.parseInt(s);
    }

    @Override
    public int getRank() {
        return 0;
    }
}