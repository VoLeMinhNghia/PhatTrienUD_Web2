package thuchanh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class doPost
 */
@WebServlet("/doPost")
public class doPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public doPost() {
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
		traVe.append("Bạn vừa yêu cầu dạng GET, đây là đáp ứng của tôi");
		String noiDungHTML = "<form method = POST action=\"/BaiThucHanh1_2/doPost\">"
				
						+ "			<label  >Họ:</label>"
						+ " 		<input type=\"text\" name=\"fname\"><br>\r\n"
						+ "			<label >Tên:</label>"
						+ "			<input type=\"text\" name=\"lname\"><br>"
						+ "			<input type=\"submit\" value=\"gửi đi\">"
						+ " </form>";
		traVe.append(noiDungHTML);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		String value1 = request.getParameter("fname");
		String value2 = request.getParameter("lname");
		PrintWriter traVe = response.getWriter();
		traVe.append("Bạn vừa gửi yêu cầu dạng POST, đây là đáp ứng của tôi");
		traVe.append("<br>Giá trị tham số fname = ");
		traVe.append(value1);
		traVe.append("<br>Giá trị tham số lname = ");
		traVe.append(value2);
	}

}
