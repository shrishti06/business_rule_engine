package br_engine.services;

import br_engine.requests.PaymentRequest;
import br_engine.response.PaymentResponse;

public interface Rule {

    void apply(PaymentRequest paymentRequest, PaymentResponse response);
}
