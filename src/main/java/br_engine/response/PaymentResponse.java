package br_engine.response;

import br_engine.constants.StringConstants;

import java.util.Objects;

public class PaymentResponse {

    public String getResult() {
        return result;
    }

    private String result = "";

    public void addResult(String answer){

        if (!Objects.equals(result, "")){
            result = result + StringConstants.DELIMITER + answer;
        } else {
            result = answer;
        }
    }
}
