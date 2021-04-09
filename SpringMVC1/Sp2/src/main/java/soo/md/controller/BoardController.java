package soo.md.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.log4j.Log4j;
import soo.md.domain.Address;
import soo.md.domain.Board;
import soo.md.service.BoardService;

@Log4j
@RequestMapping("/board/*")
@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("list.do")
	public ModelAndView list() {
		
		List<Board> list = boardService.listS();
		
		ModelAndView mv = new ModelAndView("board/list", "list", list);
		
		return mv;
	}
	
	@GetMapping("content.do")
	public ModelAndView read(long seq) throws Exception {
		
		Board board = boardService.readS(seq);
		ModelAndView mv = new ModelAndView("board/content", "board", board);
		
		return mv;
	}
	
	@GetMapping("write.do")
	public String write() {
		return "board/write";
	}
	@PostMapping("write.do")
	public String write(Board board) {		
		boardService.insertS(board);
		
		return "redirect:list.do";
	}
	
	@GetMapping("update.do")
	public ModelAndView update(long seq) {
		
		return new ModelAndView("board/update", "update", boardService.readS(seq));
		
	}
	@PostMapping("update.do")
	public String update(Board board, long seq ) {
		Board b = boardService.updateS(seq);
		return "redirect:list.do";
	}
	
	
	
	@GetMapping("del.do")
	public String delete(long seq) {
		boardService.deleteS(seq);
		
		return "redirect:list.do";
	}

}
