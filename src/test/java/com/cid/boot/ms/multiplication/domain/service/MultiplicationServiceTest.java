package com.cid.boot.ms.multiplication.domain.service;


import com.cid.boot.ms.generator.service.RandomGeneratorService;
import com.cid.boot.ms.multiplication.domain.domain.Multiplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class MultiplicationServiceTest {

    @MockBean
    private RandomGeneratorService randomGeneratorService;

    @Autowired
    private MultiplicationService multiplicationService;

    @Test
    @DisplayName("임의의 수를 획득하여 곱셈을 성공")
    public void createRandomMultiplication_Success(){

        // BDD 사용자가 원한는 행위 중심 설정
        // given 처음엔 50 반환, 다음엔 30 반환
        given(randomGeneratorService.generateRandomFactor()).willReturn(50,30);

        // when
        Multiplication multiplication = multiplicationService.createRandomMultiplication();

        // then
        assertThat(multiplication.getFactorA()).isEqualTo(50);
        assertThat(multiplication.getFactorB()).isEqualTo(30);
        assertThat(multiplication.getResult()).isEqualTo( 50 * 30);
    }

}