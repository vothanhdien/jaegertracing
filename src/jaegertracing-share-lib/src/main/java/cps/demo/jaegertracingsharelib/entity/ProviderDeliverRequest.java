package cps.demo.jaegertracingsharelib.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author dienvt
 */

@Data
@Builder
public class ProviderDeliverRequest {

    private String orderId;
}
