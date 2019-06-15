package com.examples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
 @RequestMapping(value = "/")
 public ModelAndView home() {
  ModelAndView mv = new ModelAndView("index");
  return mv;
 }

 
 @RequestMapping(value="/listBooks")
 public ModelAndView getAllBooks() {
  
  ModelAndView mv = new ModelAndView("list");
  return mv;
 }
}