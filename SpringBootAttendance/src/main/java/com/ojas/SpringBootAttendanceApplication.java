package com.ojas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ojas.AttendanceRepository.AttendanceRepository;

@ComponentScan("com.ojas")
@EntityScan("com.ojas.AttendenceEntity")
@EnableJpaRepositories("com.ojas.AttendanceRepository")
@SpringBootApplication
public class SpringBootAttendanceApplication {

	static Logger logger = LogManager.getLogger(SpringBootAttendanceApplication.class);

	@Autowired
	DataSource dataSource;
	@Autowired
	AttendanceRepository attendanceRepo;

	public static void main(String[] args) {
		logger.info("Starting Spring Boot application..");
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(Calendar.getInstance().getTime());
		logger.info(timeStamp);
		SpringApplication.run(SpringBootAttendanceApplication.class, args);
	}
}
