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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String operation = request.getParameter("operation");
        
        request.setAttribute("firstvalue", first);
        request.setAttribute("secondvalue", second);
        
        request.setAttribute("message","Your values are "+first+" "+second);
        
        if((first == null || first.equals("")) && (second == null || second.equals(""))){
           request.setAttribute("message","Result: ---"); 
        }else{
            try{
  
                switch(operation){
                    case "+":
                        request.setAttribute("message", "Result: " + (Integer.parseInt(first) + Integer.parseInt(second)));
                        break;
                    case "-":
                        request.setAttribute("message", "Result: " + (Integer.parseInt(first) - Integer.parseInt(second)));
                        break;
                    case "*":
                        request.setAttribute("message", "Result: " + (Integer.parseInt(first) * Integer.parseInt(second)));
                        break;
                    case "%":
                        request.setAttribute("message", "Result: " + (Integer.parseInt(first) / Integer.parseInt(second)));
                        break;
                }
                
            }catch(NumberFormatException e){
                request.setAttribute("message","Result: Invalid"); 
            }
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
        
    }
}
