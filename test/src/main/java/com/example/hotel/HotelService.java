package com.example.hotel;

import java.util.List;

public interface HotelService {
	// CURD 기능의 메소드 구현
		// 글 등록
//		void insertHotel(HotelVO vo);
//		
//		// 글 수정
//		void updateHotel(HotelVO vo);
//		
//		// 글 삭제
//		void deleteHotel(HotelVO vo);
		
		// 글 상세조회
		HotelVO getHotel(HotelVO vo);
		
		// 글 목록 조회
		 List<HotelVO> getHotelList(HotelVO vo);
			
}
