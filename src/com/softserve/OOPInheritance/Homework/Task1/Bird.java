package com.softserve.OOPInheritance.Homework.Task1;

public abstract class Bird {
    private boolean hasFeathers;
    private boolean isLayingEggs;

    public Bird(boolean hasFeathers, boolean isLayingEggs) {
        this.hasFeathers = hasFeathers;
        this.isLayingEggs = isLayingEggs;
    }

    public abstract void fly();

    public boolean isHasFeathers() {
        return hasFeathers;
    }

    public void setHasFeathers(boolean hasFeathers) {
        this.hasFeathers = hasFeathers;
    }

    public boolean isLayingEggs() {
        return isLayingEggs;
    }

    public void setLayingEggs(boolean layingEggs) {
        isLayingEggs = layingEggs;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
               "\nfeather=" + hasFeathers +
               "\nlayEggs=" + isLayingEggs;
    }

}
