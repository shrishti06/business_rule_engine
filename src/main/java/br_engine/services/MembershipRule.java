package br_engine.services;

import br_engine.requests.PaymentRequest;
import br_engine.response.PaymentResponse;

public abstract class MembershipRule {

    protected void informOwner(PaymentRequest paymentRequest, PaymentResponse response){
        response.addResult("informOwner");
    }
}
