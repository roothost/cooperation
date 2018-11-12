package com.servise;

import com.dao.FruitsMapper;
import com.entity.Fruits;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitsService {
    @Autowired
    FruitsMapper fruitsMapper;
    public int insert(Fruits record){
       return fruitsMapper.insert(record);
    }
    public List<Fruits> page(int pageNum) {
        PageHelper.startPage(pageNum,5);
        return   fruitsMapper.page();
    }
        public int deleteByPrimaryKey(Integer id){
       return fruitsMapper.deleteByPrimaryKey(id);
        }
        public int updateByPrimaryKey(Fruits record){
        return fruitsMapper.updateByPrimaryKey(record);
        }
        public Fruits findById(int id){
        return fruitsMapper.fidById(id);
        }
}
