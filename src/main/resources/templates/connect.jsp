<%@ page import = "java.sql.*"%>
<%
    String firstName = request. getParameter("firstName");
    String lastName = request. getParameter("lastName");
    String gender = request. getParameter("gender");
    String email = request. getParameter("email");
    String password = request. getParameter("password");
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wineDB","root","rup9ltn3nyna");
        PreparedStatement preparedStatement = connection.prepareStatement("insert into registration(firstName, lastName, gender, email,pasword)");
        preparedStatement.setString(1,firstName);
        preparedStatement.setString(2,lastName);
        preparedStatement.setString(3,gender);
        preparedStatement.setString(4,email);
        preparedStatement.setString(5,password);
        int x = preparedStatement.executeUpdate();
        if(x > 0){
            out.println("Rejestracja zakończona pomyślnie");
        }else {
            out.println("Rejestracja zakończona niepowodzeniem");
        }
    }catch (Exception e){
        out.println(e);
    }
%>