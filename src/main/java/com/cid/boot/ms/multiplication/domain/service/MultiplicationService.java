package com.cid.boot.ms.multiplication.domain.service;

import com.cid.boot.ms.multiplication.domain.domain.Multiplication;

public interface MultiplicationService {

    /**
     * 두 개의 무작위 인수를 담은 {@link com.cid.boot.ms.multiplication.domain.domain.Multiplication} 객체를 생성한다
     * 무작위로생성되는 수자의 범위는 11~99
     * @return 무작위 인수를 담은 {@link Multiplication} 객체
     */
    Multiplication createRandomMultiplication();
}
