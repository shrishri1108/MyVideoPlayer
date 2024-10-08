
package dev.shrishri1108.MyVideoPlayer.Model.Video_listResponse;


import com.google.gson.annotations.SerializedName;

public class Subtitle {

    @SerializedName("language_code")
    private String mLanguageCode;
    @SerializedName("name")
    private String mName;
    @SerializedName("url")
    private String mUrl;

    public String getLanguageCode() {
        return mLanguageCode;
    }

    public void setLanguageCode(String languageCode) {
        mLanguageCode = languageCode;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}
