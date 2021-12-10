// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteVpcHoneyPotRequest} extends {@link RequestModel}
 *
 * <p>DeleteVpcHoneyPotRequest</p>
 */
public class DeleteVpcHoneyPotRequest extends Request {
    @Query
    @NameInMap("VpcId")
    private String vpcId;


    private DeleteVpcHoneyPotRequest(Builder builder) {
        super(builder);
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVpcHoneyPotRequest create() {
        return builder().build();
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder {
        private String vpcId; 

        /**
         * <p>VpcId.</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        public DeleteVpcHoneyPotRequest build() {
            return new DeleteVpcHoneyPotRequest(this);
        } 

    } 

}