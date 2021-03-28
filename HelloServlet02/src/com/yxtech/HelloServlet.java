package com.yxtech;

/**
 * Created by leslie on 10/6/16.
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yxtech.pojo.HelloUser;

@WebServlet(
        name = "HelloServlet",
        urlPatterns = {"/hello.do"}
)

public class HelloServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    private HelloUser user = new HelloUser();
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        String username = request.getParameter("username");
        String message = user.sayHello(username);
        request.setAttribute("message", message);
        request.getRequestDispatcher("/hello.htm").forward(request, response);
    }
}
