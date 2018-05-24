package com.positivepsychology;

import com.fasterxml.jackson.annotation.JsonFormat;

import static com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT;

@JsonFormat(shape = OBJECT)
public enum Tip {
	
	SELF_AFFIRMATIONS("Say 5 self-affirmations", "For example: \"I am capable of accomplishing anything.\""),
	GRATITUDE("Say 5 things you're grateful for", "Feel free to write, say them aloud, or just in your head."),
	COMPASSIONTE_WISH("Wish someone you know joy and happiness", "This can be for someone you love, an acquaintance, or even someone you don't like much!");
	
	private String title;
	private String description;
	
	Tip(final String title, final String description) {
		this.title = title;
		this.description = description;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}

}
