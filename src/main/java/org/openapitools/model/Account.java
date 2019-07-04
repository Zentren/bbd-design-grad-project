package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Account
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-04T16:05:03.095817700+02:00[Africa/Harare]")

public class Account   {
  @JsonProperty("accountNumber")
  private Long accountNumber;

  @JsonProperty("balance")
  private Long balance;

  @JsonProperty("availableBalance")
  private Long availableBalance;

  @JsonProperty("closed")
  private Boolean closed = false;

  @JsonProperty("transactions")
  @Valid
  private List<String> transactions = null;

  public Account accountNumber(Long accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  */
  @ApiModelProperty(value = "")


  public Long getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(Long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Account balance(Long balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  */
  @ApiModelProperty(value = "")


  public Long getBalance() {
    return balance;
  }

  public void setBalance(Long balance) {
    this.balance = balance;
  }

  public Account availableBalance(Long availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

  /**
   * Get availableBalance
   * @return availableBalance
  */
  @ApiModelProperty(value = "")


  public Long getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(Long availableBalance) {
    this.availableBalance = availableBalance;
  }

  public Account closed(Boolean closed) {
    this.closed = closed;
    return this;
  }

  /**
   * Get closed
   * @return closed
  */
  @ApiModelProperty(value = "")


  public Boolean getClosed() {
    return closed;
  }

  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  public Account transactions(List<String> transactions) {
    this.transactions = transactions;
    return this;
  }

  public Account addTransactionsItem(String transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Get transactions
   * @return transactions
  */
  @ApiModelProperty(value = "")


  public List<String> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<String> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.accountNumber, account.accountNumber) &&
        Objects.equals(this.balance, account.balance) &&
        Objects.equals(this.availableBalance, account.availableBalance) &&
        Objects.equals(this.closed, account.closed) &&
        Objects.equals(this.transactions, account.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, balance, availableBalance, closed, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

