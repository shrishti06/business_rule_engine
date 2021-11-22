package br_engine.services.product_rules;

import br_engine.requests.PaymentRequest;
import br_engine.response.PaymentResponse;
import br_engine.services.ProductRule;
import br_engine.services.Rule;

public class BookRule extends ProductRule implements Rule {

    public void apply(PaymentRequest paymentRequest, PaymentResponse response) {
        response.addResult("apply");
        generatePackingSlip(paymentRequest, response);
        generateDuplicatePackingSlip(paymentRequest, response);
        generateCommissionPayment(paymentRequest, response);
    }

    private void generateDuplicatePackingSlip(PaymentRequest paymentRequest, PaymentResponse response){
        response.addResult("generateDuplicatePackingSlip");
    }
}
