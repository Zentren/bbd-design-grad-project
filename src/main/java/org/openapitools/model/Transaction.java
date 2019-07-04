package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.TransactionFromAccount;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Transaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-04T16:05:03.095817700+02:00[Africa/Harare]")

public class Transaction   {
  @JsonProperty("transactionId")
  private String transactionId;

  @JsonProperty("fromAccount")
  private TransactionFromAccount fromAccount = null;

  @JsonProperty("toAccount")
  private TransactionFromAccount toAccount = null;

  @JsonProperty("dateInitiation")
  private OffsetDateTime dateInitiation;

  @JsonProperty("dateSettlement")
  private OffsetDateTime dateSettlement;

  @JsonProperty("settled")
  private Boolean settled = false;

  public Transaction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  */
  @ApiModelProperty(value = "")


  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Transaction fromAccount(TransactionFromAccount fromAccount) {
    this.fromAccount = fromAccount;
    return this;
  }

  /**
   * Get fromAccount
   * @return fromAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public TransactionFromAccount getFromAccount() {
    return fromAccount;
  }

  public void setFromAccount(TransactionFromAccount fromAccount) {
    this.fromAccount = fromAccount;
  }

  public Transaction toAccount(TransactionFromAccount toAccount) {
    this.toAccount = toAccount;
    return this;
  }

  /**
   * Get toAccount
   * @return toAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public TransactionFromAccount getToAccount() {
    return toAccount;
  }

  public void setToAccount(TransactionFromAccount toAccount) {
    this.toAccount = toAccount;
  }

  public Transaction dateInitiation(OffsetDateTime dateInitiation) {
    this.dateInitiation = dateInitiation;
    return this;
  }

  /**
   * Get dateInitiation
   * @return dateInitiation
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDateInitiation() {
    return dateInitiation;
  }

  public void setDateInitiation(OffsetDateTime dateInitiation) {
    this.dateInitiation = dateInitiation;
  }

  public Transaction dateSettlement(OffsetDateTime dateSettlement) {
    this.dateSettlement = dateSettlement;
    return this;
  }

  /**
   * Get dateSettlement
   * @return dateSettlement
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDateSettlement() {
    return dateSettlement;
  }

  public void setDateSettlement(OffsetDateTime dateSettlement) {
    this.dateSettlement = dateSettlement;
  }

  public Transaction settled(Boolean settled) {
    this.settled = settled;
    return this;
  }

  /**
   * Get settled
   * @return settled
  */
  @ApiModelProperty(value = "")


  public Boolean getSettled() {
    return settled;
  }

  public void setSettled(Boolean settled) {
    this.settled = settled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.transactionId, transaction.transactionId) &&
        Objects.equals(this.fromAccount, transaction.fromAccount) &&
        Objects.equals(this.toAccount, transaction.toAccount) &&
        Objects.equals(this.dateInitiation, transaction.dateInitiation) &&
        Objects.equals(this.dateSettlement, transaction.dateSettlement) &&
        Objects.equals(this.settled, transaction.settled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, fromAccount, toAccount, dateInitiation, dateSettlement, settled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    dateInitiation: ").append(toIndentedString(dateInitiation)).append("\n");
    sb.append("    dateSettlement: ").append(toIndentedString(dateSettlement)).append("\n");
    sb.append("    settled: ").append(toIndentedString(settled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

