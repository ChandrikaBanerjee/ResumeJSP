package com.cg.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.model.Resume;

@WebServlet("/MyServletCode")
public class MyServletCode extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Resume resume= new Resume((request.getParameter("fname")),(request.getParameter("lname")),(request.getParameter("gender")),(request.getParameter("dob")),
				(request.getParameter("address")),(request.getParameterValues("hobbies")),
				(request.getParameter("hq")),(request.getParameterValues("skills")),(request.getParameter("email")),
				(request.getParameter("website")),(request.getParameter("contact")),(request.getParameter("summary")));
//request.setAttribute("fname", resume.getFirstName());
//request.setAttribute("lname", resume.getLastName());
//request.setAttribute("dob", resume.getDob());
//request.setAttribute("gender", resume.getGender());
//request.setAttribute("address", resume.getAddress());
//request.setAttribute("contact", resume.getContact());
//request.setAttribute("hq", resume.getHighestQualification());
//request.setAttribute("hobbies", resume.getHobbies());
//request.setAttribute("skills", resume.getSkills());
//request.setAttribute("email", resume.getEmail());
//request.setAttribute("website", resume.getWebsite());
//request.setAttribute("summary", resume.getSummary());
		request.setAttribute("Requestrequest", resume);
RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
rd.forward(request,response);


	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
