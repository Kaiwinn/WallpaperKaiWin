package com.example.wallpaperkaiwin.Listener;

import com.example.wallpaperkaiwin.Model.CuratedApiResponse;

public interface CuratedResponseListener {
    void onFetch(CuratedApiResponse response, String message);
    void onError(String message);
}
