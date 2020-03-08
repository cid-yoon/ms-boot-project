package com.cid.boot.ms.multiplication.domain.domain;

import lombok.Getter;

@Getter
public class Multiplication {

    private int factorA;
    private int factorB;
    private int result;

    public Multiplication(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
        this.result = factorA * factorB;
    }

    @Override
    public String toString() {
        return "SocialMultiplication{" +
                "factorA=" + factorA +
                ", factorB=" + factorB +
                ", result(A * B)=" + result +
                '}';
    }
}
