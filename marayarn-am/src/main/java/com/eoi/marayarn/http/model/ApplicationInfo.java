package com.eoi.marayarn.http.model;

import com.eoi.marayarn.ApplicationMasterArguments;

import java.util.List;

public class ApplicationInfo {
    public String applicationId;
    public long startTime;
    public String trackingUrl;
    public String logUrl;
    public ApplicationMasterArguments arguments;
    public int numRunningExecutors;
    public int numTotalExecutors;
    public int numAllocatedExecutors;
    public int numPendingExecutors;
    public List<ContainerInfo> containers;
    public List<ContainerInfo> completedContainers;
}
