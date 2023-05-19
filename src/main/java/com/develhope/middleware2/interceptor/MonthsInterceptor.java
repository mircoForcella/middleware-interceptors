package com.develhope.middleware2.interceptor;

import com.develhope.middleware2.entity.MonthsExerciseClass;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


import java.util.Arrays;
import java.util.List;

@Component
public class MonthsInterceptor implements HandlerInterceptor {

    private static final List<MonthsExerciseClass> monthList = Arrays.asList(
            new MonthsExerciseClass(1, "January", "Gennaio", "Januar"),
            new MonthsExerciseClass(2, "February", "Febbraio", "Februar"),
            new MonthsExerciseClass(3, "March", "Marzo", "März"),
            new MonthsExerciseClass(4, "April", "Aprile", "April"),
            new MonthsExerciseClass(5, "May", "Maggio", "Mai"),
            new MonthsExerciseClass(6, "June", "Giugno", "Juni")
    );

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String monthNumber = request.getHeader("monthNumber");
        if(monthNumber == null || monthNumber.isEmpty()){
            response.sendError(HttpStatus.BAD_REQUEST.value());
            return false;
        }

        int monthNumberControl = Integer.parseInt(monthNumber);
        if(monthNumberControl <= 0 || monthNumberControl > monthList.size()) {
            response.sendError(HttpStatus.BAD_REQUEST.value());
            return false;
        }

        MonthsExerciseClass month = monthList.get(monthNumberControl - 1);

        request.setAttribute("month", month);
        response.setStatus(HttpStatus.OK.value());
        return true;
    }


    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}
