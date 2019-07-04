/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.0.2).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Account;
import java.math.BigDecimal;
import org.openapitools.model.Transaction;
import org.openapitools.model.User;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-04T16:05:03.095817700+02:00[Africa/Harare]")

@Validated
@Api(value = "users", description = "the users API")
public interface UsersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "Close User Account", nickname = "closeUserAccount", notes = "", response = Account.class, authorizations = {
        @Authorization(value = "wallet_auth", scopes = {
            @AuthorizationScope(scope = "write-account", description = "")
            })
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Account.class),
        @ApiResponse(code = 405, message = "Invalid permission") })
    @RequestMapping(value = "/users/{userId}/{accountId}",
        produces = { "*/*" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<Account> closeUserAccount(@ApiParam(value = "",required=true) @PathVariable("userId") BigDecimal userId,@ApiParam(value = "",required=true) @PathVariable("accountId") BigDecimal accountId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    ApiUtil.setExampleResponse(request, "*/*", "{  \"balance\" : 6,  \"closed\" : false,  \"accountNumber\" : 0,  \"transactions\" : [ \"transactions\", \"transactions\" ],  \"availableBalance\" : 1}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Create account for user", nickname = "createAccountForUser", notes = "", response = User.class, authorizations = {
        @Authorization(value = "wallet_auth", scopes = {
            @AuthorizationScope(scope = "write-user", description = "")
            })
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class) })
    @RequestMapping(value = "/users/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<User> createAccountForUser(@ApiParam(value = "",required=true) @PathVariable("userId") BigDecimal userId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Account account) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"firstName\" : \"firstName\",  \"password\" : \"password\",  \"phoneNumber\" : \"phoneNumber\",  \"surname\" : \"surname\",  \"accounts\" : [ \"accounts\", \"accounts\" ],  \"userId\" : 0,  \"email\" : \"email\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Create new user", nickname = "createUser", notes = "", authorizations = {
        @Authorization(value = "wallet_auth", scopes = {
            @AuthorizationScope(scope = "write:users", description = "")
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 402, message = "Invalid authentication"),
        @ApiResponse(code = 403, message = "User already exists") })
    @RequestMapping(value = "/users",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> createUser(@ApiParam(value = ""  )  @Valid @RequestBody User body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Create User Account Transaction", nickname = "createUserAccountTransaction", notes = "", response = Account.class, authorizations = {
        @Authorization(value = "wallet_auth", scopes = {
            @AuthorizationScope(scope = "write-account", description = "")
            })
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Account.class),
        @ApiResponse(code = 405, message = "Invalid permission") })
    @RequestMapping(value = "/users/{userId}/{accountId}",
        produces = { "*/*" }, 
        method = RequestMethod.POST)
    default ResponseEntity<Account> createUserAccountTransaction(@ApiParam(value = "",required=true) @PathVariable("userId") BigDecimal userId,@ApiParam(value = "",required=true) @PathVariable("accountId") BigDecimal accountId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Account account) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    ApiUtil.setExampleResponse(request, "*/*", "{  \"balance\" : 6,  \"closed\" : false,  \"accountNumber\" : 0,  \"transactions\" : [ \"transactions\", \"transactions\" ],  \"availableBalance\" : 1}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Delete user", nickname = "deleteUser", notes = "", response = User.class, authorizations = {
        @Authorization(value = "wallet_auth", scopes = {
            @AuthorizationScope(scope = "write-user", description = "")
            })
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class) })
    @RequestMapping(value = "/users/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<User> deleteUser(@ApiParam(value = "",required=true) @PathVariable("userId") BigDecimal userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"firstName\" : \"firstName\",  \"password\" : \"password\",  \"phoneNumber\" : \"phoneNumber\",  \"surname\" : \"surname\",  \"accounts\" : [ \"accounts\", \"accounts\" ],  \"userId\" : 0,  \"email\" : \"email\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "User details", nickname = "getUser", notes = "", response = User.class, authorizations = {
        @Authorization(value = "wallet_auth", scopes = {
            @AuthorizationScope(scope = "read-user", description = "")
            })
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class) })
    @RequestMapping(value = "/users/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<User> getUser(@ApiParam(value = "",required=true) @PathVariable("userId") BigDecimal userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"firstName\" : \"firstName\",  \"password\" : \"password\",  \"phoneNumber\" : \"phoneNumber\",  \"surname\" : \"surname\",  \"accounts\" : [ \"accounts\", \"accounts\" ],  \"userId\" : 0,  \"email\" : \"email\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "User Account details", nickname = "getUserAccount", notes = "", response = Account.class, authorizations = {
        @Authorization(value = "wallet_auth", scopes = {
            @AuthorizationScope(scope = "read-account", description = "")
            })
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Account.class) })
    @RequestMapping(value = "/users/{userId}/{accountId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Account> getUserAccount(@ApiParam(value = "",required=true) @PathVariable("userId") BigDecimal userId,@ApiParam(value = "",required=true) @PathVariable("accountId") BigDecimal accountId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"balance\" : 6,  \"closed\" : false,  \"accountNumber\" : 0,  \"transactions\" : [ \"transactions\", \"transactions\" ],  \"availableBalance\" : 1}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "User Transaction details", nickname = "getUserTransaction", notes = "", response = Transaction.class, authorizations = {
        @Authorization(value = "wallet_auth", scopes = {
            @AuthorizationScope(scope = "read-user", description = "")
            })
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Transaction.class) })
    @RequestMapping(value = "/users/{userId}/{accountId}/{transactionId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Transaction> getUserTransaction(@ApiParam(value = "",required=true) @PathVariable("userId") BigDecimal userId,@ApiParam(value = "",required=true) @PathVariable("accountId") BigDecimal accountId,@ApiParam(value = "",required=true) @PathVariable("transactionId") String transactionId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"toAccount\" : {    \"accountNumber\" : \"accountNumber\",    \"openingBalance\" : 0  },  \"settled\" : false,  \"fromAccount\" : {    \"accountNumber\" : \"accountNumber\",    \"openingBalance\" : 0  },  \"dateInitiation\" : \"2000-01-23T04:56:07.000+00:00\",  \"dateSettlement\" : \"2000-01-23T04:56:07.000+00:00\",  \"transactionId\" : \"transactionId\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Get all users", nickname = "getUsers", notes = "", response = User.class, responseContainer = "List", authorizations = {
        @Authorization(value = "wallet_auth", scopes = {
            @AuthorizationScope(scope = "read:users", description = "")
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class, responseContainer = "List"),
        @ApiResponse(code = 402, message = "Invalid permission") })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<User>> getUsers() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"firstName\" : \"firstName\",  \"password\" : \"password\",  \"phoneNumber\" : \"phoneNumber\",  \"surname\" : \"surname\",  \"accounts\" : [ \"accounts\", \"accounts\" ],  \"userId\" : 0,  \"email\" : \"email\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Reverse Transaction", nickname = "reverseUserTransaction", notes = "", response = Transaction.class, authorizations = {
        @Authorization(value = "wallet_auth", scopes = {
            @AuthorizationScope(scope = "write-user", description = "")
            })
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Transaction.class) })
    @RequestMapping(value = "/users/{userId}/{accountId}/{transactionId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<Transaction> reverseUserTransaction(@ApiParam(value = "",required=true) @PathVariable("userId") BigDecimal userId,@ApiParam(value = "",required=true) @PathVariable("accountId") BigDecimal accountId,@ApiParam(value = "",required=true) @PathVariable("transactionId") String transactionId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"toAccount\" : {    \"accountNumber\" : \"accountNumber\",    \"openingBalance\" : 0  },  \"settled\" : false,  \"fromAccount\" : {    \"accountNumber\" : \"accountNumber\",    \"openingBalance\" : 0  },  \"dateInitiation\" : \"2000-01-23T04:56:07.000+00:00\",  \"dateSettlement\" : \"2000-01-23T04:56:07.000+00:00\",  \"transactionId\" : \"transactionId\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}