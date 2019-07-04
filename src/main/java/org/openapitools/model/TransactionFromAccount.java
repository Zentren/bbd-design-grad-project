package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransactionFromAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-04T16:05:03.095817700+02:00[Africa/Harare]")

public class TransactionFromAccount   {
  @JsonProperty("accountNumber")
  private String accountNumber;

  @JsonProperty("openingBalance")
  private Long openingBalance;

  public TransactionFromAccount accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  */
  @ApiModelProperty(value = "")


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public TransactionFromAccount openingBalance(Long openingBalance) {
    this.openingBalance = openingBalance;
    return this;
  }

  /**
   * Get openingBalance
   * @return openingBalance
  */
  @ApiModelProperty(value = "")


  public Long getOpeningBalance() {
    return openingBalance;
  }

  public void setOpeningBalance(Long openingBalance) {
    this.openingBalance = openingBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionFromAccount transactionFromAccount = (TransactionFromAccount) o;
    return Objects.equals(this.accountNumber, transactionFromAccount.accountNumber) &&
        Objects.equals(this.openingBalance, transactionFromAccount.openingBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, openingBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionFromAccount {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    openingBalance: ").append(toIndentedString(openingBalance)).append("\n");
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

