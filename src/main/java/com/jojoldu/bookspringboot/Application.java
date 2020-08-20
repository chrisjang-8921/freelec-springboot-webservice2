package com.jojoldu.bookspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //스프링부트의 자동설정, 스프링 Bean 일기와 생성을 모두 자도으로 설정 , 이 어노테이션부터 설정을 읽어들어감
//내장 WAS를 실행하기 떄문에, 별도의 Tomcat 서버가 필요하지 않음
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
