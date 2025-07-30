package com.project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ViewResultServlet")
public class ViewResultServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String roll_no = request.getParameter("roll_no");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_result_db", "root", "root");

            String sql = "SELECT * FROM students WHERE roll_no = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, roll_no);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                request.setAttribute("name", rs.getString("name"));
                request.setAttribute("roll_no", rs.getString("roll_no"));
                request.setAttribute("english", rs.getInt("english"));
                request.setAttribute("maths", rs.getInt("maths"));
                request.setAttribute("science", rs.getInt("science"));
                request.setAttribute("Marathi", rs.getInt("Marathi"));
                request.setAttribute("Hindi", rs.getInt("Hindi"));
                request.setAttribute("History", rs.getInt("Histoey"));
                request.setAttribute("Geography", rs.getInt("Geography"));

                request.getRequestDispatcher("result.jsp").forward(request, response);
            } else {
                response.sendRedirect("error.jsp");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}
