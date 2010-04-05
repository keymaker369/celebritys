package com.packtpub.celeb5.data;

import java.util.List;

import com.packtpub.celeb5.model.Celebrity;

public interface IDataSource {
	public List<Celebrity> getAllCelebrities();
    public Celebrity getCelebrityById(long id);
    public void addCelebrity(Celebrity c);
}
