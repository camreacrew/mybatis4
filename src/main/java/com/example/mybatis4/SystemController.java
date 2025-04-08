package com.example.mybatis4;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class SystemController {
  @GetMapping("/")
  public ModelAndView root() {
    return new ModelAndView("index");
  }
}
