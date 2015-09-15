package tr.com.hacktusdynamics.android.criminalintent.models;

import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;

    //Constructor
    public Crime() {
        //Generate unique identifier
        this.mId = UUID.randomUUID();
    }

    //Getters Setters
    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public UUID getId() {
        return mId;
    }

}
