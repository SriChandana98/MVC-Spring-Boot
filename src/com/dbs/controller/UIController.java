package com.dbs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UIController extends MultiActionController {
	public ModelAndView login(HttpServletRequest req, HttpServletResponse res)
	{
        System.out.println("hiiii0");
		ModelAndView mv= new ModelAndView("msg");
        System.out.println("hiiii1");
        Integer i1=Integer.parseInt(req.getParameter("userid"));
        System.out.println("hiiii");
        System.out.println(i1);
		mv.addObject("msg1",i1);
		return mv;
	}
	public ModelAndView register(HttpServletRequest req, HttpServletResponse res)
	{
		ModelAndView mv= new ModelAndView("msg");
		Integer i1=Integer.parseInt(req.getParameter("userid"));
		System.out.println(i1);
		mv.addObject("msg1",i1);
		return mv;
	}
}
