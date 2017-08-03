package fr.aschelch.gamebook.data.model;

import java.util.List;

/**
 * A part of a Story
 */
public class Page {

    /**
     * Text of the page
     */
    private String mText;

    /**
     * Choice list of the page
     */
    private List<Choice> mChoiceList;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public List<Choice> getChoiceList() {
        return mChoiceList;
    }

    public void setChoiceList(List<Choice> choiceList) {
        mChoiceList = choiceList;
    }
}
