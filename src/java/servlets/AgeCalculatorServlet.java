package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 743953
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age = request.getParameter("ageinput");
        
        request.setAttribute("agevalue",age);
        
        if(age == null || age.equals("")){
            request.setAttribute("message","You must give your current age.");     
        }else{
            try{
                request.setAttribute("message","Your age next birthday will be " + (Integer.parseInt(age) + 1));
            }catch(NumberFormatException e){
                request.setAttribute("message","You must enter a number.");
            }
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
        
    }
}
