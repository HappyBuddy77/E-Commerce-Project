package com.Project.ECommerce;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class Login {

	
	@GetMapping("/Login")
	
	public void index(HttpServletResponse response) {
		PrintWriter out;
		try {
			response.setContentType("text/html;charset=UTF-8");
			out = response.getWriter();
			out.println("<html><head><title>Greet</title></head><body>");
			out.println("<h2> Testing HTML Header Font </h2>");
			out.println("Hello World!<br>");
			out.println("This is a new Web Page<br>");
			out.println("Testing PrintWriter<br>");
			out.println("Testing<br>");
			out.println("</body></html>");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void method() {
        ServletRequestAttributes ra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (ra != null) {
            HttpServletRequest request = ra.getRequest();
            HttpServletResponse response = ra.getResponse();
        }
    }

}