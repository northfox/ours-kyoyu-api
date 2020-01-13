package com.github.northfox.ours.willbedoing.api.service;

import com.github.northfox.ours.kyoyu.api.domain.TodoEntity;
import com.github.northfox.ours.kyoyu.api.domain.VTodoEntity;
import com.github.northfox.ours.kyoyu.api.exception.ApplicationException;
import com.github.northfox.ours.kyoyu.api.exception.NotExistsEntityException;
import com.github.northfox.ours.willbedoing.api.domain.WillTodoEntity;
import java.util.List;

public interface WillTodosService {
    List<WillTodoEntity> all();
    List<WillTodoEntity> findByKeyword(String keyword);
    WillTodoEntity findById(Integer id);
    List<WillTodoEntity> saveAll(String keyword, List<WillTodoEntity> entity);
    List<WillTodoEntity> updateAll(String keyword, List<WillTodoEntity> entity);
    void deleteAll(String keyword);
}