package me.cizezsy.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/test/hello")
public class HelloWorldServlet extends HttpServlet {

  private static final String HELLO_WORLD_JSP_PATH = "/WEB-INF/jsp/hello.jsp";

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.getRequestDispatcher(HELLO_WORLD_JSP_PATH).forward(req, resp);
  }
}
