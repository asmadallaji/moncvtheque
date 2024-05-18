package com.cvtheque.patterns.strategies;

import com.cvtheque.models.Experience;

import java.util.List;

public interface TriStrategy {
    void trier(List<Experience> experiences);
}
