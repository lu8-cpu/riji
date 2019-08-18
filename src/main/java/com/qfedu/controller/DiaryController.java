package com.qfedu.controller;

import com.github.pagehelper.Page;
import com.qfedu.common.JsonResult;
import com.qfedu.entity.Dia;
import com.qfedu.entity.Diary;
import com.qfedu.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DiaryController {
    @Autowired
    private DiaryService diaryService;

    @RequestMapping("/add.do")
    @ResponseBody
    public JsonResult add(Diary diary){
        try {
            diaryService.add(diary);
            return new JsonResult(1, "添加成功");
        } catch (Exception e){
            return new JsonResult(0, "添加失败");
        }
    }



}
