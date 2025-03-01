// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ecd20200930.models.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<ActivateOfficeSiteResponse> activateOfficeSite(ActivateOfficeSiteRequest request);

    CompletableFuture<AddUserToDesktopGroupResponse> addUserToDesktopGroup(AddUserToDesktopGroupRequest request);

    CompletableFuture<AddUserToSecurityCenterWhiteListResponse> addUserToSecurityCenterWhiteList(AddUserToSecurityCenterWhiteListRequest request);

    CompletableFuture<AttachCenResponse> attachCen(AttachCenRequest request);

    CompletableFuture<CheckUserInSecurityCenterWhiteListResponse> checkUserInSecurityCenterWhiteList(CheckUserInSecurityCenterWhiteListRequest request);

    CompletableFuture<CheckUserTagsResponse> checkUserTags(CheckUserTagsRequest request);

    CompletableFuture<ClonePolicyGroupResponse> clonePolicyGroup(ClonePolicyGroupRequest request);

    CompletableFuture<ConfigADConnectorTrustResponse> configADConnectorTrust(ConfigADConnectorTrustRequest request);

    CompletableFuture<ConfigADConnectorUserResponse> configADConnectorUser(ConfigADConnectorUserRequest request);

    CompletableFuture<CreateADConnectorDirectoryResponse> createADConnectorDirectory(CreateADConnectorDirectoryRequest request);

    CompletableFuture<CreateADConnectorOfficeSiteResponse> createADConnectorOfficeSite(CreateADConnectorOfficeSiteRequest request);

    CompletableFuture<CreateBandwidthResourcePackagesResponse> createBandwidthResourcePackages(CreateBandwidthResourcePackagesRequest request);

    CompletableFuture<CreateBundleResponse> createBundle(CreateBundleRequest request);

    CompletableFuture<CreateCloudDriveServiceResponse> createCloudDriveService(CreateCloudDriveServiceRequest request);

    CompletableFuture<CreateDesktopGroupResponse> createDesktopGroup(CreateDesktopGroupRequest request);

    CompletableFuture<CreateDesktopsResponse> createDesktops(CreateDesktopsRequest request);

    CompletableFuture<CreateDesktopsLiteResponse> createDesktopsLite(CreateDesktopsLiteRequest request);

    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

    CompletableFuture<CreateNASFileSystemResponse> createNASFileSystem(CreateNASFileSystemRequest request);

    CompletableFuture<CreateNetworkPackageResponse> createNetworkPackage(CreateNetworkPackageRequest request);

    CompletableFuture<CreateOrderForHardwareResponse> createOrderForHardware(CreateOrderForHardwareRequest request);

    CompletableFuture<CreatePolicyGroupResponse> createPolicyGroup(CreatePolicyGroupRequest request);

    CompletableFuture<CreateRAMDirectoryResponse> createRAMDirectory(CreateRAMDirectoryRequest request);

    CompletableFuture<CreateScaleStrategyResponse> createScaleStrategy(CreateScaleStrategyRequest request);

    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    CompletableFuture<CreateSimpleOfficeSiteResponse> createSimpleOfficeSite(CreateSimpleOfficeSiteRequest request);

    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    CompletableFuture<DeleteBundlesResponse> deleteBundles(DeleteBundlesRequest request);

    CompletableFuture<DeleteCloudDriveServicesResponse> deleteCloudDriveServices(DeleteCloudDriveServicesRequest request);

    CompletableFuture<DeleteDesktopGroupResponse> deleteDesktopGroup(DeleteDesktopGroupRequest request);

    CompletableFuture<DeleteDesktopsResponse> deleteDesktops(DeleteDesktopsRequest request);

    CompletableFuture<DeleteDirectoriesResponse> deleteDirectories(DeleteDirectoriesRequest request);

    CompletableFuture<DeleteImagesResponse> deleteImages(DeleteImagesRequest request);

    CompletableFuture<DeleteNASFileSystemsResponse> deleteNASFileSystems(DeleteNASFileSystemsRequest request);

    CompletableFuture<DeleteNetworkPackagesResponse> deleteNetworkPackages(DeleteNetworkPackagesRequest request);

    CompletableFuture<DeleteOfficeSitesResponse> deleteOfficeSites(DeleteOfficeSitesRequest request);

    CompletableFuture<DeletePolicyGroupsResponse> deletePolicyGroups(DeletePolicyGroupsRequest request);

    CompletableFuture<DeleteScaleStrategyResponse> deleteScaleStrategy(DeleteScaleStrategyRequest request);

    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    CompletableFuture<DeleteVirtualMFADeviceResponse> deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request);

    CompletableFuture<DescribeAlarmEventStackInfoResponse> describeAlarmEventStackInfo(DescribeAlarmEventStackInfoRequest request);

    CompletableFuture<DescribeBundlesResponse> describeBundles(DescribeBundlesRequest request);

    CompletableFuture<DescribeCensResponse> describeCens(DescribeCensRequest request);

    CompletableFuture<DescribeClientEventsResponse> describeClientEvents(DescribeClientEventsRequest request);

    CompletableFuture<DescribeCloudDriveServiceResponse> describeCloudDriveService(DescribeCloudDriveServiceRequest request);

    CompletableFuture<DescribeDesktopGroupsResponse> describeDesktopGroups(DescribeDesktopGroupsRequest request);

    CompletableFuture<DescribeDesktopIdsByVulNamesResponse> describeDesktopIdsByVulNames(DescribeDesktopIdsByVulNamesRequest request);

    CompletableFuture<DescribeDesktopPolicysResponse> describeDesktopPolicys(DescribeDesktopPolicysRequest request);

    CompletableFuture<DescribeDesktopTypesResponse> describeDesktopTypes(DescribeDesktopTypesRequest request);

    CompletableFuture<DescribeDesktopsResponse> describeDesktops(DescribeDesktopsRequest request);

    CompletableFuture<DescribeDesktopsInGroupResponse> describeDesktopsInGroup(DescribeDesktopsInGroupRequest request);

    CompletableFuture<DescribeDirectoriesResponse> describeDirectories(DescribeDirectoriesRequest request);

    CompletableFuture<DescribeFlowMetricResponse> describeFlowMetric(DescribeFlowMetricRequest request);

    CompletableFuture<DescribeFrontVulPatchListResponse> describeFrontVulPatchList(DescribeFrontVulPatchListRequest request);

    CompletableFuture<DescribeGroupedVulResponse> describeGroupedVul(DescribeGroupedVulRequest request);

    CompletableFuture<DescribeHardwareTerminalsResponse> describeHardwareTerminals(DescribeHardwareTerminalsRequest request);

    CompletableFuture<DescribeImagesResponse> describeImages(DescribeImagesRequest request);

    CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request);

    CompletableFuture<DescribeModificationPriceResponse> describeModificationPrice(DescribeModificationPriceRequest request);

    CompletableFuture<DescribeNASFileSystemsResponse> describeNASFileSystems(DescribeNASFileSystemsRequest request);

    CompletableFuture<DescribeNetworkPackagesResponse> describeNetworkPackages(DescribeNetworkPackagesRequest request);

    CompletableFuture<DescribeOfficeSitesResponse> describeOfficeSites(DescribeOfficeSitesRequest request);

    CompletableFuture<DescribePolicyGroupsResponse> describePolicyGroups(DescribePolicyGroupsRequest request);

    CompletableFuture<DescribePostPaidDesktopBillsResponse> describePostPaidDesktopBills(DescribePostPaidDesktopBillsRequest request);

    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeRenewalPriceResponse> describeRenewalPrice(DescribeRenewalPriceRequest request);

    CompletableFuture<DescribeResourcePackageQuotaResponse> describeResourcePackageQuota(DescribeResourcePackageQuotaRequest request);

    CompletableFuture<DescribeScaleStrategysResponse> describeScaleStrategys(DescribeScaleStrategysRequest request);

    CompletableFuture<DescribeScanTaskProgressResponse> describeScanTaskProgress(DescribeScanTaskProgressRequest request);

    CompletableFuture<DescribeSecurityEventOperationStatusResponse> describeSecurityEventOperationStatus(DescribeSecurityEventOperationStatusRequest request);

    CompletableFuture<DescribeSecurityEventOperationsResponse> describeSecurityEventOperations(DescribeSecurityEventOperationsRequest request);

    CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request);

    CompletableFuture<DescribeSuspEventOverviewResponse> describeSuspEventOverview(DescribeSuspEventOverviewRequest request);

    CompletableFuture<DescribeSuspEventQuaraFilesResponse> describeSuspEventQuaraFiles(DescribeSuspEventQuaraFilesRequest request);

    CompletableFuture<DescribeSuspEventsResponse> describeSuspEvents(DescribeSuspEventsRequest request);

    CompletableFuture<DescribeUserConnectionRecordsResponse> describeUserConnectionRecords(DescribeUserConnectionRecordsRequest request);

    CompletableFuture<DescribeUsersInGroupResponse> describeUsersInGroup(DescribeUsersInGroupRequest request);

    CompletableFuture<DescribeVirtualMFADevicesResponse> describeVirtualMFADevices(DescribeVirtualMFADevicesRequest request);

    CompletableFuture<DescribeVulDetailsResponse> describeVulDetails(DescribeVulDetailsRequest request);

    CompletableFuture<DescribeVulListResponse> describeVulList(DescribeVulListRequest request);

    CompletableFuture<DescribeVulOverviewResponse> describeVulOverview(DescribeVulOverviewRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<DetachCenResponse> detachCen(DetachCenRequest request);

    CompletableFuture<DoCheckResourceResponse> doCheckResource(DoCheckResourceRequest request);

    CompletableFuture<DoLogicalDeleteResourceResponse> doLogicalDeleteResource(DoLogicalDeleteResourceRequest request);

    CompletableFuture<DoPhysicalDeleteResourceResponse> doPhysicalDeleteResource(DoPhysicalDeleteResourceRequest request);

    CompletableFuture<ExportClientEventsResponse> exportClientEvents(ExportClientEventsRequest request);

    CompletableFuture<ExportDesktopGroupInfoResponse> exportDesktopGroupInfo(ExportDesktopGroupInfoRequest request);

    CompletableFuture<ExportDesktopListInfoResponse> exportDesktopListInfo(ExportDesktopListInfoRequest request);

    CompletableFuture<GetConnectionTicketResponse> getConnectionTicket(GetConnectionTicketRequest request);

    CompletableFuture<GetDesktopGroupDetailResponse> getDesktopGroupDetail(GetDesktopGroupDetailRequest request);

    CompletableFuture<GetDirectorySsoStatusResponse> getDirectorySsoStatus(GetDirectorySsoStatusRequest request);

    CompletableFuture<GetOfficeSiteSsoStatusResponse> getOfficeSiteSsoStatus(GetOfficeSiteSsoStatusRequest request);

    CompletableFuture<GetSpMetadataResponse> getSpMetadata(GetSpMetadataRequest request);

    CompletableFuture<HandleSecurityEventsResponse> handleSecurityEvents(HandleSecurityEventsRequest request);

    CompletableFuture<ListDirectoryUsersResponse> listDirectoryUsers(ListDirectoryUsersRequest request);

    CompletableFuture<ListOfficeSiteOverviewResponse> listOfficeSiteOverview(ListOfficeSiteOverviewRequest request);

    CompletableFuture<ListOfficeSiteUsersResponse> listOfficeSiteUsers(ListOfficeSiteUsersRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListUserAdOrganizationUnitsResponse> listUserAdOrganizationUnits(ListUserAdOrganizationUnitsRequest request);

    CompletableFuture<LockVirtualMFADeviceResponse> lockVirtualMFADevice(LockVirtualMFADeviceRequest request);

    CompletableFuture<ModifyADConnectorDirectoryResponse> modifyADConnectorDirectory(ModifyADConnectorDirectoryRequest request);

    CompletableFuture<ModifyADConnectorOfficeSiteResponse> modifyADConnectorOfficeSite(ModifyADConnectorOfficeSiteRequest request);

    CompletableFuture<ModifyBundleResponse> modifyBundle(ModifyBundleRequest request);

    CompletableFuture<ModifyCloudDriveServiceResponse> modifyCloudDriveService(ModifyCloudDriveServiceRequest request);

    CompletableFuture<ModifyDesktopChargeTypeResponse> modifyDesktopChargeType(ModifyDesktopChargeTypeRequest request);

    CompletableFuture<ModifyDesktopGroupResponse> modifyDesktopGroup(ModifyDesktopGroupRequest request);

    CompletableFuture<ModifyDesktopHostNameResponse> modifyDesktopHostName(ModifyDesktopHostNameRequest request);

    CompletableFuture<ModifyDesktopNameResponse> modifyDesktopName(ModifyDesktopNameRequest request);

    CompletableFuture<ModifyDesktopPolicysResponse> modifyDesktopPolicys(ModifyDesktopPolicysRequest request);

    CompletableFuture<ModifyDesktopSpecResponse> modifyDesktopSpec(ModifyDesktopSpecRequest request);

    CompletableFuture<ModifyDesktopsPolicyGroupResponse> modifyDesktopsPolicyGroup(ModifyDesktopsPolicyGroupRequest request);

    CompletableFuture<ModifyEntitlementResponse> modifyEntitlement(ModifyEntitlementRequest request);

    CompletableFuture<ModifyImageAttributeResponse> modifyImageAttribute(ModifyImageAttributeRequest request);

    CompletableFuture<ModifyNASDefaultMountTargetResponse> modifyNASDefaultMountTarget(ModifyNASDefaultMountTargetRequest request);

    CompletableFuture<ModifyNetworkPackageResponse> modifyNetworkPackage(ModifyNetworkPackageRequest request);

    CompletableFuture<ModifyNetworkPackageBandwidthResponse> modifyNetworkPackageBandwidth(ModifyNetworkPackageBandwidthRequest request);

    CompletableFuture<ModifyNetworkPackageEnabledResponse> modifyNetworkPackageEnabled(ModifyNetworkPackageEnabledRequest request);

    CompletableFuture<ModifyOfficeSiteAttributeResponse> modifyOfficeSiteAttribute(ModifyOfficeSiteAttributeRequest request);

    CompletableFuture<ModifyOfficeSiteCrossDesktopAccessResponse> modifyOfficeSiteCrossDesktopAccess(ModifyOfficeSiteCrossDesktopAccessRequest request);

    CompletableFuture<ModifyOfficeSiteMfaEnabledResponse> modifyOfficeSiteMfaEnabled(ModifyOfficeSiteMfaEnabledRequest request);

    CompletableFuture<ModifyOperateVulResponse> modifyOperateVul(ModifyOperateVulRequest request);

    CompletableFuture<ModifyPolicyGroupResponse> modifyPolicyGroup(ModifyPolicyGroupRequest request);

    CompletableFuture<ModifyScaleStrategyResponse> modifyScaleStrategy(ModifyScaleStrategyRequest request);

    CompletableFuture<ModifyUserEntitlementResponse> modifyUserEntitlement(ModifyUserEntitlementRequest request);

    CompletableFuture<ModifyUserToDesktopGroupResponse> modifyUserToDesktopGroup(ModifyUserToDesktopGroupRequest request);

    CompletableFuture<OperateVulsResponse> operateVuls(OperateVulsRequest request);

    CompletableFuture<PayOrderCallbackResponse> payOrderCallback(PayOrderCallbackRequest request);

    CompletableFuture<RebootDesktopsResponse> rebootDesktops(RebootDesktopsRequest request);

    CompletableFuture<RebuildDesktopsResponse> rebuildDesktops(RebuildDesktopsRequest request);

    CompletableFuture<RecreateDesktopGroupResponse> recreateDesktopGroup(RecreateDesktopGroupRequest request);

    CompletableFuture<RemoveUserFromDesktopGroupResponse> removeUserFromDesktopGroup(RemoveUserFromDesktopGroupRequest request);

    CompletableFuture<RenewDesktopGroupResponse> renewDesktopGroup(RenewDesktopGroupRequest request);

    CompletableFuture<RenewDesktopsResponse> renewDesktops(RenewDesktopsRequest request);

    CompletableFuture<RenewNetworkPackagesResponse> renewNetworkPackages(RenewNetworkPackagesRequest request);

    CompletableFuture<ResetNASDefaultMountTargetResponse> resetNASDefaultMountTarget(ResetNASDefaultMountTargetRequest request);

    CompletableFuture<ResetSnapshotResponse> resetSnapshot(ResetSnapshotRequest request);

    CompletableFuture<RollbackSuspEventQuaraFileResponse> rollbackSuspEventQuaraFile(RollbackSuspEventQuaraFileRequest request);

    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    CompletableFuture<SendVerifyCodeResponse> sendVerifyCode(SendVerifyCodeRequest request);

    CompletableFuture<SetDirectorySsoStatusResponse> setDirectorySsoStatus(SetDirectorySsoStatusRequest request);

    CompletableFuture<SetIdpMetadataResponse> setIdpMetadata(SetIdpMetadataRequest request);

    CompletableFuture<SetOfficeSiteSsoStatusResponse> setOfficeSiteSsoStatus(SetOfficeSiteSsoStatusRequest request);

    CompletableFuture<StartDesktopsResponse> startDesktops(StartDesktopsRequest request);

    CompletableFuture<StartVirusScanTaskResponse> startVirusScanTask(StartVirusScanTaskRequest request);

    CompletableFuture<StopDesktopsResponse> stopDesktops(StopDesktopsRequest request);

    CompletableFuture<StopInvocationResponse> stopInvocation(StopInvocationRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnlockVirtualMFADeviceResponse> unlockVirtualMFADevice(UnlockVirtualMFADeviceRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<VerifyCenResponse> verifyCen(VerifyCenRequest request);

}
