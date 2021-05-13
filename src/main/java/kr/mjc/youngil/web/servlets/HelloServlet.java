package kr.mjc.youngil.web.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 서블릿이란?
 * 자바로 만든 server-side 클래스
 * Request-Response 모델을 사용한다. (요청 하나당 하나의 응답을 처리)
 * 모든 유형의 요청에 응답할 수 있다.
 * 서블릿을 구동하는 서버를 servlet container 라고 한다.
 * -예시: Apache Tomcat
 * <p>
 * 서블릿의 특징
 * Single instance 이다.
 * 요청이 올때마다 worker thread 에 할당해 처리한다.
 */
@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("""
                <!DOCTYPE html>
                <html>
                <body>
                  <h1>Hello, 서블릿.</h1>
                </body>
                </html>
                """);
        out.close();
    }
}