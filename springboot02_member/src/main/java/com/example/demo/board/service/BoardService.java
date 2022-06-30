package com.example.demo.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.board.dto.BoardDTO;
import com.example.demo.board.dto.PageDTO;
@Service
public interface BoardService {
	public int countProcess(); 
	public List<BoardDTO> listProcess(PageDTO pv);
	public void insertProcess(BoardDTO dto);
	public BoardDTO contentProcess(int num);
	public void reStepProcess(BoardDTO dto);
	public BoardDTO updateSelectProcess(int num);
	public void updateProcess(BoardDTO dto, String urlpath);
	public void deleteProcess(int num, String urlpath);
	public String fileSelectprocess(int num);
}
