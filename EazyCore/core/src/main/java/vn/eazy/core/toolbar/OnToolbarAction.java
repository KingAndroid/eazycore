package vn.eazy.core.toolbar;

/**
 * Created by QuangTo on 12/24/16.
 */

public interface OnToolbarAction {
    void setTitle(String title);

    void setTitle(String title,String font);

    void setTitleMainColor(int color);

    void showToolbar(boolean isShow);

    void showBackButton(boolean isShow);

    void showBackButton(boolean isShow, OnCallBackToolbarAction onCallBackToolbarAction);

    void setImageForLeftButton(int drawable);
}
