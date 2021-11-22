package br_engine.services.video_rules;

import br_engine.requests.PaymentRequest;
import br_engine.response.PaymentResponse;
import br_engine.services.Rule;
import br_engine.services.VideoRule;

public class BasicVideoRule extends VideoRule implements Rule {

    public void apply(PaymentRequest paymentRequest, PaymentResponse response) {
        response.addResult("apply");
        response.addResult("added a free \"First Aid\" video to the packing slip");
    }
}
