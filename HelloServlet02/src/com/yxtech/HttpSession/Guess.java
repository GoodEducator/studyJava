package com.yxtech.HttpSession;

/**
 * Created by leslie on 10/6/16.
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(
        name = "guessNumber",
        urlPatterns = {"/servlet/Guess"}
)
public class Guess extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        String guessNumber = request.getParameter("guessNumber");
        int number = Integer.parseInt(guessNumber);
        HttpSession session = request.getSession();
        Integer currentNumber = (Integer)session.getAttribute("currentNumber");
        String context = request.getContextPath();
        if (currentNumber == null)
        {
            currentNumber = 1 + (int)(Math.random()*50);
            session.setAttribute("currentNumber", currentNumber);
        }

        if(number > currentNumber)
        {
            response.sendRedirect(context+"/guessNumber.jsp?flag=larger");
        }
        else if(number < currentNumber)
        {
            response.sendRedirect(context + "/guessNumber.jsp?flag=lessner");
        }
        else
        {
            currentNumber = 1 + (int)(Math.random() * 50);
            session.setAttribute("currentNumber", currentNumber);
            response.sendRedirect(context + "guessNumber.jsp?flag=success");
        }
    }
}
