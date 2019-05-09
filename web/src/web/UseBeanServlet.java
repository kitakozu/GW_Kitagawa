package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseBeanServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//インスタンス化
		EmpBean bean =new EmpBean();
		//EmpBeanクラスのnameに値を入れる
		bean.setName("あああ");
		//EmpBeanクラスのageに値を入れる
		bean.setAge(20);
		//リクエストオブジェクトにキーをempとして、beanを入れる
		req.setAttribute("emp", bean);

		//リクエスト・レスポンスオブジェクトの転送先URLを指定
		RequestDispatcher rd = req.getRequestDispatcher("useBean.jsp");
		//リクエスト・レスポンスオブジェクトを指定したURLに転送
		rd.forward(req, resp);
	}

}
