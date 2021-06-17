package com.sanchit.di;

/**
 * @author: Sanchit Raina
 */
public class Student {
    private MathCheat mathCheat;

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
        System.out.println("setMathCheat() called");
    }

    public void cheating() {
        mathCheat.mathCheat();
    }
}
