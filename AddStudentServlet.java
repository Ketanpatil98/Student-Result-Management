package com.project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String roll_no = request.getParameter("roll_no");
        int english = Integer.parseInt(request.getParameter("english"));
        int maths = Integer.parseInt(request.getParameter("maths"));
        int science = Integer.parseInt(request.getParameter("science"));
        int Marathi = Integer.parseInt(request.getParameter("Marathi"));
        int Hindi = Integer.parseInt(request.getParameter("Hindi"));
        int History = Integer.parseInt(request.getParameter("History"));
        int Geography = Integer.parseInt(request.getParameter("Geography"));
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_result_db", "root", "root");

            String sql = "INSERT INTO students (name, roll_no, english, maths, science,Marathi ,Hindi,History ,Geography) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, roll_no);
            stmt.setInt(3, english);
            stmt.setInt(4, maths);
            stmt.setInt(5, science);
            stmt.setInt(6,Marathi);
            stmt.setInt(7,Hindi);
            stmt.setInt(8,History);
            stmt.setInt(9,Geography);

            int i = stmt.executeUpdate();
            if (i > 0) {
                response.sendRedirect("index.jsp");
            } else {
                response.sendRedirect("error.jsp");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // shows full stack trace in logs
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }

    }
}
