package soo.md.mapper;

import java.util.List;

import soo.md.domain.Board;

public interface BoardMapper {
	
	
	List<Board> boardList();
	Board boardRead(long seq);
	void boardInsert(Board board);
	void boardUpdate(Board board);
	void boardDelete(long seq);
}
