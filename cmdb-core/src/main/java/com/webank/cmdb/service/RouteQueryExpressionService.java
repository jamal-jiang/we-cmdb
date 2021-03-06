package com.webank.cmdb.service;

import com.webank.cmdb.dto.AdhocIntegrationQueryDto;

import java.util.List;

public interface RouteQueryExpressionService extends CmdbService{
    public static final String SERVICE_NAME = "RouteQueryExpressionService";

    @Override
    default String getName() {
        return SERVICE_NAME;
    }

    List executeQuery(String expression);

    AdhocIntegrationQueryDto parseRouteExpression(String routeExpression);
}
