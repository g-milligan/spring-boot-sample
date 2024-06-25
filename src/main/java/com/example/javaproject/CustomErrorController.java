package com.example.javaproject;

import java.util.Objects;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class CustomErrorController implements ErrorController {

    @RequestMapping("${server.error.path}")
    public String handleError(HttpServletRequest request) {
      
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        System.err.println(status);

        if (Objects.isNull(status)) return "error null status";

        int statusCode = Integer.parseInt(status.toString());
        String view = switch (statusCode) {
            case 404 -> "error/my-404";
            default -> "generic error";
        };

        return view;
    }
}
