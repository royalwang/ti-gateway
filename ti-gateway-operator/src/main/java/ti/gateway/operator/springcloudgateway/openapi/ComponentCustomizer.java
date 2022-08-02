package ti.gateway.operator.springcloudgateway.openapi;

import ti.gateway.operator.springcloudgateway.models.V1SpringCloudGateway;
import ti.gateway.operator.springcloudgateway.route.RouteDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.PathItem;

public interface ComponentCustomizer {
    void customize(V1SpringCloudGateway gateway, RouteDefinition routeDefinition, PathItem pathItem, OpenAPI apiToCustomize);

    boolean supports(RouteDefinition routeDefinition);
}
