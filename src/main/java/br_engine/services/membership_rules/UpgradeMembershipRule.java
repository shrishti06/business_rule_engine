package br_engine.services.membership_rules;

import br_engine.requests.PaymentRequest;
import br_engine.response.PaymentResponse;
import br_engine.services.MembershipRule;
import br_engine.services.Rule;

public class UpgradeMembershipRule extends MembershipRule implements Rule {

    public void apply(PaymentRequest paymentRequest, PaymentResponse response) {
        response.addResult("apply");
        informOwner(paymentRequest, response);
        upgrade(paymentRequest, response);
    }

    private void upgrade(PaymentRequest paymentRequest, PaymentResponse response){
        response.addResult("upgrade");
    }
}
