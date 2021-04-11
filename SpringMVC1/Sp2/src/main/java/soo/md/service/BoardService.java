package soo.md.service;

import java.util.List;
import java.util.Map;

import soo.md.domain.Board;
import soo.md.page.pagination;

public interface BoardService {
	
	List<Map<String,Object>> listS(pagination cri);
	Board readS(long seq);
	void insertS(Board board);
	void updateS (Board board);
	void deleteS(long seq);
	
	int countBoardListTotal();
	
}
