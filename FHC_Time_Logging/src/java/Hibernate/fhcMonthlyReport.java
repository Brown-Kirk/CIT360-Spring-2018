package Hibernate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author reddo
 */
public class fhcMonthlyReport extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            Controller controller = new Controller();
            List<TimeLog> timelog = controller.monthlyFHCQuery();
            Timestamp logInTime = null;
            Timestamp logOutTime = null;
            Long difference = 0L;
            Long totalTime = 0L;
            int logInRow = 0;
            int lastPatron = 0;
            String fullname = null;
            out.println("<h1>FHC Monthly Time Log</h1>");
            Timestamp firstEntry = timelog.get(0).getTimeLogTimeStamp();
            SimpleDateFormat firstEntryFormat = new SimpleDateFormat("MMMM d, yyyy");
            String formattedFirstEntry = firstEntryFormat.format(firstEntry);
            for (TimeLog entry : timelog) {
                int row = entry.getTimeLogId();
                Timestamp time = entry.getTimeLogTimeStamp();
                int action = entry.getTimeLogActionId();
                int patronId = entry.getTimeLogPatronId();
                Date logInDate = time;
                SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE MMMM d, yyyy");
                String formattedDate = dateFormat.format(logInDate);
                if (action == 1) {
                    logInRow = logInRow + 1;
                    logInTime = time;
                    lastPatron = patronId;
                    Patron patron = controller.getPatron(patronId);
                    String firstName = patron.getPatronFirstName();
                    String lastName = patron.getPatronLastName();
                    fullname = firstName + " " + lastName;
                }
                if (action == 2) {
                    if (patronId == lastPatron) {
                        logOutTime = time;
                        difference = logOutTime.getTime() - logInTime.getTime();
                        Long differenceMinutes = difference / 60000;
                        totalTime = totalTime + difference;
                        Patron patron = controller.getPatron(patronId);
                        out.println("On " + formattedDate + " " + fullname + " logged in for " + differenceMinutes + " minutes.<br>");
                    } else {
                        // Do nothing, skip to next entry because someone didn't log out
                    }
                }
            }
            Long totalTimeMinutes = totalTime / 60000;
            out.println("<br>During last month, guests logged a total of " + totalTimeMinutes + " minutes.<br>");
            out.println("<br><br> <a href='/FHC_Time_Logging/faces/patrontimeentry.jsp'>Click here to return to the Time Entry screen.</a>");
            out.println("<br><br> <a href='/FHC_Time_Logging/'>Click here to return to the home screen.</a>");
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
