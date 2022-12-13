package com.Jquerytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Jquerytest.dto.MessageDTO;

@Controller
public class MainController {
	@RequestMapping(value = "/dataSend",method = RequestMethod.POST)
    public String dataSend(Model model, MessageDTO dto){
        model.addAttribute("msg",dto.getResult());
        return "index :: #resultDiv";
    }
}
