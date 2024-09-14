package com.laptrinhjavaweb.controller.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.model.UserModel;

@WebServlet(urlPatterns= {"/trang-chu"})
public class HomeController extends HttpServlet{
	//de su dung dc serverlet dau tien phai extends no
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		UserModel userModel= new UserModel();
		userModel.setFullName("Hello word");
		request.setAttribute("model", userModel);// dat 1 bien la model va gan gia tri cho no laf userModel, de mk tra bien nay ve cho ben view 
		RequestDispatcher rd=request.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(request,response); // tra ve cho ben view de hien thi
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
}

