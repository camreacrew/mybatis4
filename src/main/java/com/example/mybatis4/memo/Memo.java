package com.example.mybatis4.memo;

import com.sun.jdi.event.*;
import lombok.*;
import org.springframework.format.annotation.*;

import java.time.*;

@Getter
@Setter
@AllArgsConstructor
public class Memo {
  private Integer mno;
  private String title;
  private String content;
  private String writer;
  // <input type='date'>로 낳짜를 선택하면 서버로 '2025-10-20' 형식의 문자열이 넘어간다
  // 스프링에서 문자열을 날짜로 변환 -> 어노테이션을 추가해 변환
  @DateTimeFormat(pattern = "yyy-MM-dd")
  private LocalDate regDate;
}
