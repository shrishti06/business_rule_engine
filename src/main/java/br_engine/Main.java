package br_engine;

import br_engine.constants.EntityNames;
import br_engine.enums.EntityType;
import br_engine.factory.RuleFactory;
import br_engine.requests.PaymentRequest;
import br_engine.response.PaymentResponse;

public class Main {

    public static void main(String[] args){

        PaymentRequest paymentRequest = new PaymentRequest(EntityType.PRODUCT, EntityNames.PRODUCT_BOOK);
        RuleFactory ruleFactory = new RuleFactory();
        PaymentResponse response = ruleFactory.applyRule(paymentRequest);
        System.out.println(response.getResult());
    }
}
