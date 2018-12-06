package com.ojas.AttendanceController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ojas.AttendanceRepository.AttendanceRepository;
import com.ojas.AttendenceEntity.Attendance;

@RestController
@RequestMapping("/attendance")
public class Attendancecontroller {
	
	@Autowired
	 private AttendanceRepository attendanceRepository;
	
	@Autowired
	private AttenceService attendanceService;
	
	@PostMapping("/addemployeeattendance")
	@Produces(MediaType.APPLICATION_JSON)
	public Attendance add(@RequestBody Attendance attendance) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		//attendance.setEmployeeLoginTime(new java.sql.Date(date.getTime()));		
		//attendance.setEmployeeLogoutTime(new java.sql.Date(date.getTime()));
		//String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(Calendar.getInstance().getTime());
		//SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy");
		//Date d1=attendance.getEmployeeLoginTime();
		//Date d2=attendance.getEmployeeLogoutTime();
		attendanceRepository.save(attendance);
		return attendance;
	}
	/*@PostMapping("/duration")
public long duration(@RequestBody DateDifference difference) throws java.text.ParseException {
	 String employeeLoginTime = "11/03/14 09:29:58";
	    String employeeLogoutTime = "11/03/14 09:33:43";

	    
	    SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss");

	    Date d1 = null;
	    Date d2 = null;
	    try {
	        d1 = format.parse(employeeLoginTime);
	        d2 = format.parse(employeeLogoutTime);
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }

	    // Get msec from each, and subtract.
	    long diff = d2.getTime() - d1.getTime();
	    long diffSeconds = diff / 1000 % 60;
	    long diffMinutes = diff / (60 * 1000) % 60;
	    long diffHours = diff / (60 * 60 * 1000);
	    System.out.println("Time in seconds: " + diffSeconds + " seconds.");
	    System.out.println("Time in minutes: " + diffMinutes + " minutes.");
	    System.out.println("Time in hours: " + diffHours + " hours.");
		return diffHours;
}*/
}
