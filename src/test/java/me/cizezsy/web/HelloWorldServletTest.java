package me.cizezsy.web;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorldServletTest extends Mockito {

  @Mock
  private HttpServletRequest request;
  @Mock
  private HttpServletResponse response;
  @Mock
  private RequestDispatcher dispatcher;


  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    when(request.getRequestDispatcher(anyString())).thenReturn(dispatcher);
  }

  @Test
  public void testDoGet() throws ServletException, IOException {
    new HelloWorldServlet().doGet(request, response);
    ArgumentCaptor<String> da = ArgumentCaptor.forClass(String.class);
    verify(request).getRequestDispatcher(da.capture());
    Assert.assertEquals("/WEB-INF/jsp/hello.jsp", da.getValue());
  }

}
