package thuchanh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BMI
 */
@WebServlet("/BMI")
public class BMI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BMI() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter traVe = response.getWriter();
		traVe.append("<h2>BMI Calculator</h2>");
		String noiDungHTML = "<form method = POST action=\"/BaiThucHanh1_4/BMI\">"
								+ "<label for=\"weight\">Weight (kg):</label>\r\n"
								+ "<input type=\"number\" id=\"weight\" name=\"weight\"><br><br>\r\n"
								+ "<label for=\"height\">Height (cm):</label>\r\n"
								+ "<input type=\"number\" id=\"height\" name=\"height\"><br><br>"
								+ "<input type=\"submit\" value=\"OK\">"
							+ "</form>";
		traVe.append(noiDungHTML);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		int weight = Integer.parseInt(request.getParameter("weight"));
	    int height = Integer.parseInt(request.getParameter("height"));
	    double bmi = weight / (height / 100.0 * height / 100.0);
	    String formattedBmi = String.format("%.2f", bmi);
	    PrintWriter traVe = response.getWriter();
	    traVe.append("<h2>BMI Calculator</h2>");
	    traVe.println("Your BMI is: " + formattedBmi);
	}

}
