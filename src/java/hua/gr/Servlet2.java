/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hua.gr;

import hua.gr.entities.Inputs;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Servlet2", urlPatterns = {"/Servlet2"})
public class Servlet2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        DataBean bean = (DataBean) session.getAttribute("dataBean");

//      Elegxos gia to pio koumpi patisame
        String button1 = request.getParameter("Btn");
        if ("Exit".equals(button1)) {
            bean.setA(request.getParameter("q4"), 3);
            bean.setA(request.getParameter("q5"), 4);
            bean.setA(request.getParameter("q6"), 5);
            Inputs newInput;
            newInput = new Inputs();
            newInput.setA1(bean.getA(0));
            newInput.setA2(bean.getA(1));
            newInput.setA3(bean.getA(2));
            newInput.setA4(bean.getA(3));
            newInput.setA5(bean.getA(4));
            newInput.setA6(bean.getA(5));
            newInput.setA7(bean.getA(6));
            newInput.setA8(bean.getA(7));
            newInput.setA9(bean.getA(8));
            newInput.setA10(bean.getA(9));
            newInput.setA11(bean.getA(10));
            newInput.setA12(bean.getA(11));

            EntityManager em = Persistence.createEntityManagerFactory("Ergasia2PU").createEntityManager();
            em.getTransaction().begin();
            em.persist(newInput);
            em.getTransaction().commit();
            int TempId = newInput.getIndexId();
            bean.setID(TempId);
            request.getRequestDispatcher("/WEB-INF/exiturl.jsp").forward(request, response);

        }

//        
        bean.setA(request.getParameter("q4"), 3);
        bean.setA(request.getParameter("q5"), 4);
        bean.setA(request.getParameter("q6"), 5);
        request.getRequestDispatcher("/WEB-INF/question3.jsp").forward(request, response);

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
