package com.example.hotel.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotel.HotelService;
import com.example.hotel.HotelVO;

@Service("hotelService")
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelDAOSpring hotelDAO;

//	public void insertBoard(HotelVO vo) {
////		if (vo.getSeq() == 0) {
////			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
////		}
//		boardDAO.insertBoard(vo);
//	}
//
//	public void updateBoard(HotelVO vo) {
//		boardDAO.updateBoard(vo);
//	}
//
//	public void deleteBoard(HotelVO vo) {
//		boardDAO.deleteBoard(vo);
//	}

	public HotelVO getHotel(HotelVO vo) {
		return hotelDAO.getHotel(vo);
	}

	public List<HotelVO> getHotelList(HotelVO vo) {
		return hotelDAO.getHotelList(vo);
	}
}