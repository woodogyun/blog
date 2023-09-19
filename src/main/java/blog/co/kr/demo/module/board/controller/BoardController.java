package blog.co.kr.demo.module.board.controller;

import blog.co.kr.demo.module.board.entity.Board;
import blog.co.kr.demo.module.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/board")
@RestController
@RequiredArgsConstructor
public class BoardController {

    private BoardService boardService;

    @GetMapping("")
    public Page<Board> getBoardPage(Pageable pageable){
        final Page<Board> page = boardService.getPage(pageable);
        return null;
    }

    @GetMapping("/{id}")
    public Board getBoard(@PathVariable("id")Long id){
        final Board board = boardService.getBoard(id);
        return null;
    }
}
