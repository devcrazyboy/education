package com.mobius.education.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("review/*")
public class ReviewController {
    @GetMapping("/review")
    public void review() {

    }

    @GetMapping("/myReview")
    public void myReview() {

    }

    @GetMapping("/classReview")
    public void classReview() {

    }
}
