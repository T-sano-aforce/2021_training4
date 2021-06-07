package jp.co.aforce.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.User;
import jp.co.aforce.dao.UserDAO;
import jp.co.aforce.tool.Action;


public class LoginAction extends Action{
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	)throws Exception{
		HttpSession session = request.getSession();
		response.setContentType("text/html; charset = UTF-8");

		String login = request.getParameter("login");
		String password = request.getParameter("password");
		UserDAO dao = new UserDAO();
		User user = dao.search(login, password);

		if (user != null) {
			session.setAttribute("user", user);
			return "../jsp/login-success.jsp";
		}

			request.setAttribute("IDもしくはパスワードが違います。", user);

			return "../jsp/login.jsp";


	}
}