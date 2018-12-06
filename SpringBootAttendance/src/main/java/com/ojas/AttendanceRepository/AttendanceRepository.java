package com.ojas.AttendanceRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.AttendenceEntity.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
	
	}
