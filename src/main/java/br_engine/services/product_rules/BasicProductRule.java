package br_engine.services.product_rules;

import br_engine.requests.PaymentRequest;
import br_engine.response.PaymentResponse;
import br_engine.services.ProductRule;
import br_engine.services.Rule;

public class BasicProductRule extends ProductRule implements Rule {

    public void apply(PaymentRequest paymentRequest, PaymentResponse response) {
        response.addResult("apply");
        this.generatePackingSlip(paymentRequest, response);
        this.generateCommissionPayment(paymentRequest, response);
    }
}
