package com.softserve.OOPInheritance.Homework.Task1.NonFlyingBirds;

import com.softserve.OOPInheritance.Homework.Task1.Bird;

class NonFlyingBird extends Bird {

    protected NonFlyingBird(boolean hasFeathers, boolean isLayingEggs) {
        super(hasFeathers, isLayingEggs);
    }

    @Override
    public void fly() {
        System.out.println("Sorry," + this.getClass().getSimpleName() + " couldn't fly");
    }

    @Override
    public String toString() {
        return super.toString() + "\nCould fly = false\n";
    }
}
