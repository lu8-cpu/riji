package com.qfedu.controller;

import com.github.pagehelper.Page;
import com.qfedu.entity.Dia;
import com.qfedu.service.DiaService;
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
public class DiaController {
    @Autowired
    private DiaService diaService;
    @RequestMapping("/find.do")
    @ResponseBody
    public Map<String, Object> find(HttpSession session, Integer page, Integer limit) {

        List<Dia> diaList = diaService.find(page, limit);

        long total = ((Page) diaList).getTotal();
        HashMap<String , Object> map = new HashMap<>();
        // 结合layui的表格组件， 0 表示成功
        map.put("code", 0);
        map.put("msg", "");
        // 表中总记录数
        map.put("count", total);
        // 获取到的分页数据
        map.put("data", diaList);

        return map;
    }
}
