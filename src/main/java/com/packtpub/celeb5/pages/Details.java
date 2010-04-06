package com.packtpub.celeb5.pages;

import java.text.Format;

import com.packtpub.celeb5.data.IDataSource;
import com.packtpub.celeb5.model.Celebrity;
import com.packtpub.celeb5.util.Formats;

import org.apache.tapestry5.annotations.ApplicationState;

public class Details {
	
	@ApplicationState
	private IDataSource dataSource;
	
	private Celebrity celebrity;
	
	void onActivate(long id) {
	    celebrity = dataSource.getCelebrityById(id);
	}

	public void setCelebrity(Celebrity c) {
		this.celebrity = c;
	}

	public Celebrity getCelebrity() {
		return celebrity;
	}

	public Format getDateFormat() {
		return Formats.getDateFormat();
	}
}
