import br_engine.constants.EntityNames;
import br_engine.enums.EntityType;
import br_engine.factory.RuleFactory;
import br_engine.requests.PaymentRequest;
import br_engine.response.PaymentResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void bookRuleTest() {
        PaymentRequest paymentRequest = new PaymentRequest(EntityType.PRODUCT, EntityNames.PRODUCT_BOOK);
        RuleFactory ruleFactory = new RuleFactory();
        PaymentResponse response = ruleFactory.applyRule(paymentRequest);
        Assertions.assertEquals("apply | generatePackingSlip | generateDuplicatePackingSlip | generateCommissionPayment", response.getResult());
    }

    @Test
    public void productRuleTest() {
        PaymentRequest paymentRequest = new PaymentRequest(EntityType.PRODUCT, EntityNames.PRODUCT);
        RuleFactory ruleFactory = new RuleFactory();
        PaymentResponse response = ruleFactory.applyRule(paymentRequest);
        Assertions.assertEquals("apply | generatePackingSlip | generateCommissionPayment", response.getResult());
    }

    @Test
    public void activateMembershipRuleTest() {
        PaymentRequest paymentRequest = new PaymentRequest(EntityType.MEMBERSHIP, EntityNames.ACTIVATE_MEMBERSHIP);
        RuleFactory ruleFactory = new RuleFactory();
        PaymentResponse response = ruleFactory.applyRule(paymentRequest);
        Assertions.assertEquals("apply | informOwner | activate", response.getResult());
    }

    @Test
    public void upgradeMembershipRuleTest() {
        PaymentRequest paymentRequest = new PaymentRequest(EntityType.MEMBERSHIP, EntityNames.UPGRADE_MEMBERSHIP);
        RuleFactory ruleFactory = new RuleFactory();
        PaymentResponse response = ruleFactory.applyRule(paymentRequest);
        Assertions.assertEquals("apply | informOwner | upgrade", response.getResult());
    }

    @Test
    public void videoRuleTest() {
        PaymentRequest paymentRequest = new PaymentRequest(EntityType.VIDEO, EntityNames.Learning_to_Ski);
        RuleFactory ruleFactory = new RuleFactory();
        PaymentResponse response = ruleFactory.applyRule(paymentRequest);
        Assertions.assertEquals("apply | added a free \"First Aid\" video to the packing slip", response.getResult());
    }
}
