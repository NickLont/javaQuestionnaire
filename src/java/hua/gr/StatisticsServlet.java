/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hua.gr;

import hua.gr.entities.Inputs;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pavlos
 */
@WebServlet(name = "StatisticsServlet", urlPatterns = {"/StatisticsServlet"})
public class StatisticsServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EntityManager em = Persistence.createEntityManagerFactory("Ergasia2PU").createEntityManager();
//        TypedQuery<Inputs> q= em.createQuery("SELECT i FROM Inputs i", Inputs.class);
//        List<Inputs> listOfInputs=q.getResultList();
//        for(Inputs input:listOfInputs){
//            System.out.println( input.getA1());
//        }
        int q11 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a1='a1'").getSingleResult()).intValue();
        int q12 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a1='a2'").getSingleResult()).intValue();
        int q13 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a1='a3'").getSingleResult()).intValue();

        int q21 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a2='a1'").getSingleResult()).intValue();
        int q22 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a2='a2'").getSingleResult()).intValue();
        int q23 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a2='a3'").getSingleResult()).intValue();

        int q31 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a3='a1'").getSingleResult()).intValue();
        int q32 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a3='a2'").getSingleResult()).intValue();
        int q33 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a3='a3'").getSingleResult()).intValue();

        int q41 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a4='a1'").getSingleResult()).intValue();
        int q42 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a4='a2'").getSingleResult()).intValue();
        int q43 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a4='a3'").getSingleResult()).intValue();

        int q51 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a5='a1'").getSingleResult()).intValue();
        int q52 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a5='a2'").getSingleResult()).intValue();
        int q53 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a5='a3'").getSingleResult()).intValue();

        int q61 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a6='a1'").getSingleResult()).intValue();
        int q62 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a6='a2'").getSingleResult()).intValue();
        int q63 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a6='a3'").getSingleResult()).intValue();

        int q71 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a7='a1'").getSingleResult()).intValue();
        int q72 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a7='a2'").getSingleResult()).intValue();
        int q73 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a7='a3'").getSingleResult()).intValue();

        int q81 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a8='a1'").getSingleResult()).intValue();
        int q82 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a8='a2'").getSingleResult()).intValue();
        int q83 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a8='a3'").getSingleResult()).intValue();

        int q91 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a9='a1'").getSingleResult()).intValue();
        int q92 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a9='a2'").getSingleResult()).intValue();
        int q93 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a9='a3'").getSingleResult()).intValue();

        int q101 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a10='a1'").getSingleResult()).intValue();
        int q102 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a10='a2'").getSingleResult()).intValue();
        int q103 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a10='a3'").getSingleResult()).intValue();

        int q111 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a11='a1'").getSingleResult()).intValue();
        int q112 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a11='a2'").getSingleResult()).intValue();
        int q113 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a11='a3'").getSingleResult()).intValue();

        int q121 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a12='a1'").getSingleResult()).intValue();
        int q122 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a12='a2'").getSingleResult()).intValue();
        int q123 = ((Number) em.createQuery("Select Count(i) FROM Inputs i WHERE i.a12='a3'").getSingleResult()).intValue();

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StatisticsServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Page Statistics: </h1>");

            out.println("<ul>");
            out.println("<li>Question1: ");
            out.println("<ul>");
            out.println("<li>" + "<h3>" + "Answer a1: " + q11 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a2: " + q12 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a3: " + q13 + "</h3>" + "</li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("</ul>");

            out.println("<ul>");
            out.println("<li>Question2: ");
            out.println("<ul>");
            out.println("<li>" + "<h3>" + "Answer a1: " + q21 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a2: " + q22 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a3: " + q23 + "</h3>" + "</li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("</ul>");

            out.println("<ul>");
            out.println("<li>Question3: ");
            out.println("<ul>");
            out.println("<li>" + "<h3>" + "Answer a1: " + q31 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a2: " + q32 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a3: " + q33 + "</h3>" + "</li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("</ul>");

            out.println("<ul>");
            out.println("<li>Question4: ");
            out.println("<ul>");
            out.println("<li>" + "<h3>" + "Answer a1: " + q41 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a2: " + q42 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a3: " + q43 + "</h3>" + "</li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("</ul>");

            out.println("<ul>");
            out.println("<li>Question5: ");
            out.println("<ul>");
            out.println("<li>" + "<h3>" + "Answer a1: " + q51 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a2: " + q52 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a3: " + q53 + "</h3>" + "</li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("</ul>");

            out.println("<ul>");
            out.println("<li>Question6: ");
            out.println("<ul>");
            out.println("<li>" + "<h3>" + "Answer a1: " + q61 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a2: " + q62 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a3: " + q63 + "</h3>" + "</li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("</ul>");

            out.println("<ul>");
            out.println("<li>Question7: ");
            out.println("<ul>");
            out.println("<li>" + "<h3>" + "Answer a1: " + q71 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a2: " + q72 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a3: " + q73 + "</h3>" + "</li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("</ul>");

            out.println("<ul>");
            out.println("<li>Question8: ");
            out.println("<ul>");
            out.println("<li>" + "<h3>" + "Answer a1: " + q81 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a2: " + q82 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a3: " + q83 + "</h3>" + "</li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("</ul>");

            out.println("<ul>");
            out.println("<li>Question9: ");
            out.println("<ul>");
            out.println("<li>" + "<h3>" + "Answer a1: " + q91 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a2: " + q92 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a3: " + q93 + "</h3>" + "</li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("</ul>");

            out.println("<ul>");
            out.println("<li>Question10: ");
            out.println("<ul>");
            out.println("<li>" + "<h3>" + "Answer a1: " + q101 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a2: " + q102 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a3: " + q103 + "</h3>" + "</li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("</ul>");

            out.println("<ul>");
            out.println("<li>Question11: ");
            out.println("<ul>");
            out.println("<li>" + "<h3>" + "Answer a1: " + q111 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a2: " + q112 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a3: " + q113 + "</h3>" + "</li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("</ul>");

            out.println("<ul>");
            out.println("<li>Question12: ");
            out.println("<ul>");
            out.println("<li>" + "<h3>" + "Answer a1: " + q121 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a2: " + q122 + "</h3>" + "</li>");
            out.println("<li>" + "<h3>" + "Answer a3: " + q123 + "</h3>" + "</li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("</ul>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
