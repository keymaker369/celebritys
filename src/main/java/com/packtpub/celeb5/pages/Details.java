package com.packtpub.celeb5.pages;

import java.text.Format;

import com.packtpub.celeb5.model.Celebrity;
import com.packtpub.celeb5.util.Formats;
import org.apache.tapestry5.annotations.Persist;

public class Details {

	@Persist
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
	
	Object onActivate(){
		if (celebrity == null)
			return Index.class;
		return null;
	}
}
