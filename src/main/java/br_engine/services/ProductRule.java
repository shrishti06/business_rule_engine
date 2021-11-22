package br_engine.services;

import br_engine.requests.PaymentRequest;
import br_engine.response.PaymentResponse;

public abstract class ProductRule {

    protected void generatePackingSlip(PaymentRequest paymentRequest, PaymentResponse response){
        response.addResult("generatePackingSlip");
    }

    protected void generateCommissionPayment(PaymentRequest paymentRequest, PaymentResponse response){
        response.addResult("generateCommissionPayment");
    }

}
