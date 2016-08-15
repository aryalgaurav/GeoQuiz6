package android.nku.edu.geoquiz;

/**
 * Created by Gaurav on 8/5/2016.
 *
 * The question class holds two pieces of data:
 * 1. The question text
 * 2. The question answer that is either true or false.

 */
public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mUserCheated;

    public Question(int textResId, boolean answerTrue, boolean userCheated) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mUserCheated = userCheated;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isUserCheated() {
        return mUserCheated;
    }

    public void setUserCheated(boolean userCheated) {
        mUserCheated = userCheated;
    }
}