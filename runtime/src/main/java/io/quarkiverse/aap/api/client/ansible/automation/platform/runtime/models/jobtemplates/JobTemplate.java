package io.quarkiverse.aap.api.client.ansible.automation.platform.runtime.models.jobtemplates;

import java.time.LocalDateTime;

public class JobTemplate {

    /**
     * Database ID for this job template. (integer)
     */
    public Integer id;
    /**
     * Data type for this job template. (choice)
     */
    public String type;
    /**
     * URL for this job template. (string)
     */
    public String url;
    /**
     * Data structure with URLs of related resources. (object)
     */
    public Object related;
    /**
     * Data structure with name/description for related resources. The output for
     * some objects may be limited for performance reasons. (object)
     */
    public Object summaryFields;
    /**
     * Timestamp when this job template was created. (datetime)
     */
    public LocalDateTime created;
    /**
     * Timestamp when this job template was last modified. (datetime)
     */
    public LocalDateTime modified;
    /**
     * Name of this job template. (string)
     */
    public String name;
    /**
     * Optional description of this job template. (string)
     */
    public String description;
    /**
     * (choice)
     */
    public String jobType;
    /**
     *
     */
    public Integer inventory;
    /**
     *
     */
    public Integer project;
    /**
     *
     */
    public String playbook;
    /**
     * Branch to use in job run. Project default used if blank. Only allowed if project allow_override field is set to true.
     * (string)
     */
    public String scmBranch;
    /**
     *
     */
    public Integer forks;
    /**
     *
     */
    public String limit;
    /**
     * : 0 (Normal)
     * 1: 1 (Verbose)
     * 2: 2 (More Verbose)
     * 3: 3 (Debug)
     * 4: 4 (Connection Debug)
     * 5: 5 (WinRM Debug)
     */
    public Integer verbosity;
    /**
     *
     */
    public Object extraVars;
    /**
     *
     */
    public String jobTags;
    /**
     *
     */
    public Boolean forceHandlers;
    /**
     *
     */
    public String skipTags;
    /**
     *
     */
    public String startAtTask;
    /**
     * The amount of time (in seconds) to run before the task is canceled. (integer)
     */
    public Integer timeout;
    /**
     * If enabled, the service will act as an Ansible Fact Cache Plugin; persisting facts at the
     * end of a playbook run to the database and caching facts for use by Ansible. (boolean)
     */
    public Boolean useFastCache;
    /**
     * The organization used to determine access to this template. (id)
     */
    public Integer organization;
    public LocalDateTime lastJobRun;
    public Boolean lastJobFailed;
    public LocalDateTime nextJobRun;
    /**
     * new: New
     * pending: Pending
     * waiting: Waiting
     * running: Running
     * successful: Successful
     * failed: Failed
     * error: Error
     * canceled: Canceled
     * never updated: Never Updated
     */
    public String status;

}
