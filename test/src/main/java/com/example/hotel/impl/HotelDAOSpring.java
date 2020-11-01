package com.example.hotel.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.hotel.HotelVO;

@Repository
//public class BoardDAOSpring extends JdbcDaoSupport{
public class HotelDAOSpring {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	// 어노테이션을 이용하여 jdbcTemplate 타입의 객체를 의존성 주입처리함
	
	//SQL 명령문
	/* private final String BOARD_INSERT=
			"insert into board(seq, title, writer, content)"
			+" values((select nvl(max(seq),0)+1 from board), ?,?,?)";*/
	private final String BOARD_INSERT="insert into board(seq, title, writer, content) values(?,?,?,?)";
	private final String BOARD_UPDATE="update board set title=?, content=? where seq=?";
	private final String BOARD_DELETE="delete board where seq=?";
	private final String BOARD_GET="select * from board where seq=?";
	private final String BOARD_LIST="select * from ajax order by seq desc";
	// 제목검색
		private final String BOARD_LIST_T =
				"select * from ajax where title like '%' || ? || '%'  order by seq desc" ;
		// 내용검색
		private final String BOARD_LIST_C =
				"select * from ajax where content like '%' || ? || '%'  order by seq desc";
		
	
	
	/*
	 * public void setSuperDataSource(DataSource dataSource) {
	 * super.setDataSource(dataSource); }
	 */
	
	//CRUD 기능의 메소드 구현
	
//	// 글등록
//	public void insertBoard(BoardVO vo) {
//		System.out.println("===> Spring JDBC로 insertBoard() 기능 처리... 2 ");
//		//getJdbcTemplate().update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getContent());
//		jdbcTemplate.update(BOARD_INSERT,vo.getSeq(), vo.getTitle(), vo.getWriter(), vo.getContent());
//	}
	
//	// 글 수정
//	public void updateBoard(BoardVO vo) {
//		System.out.println("===> Spring JDBC로 updateBoard() 기능 처리 ......");
//		//getJdbcTemplate().update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
//		jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
//	}
	
	
//	// 글 삭제 
//	public void deleteBoard(BoardVO vo) {
//		System.out.println("===> Spring JDBC로 deleteBoard() 기능 처리......");
//		//getJdbcTemplate().update(BOARD_DELETE, vo.getSeq());
//		jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
//	}
	
	// 글 상세조회
	public HotelVO getHotel(HotelVO vo) {
		System.out.println("===> Spring JDBC로 getBoard() 기능 처리........");
		Object[] args = {vo.getSeq()};
		//return getJdbcTemplate().queryForObject(BOARD_GET, args, new BoardRowMapper());
		return jdbcTemplate.queryForObject(BOARD_GET, args, new HotelRowMapper());
	}
	
	// 글 목록 조회
	public List<HotelVO> getHotelList(HotelVO  vo) {
		System.out.println("===> Spring JDBC로 getBoardList() 기능처리........  2   ");
//		Object[] args = { vo.getSearchKeyword() };
//		if (vo.getSearchCondition().equals("NAME")) {			
//			return jdbcTemplate.query(BOARD_LIST_T, args, new HotelRowMapper());
//		} else if (vo.getSearchCondition().equals("EMAL")) {
//			return jdbcTemplate.query(BOARD_LIST_C, args, new HotelRowMapper());
//		}
		return jdbcTemplate.query(BOARD_LIST, new HotelRowMapper());
		
		//return getJdbcTemplate().query(BOARD_LIST, new BoardRowMapper());
		//return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
		
	}
	
	
}

