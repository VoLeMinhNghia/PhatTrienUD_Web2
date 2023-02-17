package thuchanh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AboutMe
 */
@WebServlet("/AboutMe")
public class AboutMe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AboutMe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//head
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		//body
		String noiDungHTML = "<h2>THÔNG TIN SINH VIÊN</h2>";
		noiDungHTML += "<table style=\"width:20%\"> "
						+ "<tr>"
							+ "<td style=\"width:40%\"> "
								+ "Mã sinh viên: <br />\r\n"
								+ "Họ tên: <br />\r\n"
								+ "Lớp: <br />\r\n"
							+ "</td>"
							+ "<td style=\"width:60%\"> "
								+ "62131275 <br />\r\n"
								+ "Võ Lê Minh Nghĩa <br />\r\n"
								+ "62.CNTTCLC <br />\r\n"
							+ "</td>"
						+ "</tr>"
					+ "</table>";
		PrintWriter traVe = response.getWriter();
		traVe.append(noiDungHTML);
	}

}
