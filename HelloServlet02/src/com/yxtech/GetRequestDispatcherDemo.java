package com.yxtech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by leslie on 10/6/16.
 */
@WebServlet(
        name = "getDispatcherDemo",
        urlPatterns = {"/include.do"},
        loadOnStartup = 0
)

public class GetRequestDispatcherDemo extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>a servelt</title></head>");
        out.println("<body>");
        out.println("The first servlet");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/includeSecond.do");
        dispatcher.include(request, response);
        out.println("Including  servlet");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
