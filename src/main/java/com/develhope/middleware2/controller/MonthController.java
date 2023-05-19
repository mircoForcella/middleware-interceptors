package com.develhope.middleware2.controller;

import com.develhope.middleware2.entity.MonthsExerciseClass;
import com.develhope.middleware2.interceptor.MonthsInterceptor;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/months")
public class MonthController {

    @Autowired
    private MonthsInterceptor monthsInterceptor;

    @GetMapping
    public MonthsExerciseClass getMonth(HttpServletRequest request){
        return (MonthsExerciseClass)request.getAttribute("month");
    }

}
