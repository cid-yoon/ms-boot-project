package com.cid.boot.ms.multiplication.domain.service.impl;

import com.cid.boot.ms.generator.service.RandomGeneratorService;
import com.cid.boot.ms.multiplication.domain.domain.Multiplication;
import com.cid.boot.ms.multiplication.domain.service.MultiplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MultiplicationServiceImpl implements MultiplicationService {

    final private RandomGeneratorService randomGeneratorService;

    /**
     * 두 개의 무작위 인수를 담은 {@link Multiplication} 객체를 생성한다
     * 무작위로생성되는 수자의 범위는 11~99
     *
     * @return 무작위 인수를 담은 {@link Multiplication} 객체
     */
    @Override
    public Multiplication createRandomMultiplication() {

        int factorA = randomGeneratorService.generateRandomFactor();
        int factorB = randomGeneratorService.generateRandomFactor();

        return new Multiplication(factorA, factorB);
    }


}
