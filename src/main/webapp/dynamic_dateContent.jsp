<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<title>JSP Expression</title>
</head>
<body>
<%
    Date dt=new Date();
    SimpleDateFormat sfd1=new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sfd2=new SimpleDateFormat("hh:mm:ss a");
    String date=sfd1.format(dt);
    String time=sfd2.format(dt);
%>
<h2>Current Date: <%=date%></h2>
<h2>Current Time: <%=time%></h2>
</body>
</html>