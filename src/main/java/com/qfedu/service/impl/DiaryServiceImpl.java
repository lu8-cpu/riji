package com.qfedu.service.impl;

import com.qfedu.common.JsonResult;
import com.qfedu.dao.DiaryDao;
import com.qfedu.entity.Diary;
import com.qfedu.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class  DiaryServiceImpl  implements DiaryService {
    @Autowired
    private DiaryDao diaryDao;
    @Override
    public void add(Diary diary) {
        diaryDao.add(diary);
    }
}
