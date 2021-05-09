package kr.mjc.youngil.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Spring Boot
 * 실행할 수 있는 Stand-alone (jar 로 만들어 실행시 바로 동작),
 * production-grade(개발 수준이 아닌 상용수준으로도 사용 가능) Spring 기반 어플리케이션을 만들 수 있다.
 * Spring 구성이 거의 필요 X
 * 더 빠르고 광범위하게 액세스 할 수 있는 시작 환경을 제공
 * Tomcat 9.0, Jetty 9.4, Undertow 2.0과 같은 임베디드 서블릿 컨테이너를 지원.
 * Servlet 3.1+ 호환 컨테이너에 Spring Boot 애플리케이션을 배포할 수도 있다.
 *
 * Spring Boot 프로젝트 만들기
 * 1. Gradle Project - Java 와 Web 에 체크 후 생성
 * 2. build.gradle 에 필요한 플러그인과 프로퍼티들 기술
 * 3. resources/application.properties 에필요한 properties 기술
 * 4. @SpringBootApplication 클래스 생성
 *  a. @EnableAutoConfiguration: Spring Boot 의 자동구성 활성화
 *  b. @ComponentScan: 패키지에서 @Component 를 스캔
 *  c. Configuration: 컨텍스트의 추가적인 빈들을 등록
 * 5. WebServerFactoryCustomizer 구현체를만들어 page encoding 설정
 *  JSP 와 HTML 에서 한글 사용
 */

@SpringBootApplication
@ServletComponentScan //웹 서블릿을 스캔한다.
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
