package com.damore.tutorial.generics.test3;

public class OddPredicate implements UnaryPredicate<Long> {
	@Override
    public boolean test(Long i) {
                return (i % 2) > 0;
    }
}

