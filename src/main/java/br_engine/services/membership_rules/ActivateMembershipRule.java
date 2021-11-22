package br_engine.services.membership_rules;

import br_engine.requests.PaymentRequest;
import br_engine.response.PaymentResponse;
import br_engine.services.MembershipRule;
import br_engine.services.Rule;

public class ActivateMembershipRule extends MembershipRule implements Rule {

    @Override
    public void apply(PaymentRequest paymentRequest, PaymentResponse response) {
        response.addResult("apply");
        informOwner(paymentRequest, response);
        activate(paymentRequest, response);
    }

    private void activate(PaymentRequest paymentRequest, PaymentResponse response){
        response.addResult("activate");
    }
}
