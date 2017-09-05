package com.ccc.ch3houseOfMirrors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MazeReader {
	
	@RequestMapping(value="houseOfMirrors", method = RequestMethod.GET)
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("houseOfMirrors");
	}
	
	@PostMapping(value="/uploadMaze")
	public String uploadFile(@RequestParam("file") MultipartFile file) {
		processFile(file);
		
		return null;
	}
	
	private void processFile(MultipartFile file) {
		
	}
}
