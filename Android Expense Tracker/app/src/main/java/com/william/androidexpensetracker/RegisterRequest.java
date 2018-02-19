package com.william.androidexpensetracker;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by william on 2/19/2018.
 */

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "https://vixensignup.000webhostapp.com/Register.php";
    private Map<String,String> params;

    public RegisterRequest(String judul , String deskripsi , String instansi, Response.Listener<String> listener){
        super(Method.POST,REGISTER_REQUEST_URL,listener,null);
        params = new HashMap<>();
        params.put("judul" , judul);
        params.put("deskripsi",deskripsi);
        params.put("instansi",instansi);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
