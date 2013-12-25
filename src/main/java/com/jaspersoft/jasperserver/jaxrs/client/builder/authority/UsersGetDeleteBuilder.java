package com.jaspersoft.jasperserver.jaxrs.client.builder.authority;

import com.jaspersoft.jasperserver.jaxrs.client.builder.api.GetDeleteRequest;
import com.jaspersoft.jasperserver.jaxrs.client.builder.api.Request;

import javax.ws.rs.core.Response;
import java.util.Map;

public class UsersGetDeleteBuilder<T> implements GetDeleteRequest<T> {

    private UsersRequestBuilder<T> wrappedBuilder;

    public UsersGetDeleteBuilder(UsersRequestBuilder<T> wrappedBuilder){
        this.wrappedBuilder = wrappedBuilder;
    }

    @Override
    public T get() {
        return wrappedBuilder.get();
    }

    @Override
    public Response delete() {
        return wrappedBuilder.delete();
    }

    @Override
    public UsersGetDeleteBuilder<T> addParam(String name, String... values) {
        return wrappedBuilder.addParam(name, values);
    }

    @Override
    public UsersGetDeleteBuilder<T> addParams(Map<String, String[]> params) {
        return wrappedBuilder.addParams(params);
    }


    @Override
    public Request setPath(String path) {
        return wrappedBuilder.setPath(path);
    }
}