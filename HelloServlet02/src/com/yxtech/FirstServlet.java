package com.yxtech;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by leslie on 10/5/16.
 */
public class FirstServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public void init() throws ServletException
    {
        System.out.println("1 init()");
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("2 doGet()");
        response.setContentType("text/html;charset=gbk");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>testing 0-10 's result</title>");
        out.println("<body>");
        out.println("begining to exectue.......");
        int count = 0;
        for(int i = 0; i <= 10; ++i)
        {
            count += i;
        }

        out.println("executing result is " + count);
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException
    {
        doGet(request, response);
    }

    public void destroy()
    {
        System.out.println("Executing destroy()");
    }
}
