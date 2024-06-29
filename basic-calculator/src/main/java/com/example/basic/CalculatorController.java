package com.example.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("index");
    }

    @GetMapping("/calculate")
    public ModelAndView calculate(@RequestParam("a") int a, @RequestParam("b") int b, @RequestParam("operation") String operation) {
        double result = 0;
        switch (operation) {
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
            case "multiply":
                result = a * b;
                break;
            case "divide":
                if (b == 0|| a==0) {
                    result = (double) a / b;
                } else {
                
                  return new ModelAndView("error").addObject("message", "Division by zero is not allowed");
                }
                break;
        }

        // Save result to database
        String sql = "INSERT INTO calculator (operand1, operand2, operation, result) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, a, b, operation, result);

        ModelAndView mv = new ModelAndView("result");
        mv.addObject("result", result);
        return mv;
    }
}
