package com.dao;

import com.domain.items;

import java.util.List;

public interface itemsDAO {
    public List<items> findAll() throws Exception;
}
