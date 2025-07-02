package feedback_form;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Get form data
		//process the data
		//response
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String feedback = req.getParameter("feedback");
		System.out.println();
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Feedback servlet working</h1>");
		writer.println(""" 
				<h1>YOUR FORM DETAILS WHICH ARE BEING SUBMITTED</h1>
				<h3>Email Address %s </h3>
				<h3>Phone number  %s </h3>
				<h3>Feedback is   %s </h3>
				""".formatted(email,phone,feedback));
	}

}
