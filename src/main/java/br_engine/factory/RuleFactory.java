package br_engine.factory;

import br_engine.requests.PaymentRequest;
import br_engine.response.PaymentResponse;
import br_engine.services.membership_rules.ActivateMembershipRule;
import br_engine.services.membership_rules.UpgradeMembershipRule;
import br_engine.services.product_rules.BasicProductRule;
import br_engine.services.product_rules.BookRule;
import br_engine.services.video_rules.BasicVideoRule;

public class RuleFactory {

    private final BasicProductRule basicProductRule;
    private final BasicVideoRule basicVideoRule;
    private final BookRule bookRule;
    private final ActivateMembershipRule activateMembershipRule;
    private final UpgradeMembershipRule upgradeMembershipRule;

    public RuleFactory() {

        this.basicProductRule = new BasicProductRule();
        this.basicVideoRule = new BasicVideoRule();
        this.bookRule = new BookRule();
        this.activateMembershipRule = new ActivateMembershipRule();
        this.upgradeMembershipRule = new UpgradeMembershipRule();
    }

    public PaymentResponse applyRule(PaymentRequest paymentRequest){

        PaymentResponse response = new PaymentResponse();

        switch (paymentRequest.getEntityType()){
            case PRODUCT:
                switch (paymentRequest.getEntityName()){
                    case "BOOK":
                        bookRule.apply(paymentRequest, response);
                        break;
                    default:
                        basicProductRule.apply(paymentRequest, response);
                }
                break;
            case MEMBERSHIP:
                switch (paymentRequest.getEntityName()){
                    case "ACTIVATE":
                        activateMembershipRule.apply(paymentRequest, response);
                        break;
                    case "UPGRADE":
                        upgradeMembershipRule.apply(paymentRequest, response);
                        break;
                }
                break;
            case VIDEO:
                basicVideoRule.apply(paymentRequest, response);
                break;
        }
        return response;
    }
}
