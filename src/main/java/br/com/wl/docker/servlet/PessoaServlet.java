package br.com.wl.docker.servlet;

import br.com.wl.docker.controller.PeopleController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wellington
 */
@WebServlet("/")
public class PessoaServlet extends HttpServlet {

    private PeopleController peopleController = new PeopleController();
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>People</title>");
            out.println("</head>");
            out.println("<body>");
            out.println(peopleController.listPeople());
            
            out.println("</body>");
            out.println("</html>");
        }

    }
}
