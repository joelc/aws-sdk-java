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
package com.amazonaws.services.health.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.health.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.*;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EnableHealthServiceAccessForOrganizationRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EnableHealthServiceAccessForOrganizationRequestProtocolMarshaller implements
        Marshaller<Request<EnableHealthServiceAccessForOrganizationRequest>, EnableHealthServiceAccessForOrganizationRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.AWS_JSON).requestUri("/")
            .httpMethodName(HttpMethodName.POST).hasExplicitPayloadMember(false).hasPayloadMembers(false)
            .operationIdentifier("AWSHealth_20160804.EnableHealthServiceAccessForOrganization").serviceName("AWSHealth").build();

    private final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory;

    public EnableHealthServiceAccessForOrganizationRequestProtocolMarshaller(com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<EnableHealthServiceAccessForOrganizationRequest> marshall(
            EnableHealthServiceAccessForOrganizationRequest enableHealthServiceAccessForOrganizationRequest) {

        if (enableHealthServiceAccessForOrganizationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<EnableHealthServiceAccessForOrganizationRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(
                    SDK_OPERATION_BINDING, enableHealthServiceAccessForOrganizationRequest);

            protocolMarshaller.startMarshalling();
            EnableHealthServiceAccessForOrganizationRequestMarshaller.getInstance().marshall(enableHealthServiceAccessForOrganizationRequest,
                    protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
