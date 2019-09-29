package com.codegym.controller;

import com.codegym.model.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryServlet {

    @PostMapping("/dictionary")
    public String result(@RequestParam String text, Model model){
        Dictionary dictionary=new Dictionary();
        model.addAttribute("text",text);
        model.addAttribute("result",dictionary.getValue(text));
        if(dictionary.getValue(text)==null){
            return "notfound";
        }else {
            return "dictionary";
        }


    }
}










