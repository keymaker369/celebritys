package com.packtpub.celeb5.pages;

import java.text.Format;

import com.packtpub.celeb5.data.MockDataSource;
import com.packtpub.celeb5.model.Celebrity;
import com.packtpub.celeb5.util.Formats;

import org.apache.tapestry5.annotations.ApplicationState;
import org.apache.tapestry5.annotations.Persist;

public class Details {

	@ApplicationState
	private MockDataSource dataSource;
	private Celebrity celebrity;

	
	public void setCelebrity(Celebrity c){
		this.celebrity = c;
	}
	
	public Celebrity getCelebrity(){
		return celebrity;
	}
	
	public Format getDateFormat(){
		return Formats.getDateFormat();
	}
	
	void onActivate(long id){
		System.out.println("Aktivirana je details strana!!! I ovaj integer ej dobijen iz Contexta - kliktanja na link(prosledjen je id(broj):  " + id);
		celebrity = dataSource.getCelebrityById(id);
	}
}
