package com.game.controller;

import java.io.*;
import java.io.PrintWriter;
import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.game.common.CommonView;
import com.game.service.BoardInfoService;
import com.game.service.impl.BoardInfoServiceImpl;
import com.game.vo.BoardInfoVO;
import com.google.gson.Gson;

@WebServlet("/json/*")
public class JsonServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Gson gson = new Gson();
    private BoardInfoService biService = new BoardInfoServiceImpl();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String json = "";
    	String cmd = CommonView.getCmd(request);
    	if("list".equals(cmd)) {
    	BoardInfoVO board = new BoardInfoVO();
    	board.setsearchType(request.getParameter("searchType"));
    	board.setsearchStr(request.getParameter("searchStr"));
    	json = gson.toJson(biService.selectBoardInfoList(board));
    	}else if("one".equals(cmd)) {
    		String biNum = request.getParameter("biNum");
    		json = gson.toJson(biService.selectBoardInfo(biNum));    		
    	}
    	
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); 
        out.print(json);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    }
