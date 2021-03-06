/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateIdentityProvider" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIdentityProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The identity provider name.
     * </p>
     */
    private String providerName;
    /**
     * <p>
     * The identity provider type.
     * </p>
     */
    private String providerType;
    /**
     * <p>
     * The identity provider details. The following list describes the provider detail keys for each identity provider
     * type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Google, Facebook and Login with Amazon:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Sign in with Apple:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * team_id
     * </p>
     * </li>
     * <li>
     * <p>
     * key_id
     * </p>
     * </li>
     * <li>
     * <p>
     * private_key
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For OIDC providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_request_method
     * </p>
     * </li>
     * <li>
     * <p>
     * oidc_issuer
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * token_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * jwks_uri <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For SAML providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MetadataFile OR MetadataURL
     * </p>
     * </li>
     * <li>
     * <p>
     * IDPSignOut <i>optional</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> providerDetails;
    /**
     * <p>
     * A mapping of identity provider attributes to standard and custom user pool attributes.
     * </p>
     */
    private java.util.Map<String, String> attributeMapping;
    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     */
    private java.util.List<String> idpIdentifiers;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @return The user pool ID.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentityProviderRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The identity provider name.
     * </p>
     * 
     * @param providerName
     *        The identity provider name.
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The identity provider name.
     * </p>
     * 
     * @return The identity provider name.
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * <p>
     * The identity provider name.
     * </p>
     * 
     * @param providerName
     *        The identity provider name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentityProviderRequest withProviderName(String providerName) {
        setProviderName(providerName);
        return this;
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * 
     * @param providerType
     *        The identity provider type.
     * @see IdentityProviderTypeType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * 
     * @return The identity provider type.
     * @see IdentityProviderTypeType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * 
     * @param providerType
     *        The identity provider type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderTypeType
     */

    public CreateIdentityProviderRequest withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * 
     * @param providerType
     *        The identity provider type.
     * @see IdentityProviderTypeType
     */

    public void setProviderType(IdentityProviderTypeType providerType) {
        withProviderType(providerType);
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * 
     * @param providerType
     *        The identity provider type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderTypeType
     */

    public CreateIdentityProviderRequest withProviderType(IdentityProviderTypeType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The identity provider details. The following list describes the provider detail keys for each identity provider
     * type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Google, Facebook and Login with Amazon:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Sign in with Apple:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * team_id
     * </p>
     * </li>
     * <li>
     * <p>
     * key_id
     * </p>
     * </li>
     * <li>
     * <p>
     * private_key
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For OIDC providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_request_method
     * </p>
     * </li>
     * <li>
     * <p>
     * oidc_issuer
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * token_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * jwks_uri <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For SAML providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MetadataFile OR MetadataURL
     * </p>
     * </li>
     * <li>
     * <p>
     * IDPSignOut <i>optional</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The identity provider details. The following list describes the provider detail keys for each identity
     *         provider type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For Google, Facebook and Login with Amazon:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         client_id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         client_secret
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         authorize_scopes
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For Sign in with Apple:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         client_id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         team_id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         key_id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         private_key
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         authorize_scopes
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For OIDC providers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         client_id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         client_secret
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         attributes_request_method
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         oidc_issuer
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         authorize_scopes
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         authorize_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         token_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         attributes_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         jwks_uri <i>if not available from discovery URL specified by oidc_issuer key</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         authorize_scopes
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For SAML providers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         MetadataFile OR MetadataURL
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IDPSignOut <i>optional</i>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public java.util.Map<String, String> getProviderDetails() {
        return providerDetails;
    }

    /**
     * <p>
     * The identity provider details. The following list describes the provider detail keys for each identity provider
     * type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Google, Facebook and Login with Amazon:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Sign in with Apple:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * team_id
     * </p>
     * </li>
     * <li>
     * <p>
     * key_id
     * </p>
     * </li>
     * <li>
     * <p>
     * private_key
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For OIDC providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_request_method
     * </p>
     * </li>
     * <li>
     * <p>
     * oidc_issuer
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * token_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * jwks_uri <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For SAML providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MetadataFile OR MetadataURL
     * </p>
     * </li>
     * <li>
     * <p>
     * IDPSignOut <i>optional</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param providerDetails
     *        The identity provider details. The following list describes the provider detail keys for each identity
     *        provider type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For Google, Facebook and Login with Amazon:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        client_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        client_secret
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        authorize_scopes
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For Sign in with Apple:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        client_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        team_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        key_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        private_key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        authorize_scopes
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For OIDC providers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        client_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        client_secret
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        attributes_request_method
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        oidc_issuer
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        authorize_scopes
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        authorize_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        token_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        attributes_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        jwks_uri <i>if not available from discovery URL specified by oidc_issuer key</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        authorize_scopes
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For SAML providers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        MetadataFile OR MetadataURL
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IDPSignOut <i>optional</i>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setProviderDetails(java.util.Map<String, String> providerDetails) {
        this.providerDetails = providerDetails;
    }

    /**
     * <p>
     * The identity provider details. The following list describes the provider detail keys for each identity provider
     * type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Google, Facebook and Login with Amazon:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Sign in with Apple:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * team_id
     * </p>
     * </li>
     * <li>
     * <p>
     * key_id
     * </p>
     * </li>
     * <li>
     * <p>
     * private_key
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For OIDC providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_request_method
     * </p>
     * </li>
     * <li>
     * <p>
     * oidc_issuer
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * token_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * jwks_uri <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For SAML providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MetadataFile OR MetadataURL
     * </p>
     * </li>
     * <li>
     * <p>
     * IDPSignOut <i>optional</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param providerDetails
     *        The identity provider details. The following list describes the provider detail keys for each identity
     *        provider type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For Google, Facebook and Login with Amazon:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        client_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        client_secret
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        authorize_scopes
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For Sign in with Apple:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        client_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        team_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        key_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        private_key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        authorize_scopes
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For OIDC providers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        client_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        client_secret
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        attributes_request_method
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        oidc_issuer
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        authorize_scopes
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        authorize_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        token_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        attributes_url <i>if not available from discovery URL specified by oidc_issuer key</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        jwks_uri <i>if not available from discovery URL specified by oidc_issuer key</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        authorize_scopes
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For SAML providers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        MetadataFile OR MetadataURL
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IDPSignOut <i>optional</i>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentityProviderRequest withProviderDetails(java.util.Map<String, String> providerDetails) {
        setProviderDetails(providerDetails);
        return this;
    }

    public CreateIdentityProviderRequest addProviderDetailsEntry(String key, String value) {
        if (null == this.providerDetails) {
            this.providerDetails = new java.util.HashMap<String, String>();
        }
        if (this.providerDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.providerDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ProviderDetails.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentityProviderRequest clearProviderDetailsEntries() {
        this.providerDetails = null;
        return this;
    }

    /**
     * <p>
     * A mapping of identity provider attributes to standard and custom user pool attributes.
     * </p>
     * 
     * @return A mapping of identity provider attributes to standard and custom user pool attributes.
     */

    public java.util.Map<String, String> getAttributeMapping() {
        return attributeMapping;
    }

    /**
     * <p>
     * A mapping of identity provider attributes to standard and custom user pool attributes.
     * </p>
     * 
     * @param attributeMapping
     *        A mapping of identity provider attributes to standard and custom user pool attributes.
     */

    public void setAttributeMapping(java.util.Map<String, String> attributeMapping) {
        this.attributeMapping = attributeMapping;
    }

    /**
     * <p>
     * A mapping of identity provider attributes to standard and custom user pool attributes.
     * </p>
     * 
     * @param attributeMapping
     *        A mapping of identity provider attributes to standard and custom user pool attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentityProviderRequest withAttributeMapping(java.util.Map<String, String> attributeMapping) {
        setAttributeMapping(attributeMapping);
        return this;
    }

    public CreateIdentityProviderRequest addAttributeMappingEntry(String key, String value) {
        if (null == this.attributeMapping) {
            this.attributeMapping = new java.util.HashMap<String, String>();
        }
        if (this.attributeMapping.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributeMapping.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AttributeMapping.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentityProviderRequest clearAttributeMappingEntries() {
        this.attributeMapping = null;
        return this;
    }

    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     * 
     * @return A list of identity provider identifiers.
     */

    public java.util.List<String> getIdpIdentifiers() {
        return idpIdentifiers;
    }

    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     * 
     * @param idpIdentifiers
     *        A list of identity provider identifiers.
     */

    public void setIdpIdentifiers(java.util.Collection<String> idpIdentifiers) {
        if (idpIdentifiers == null) {
            this.idpIdentifiers = null;
            return;
        }

        this.idpIdentifiers = new java.util.ArrayList<String>(idpIdentifiers);
    }

    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdpIdentifiers(java.util.Collection)} or {@link #withIdpIdentifiers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param idpIdentifiers
     *        A list of identity provider identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentityProviderRequest withIdpIdentifiers(String... idpIdentifiers) {
        if (this.idpIdentifiers == null) {
            setIdpIdentifiers(new java.util.ArrayList<String>(idpIdentifiers.length));
        }
        for (String ele : idpIdentifiers) {
            this.idpIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     * 
     * @param idpIdentifiers
     *        A list of identity provider identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentityProviderRequest withIdpIdentifiers(java.util.Collection<String> idpIdentifiers) {
        setIdpIdentifiers(idpIdentifiers);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getProviderName() != null)
            sb.append("ProviderName: ").append(getProviderName()).append(",");
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
        if (getProviderDetails() != null)
            sb.append("ProviderDetails: ").append(getProviderDetails()).append(",");
        if (getAttributeMapping() != null)
            sb.append("AttributeMapping: ").append(getAttributeMapping()).append(",");
        if (getIdpIdentifiers() != null)
            sb.append("IdpIdentifiers: ").append(getIdpIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIdentityProviderRequest == false)
            return false;
        CreateIdentityProviderRequest other = (CreateIdentityProviderRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false)
            return false;
        if (other.getProviderDetails() == null ^ this.getProviderDetails() == null)
            return false;
        if (other.getProviderDetails() != null && other.getProviderDetails().equals(this.getProviderDetails()) == false)
            return false;
        if (other.getAttributeMapping() == null ^ this.getAttributeMapping() == null)
            return false;
        if (other.getAttributeMapping() != null && other.getAttributeMapping().equals(this.getAttributeMapping()) == false)
            return false;
        if (other.getIdpIdentifiers() == null ^ this.getIdpIdentifiers() == null)
            return false;
        if (other.getIdpIdentifiers() != null && other.getIdpIdentifiers().equals(this.getIdpIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getProviderDetails() == null) ? 0 : getProviderDetails().hashCode());
        hashCode = prime * hashCode + ((getAttributeMapping() == null) ? 0 : getAttributeMapping().hashCode());
        hashCode = prime * hashCode + ((getIdpIdentifiers() == null) ? 0 : getIdpIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public CreateIdentityProviderRequest clone() {
        return (CreateIdentityProviderRequest) super.clone();
    }

}
