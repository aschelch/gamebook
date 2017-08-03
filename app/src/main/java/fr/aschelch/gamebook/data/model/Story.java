package fr.aschelch.gamebook.data.model;

import java.util.List;

/**
 * A story
 */
public class Story {

    /**
     * Title of the story
     */
    private String mTitle;

    /**
     * Page list of the story
     */
    private List<Page> mPageList;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public List<Page> getPageList() {
        return mPageList;
    }

    public void setPageList(List<Page> pageList) {
        mPageList = pageList;
    }
}
