package moe.xmcn.spcraft.eurwin.communications;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Unit {
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    void auth(String token) {
        String json = "";

        OkHttpClient c = new OkHttpClient();
        RequestBody body = RequestBody.create(JSON, json);
        Request req = new Request.Builder()
                .url("")
                .post(body)
                .build();
    }

}
