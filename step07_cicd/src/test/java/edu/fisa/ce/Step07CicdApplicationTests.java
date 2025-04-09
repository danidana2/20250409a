package edu.fisa.ce;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Step07CicdApplicationTests {

	@Test
    public void testAddition() {
        int result = 2 + 13;
        /* 예시 - 서버 시작시에 특정 database 로부터 검색
         * 그 데이터는 꼭 fisa여야 하는 상황
         * fisa가 없다면 서버 중지 또는 다른 로직 실행
         * 
         * 개발중에 데이터에 대한 test 검증용 등으로 사용
         * 
         */
        
        System.out.println("비교 전***********************");
        assertEquals(1, result);  // 성공: 15 == 15
        
        System.out.println("비교 후***********************");
    }

}
