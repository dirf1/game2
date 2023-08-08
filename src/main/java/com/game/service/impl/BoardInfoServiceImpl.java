package com.game.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.game.common.MybatisSqlSessionFactory;
import com.game.dao.BoardInfoDAO;
import com.game.dao.impl.BoardInfoDAOImpl;
import com.game.mapper.BoardInfoMapper;
import com.game.service.BoardInfoService;
import com.game.vo.BoardInfoVO;

public class BoardInfoServiceImpl implements BoardInfoService{
	private BoardInfoDAO biDAO = new BoardInfoDAOImpl();
	private SqlSessionFactory ssf = MybatisSqlSessionFactory.getSqlSessionFactory();
	@Override
	public List<BoardInfoVO> selectBoardInfoList(BoardInfoVO board) {
		try(SqlSession session = ssf.openSession()){
			BoardInfoMapper biMapper = session.getMapper(BoardInfoMapper.class);
			return biMapper.selectBoardInfoList(board); //위에선 스트링 스트링을 받는데 보드인포리스트를 받으니까 오류가 생기는 것. 그래서 인터페이스를 바꿔줘야함
		}catch(Exception e ) {
			throw e;
		}
		
		 //캐치에서 리턴을 해주는 것이 없으니 아래에 리턴을 해줌. 오류가 나는 것과 상관없이 리턴은 무조건 필요하다. throw e가 없으면 아래에 리턴을 넣어줘야함
	}

	@Override
	public BoardInfoVO selectBoardInfo(String biNum) {
		try(SqlSession session = ssf.openSession()){
			BoardInfoMapper biMapper = session.getMapper(BoardInfoMapper.class);
			return biMapper.selectBoardInfo(biNum); //위에선 스트링 스트링을 받는데 보드인포리스트를 받으니까 오류가 생기는 것. 그래서 인터페이스를 바꿔줘야함
		}catch(Exception e ) {
			throw e;
		}
		
	}

	@Override
	public int insertBoardInfo(Map<String, String> board) {
		return biDAO.insertBoardInfo(board);
	}

	@Override
	public int updateBoardInfo(Map<String, String> board) {
		return biDAO.updateBoardInfo(board);
	}

	@Override
	public int deleteBoardInfo(String biNum) {
		return biDAO.deleteBoardInfo(biNum);
	}

}
