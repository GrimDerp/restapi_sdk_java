//
//  9/17/2015 1:32:18 PM
//

package SecureNetRestApiSDK.Api.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
* Contains Level Three transaction data.
*/
public class LevelThreeData   
{
    private List<Product> products = new ArrayList<Product>();
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> value) {
        products = value;
    }

    //TODO - Missing from API DOCs Refernce Page
    //public VatData VatData { get; set;}
    /**
    * Date of the transaction.
    */
    private Date orderDate = new Date();
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date value) {
        orderDate = value;
    }

    /**
    * Destination address of the purchased items.
    */
    private Address destinationAddress;
    public Address getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(Address value) {
        destinationAddress = value;
    }

    /**
    * Origin address of the purchased items.
    */
    private Address originAddress;
    public Address getOriginAddress() {
        return originAddress;
    }

    public void setOriginAddress(Address value) {
        originAddress = value;
    }

    /**
    * Amount of discount applied to the purchased items.
    */
    private double discountAmount;
    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double value) {
        discountAmount = value;
    }

    /**
    * Plan identifier. Auto-generated by the system and given to the merchant when the plan is added.
    */
    private int planId;
    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int value) {
        planId = value;
    }

    /**
    * Plan start date.
    */
    private Date startDate = new Date();
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date value) {
        startDate = value;
    }

    /**
    * Next scheduled payment date.
    */
    private Date nextPaymentDate = new Date();
    public Date getNextPaymentDate() {
        return nextPaymentDate;
    }

    public void setNextPaymentDate(Date value) {
        nextPaymentDate = value;
    }

    /**
    * Number of times to retry billing if payment is declined.
    */
    private int maxRetries;
    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int value) {
        maxRetries = value;
    }

    /**
    * Primary payment method to be used for billing.
    */
    private String primaryPaymentMethodId = new String();
    public String getPrimaryPaymentMethodId() {
        return primaryPaymentMethodId;
    }

    public void setPrimaryPaymentMethodId(String value) {
        primaryPaymentMethodId = value;
    }

    /**
    * Secondary payment method to be used for billing.
    */
    private String secondaryPaymentMethodId = new String();
    public String getSecondaryPaymentMethodId() {
        return secondaryPaymentMethodId;
    }

    public void setSecondaryPaymentMethodId(String value) {
        secondaryPaymentMethodId = value;
    }

    /**
    * Custom user-defined fields tied to the plan, which can be used for reporting.
    */
    private List<UserDefinedField> userDefinedFields = new ArrayList<UserDefinedField>();
    public List<UserDefinedField> getUserDefinedFields() {
        return userDefinedFields;
    }

    public void setUserDefinedFields(List<UserDefinedField> value) {
        userDefinedFields = value;
    }

}


