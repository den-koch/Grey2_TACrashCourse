package com.softserve.OOPInheritance.Homework.Task1.FlyingBirds;

import com.softserve.OOPInheritance.Homework.Task1.Bird;

class FlyingBird extends Bird {

    public FlyingBird(boolean hasFeathers, boolean isLayingEggs) {
        super(hasFeathers, isLayingEggs);
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " flying height in the sky");
    }

    @Override
    public String toString() {
        return super.toString() + "\nCould fly = true\n";
    }
}
