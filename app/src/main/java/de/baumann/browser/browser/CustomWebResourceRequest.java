package de.baumann.browser.browser;

import android.net.Uri;
import android.webkit.WebResourceRequest;

import java.util.Map;

public class CustomWebResourceRequest implements WebResourceRequest {
    private Uri uri;
    private String method;
    private Map<String, String> headers;

    public CustomWebResourceRequest(Uri uri, String method, Map<String, String> headers) {
        this.uri = uri;
        this.method = method;
        this.headers = headers;
    }

    @Override
    public Uri getUrl() {
        return uri;
    }

    @Override
    public boolean isForMainFrame() {
        return true;
    }

    @Override
    public boolean isRedirect() {
        return false;
    }

    @Override
    public boolean hasGesture() {
        return false;
    }

    @Override
    public String getMethod() {
        return method;
    }

    @Override
    public Map<String, String> getRequestHeaders() {
        return headers;
    }
}
