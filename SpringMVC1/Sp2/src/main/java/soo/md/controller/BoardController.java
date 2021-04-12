package soo.md.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.log4j.Log4j;
import soo.md.domain.Board;
import soo.md.page.pagemaker;
import soo.md.page.pagination;
import soo.md.service.BoardService;

@Log4j
@RequestMapping("/board/*")
@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("list.do")
	public ModelAndView list(pagination cri) throws Exception {
		
		
		ModelAndView mv = new ModelAndView("board/list");
		
		List<Map<String,Object>> list = boardService.listS(cri);
		pagemaker pm = new pagemaker();
		pm.setCri(cri);
		pm.setTotalCount(boardService.countBoardListTotal());
		
		mv.addObject("list", list);
		mv.addObject("pagemaker", pm);
		
		return mv;
	}
	
	@GetMapping("content.do")
	public ModelAndView read(long seq) throws Exception {
		
		Board board = boardService.readS(seq);
		ModelAndView mv = new ModelAndView("board/content", "board", board);
		
		return mv;
	}
	
	@GetMapping("write.do")
	public String write() throws Exception{
		return "board/write";
	}
	@PostMapping("write.do")
	public String write(Board board) throws Exception {		
		boardService.insertS(board);
		
		return "redirect:list.do";
	}
	
	@GetMapping("update.do")
	public ModelAndView update(long seq) throws Exception {
		Board board =  boardService.readS(seq);
		
		return new ModelAndView("board/update", "update", board);
		
	}
	@PostMapping("update.do")
	public String update(Board board, long seq) throws Exception {
		board.getSeq();
		boardService.updateS(board);
	
		return "redirect:list.do";
	}
	
	@GetMapping("del.do")
	public String delete(long seq) {
		boardService.deleteS(seq);
		
		return "redirect:list.do";
	}
	


}
