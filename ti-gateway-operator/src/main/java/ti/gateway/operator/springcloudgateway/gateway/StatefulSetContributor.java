package ti.gateway.operator.springcloudgateway.gateway;

import ti.gateway.operator.springcloudgateway.models.V1SpringCloudGateway;
import io.kubernetes.client.openapi.models.V1StatefulSet;

import java.util.function.BiConsumer;

interface StatefulSetContributor extends BiConsumer<V1StatefulSet, V1SpringCloudGateway> {
    void accept(V1StatefulSet statefulSet, V1SpringCloudGateway gateway);
}
