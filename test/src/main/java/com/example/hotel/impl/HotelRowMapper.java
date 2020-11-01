package com.example.hotel.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.hotel.HotelVO;

public class HotelRowMapper implements RowMapper<HotelVO> {

	@Override
	public HotelVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		HotelVO hotel = new HotelVO();
		hotel.setSeq(rs.getInt("SEQ"));
		hotel.setName(rs.getString("NAME"));
		hotel.setAge(rs.getInt("AGE"));
		hotel.setSex(rs.getString("SEX"));		
		hotel.setEmail(rs.getString("EMAIL"));
			
		return hotel;
	}

}
