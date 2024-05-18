package com.cvtheque.patterns.decorator;

import com.cvtheque.patterns.composites.CVElement;

public abstract class CVDecorator implements CVElement {
    protected CVElement decoratedCV;

    public CVDecorator(CVElement cv) {
        this.decoratedCV = cv;
    }

    public void afficherDetails() {
        decoratedCV.afficherDetails();
    }
}