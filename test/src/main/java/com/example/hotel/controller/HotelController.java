package com.example.hotel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.SessionAttributes;


import com.example.hotel.HotelListVO;
import com.example.hotel.HotelService;
import com.example.hotel.HotelVO;


@Controller
@SessionAttributes("hotel")
public class HotelController {
	@Autowired
	private HotelService hotelService;

//	@RequestMapping("/dataTransform.do")
//	@ResponseBody
//	public BoardListVO dataTransform(BoardVO vo) {
//		vo.setSearchCondition("TITLE");
//		vo.setSearchKeyword("");
//		List<BoardVO> boardList = boardService.getBoardList(vo);
//		BoardListVO boardListVO = new BoardListVO();
//		boardListVO.setBoardList(boardList);
//		return boardListVO;
//	}
//
//	// 글등록
//	@RequestMapping(value = "/insertBoard.do")
//	public String insertBoard(BoardVO vo) throws IOException {
//	
//		MultipartFile uploadFile = vo.getUploadFile();
//		if (!uploadFile.isEmpty()) {
//			String fileName = uploadFile.getOriginalFilename();
//			uploadFile.transferTo(new File("D:/" + fileName));
//		}
//
//		boardService.insertBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 수정
//	@RequestMapping("/updateBoard.do")
//	public String updateBoard(@ModelAttribute("board") BoardVO vo) {
//		boardService.updateBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 삭제
//	@RequestMapping("/deleteBoard.do")
//	public String deleteBoard(BoardVO vo) {
//		boardService.deleteBoard(vo);
//		return "getBoardList.do";
//	}

	// 글 상세보기
	@RequestMapping("/getHotel.do")
	public String getHotel(HotelVO vo, Model model) {
		model.addAttribute("hotel", hotelService.getHotel(vo)); // Model Á¤º¸ ÀúÀå
		return "/test/getHotel"; // View ÀÌ¸§ ¸®ÅÏ
	}

//	// 검색 조건 목록 설정
//	@ModelAttribute("conditionMap")
//	public Map<String, String> searchConditionMap() {
//		Map<String, String> conditionMap = new HashMap<String, String>();
//		conditionMap.put("제목", "TITLE");
//		conditionMap.put("내용", "CONTENT");
//		return conditionMap;
//	}

	// 글 목록 검색
	@RequestMapping("/getHotelList.do")
	public String getHotelList(HotelVO vo, Model model) {
		// Null Check
//		if (vo.getSearchCondition() == null)
//			vo.setSearchCondition("NAME");
//		if (vo.getSearchKeyword() == null)
//			vo.setSearchKeyword("");
		// Model 
		model.addAttribute("hotelList", hotelService.getHotelList(vo));
		System.out.println(model);
		return "/test/getBoardList"; // View 
	}
}