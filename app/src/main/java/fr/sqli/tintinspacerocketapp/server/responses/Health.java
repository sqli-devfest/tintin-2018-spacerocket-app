package fr.sqli.tintinspacerocketapp.server.responses;

import com.squareup.moshi.Moshi;

import fi.iki.elonen.NanoHTTPD.Response.Status;

public final class Health implements HttpResponse {

    public final String status = "alive";

    @Override
    public String toJson(final Moshi moshi) {
        return moshi.adapter(Health.class).toJson(this);
    }

    @Override
    public Status getStatus() {
        return Status.OK;
    }
}
