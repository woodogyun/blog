package blog.co.kr.demo.module.board.service;

import blog.co.kr.demo.module.board.entity.Board;
import blog.co.kr.demo.module.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public Page<Board> getPage(Pageable pageable) {
//        final Page<Board> page = boardRepository.findAll(pageable);
        return boardRepository.findAll(pageable);
    }

    public Board getBoard(Long id) {

        return null;
    }
}
