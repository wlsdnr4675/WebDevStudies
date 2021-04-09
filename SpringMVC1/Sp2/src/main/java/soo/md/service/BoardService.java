package soo.md.service;

import java.util.List;

import soo.md.domain.Board;

public interface BoardService {
	
	List<Board> listS();
	Board readS(long seq);
	void insertS(Board board);
	Board updateS(long seq);
	void deleteS(long seq);
	
}
