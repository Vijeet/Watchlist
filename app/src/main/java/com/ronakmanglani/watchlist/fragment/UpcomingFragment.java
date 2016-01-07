package com.ronakmanglani.watchlist.fragment;

import com.ronakmanglani.watchlist.util.TMDBHelper;

public class UpcomingFragment extends BaseGridFragment {

    public String getUrlToDownload(int page) {
        return TMDBHelper.getUpcomingMoviesLink(getActivity(), page);
    }

    public boolean isDetailedViewEnabled() {
        return false;
    }

    public int getTabNumber() {
        return 3;
    }

    public int getSpanLocation() {
        return -1;
    }
}