<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
%>

<html>
<head>
    <title>guess number online</title>
</head>
<%
    String flag = request.getParameter("flag");
    String message = "";
    if(flag!=null && "larger".equals(flag))
    {
        message = "too larger";
    }
    else if(flag!=null && "lessner".equals(flag))
    {
        message = "too small";
    }
    else if(flag!=null && "success".equals(flag));
    {
        message = "you got it";
    }
%>
<body>
<form action = "<%=path%>/servlet/Guess" method="post">
    <span>please input the number:</span>
    <input name="guessNumber" size="10"/>
    <span style="color: red"><%=message%></span>
    <input type="submit" value="submit">
</form>

</body>
</html>