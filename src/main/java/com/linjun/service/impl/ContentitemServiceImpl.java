package com.linjun.service.impl;

import com.linjun.dao.ContentltemMapper;
import com.linjun.model.Contentltem;
import com.linjun.model.ContentltemCriteria;
import com.linjun.service.ContentitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentitemServiceImpl implements ContentitemService {
    @Autowired
    ContentltemMapper contentltemMapper;
    public int insert(Contentltem contentltem) {
        return contentltemMapper.insert(contentltem );
    }

    public int update(int id, Contentltem contentltem) {
        ContentltemCriteria contentltemCriteria=new ContentltemCriteria();
        ContentltemCriteria.Criteria criteria=contentltemCriteria.createCriteria();
        criteria.andContentcategroyidEqualTo(id);

        return contentltemMapper.updateByExample(contentltem,contentltemCriteria);
    }

    public int delete(int id) {
        ContentltemCriteria contentltemCriteria=new ContentltemCriteria();
        ContentltemCriteria.Criteria criteria=contentltemCriteria.createCriteria();
        criteria.andContentcategroyidEqualTo(id);
        return contentltemMapper.deleteByExample(contentltemCriteria);
    }
}
