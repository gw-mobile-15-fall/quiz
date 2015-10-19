package com.guysquare.geoquiz;

/**
 * Created by zhishengliu on 9/27/15.
 */
public class Question {

    private int mTextResId;
    private boolean mAnserTrue;

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnserTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnserTrue() {
        return mAnserTrue;
    }

    public void setAnserTrue(boolean anserTrue) {
        mAnserTrue = anserTrue;
    }
}
