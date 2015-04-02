package com.kgr.sample.classschedule;
import com.kgr.sample.schoolclass.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ScheduleServlet extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		String title = req.getParameter("title");
		int starttime = Integer.parseInt(req.getParameter("starttime"));
		int endtime = Integer.parseInt(req.getParameter("endtime"));
		String[] days = req.getParameterValues("day");
		
		SchoolSchedule sc =(SchoolSchedule) req.getSession().getAttribute("schoolschedule");
		if(sc == null)
		{
			sc = new SchoolSchedule();
		}
		
		if(days != null)
		{
			for(int i=0; i<days.length;i++)
			{
				String dayString = days[i];
				int day;
				if(dayString.equalsIgnoreCase("sun"))day=0;
				else if(dayString.equalsIgnoreCase("mon"))day=1;
				else if(dayString.equalsIgnoreCase("tue"))day=2;
				else if(dayString.equalsIgnoreCase("wed"))day=3;
				else if(dayString.equalsIgnoreCase("thu"))day=4;
				else if(dayString.equalsIgnoreCase("fri"))day=5;
				else day=6;
				
				SchoolClass cl = new SchoolClass(title,starttime,endtime,day);
				sc.addClass(cl);
			}
		}
		req.getSession().setAttribute("schoolschedule",sc);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/Schedule.jsp");
		dispatcher.forward(req, resp);
	}
}
