package com.github.northfox.ours.kyoyu.kyoyu.api.service;

import com.github.northfox.ours.kyoyu.kyoyu.api.domain.StatusEntity;
import com.github.northfox.ours.kyoyu.kyoyu.api.domain.TodoEntity;
import com.github.northfox.ours.kyoyu.kyoyu.api.domain.VTodoEntity;
import com.github.northfox.ours.kyoyu.kyoyu.api.repository.StatusRepository;
import com.github.northfox.ours.kyoyu.kyoyu.api.repository.TodoRepository;
import com.github.northfox.ours.kyoyu.kyoyu.api.repository.VTodoRepository;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
@Slf4j
public class StatusesServiceImpl implements StatusesService {

    private final StatusRepository repository;

    @Autowired
    public StatusesServiceImpl(StatusRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<StatusEntity> all() {
        return repository.findAll();
    }

    @Override
    public StatusEntity save(StatusEntity entity) {
        return repository.save(entity);
    }
}