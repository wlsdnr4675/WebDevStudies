package soo.md.mapper;

import java.util.List;

import soo.md.domain.Board;

public interface BoardMapper {
	
	
	List<Board> boardList();
	Board boardRead(long seq);
	void boardInsert(Board board);
	Board boardUpdate(long seq);
	void boardDelete(long seq);
}
