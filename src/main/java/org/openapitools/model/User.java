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
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-04T16:05:03.095817700+02:00[Africa/Harare]")

public class User   {
  @JsonProperty("userId")
  private Long userId;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("surname")
  private String surname;

  @JsonProperty("email")
  private String email;

  @JsonProperty("phoneNumber")
  private String phoneNumber;

  @JsonProperty("password")
  private String password;

  @JsonProperty("accounts")
  @Valid
  private List<String> accounts = null;

  public User userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @ApiModelProperty(value = "")


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  */
  @ApiModelProperty(value = "")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  @ApiModelProperty(value = "")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @ApiModelProperty(value = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User accounts(List<String> accounts) {
    this.accounts = accounts;
    return this;
  }

  public User addAccountsItem(String accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Get accounts
   * @return accounts
  */
  @ApiModelProperty(value = "")


  public List<String> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<String> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.userId, user.userId) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.surname, user.surname) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.phoneNumber, user.phoneNumber) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.accounts, user.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, firstName, surname, email, phoneNumber, password, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

