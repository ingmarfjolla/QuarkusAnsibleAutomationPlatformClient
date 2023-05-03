package org.openapi.quarkus.swagger_json.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SettingsSettingsLoggingTestCreateRequest  {

    private Boolean ACTIVITY_STREAM_ENABLED;
    private Boolean ACTIVITY_STREAM_ENABLED_FOR_INVENTORY_SYNC;
    private List<String> AD_HOC_COMMANDS = null;
    private String ALLOW_JINJA_IN_EXTRA_VARS;
    private Boolean ALLOW_METRICS_FOR_ANONYMOUS_USERS;
    private Boolean ALLOW_OAUTH2_FOR_EXTERNAL_USERS;
    private Integer ANSIBLE_FACT_CACHE_TIMEOUT;
    private String API_400_ERROR_LOG_FORMAT;
    private Boolean AUTH_BASIC_ENABLED;
    private String AUTH_LDAP_1_BIND_DN;
    private String AUTH_LDAP_1_BIND_PASSWORD;
    private Object AUTH_LDAP_1_CONNECTION_OPTIONS;
    private String AUTH_LDAP_1_DENY_GROUP;
    private List<String> AUTH_LDAP_1_GROUP_SEARCH = null;
    private String AUTH_LDAP_1_GROUP_TYPE;
    private Object AUTH_LDAP_1_GROUP_TYPE_PARAMS;
    private Object AUTH_LDAP_1_ORGANIZATION_MAP;
    private String AUTH_LDAP_1_REQUIRE_GROUP;
    private String AUTH_LDAP_1_SERVER_URI;
    private Boolean AUTH_LDAP_1_START_TLS;
    private Object AUTH_LDAP_1_TEAM_MAP;
    private Object AUTH_LDAP_1_USER_ATTR_MAP;
    private String AUTH_LDAP_1_USER_DN_TEMPLATE;
    private Object AUTH_LDAP_1_USER_FLAGS_BY_GROUP;
    private List<String> AUTH_LDAP_1_USER_SEARCH = null;
    private String AUTH_LDAP_2_BIND_DN;
    private String AUTH_LDAP_2_BIND_PASSWORD;
    private Object AUTH_LDAP_2_CONNECTION_OPTIONS;
    private String AUTH_LDAP_2_DENY_GROUP;
    private List<String> AUTH_LDAP_2_GROUP_SEARCH = null;
    private String AUTH_LDAP_2_GROUP_TYPE;
    private Object AUTH_LDAP_2_GROUP_TYPE_PARAMS;
    private Object AUTH_LDAP_2_ORGANIZATION_MAP;
    private String AUTH_LDAP_2_REQUIRE_GROUP;
    private String AUTH_LDAP_2_SERVER_URI;
    private Boolean AUTH_LDAP_2_START_TLS;
    private Object AUTH_LDAP_2_TEAM_MAP;
    private Object AUTH_LDAP_2_USER_ATTR_MAP;
    private String AUTH_LDAP_2_USER_DN_TEMPLATE;
    private Object AUTH_LDAP_2_USER_FLAGS_BY_GROUP;
    private List<String> AUTH_LDAP_2_USER_SEARCH = null;
    private String AUTH_LDAP_3_BIND_DN;
    private String AUTH_LDAP_3_BIND_PASSWORD;
    private Object AUTH_LDAP_3_CONNECTION_OPTIONS;
    private String AUTH_LDAP_3_DENY_GROUP;
    private List<String> AUTH_LDAP_3_GROUP_SEARCH = null;
    private String AUTH_LDAP_3_GROUP_TYPE;
    private Object AUTH_LDAP_3_GROUP_TYPE_PARAMS;
    private Object AUTH_LDAP_3_ORGANIZATION_MAP;
    private String AUTH_LDAP_3_REQUIRE_GROUP;
    private String AUTH_LDAP_3_SERVER_URI;
    private Boolean AUTH_LDAP_3_START_TLS;
    private Object AUTH_LDAP_3_TEAM_MAP;
    private Object AUTH_LDAP_3_USER_ATTR_MAP;
    private String AUTH_LDAP_3_USER_DN_TEMPLATE;
    private Object AUTH_LDAP_3_USER_FLAGS_BY_GROUP;
    private List<String> AUTH_LDAP_3_USER_SEARCH = null;
    private String AUTH_LDAP_4_BIND_DN;
    private String AUTH_LDAP_4_BIND_PASSWORD;
    private Object AUTH_LDAP_4_CONNECTION_OPTIONS;
    private String AUTH_LDAP_4_DENY_GROUP;
    private List<String> AUTH_LDAP_4_GROUP_SEARCH = null;
    private String AUTH_LDAP_4_GROUP_TYPE;
    private Object AUTH_LDAP_4_GROUP_TYPE_PARAMS;
    private Object AUTH_LDAP_4_ORGANIZATION_MAP;
    private String AUTH_LDAP_4_REQUIRE_GROUP;
    private String AUTH_LDAP_4_SERVER_URI;
    private Boolean AUTH_LDAP_4_START_TLS;
    private Object AUTH_LDAP_4_TEAM_MAP;
    private Object AUTH_LDAP_4_USER_ATTR_MAP;
    private String AUTH_LDAP_4_USER_DN_TEMPLATE;
    private Object AUTH_LDAP_4_USER_FLAGS_BY_GROUP;
    private List<String> AUTH_LDAP_4_USER_SEARCH = null;
    private String AUTH_LDAP_5_BIND_DN;
    private String AUTH_LDAP_5_BIND_PASSWORD;
    private Object AUTH_LDAP_5_CONNECTION_OPTIONS;
    private String AUTH_LDAP_5_DENY_GROUP;
    private List<String> AUTH_LDAP_5_GROUP_SEARCH = null;
    private String AUTH_LDAP_5_GROUP_TYPE;
    private Object AUTH_LDAP_5_GROUP_TYPE_PARAMS;
    private Object AUTH_LDAP_5_ORGANIZATION_MAP;
    private String AUTH_LDAP_5_REQUIRE_GROUP;
    private String AUTH_LDAP_5_SERVER_URI;
    private Boolean AUTH_LDAP_5_START_TLS;
    private Object AUTH_LDAP_5_TEAM_MAP;
    private Object AUTH_LDAP_5_USER_ATTR_MAP;
    private String AUTH_LDAP_5_USER_DN_TEMPLATE;
    private Object AUTH_LDAP_5_USER_FLAGS_BY_GROUP;
    private List<String> AUTH_LDAP_5_USER_SEARCH = null;
    private String AUTH_LDAP_BIND_DN;
    private String AUTH_LDAP_BIND_PASSWORD;
    private Object AUTH_LDAP_CONNECTION_OPTIONS;
    private String AUTH_LDAP_DENY_GROUP;
    private List<String> AUTH_LDAP_GROUP_SEARCH = null;
    private String AUTH_LDAP_GROUP_TYPE;
    private Object AUTH_LDAP_GROUP_TYPE_PARAMS;
    private Object AUTH_LDAP_ORGANIZATION_MAP;
    private String AUTH_LDAP_REQUIRE_GROUP;
    private String AUTH_LDAP_SERVER_URI;
    private Boolean AUTH_LDAP_START_TLS;
    private Object AUTH_LDAP_TEAM_MAP;
    private Object AUTH_LDAP_USER_ATTR_MAP;
    private String AUTH_LDAP_USER_DN_TEMPLATE;
    private Object AUTH_LDAP_USER_FLAGS_BY_GROUP;
    private List<String> AUTH_LDAP_USER_SEARCH = null;
    private Integer AUTOMATION_ANALYTICS_GATHER_INTERVAL;
    private String AUTOMATION_ANALYTICS_LAST_ENTRIES;
    private String AUTOMATION_ANALYTICS_LAST_GATHER;
    private String AUTOMATION_ANALYTICS_URL;
    private List<String> AWX_ANSIBLE_CALLBACK_PLUGINS = null;
    private Boolean AWX_COLLECTIONS_ENABLED;
    private String AWX_ISOLATION_BASE_PATH;
    private List<String> AWX_ISOLATION_SHOW_PATHS = null;
    private Boolean AWX_MOUNT_ISOLATED_PATHS_ON_K8S;
    private Boolean AWX_ROLES_ENABLED;
    private Integer AWX_RUNNER_KEEPALIVE_SECONDS;
    private Boolean AWX_SHOW_PLAYBOOK_LINKS;
    private Object AWX_TASK_ENV;
    private Integer BULK_HOST_MAX_CREATE;
    private Integer BULK_JOB_MAX_LAUNCH;
    private String CLEANUP_HOST_METRICS_LAST_TS;
    private String CUSTOM_LOGIN_INFO;
    private String CUSTOM_LOGO;
    private List<String> CUSTOM_VENV_PATHS = null;
    private Integer DEFAULT_EXECUTION_ENVIRONMENT;
    private Integer DEFAULT_INVENTORY_UPDATE_TIMEOUT;
    private Integer DEFAULT_JOB_IDLE_TIMEOUT;
    private Integer DEFAULT_JOB_TIMEOUT;
    private Integer DEFAULT_PROJECT_UPDATE_TIMEOUT;
    private Boolean DISABLE_LOCAL_AUTH;
    private Integer EVENT_STDOUT_MAX_BYTES_DISPLAY;
    private Boolean GALAXY_IGNORE_CERTS;
    private Object GALAXY_TASK_ENV;
    private Boolean INSIGHTS_TRACKING_STATE;
    private Integer LOCAL_PASSWORD_MIN_DIGITS;
    private Integer LOCAL_PASSWORD_MIN_LENGTH;
    private Integer LOCAL_PASSWORD_MIN_SPECIAL;
    private Integer LOCAL_PASSWORD_MIN_UPPER;
    private String LOGIN_REDIRECT_OVERRIDE;
    private Boolean LOG_AGGREGATOR_ENABLED;
    private String LOG_AGGREGATOR_HOST;
    private Boolean LOG_AGGREGATOR_INDIVIDUAL_FACTS;
    private String LOG_AGGREGATOR_LEVEL;
    private List<String> LOG_AGGREGATOR_LOGGERS = null;
    private Integer LOG_AGGREGATOR_MAX_DISK_USAGE_GB;
    private String LOG_AGGREGATOR_MAX_DISK_USAGE_PATH;
    private String LOG_AGGREGATOR_PASSWORD;
    private Integer LOG_AGGREGATOR_PORT;
    private String LOG_AGGREGATOR_PROTOCOL;
    private Boolean LOG_AGGREGATOR_RSYSLOGD_DEBUG;
    private Integer LOG_AGGREGATOR_TCP_TIMEOUT;
    private String LOG_AGGREGATOR_TOWER_UUID;
    private String LOG_AGGREGATOR_TYPE;
    private String LOG_AGGREGATOR_USERNAME;
    private Boolean LOG_AGGREGATOR_VERIFY_CERT;
    private Boolean MANAGE_ORGANIZATION_AUTH;
    private Integer MAX_FORKS;
    private Integer MAX_UI_JOB_EVENTS;
    private Integer MAX_WEBSOCKET_EVENT_RATE;
    private Object OAUTH2_PROVIDER;
    private Boolean ORG_ADMINS_CAN_SEE_ALL_USERS;
    private Boolean PROJECT_UPDATE_VVV;
    private List<String> PROXY_IP_ALLOWED_LIST = new ArrayList<>();
    private Integer RADIUS_PORT;
    private String RADIUS_SECRET;
    private String RADIUS_SERVER;
    private String REDHAT_PASSWORD;
    private String REDHAT_USERNAME;
    private List<String> REMOTE_HOST_HEADERS = new ArrayList<>();
    private Boolean SAML_AUTO_CREATE_OBJECTS;
    private Integer SCHEDULE_MAX_JOBS;
    private Integer SESSIONS_PER_USER;
    private Integer SESSION_COOKIE_AGE;
    private String SOCIAL_AUTH_AZUREAD_OAUTH2_KEY;
    private Object SOCIAL_AUTH_AZUREAD_OAUTH2_ORGANIZATION_MAP;
    private String SOCIAL_AUTH_AZUREAD_OAUTH2_SECRET;
    private Object SOCIAL_AUTH_AZUREAD_OAUTH2_TEAM_MAP;
    private String SOCIAL_AUTH_GITHUB_ENTERPRISE_API_URL;
    private String SOCIAL_AUTH_GITHUB_ENTERPRISE_KEY;
    private Object SOCIAL_AUTH_GITHUB_ENTERPRISE_ORGANIZATION_MAP;
    private String SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_API_URL;
    private String SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_KEY;
    private String SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_NAME;
    private Object SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_ORGANIZATION_MAP;
    private String SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_SECRET;
    private Object SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_TEAM_MAP;
    private String SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_URL;
    private String SOCIAL_AUTH_GITHUB_ENTERPRISE_SECRET;
    private String SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_API_URL;
    private String SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ID;
    private String SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_KEY;
    private Object SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_MAP;
    private Object SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ORGANIZATION_MAP;
    private String SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_SECRET;
    private Object SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_TEAM_MAP;
    private String SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_URL;
    private String SOCIAL_AUTH_GITHUB_ENTERPRISE_URL;
    private String SOCIAL_AUTH_GITHUB_KEY;
    private Object SOCIAL_AUTH_GITHUB_ORGANIZATION_MAP;
    private String SOCIAL_AUTH_GITHUB_ORG_KEY;
    private String SOCIAL_AUTH_GITHUB_ORG_NAME;
    private Object SOCIAL_AUTH_GITHUB_ORG_ORGANIZATION_MAP;
    private String SOCIAL_AUTH_GITHUB_ORG_SECRET;
    private Object SOCIAL_AUTH_GITHUB_ORG_TEAM_MAP;
    private String SOCIAL_AUTH_GITHUB_SECRET;
    private String SOCIAL_AUTH_GITHUB_TEAM_ID;
    private String SOCIAL_AUTH_GITHUB_TEAM_KEY;
    private Object SOCIAL_AUTH_GITHUB_TEAM_MAP;
    private Object SOCIAL_AUTH_GITHUB_TEAM_ORGANIZATION_MAP;
    private String SOCIAL_AUTH_GITHUB_TEAM_SECRET;
    private Object SOCIAL_AUTH_GITHUB_TEAM_TEAM_MAP;
    private Object SOCIAL_AUTH_GOOGLE_OAUTH2_AUTH_EXTRA_ARGUMENTS;
    private String SOCIAL_AUTH_GOOGLE_OAUTH2_KEY;
    private Object SOCIAL_AUTH_GOOGLE_OAUTH2_ORGANIZATION_MAP;
    private String SOCIAL_AUTH_GOOGLE_OAUTH2_SECRET;
    private Object SOCIAL_AUTH_GOOGLE_OAUTH2_TEAM_MAP;
    private List<String> SOCIAL_AUTH_GOOGLE_OAUTH2_WHITELISTED_DOMAINS = null;
    private String SOCIAL_AUTH_OIDC_KEY;
    private String SOCIAL_AUTH_OIDC_OIDC_ENDPOINT;
    private String SOCIAL_AUTH_OIDC_SECRET;
    private Boolean SOCIAL_AUTH_OIDC_VERIFY_SSL;
    private Object SOCIAL_AUTH_ORGANIZATION_MAP;
    private Object SOCIAL_AUTH_SAML_ENABLED_IDPS;
    private List<String> SOCIAL_AUTH_SAML_EXTRA_DATA = null;
    private Object SOCIAL_AUTH_SAML_ORGANIZATION_ATTR;
    private Object SOCIAL_AUTH_SAML_ORGANIZATION_MAP;
    private Object SOCIAL_AUTH_SAML_ORG_INFO;
    private Object SOCIAL_AUTH_SAML_SECURITY_CONFIG;
    private String SOCIAL_AUTH_SAML_SP_ENTITY_ID;
    private Object SOCIAL_AUTH_SAML_SP_EXTRA;
    private String SOCIAL_AUTH_SAML_SP_PRIVATE_KEY;
    private String SOCIAL_AUTH_SAML_SP_PUBLIC_CERT;
    private Object SOCIAL_AUTH_SAML_SUPPORT_CONTACT;
    private Object SOCIAL_AUTH_SAML_TEAM_ATTR;
    private Object SOCIAL_AUTH_SAML_TEAM_MAP;
    private Object SOCIAL_AUTH_SAML_TECHNICAL_CONTACT;
    private Object SOCIAL_AUTH_SAML_USER_FLAGS_BY_ATTR;
    private Object SOCIAL_AUTH_TEAM_MAP;
    private Boolean SOCIAL_AUTH_USERNAME_IS_FULL_EMAIL;
    private List<String> SOCIAL_AUTH_USER_FIELDS = null;
    private Integer STDOUT_MAX_BYTES_DISPLAY;
    private String SUBSCRIPTIONS_PASSWORD;
    private String SUBSCRIPTIONS_USERNAME;
    private String SUBSCRIPTION_USAGE_MODEL;
    private String TACACSPLUS_AUTH_PROTOCOL;
    private String TACACSPLUS_HOST;
    private Integer TACACSPLUS_PORT;
    private String TACACSPLUS_SECRET;
    private Integer TACACSPLUS_SESSION_TIMEOUT;
    private String TOWER_URL_BASE;
    private Boolean UI_LIVE_UPDATES_ENABLED;
    private Boolean UI_NEXT;

    /**
    * Enable capturing activity for the activity stream.
    * @return ACTIVITY_STREAM_ENABLED
    **/
    @JsonProperty("ACTIVITY_STREAM_ENABLED")
    public Boolean getACTIVITYSTREAMENABLED() {
        return ACTIVITY_STREAM_ENABLED;
    }

    /**
     * Set ACTIVITY_STREAM_ENABLED
     **/
    public void setACTIVITYSTREAMENABLED(Boolean ACTIVITY_STREAM_ENABLED) {
        this.ACTIVITY_STREAM_ENABLED = ACTIVITY_STREAM_ENABLED;
    }

    public SettingsSettingsLoggingTestCreateRequest ACTIVITY_STREAM_ENABLED(Boolean ACTIVITY_STREAM_ENABLED) {
        this.ACTIVITY_STREAM_ENABLED = ACTIVITY_STREAM_ENABLED;
        return this;
    }

    /**
    * Enable capturing activity for the activity stream when running inventory sync.
    * @return ACTIVITY_STREAM_ENABLED_FOR_INVENTORY_SYNC
    **/
    @JsonProperty("ACTIVITY_STREAM_ENABLED_FOR_INVENTORY_SYNC")
    public Boolean getACTIVITYSTREAMENABLEDFORINVENTORYSYNC() {
        return ACTIVITY_STREAM_ENABLED_FOR_INVENTORY_SYNC;
    }

    /**
     * Set ACTIVITY_STREAM_ENABLED_FOR_INVENTORY_SYNC
     **/
    public void setACTIVITYSTREAMENABLEDFORINVENTORYSYNC(Boolean ACTIVITY_STREAM_ENABLED_FOR_INVENTORY_SYNC) {
        this.ACTIVITY_STREAM_ENABLED_FOR_INVENTORY_SYNC = ACTIVITY_STREAM_ENABLED_FOR_INVENTORY_SYNC;
    }

    public SettingsSettingsLoggingTestCreateRequest ACTIVITY_STREAM_ENABLED_FOR_INVENTORY_SYNC(Boolean ACTIVITY_STREAM_ENABLED_FOR_INVENTORY_SYNC) {
        this.ACTIVITY_STREAM_ENABLED_FOR_INVENTORY_SYNC = ACTIVITY_STREAM_ENABLED_FOR_INVENTORY_SYNC;
        return this;
    }

    /**
    * List of modules allowed to be used by ad-hoc jobs.
    * @return AD_HOC_COMMANDS
    **/
    @JsonProperty("AD_HOC_COMMANDS")
    public List<String> getADHOCCOMMANDS() {
        return AD_HOC_COMMANDS;
    }

    /**
     * Set AD_HOC_COMMANDS
     **/
    public void setADHOCCOMMANDS(List<String> AD_HOC_COMMANDS) {
        this.AD_HOC_COMMANDS = AD_HOC_COMMANDS;
    }

    public SettingsSettingsLoggingTestCreateRequest AD_HOC_COMMANDS(List<String> AD_HOC_COMMANDS) {
        this.AD_HOC_COMMANDS = AD_HOC_COMMANDS;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addADHOCCOMMANDSItem(String AD_HOC_COMMANDSItem) {
        this.AD_HOC_COMMANDS.add(AD_HOC_COMMANDSItem);
        return this;
    }

    /**
    * Ansible allows variable substitution via the Jinja2 templating language for --extra-vars. This poses a potential security risk where users with the ability to specify extra vars at job launch time can use Jinja2 templates to run arbitrary Python.  It is recommended that this value be set to \"template\" or \"never\".
    * @return ALLOW_JINJA_IN_EXTRA_VARS
    **/
    @JsonProperty("ALLOW_JINJA_IN_EXTRA_VARS")
    public String getALLOWJINJAINEXTRAVARS() {
        return ALLOW_JINJA_IN_EXTRA_VARS;
    }

    /**
     * Set ALLOW_JINJA_IN_EXTRA_VARS
     **/
    public void setALLOWJINJAINEXTRAVARS(String ALLOW_JINJA_IN_EXTRA_VARS) {
        this.ALLOW_JINJA_IN_EXTRA_VARS = ALLOW_JINJA_IN_EXTRA_VARS;
    }

    public SettingsSettingsLoggingTestCreateRequest ALLOW_JINJA_IN_EXTRA_VARS(String ALLOW_JINJA_IN_EXTRA_VARS) {
        this.ALLOW_JINJA_IN_EXTRA_VARS = ALLOW_JINJA_IN_EXTRA_VARS;
        return this;
    }

    /**
    * If true, anonymous users are allowed to poll metrics.
    * @return ALLOW_METRICS_FOR_ANONYMOUS_USERS
    **/
    @JsonProperty("ALLOW_METRICS_FOR_ANONYMOUS_USERS")
    public Boolean getALLOWMETRICSFORANONYMOUSUSERS() {
        return ALLOW_METRICS_FOR_ANONYMOUS_USERS;
    }

    /**
     * Set ALLOW_METRICS_FOR_ANONYMOUS_USERS
     **/
    public void setALLOWMETRICSFORANONYMOUSUSERS(Boolean ALLOW_METRICS_FOR_ANONYMOUS_USERS) {
        this.ALLOW_METRICS_FOR_ANONYMOUS_USERS = ALLOW_METRICS_FOR_ANONYMOUS_USERS;
    }

    public SettingsSettingsLoggingTestCreateRequest ALLOW_METRICS_FOR_ANONYMOUS_USERS(Boolean ALLOW_METRICS_FOR_ANONYMOUS_USERS) {
        this.ALLOW_METRICS_FOR_ANONYMOUS_USERS = ALLOW_METRICS_FOR_ANONYMOUS_USERS;
        return this;
    }

    /**
    * For security reasons, users from external auth providers (LDAP, SAML, SSO, Radius, and others) are not allowed to create OAuth2 tokens. To change this behavior, enable this setting. Existing tokens will not be deleted when this setting is toggled off.
    * @return ALLOW_OAUTH2_FOR_EXTERNAL_USERS
    **/
    @JsonProperty("ALLOW_OAUTH2_FOR_EXTERNAL_USERS")
    public Boolean getALLOWOAUTH2FOREXTERNALUSERS() {
        return ALLOW_OAUTH2_FOR_EXTERNAL_USERS;
    }

    /**
     * Set ALLOW_OAUTH2_FOR_EXTERNAL_USERS
     **/
    public void setALLOWOAUTH2FOREXTERNALUSERS(Boolean ALLOW_OAUTH2_FOR_EXTERNAL_USERS) {
        this.ALLOW_OAUTH2_FOR_EXTERNAL_USERS = ALLOW_OAUTH2_FOR_EXTERNAL_USERS;
    }

    public SettingsSettingsLoggingTestCreateRequest ALLOW_OAUTH2_FOR_EXTERNAL_USERS(Boolean ALLOW_OAUTH2_FOR_EXTERNAL_USERS) {
        this.ALLOW_OAUTH2_FOR_EXTERNAL_USERS = ALLOW_OAUTH2_FOR_EXTERNAL_USERS;
        return this;
    }

    /**
    * Maximum time, in seconds, that stored Ansible facts are considered valid since the last time they were modified. Only valid, non-stale, facts will be accessible by a playbook. Note, this does not influence the deletion of ansible_facts from the database. Use a value of 0 to indicate that no timeout should be imposed.
    * @return ANSIBLE_FACT_CACHE_TIMEOUT
    **/
    @JsonProperty("ANSIBLE_FACT_CACHE_TIMEOUT")
    public Integer getANSIBLEFACTCACHETIMEOUT() {
        return ANSIBLE_FACT_CACHE_TIMEOUT;
    }

    /**
     * Set ANSIBLE_FACT_CACHE_TIMEOUT
     **/
    public void setANSIBLEFACTCACHETIMEOUT(Integer ANSIBLE_FACT_CACHE_TIMEOUT) {
        this.ANSIBLE_FACT_CACHE_TIMEOUT = ANSIBLE_FACT_CACHE_TIMEOUT;
    }

    public SettingsSettingsLoggingTestCreateRequest ANSIBLE_FACT_CACHE_TIMEOUT(Integer ANSIBLE_FACT_CACHE_TIMEOUT) {
        this.ANSIBLE_FACT_CACHE_TIMEOUT = ANSIBLE_FACT_CACHE_TIMEOUT;
        return this;
    }

    /**
    * The format of logged messages when an API 4XX error occurs, the following variables will be substituted:  status_code - The HTTP status code of the error user_name - The user name attempting to use the API url_path - The URL path to the API endpoint called remote_addr - The remote address seen for the user error - The error set by the api endpoint Variables need to be in the format {<variable name>}.
    * @return API_400_ERROR_LOG_FORMAT
    **/
    @JsonProperty("API_400_ERROR_LOG_FORMAT")
    public String getAPI400ERRORLOGFORMAT() {
        return API_400_ERROR_LOG_FORMAT;
    }

    /**
     * Set API_400_ERROR_LOG_FORMAT
     **/
    public void setAPI400ERRORLOGFORMAT(String API_400_ERROR_LOG_FORMAT) {
        this.API_400_ERROR_LOG_FORMAT = API_400_ERROR_LOG_FORMAT;
    }

    public SettingsSettingsLoggingTestCreateRequest API_400_ERROR_LOG_FORMAT(String API_400_ERROR_LOG_FORMAT) {
        this.API_400_ERROR_LOG_FORMAT = API_400_ERROR_LOG_FORMAT;
        return this;
    }

    /**
    * Enable HTTP Basic Auth for the API Browser.
    * @return AUTH_BASIC_ENABLED
    **/
    @JsonProperty("AUTH_BASIC_ENABLED")
    public Boolean getAUTHBASICENABLED() {
        return AUTH_BASIC_ENABLED;
    }

    /**
     * Set AUTH_BASIC_ENABLED
     **/
    public void setAUTHBASICENABLED(Boolean AUTH_BASIC_ENABLED) {
        this.AUTH_BASIC_ENABLED = AUTH_BASIC_ENABLED;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_BASIC_ENABLED(Boolean AUTH_BASIC_ENABLED) {
        this.AUTH_BASIC_ENABLED = AUTH_BASIC_ENABLED;
        return this;
    }

    /**
    * DN (Distinguished Name) of user to bind for all search queries. This is the system user account we will use to login to query LDAP for other user information. Refer to the documentation for example syntax.
    * @return AUTH_LDAP_1_BIND_DN
    **/
    @JsonProperty("AUTH_LDAP_1_BIND_DN")
    public String getAUTHLDAP1BINDDN() {
        return AUTH_LDAP_1_BIND_DN;
    }

    /**
     * Set AUTH_LDAP_1_BIND_DN
     **/
    public void setAUTHLDAP1BINDDN(String AUTH_LDAP_1_BIND_DN) {
        this.AUTH_LDAP_1_BIND_DN = AUTH_LDAP_1_BIND_DN;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_1_BIND_DN(String AUTH_LDAP_1_BIND_DN) {
        this.AUTH_LDAP_1_BIND_DN = AUTH_LDAP_1_BIND_DN;
        return this;
    }

    /**
    * Password used to bind LDAP user account.
    * @return AUTH_LDAP_1_BIND_PASSWORD
    **/
    @JsonProperty("AUTH_LDAP_1_BIND_PASSWORD")
    public String getAUTHLDAP1BINDPASSWORD() {
        return AUTH_LDAP_1_BIND_PASSWORD;
    }

    /**
     * Set AUTH_LDAP_1_BIND_PASSWORD
     **/
    public void setAUTHLDAP1BINDPASSWORD(String AUTH_LDAP_1_BIND_PASSWORD) {
        this.AUTH_LDAP_1_BIND_PASSWORD = AUTH_LDAP_1_BIND_PASSWORD;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_1_BIND_PASSWORD(String AUTH_LDAP_1_BIND_PASSWORD) {
        this.AUTH_LDAP_1_BIND_PASSWORD = AUTH_LDAP_1_BIND_PASSWORD;
        return this;
    }

    /**
    * Additional options to set for the LDAP connection.  LDAP referrals are disabled by default (to prevent certain LDAP queries from hanging with AD). Option names should be strings (e.g. \"OPT_REFERRALS\"). Refer to https://www.python-ldap.org/doc/html/ldap.html#options for possible options and values that can be set.
    * @return AUTH_LDAP_1_CONNECTION_OPTIONS
    **/
    @JsonProperty("AUTH_LDAP_1_CONNECTION_OPTIONS")
    public Object getAUTHLDAP1CONNECTIONOPTIONS() {
        return AUTH_LDAP_1_CONNECTION_OPTIONS;
    }

    /**
     * Set AUTH_LDAP_1_CONNECTION_OPTIONS
     **/
    public void setAUTHLDAP1CONNECTIONOPTIONS(Object AUTH_LDAP_1_CONNECTION_OPTIONS) {
        this.AUTH_LDAP_1_CONNECTION_OPTIONS = AUTH_LDAP_1_CONNECTION_OPTIONS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_1_CONNECTION_OPTIONS(Object AUTH_LDAP_1_CONNECTION_OPTIONS) {
        this.AUTH_LDAP_1_CONNECTION_OPTIONS = AUTH_LDAP_1_CONNECTION_OPTIONS;
        return this;
    }

    /**
    * Group DN denied from login. If specified, user will not be allowed to login if a member of this group.  Only one deny group is supported.
    * @return AUTH_LDAP_1_DENY_GROUP
    **/
    @JsonProperty("AUTH_LDAP_1_DENY_GROUP")
    public String getAUTHLDAP1DENYGROUP() {
        return AUTH_LDAP_1_DENY_GROUP;
    }

    /**
     * Set AUTH_LDAP_1_DENY_GROUP
     **/
    public void setAUTHLDAP1DENYGROUP(String AUTH_LDAP_1_DENY_GROUP) {
        this.AUTH_LDAP_1_DENY_GROUP = AUTH_LDAP_1_DENY_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_1_DENY_GROUP(String AUTH_LDAP_1_DENY_GROUP) {
        this.AUTH_LDAP_1_DENY_GROUP = AUTH_LDAP_1_DENY_GROUP;
        return this;
    }

    /**
    * Users are mapped to organizations based on their membership in LDAP groups. This setting defines the LDAP search query to find groups. Unlike the user search, group search does not support LDAPSearchUnion.
    * @return AUTH_LDAP_1_GROUP_SEARCH
    **/
    @JsonProperty("AUTH_LDAP_1_GROUP_SEARCH")
    public List<String> getAUTHLDAP1GROUPSEARCH() {
        return AUTH_LDAP_1_GROUP_SEARCH;
    }

    /**
     * Set AUTH_LDAP_1_GROUP_SEARCH
     **/
    public void setAUTHLDAP1GROUPSEARCH(List<String> AUTH_LDAP_1_GROUP_SEARCH) {
        this.AUTH_LDAP_1_GROUP_SEARCH = AUTH_LDAP_1_GROUP_SEARCH;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_1_GROUP_SEARCH(List<String> AUTH_LDAP_1_GROUP_SEARCH) {
        this.AUTH_LDAP_1_GROUP_SEARCH = AUTH_LDAP_1_GROUP_SEARCH;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addAUTHLDAP1GROUPSEARCHItem(String AUTH_LDAP_1_GROUP_SEARCHItem) {
        this.AUTH_LDAP_1_GROUP_SEARCH.add(AUTH_LDAP_1_GROUP_SEARCHItem);
        return this;
    }

    /**
    * The group type may need to be changed based on the type of the LDAP server.  Values are listed at: https://django-auth-ldap.readthedocs.io/en/stable/groups.html#types-of-groups
    * @return AUTH_LDAP_1_GROUP_TYPE
    **/
    @JsonProperty("AUTH_LDAP_1_GROUP_TYPE")
    public String getAUTHLDAP1GROUPTYPE() {
        return AUTH_LDAP_1_GROUP_TYPE;
    }

    /**
     * Set AUTH_LDAP_1_GROUP_TYPE
     **/
    public void setAUTHLDAP1GROUPTYPE(String AUTH_LDAP_1_GROUP_TYPE) {
        this.AUTH_LDAP_1_GROUP_TYPE = AUTH_LDAP_1_GROUP_TYPE;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_1_GROUP_TYPE(String AUTH_LDAP_1_GROUP_TYPE) {
        this.AUTH_LDAP_1_GROUP_TYPE = AUTH_LDAP_1_GROUP_TYPE;
        return this;
    }

    /**
    * Key value parameters to send the chosen group type init method.
    * @return AUTH_LDAP_1_GROUP_TYPE_PARAMS
    **/
    @JsonProperty("AUTH_LDAP_1_GROUP_TYPE_PARAMS")
    public Object getAUTHLDAP1GROUPTYPEPARAMS() {
        return AUTH_LDAP_1_GROUP_TYPE_PARAMS;
    }

    /**
     * Set AUTH_LDAP_1_GROUP_TYPE_PARAMS
     **/
    public void setAUTHLDAP1GROUPTYPEPARAMS(Object AUTH_LDAP_1_GROUP_TYPE_PARAMS) {
        this.AUTH_LDAP_1_GROUP_TYPE_PARAMS = AUTH_LDAP_1_GROUP_TYPE_PARAMS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_1_GROUP_TYPE_PARAMS(Object AUTH_LDAP_1_GROUP_TYPE_PARAMS) {
        this.AUTH_LDAP_1_GROUP_TYPE_PARAMS = AUTH_LDAP_1_GROUP_TYPE_PARAMS;
        return this;
    }

    /**
    * Mapping between organization admins/users and LDAP groups. This controls which users are placed into which organizations relative to their LDAP group memberships. Configuration details are available in the documentation.
    * @return AUTH_LDAP_1_ORGANIZATION_MAP
    **/
    @JsonProperty("AUTH_LDAP_1_ORGANIZATION_MAP")
    public Object getAUTHLDAP1ORGANIZATIONMAP() {
        return AUTH_LDAP_1_ORGANIZATION_MAP;
    }

    /**
     * Set AUTH_LDAP_1_ORGANIZATION_MAP
     **/
    public void setAUTHLDAP1ORGANIZATIONMAP(Object AUTH_LDAP_1_ORGANIZATION_MAP) {
        this.AUTH_LDAP_1_ORGANIZATION_MAP = AUTH_LDAP_1_ORGANIZATION_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_1_ORGANIZATION_MAP(Object AUTH_LDAP_1_ORGANIZATION_MAP) {
        this.AUTH_LDAP_1_ORGANIZATION_MAP = AUTH_LDAP_1_ORGANIZATION_MAP;
        return this;
    }

    /**
    * Group DN required to login. If specified, user must be a member of this group to login via LDAP. If not set, everyone in LDAP that matches the user search will be able to login to the service. Only one require group is supported.
    * @return AUTH_LDAP_1_REQUIRE_GROUP
    **/
    @JsonProperty("AUTH_LDAP_1_REQUIRE_GROUP")
    public String getAUTHLDAP1REQUIREGROUP() {
        return AUTH_LDAP_1_REQUIRE_GROUP;
    }

    /**
     * Set AUTH_LDAP_1_REQUIRE_GROUP
     **/
    public void setAUTHLDAP1REQUIREGROUP(String AUTH_LDAP_1_REQUIRE_GROUP) {
        this.AUTH_LDAP_1_REQUIRE_GROUP = AUTH_LDAP_1_REQUIRE_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_1_REQUIRE_GROUP(String AUTH_LDAP_1_REQUIRE_GROUP) {
        this.AUTH_LDAP_1_REQUIRE_GROUP = AUTH_LDAP_1_REQUIRE_GROUP;
        return this;
    }

    /**
    * URI to connect to LDAP server, such as \"ldap://ldap.example.com:389\" (non-SSL) or \"ldaps://ldap.example.com:636\" (SSL). Multiple LDAP servers may be specified by separating with spaces or commas. LDAP authentication is disabled if this parameter is empty.
    * @return AUTH_LDAP_1_SERVER_URI
    **/
    @JsonProperty("AUTH_LDAP_1_SERVER_URI")
    public String getAUTHLDAP1SERVERURI() {
        return AUTH_LDAP_1_SERVER_URI;
    }

    /**
     * Set AUTH_LDAP_1_SERVER_URI
     **/
    public void setAUTHLDAP1SERVERURI(String AUTH_LDAP_1_SERVER_URI) {
        this.AUTH_LDAP_1_SERVER_URI = AUTH_LDAP_1_SERVER_URI;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_1_SERVER_URI(String AUTH_LDAP_1_SERVER_URI) {
        this.AUTH_LDAP_1_SERVER_URI = AUTH_LDAP_1_SERVER_URI;
        return this;
    }

    /**
    * Whether to enable TLS when the LDAP connection is not using SSL.
    * @return AUTH_LDAP_1_START_TLS
    **/
    @JsonProperty("AUTH_LDAP_1_START_TLS")
    public Boolean getAUTHLDAP1STARTTLS() {
        return AUTH_LDAP_1_START_TLS;
    }

    /**
     * Set AUTH_LDAP_1_START_TLS
     **/
    public void setAUTHLDAP1STARTTLS(Boolean AUTH_LDAP_1_START_TLS) {
        this.AUTH_LDAP_1_START_TLS = AUTH_LDAP_1_START_TLS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_1_START_TLS(Boolean AUTH_LDAP_1_START_TLS) {
        this.AUTH_LDAP_1_START_TLS = AUTH_LDAP_1_START_TLS;
        return this;
    }

    /**
    * Mapping between team members (users) and LDAP groups. Configuration details are available in the documentation.
    * @return AUTH_LDAP_1_TEAM_MAP
    **/
    @JsonProperty("AUTH_LDAP_1_TEAM_MAP")
    public Object getAUTHLDAP1TEAMMAP() {
        return AUTH_LDAP_1_TEAM_MAP;
    }

    /**
     * Set AUTH_LDAP_1_TEAM_MAP
     **/
    public void setAUTHLDAP1TEAMMAP(Object AUTH_LDAP_1_TEAM_MAP) {
        this.AUTH_LDAP_1_TEAM_MAP = AUTH_LDAP_1_TEAM_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_1_TEAM_MAP(Object AUTH_LDAP_1_TEAM_MAP) {
        this.AUTH_LDAP_1_TEAM_MAP = AUTH_LDAP_1_TEAM_MAP;
        return this;
    }

    /**
    * Mapping of LDAP user schema to API user attributes. The default setting is valid for ActiveDirectory but users with other LDAP configurations may need to change the values. Refer to the documentation for additional details.
    * @return AUTH_LDAP_1_USER_ATTR_MAP
    **/
    @JsonProperty("AUTH_LDAP_1_USER_ATTR_MAP")
    public Object getAUTHLDAP1USERATTRMAP() {
        return AUTH_LDAP_1_USER_ATTR_MAP;
    }

    /**
     * Set AUTH_LDAP_1_USER_ATTR_MAP
     **/
    public void setAUTHLDAP1USERATTRMAP(Object AUTH_LDAP_1_USER_ATTR_MAP) {
        this.AUTH_LDAP_1_USER_ATTR_MAP = AUTH_LDAP_1_USER_ATTR_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_1_USER_ATTR_MAP(Object AUTH_LDAP_1_USER_ATTR_MAP) {
        this.AUTH_LDAP_1_USER_ATTR_MAP = AUTH_LDAP_1_USER_ATTR_MAP;
        return this;
    }

    /**
    * Alternative to user search, if user DNs are all of the same format. This approach is more efficient for user lookups than searching if it is usable in your organizational environment. If this setting has a value it will be used instead of AUTH_LDAP_USER_SEARCH.
    * @return AUTH_LDAP_1_USER_DN_TEMPLATE
    **/
    @JsonProperty("AUTH_LDAP_1_USER_DN_TEMPLATE")
    public String getAUTHLDAP1USERDNTEMPLATE() {
        return AUTH_LDAP_1_USER_DN_TEMPLATE;
    }

    /**
     * Set AUTH_LDAP_1_USER_DN_TEMPLATE
     **/
    public void setAUTHLDAP1USERDNTEMPLATE(String AUTH_LDAP_1_USER_DN_TEMPLATE) {
        this.AUTH_LDAP_1_USER_DN_TEMPLATE = AUTH_LDAP_1_USER_DN_TEMPLATE;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_1_USER_DN_TEMPLATE(String AUTH_LDAP_1_USER_DN_TEMPLATE) {
        this.AUTH_LDAP_1_USER_DN_TEMPLATE = AUTH_LDAP_1_USER_DN_TEMPLATE;
        return this;
    }

    /**
    * Retrieve users from a given group. At this time, superuser and system auditors are the only groups supported. Refer to the documentation for more detail.
    * @return AUTH_LDAP_1_USER_FLAGS_BY_GROUP
    **/
    @JsonProperty("AUTH_LDAP_1_USER_FLAGS_BY_GROUP")
    public Object getAUTHLDAP1USERFLAGSBYGROUP() {
        return AUTH_LDAP_1_USER_FLAGS_BY_GROUP;
    }

    /**
     * Set AUTH_LDAP_1_USER_FLAGS_BY_GROUP
     **/
    public void setAUTHLDAP1USERFLAGSBYGROUP(Object AUTH_LDAP_1_USER_FLAGS_BY_GROUP) {
        this.AUTH_LDAP_1_USER_FLAGS_BY_GROUP = AUTH_LDAP_1_USER_FLAGS_BY_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_1_USER_FLAGS_BY_GROUP(Object AUTH_LDAP_1_USER_FLAGS_BY_GROUP) {
        this.AUTH_LDAP_1_USER_FLAGS_BY_GROUP = AUTH_LDAP_1_USER_FLAGS_BY_GROUP;
        return this;
    }

    /**
    * LDAP search query to find users.  Any user that matches the given pattern will be able to login to the service.  The user should also be mapped into an organization (as defined in the AUTH_LDAP_ORGANIZATION_MAP setting).  If multiple search queries need to be supported use of \"LDAPUnion\" is possible. See the documentation for details.
    * @return AUTH_LDAP_1_USER_SEARCH
    **/
    @JsonProperty("AUTH_LDAP_1_USER_SEARCH")
    public List<String> getAUTHLDAP1USERSEARCH() {
        return AUTH_LDAP_1_USER_SEARCH;
    }

    /**
     * Set AUTH_LDAP_1_USER_SEARCH
     **/
    public void setAUTHLDAP1USERSEARCH(List<String> AUTH_LDAP_1_USER_SEARCH) {
        this.AUTH_LDAP_1_USER_SEARCH = AUTH_LDAP_1_USER_SEARCH;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_1_USER_SEARCH(List<String> AUTH_LDAP_1_USER_SEARCH) {
        this.AUTH_LDAP_1_USER_SEARCH = AUTH_LDAP_1_USER_SEARCH;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addAUTHLDAP1USERSEARCHItem(String AUTH_LDAP_1_USER_SEARCHItem) {
        this.AUTH_LDAP_1_USER_SEARCH.add(AUTH_LDAP_1_USER_SEARCHItem);
        return this;
    }

    /**
    * DN (Distinguished Name) of user to bind for all search queries. This is the system user account we will use to login to query LDAP for other user information. Refer to the documentation for example syntax.
    * @return AUTH_LDAP_2_BIND_DN
    **/
    @JsonProperty("AUTH_LDAP_2_BIND_DN")
    public String getAUTHLDAP2BINDDN() {
        return AUTH_LDAP_2_BIND_DN;
    }

    /**
     * Set AUTH_LDAP_2_BIND_DN
     **/
    public void setAUTHLDAP2BINDDN(String AUTH_LDAP_2_BIND_DN) {
        this.AUTH_LDAP_2_BIND_DN = AUTH_LDAP_2_BIND_DN;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_2_BIND_DN(String AUTH_LDAP_2_BIND_DN) {
        this.AUTH_LDAP_2_BIND_DN = AUTH_LDAP_2_BIND_DN;
        return this;
    }

    /**
    * Password used to bind LDAP user account.
    * @return AUTH_LDAP_2_BIND_PASSWORD
    **/
    @JsonProperty("AUTH_LDAP_2_BIND_PASSWORD")
    public String getAUTHLDAP2BINDPASSWORD() {
        return AUTH_LDAP_2_BIND_PASSWORD;
    }

    /**
     * Set AUTH_LDAP_2_BIND_PASSWORD
     **/
    public void setAUTHLDAP2BINDPASSWORD(String AUTH_LDAP_2_BIND_PASSWORD) {
        this.AUTH_LDAP_2_BIND_PASSWORD = AUTH_LDAP_2_BIND_PASSWORD;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_2_BIND_PASSWORD(String AUTH_LDAP_2_BIND_PASSWORD) {
        this.AUTH_LDAP_2_BIND_PASSWORD = AUTH_LDAP_2_BIND_PASSWORD;
        return this;
    }

    /**
    * Additional options to set for the LDAP connection.  LDAP referrals are disabled by default (to prevent certain LDAP queries from hanging with AD). Option names should be strings (e.g. \"OPT_REFERRALS\"). Refer to https://www.python-ldap.org/doc/html/ldap.html#options for possible options and values that can be set.
    * @return AUTH_LDAP_2_CONNECTION_OPTIONS
    **/
    @JsonProperty("AUTH_LDAP_2_CONNECTION_OPTIONS")
    public Object getAUTHLDAP2CONNECTIONOPTIONS() {
        return AUTH_LDAP_2_CONNECTION_OPTIONS;
    }

    /**
     * Set AUTH_LDAP_2_CONNECTION_OPTIONS
     **/
    public void setAUTHLDAP2CONNECTIONOPTIONS(Object AUTH_LDAP_2_CONNECTION_OPTIONS) {
        this.AUTH_LDAP_2_CONNECTION_OPTIONS = AUTH_LDAP_2_CONNECTION_OPTIONS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_2_CONNECTION_OPTIONS(Object AUTH_LDAP_2_CONNECTION_OPTIONS) {
        this.AUTH_LDAP_2_CONNECTION_OPTIONS = AUTH_LDAP_2_CONNECTION_OPTIONS;
        return this;
    }

    /**
    * Group DN denied from login. If specified, user will not be allowed to login if a member of this group.  Only one deny group is supported.
    * @return AUTH_LDAP_2_DENY_GROUP
    **/
    @JsonProperty("AUTH_LDAP_2_DENY_GROUP")
    public String getAUTHLDAP2DENYGROUP() {
        return AUTH_LDAP_2_DENY_GROUP;
    }

    /**
     * Set AUTH_LDAP_2_DENY_GROUP
     **/
    public void setAUTHLDAP2DENYGROUP(String AUTH_LDAP_2_DENY_GROUP) {
        this.AUTH_LDAP_2_DENY_GROUP = AUTH_LDAP_2_DENY_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_2_DENY_GROUP(String AUTH_LDAP_2_DENY_GROUP) {
        this.AUTH_LDAP_2_DENY_GROUP = AUTH_LDAP_2_DENY_GROUP;
        return this;
    }

    /**
    * Users are mapped to organizations based on their membership in LDAP groups. This setting defines the LDAP search query to find groups. Unlike the user search, group search does not support LDAPSearchUnion.
    * @return AUTH_LDAP_2_GROUP_SEARCH
    **/
    @JsonProperty("AUTH_LDAP_2_GROUP_SEARCH")
    public List<String> getAUTHLDAP2GROUPSEARCH() {
        return AUTH_LDAP_2_GROUP_SEARCH;
    }

    /**
     * Set AUTH_LDAP_2_GROUP_SEARCH
     **/
    public void setAUTHLDAP2GROUPSEARCH(List<String> AUTH_LDAP_2_GROUP_SEARCH) {
        this.AUTH_LDAP_2_GROUP_SEARCH = AUTH_LDAP_2_GROUP_SEARCH;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_2_GROUP_SEARCH(List<String> AUTH_LDAP_2_GROUP_SEARCH) {
        this.AUTH_LDAP_2_GROUP_SEARCH = AUTH_LDAP_2_GROUP_SEARCH;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addAUTHLDAP2GROUPSEARCHItem(String AUTH_LDAP_2_GROUP_SEARCHItem) {
        this.AUTH_LDAP_2_GROUP_SEARCH.add(AUTH_LDAP_2_GROUP_SEARCHItem);
        return this;
    }

    /**
    * The group type may need to be changed based on the type of the LDAP server.  Values are listed at: https://django-auth-ldap.readthedocs.io/en/stable/groups.html#types-of-groups
    * @return AUTH_LDAP_2_GROUP_TYPE
    **/
    @JsonProperty("AUTH_LDAP_2_GROUP_TYPE")
    public String getAUTHLDAP2GROUPTYPE() {
        return AUTH_LDAP_2_GROUP_TYPE;
    }

    /**
     * Set AUTH_LDAP_2_GROUP_TYPE
     **/
    public void setAUTHLDAP2GROUPTYPE(String AUTH_LDAP_2_GROUP_TYPE) {
        this.AUTH_LDAP_2_GROUP_TYPE = AUTH_LDAP_2_GROUP_TYPE;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_2_GROUP_TYPE(String AUTH_LDAP_2_GROUP_TYPE) {
        this.AUTH_LDAP_2_GROUP_TYPE = AUTH_LDAP_2_GROUP_TYPE;
        return this;
    }

    /**
    * Key value parameters to send the chosen group type init method.
    * @return AUTH_LDAP_2_GROUP_TYPE_PARAMS
    **/
    @JsonProperty("AUTH_LDAP_2_GROUP_TYPE_PARAMS")
    public Object getAUTHLDAP2GROUPTYPEPARAMS() {
        return AUTH_LDAP_2_GROUP_TYPE_PARAMS;
    }

    /**
     * Set AUTH_LDAP_2_GROUP_TYPE_PARAMS
     **/
    public void setAUTHLDAP2GROUPTYPEPARAMS(Object AUTH_LDAP_2_GROUP_TYPE_PARAMS) {
        this.AUTH_LDAP_2_GROUP_TYPE_PARAMS = AUTH_LDAP_2_GROUP_TYPE_PARAMS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_2_GROUP_TYPE_PARAMS(Object AUTH_LDAP_2_GROUP_TYPE_PARAMS) {
        this.AUTH_LDAP_2_GROUP_TYPE_PARAMS = AUTH_LDAP_2_GROUP_TYPE_PARAMS;
        return this;
    }

    /**
    * Mapping between organization admins/users and LDAP groups. This controls which users are placed into which organizations relative to their LDAP group memberships. Configuration details are available in the documentation.
    * @return AUTH_LDAP_2_ORGANIZATION_MAP
    **/
    @JsonProperty("AUTH_LDAP_2_ORGANIZATION_MAP")
    public Object getAUTHLDAP2ORGANIZATIONMAP() {
        return AUTH_LDAP_2_ORGANIZATION_MAP;
    }

    /**
     * Set AUTH_LDAP_2_ORGANIZATION_MAP
     **/
    public void setAUTHLDAP2ORGANIZATIONMAP(Object AUTH_LDAP_2_ORGANIZATION_MAP) {
        this.AUTH_LDAP_2_ORGANIZATION_MAP = AUTH_LDAP_2_ORGANIZATION_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_2_ORGANIZATION_MAP(Object AUTH_LDAP_2_ORGANIZATION_MAP) {
        this.AUTH_LDAP_2_ORGANIZATION_MAP = AUTH_LDAP_2_ORGANIZATION_MAP;
        return this;
    }

    /**
    * Group DN required to login. If specified, user must be a member of this group to login via LDAP. If not set, everyone in LDAP that matches the user search will be able to login to the service. Only one require group is supported.
    * @return AUTH_LDAP_2_REQUIRE_GROUP
    **/
    @JsonProperty("AUTH_LDAP_2_REQUIRE_GROUP")
    public String getAUTHLDAP2REQUIREGROUP() {
        return AUTH_LDAP_2_REQUIRE_GROUP;
    }

    /**
     * Set AUTH_LDAP_2_REQUIRE_GROUP
     **/
    public void setAUTHLDAP2REQUIREGROUP(String AUTH_LDAP_2_REQUIRE_GROUP) {
        this.AUTH_LDAP_2_REQUIRE_GROUP = AUTH_LDAP_2_REQUIRE_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_2_REQUIRE_GROUP(String AUTH_LDAP_2_REQUIRE_GROUP) {
        this.AUTH_LDAP_2_REQUIRE_GROUP = AUTH_LDAP_2_REQUIRE_GROUP;
        return this;
    }

    /**
    * URI to connect to LDAP server, such as \"ldap://ldap.example.com:389\" (non-SSL) or \"ldaps://ldap.example.com:636\" (SSL). Multiple LDAP servers may be specified by separating with spaces or commas. LDAP authentication is disabled if this parameter is empty.
    * @return AUTH_LDAP_2_SERVER_URI
    **/
    @JsonProperty("AUTH_LDAP_2_SERVER_URI")
    public String getAUTHLDAP2SERVERURI() {
        return AUTH_LDAP_2_SERVER_URI;
    }

    /**
     * Set AUTH_LDAP_2_SERVER_URI
     **/
    public void setAUTHLDAP2SERVERURI(String AUTH_LDAP_2_SERVER_URI) {
        this.AUTH_LDAP_2_SERVER_URI = AUTH_LDAP_2_SERVER_URI;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_2_SERVER_URI(String AUTH_LDAP_2_SERVER_URI) {
        this.AUTH_LDAP_2_SERVER_URI = AUTH_LDAP_2_SERVER_URI;
        return this;
    }

    /**
    * Whether to enable TLS when the LDAP connection is not using SSL.
    * @return AUTH_LDAP_2_START_TLS
    **/
    @JsonProperty("AUTH_LDAP_2_START_TLS")
    public Boolean getAUTHLDAP2STARTTLS() {
        return AUTH_LDAP_2_START_TLS;
    }

    /**
     * Set AUTH_LDAP_2_START_TLS
     **/
    public void setAUTHLDAP2STARTTLS(Boolean AUTH_LDAP_2_START_TLS) {
        this.AUTH_LDAP_2_START_TLS = AUTH_LDAP_2_START_TLS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_2_START_TLS(Boolean AUTH_LDAP_2_START_TLS) {
        this.AUTH_LDAP_2_START_TLS = AUTH_LDAP_2_START_TLS;
        return this;
    }

    /**
    * Mapping between team members (users) and LDAP groups. Configuration details are available in the documentation.
    * @return AUTH_LDAP_2_TEAM_MAP
    **/
    @JsonProperty("AUTH_LDAP_2_TEAM_MAP")
    public Object getAUTHLDAP2TEAMMAP() {
        return AUTH_LDAP_2_TEAM_MAP;
    }

    /**
     * Set AUTH_LDAP_2_TEAM_MAP
     **/
    public void setAUTHLDAP2TEAMMAP(Object AUTH_LDAP_2_TEAM_MAP) {
        this.AUTH_LDAP_2_TEAM_MAP = AUTH_LDAP_2_TEAM_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_2_TEAM_MAP(Object AUTH_LDAP_2_TEAM_MAP) {
        this.AUTH_LDAP_2_TEAM_MAP = AUTH_LDAP_2_TEAM_MAP;
        return this;
    }

    /**
    * Mapping of LDAP user schema to API user attributes. The default setting is valid for ActiveDirectory but users with other LDAP configurations may need to change the values. Refer to the documentation for additional details.
    * @return AUTH_LDAP_2_USER_ATTR_MAP
    **/
    @JsonProperty("AUTH_LDAP_2_USER_ATTR_MAP")
    public Object getAUTHLDAP2USERATTRMAP() {
        return AUTH_LDAP_2_USER_ATTR_MAP;
    }

    /**
     * Set AUTH_LDAP_2_USER_ATTR_MAP
     **/
    public void setAUTHLDAP2USERATTRMAP(Object AUTH_LDAP_2_USER_ATTR_MAP) {
        this.AUTH_LDAP_2_USER_ATTR_MAP = AUTH_LDAP_2_USER_ATTR_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_2_USER_ATTR_MAP(Object AUTH_LDAP_2_USER_ATTR_MAP) {
        this.AUTH_LDAP_2_USER_ATTR_MAP = AUTH_LDAP_2_USER_ATTR_MAP;
        return this;
    }

    /**
    * Alternative to user search, if user DNs are all of the same format. This approach is more efficient for user lookups than searching if it is usable in your organizational environment. If this setting has a value it will be used instead of AUTH_LDAP_USER_SEARCH.
    * @return AUTH_LDAP_2_USER_DN_TEMPLATE
    **/
    @JsonProperty("AUTH_LDAP_2_USER_DN_TEMPLATE")
    public String getAUTHLDAP2USERDNTEMPLATE() {
        return AUTH_LDAP_2_USER_DN_TEMPLATE;
    }

    /**
     * Set AUTH_LDAP_2_USER_DN_TEMPLATE
     **/
    public void setAUTHLDAP2USERDNTEMPLATE(String AUTH_LDAP_2_USER_DN_TEMPLATE) {
        this.AUTH_LDAP_2_USER_DN_TEMPLATE = AUTH_LDAP_2_USER_DN_TEMPLATE;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_2_USER_DN_TEMPLATE(String AUTH_LDAP_2_USER_DN_TEMPLATE) {
        this.AUTH_LDAP_2_USER_DN_TEMPLATE = AUTH_LDAP_2_USER_DN_TEMPLATE;
        return this;
    }

    /**
    * Retrieve users from a given group. At this time, superuser and system auditors are the only groups supported. Refer to the documentation for more detail.
    * @return AUTH_LDAP_2_USER_FLAGS_BY_GROUP
    **/
    @JsonProperty("AUTH_LDAP_2_USER_FLAGS_BY_GROUP")
    public Object getAUTHLDAP2USERFLAGSBYGROUP() {
        return AUTH_LDAP_2_USER_FLAGS_BY_GROUP;
    }

    /**
     * Set AUTH_LDAP_2_USER_FLAGS_BY_GROUP
     **/
    public void setAUTHLDAP2USERFLAGSBYGROUP(Object AUTH_LDAP_2_USER_FLAGS_BY_GROUP) {
        this.AUTH_LDAP_2_USER_FLAGS_BY_GROUP = AUTH_LDAP_2_USER_FLAGS_BY_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_2_USER_FLAGS_BY_GROUP(Object AUTH_LDAP_2_USER_FLAGS_BY_GROUP) {
        this.AUTH_LDAP_2_USER_FLAGS_BY_GROUP = AUTH_LDAP_2_USER_FLAGS_BY_GROUP;
        return this;
    }

    /**
    * LDAP search query to find users.  Any user that matches the given pattern will be able to login to the service.  The user should also be mapped into an organization (as defined in the AUTH_LDAP_ORGANIZATION_MAP setting).  If multiple search queries need to be supported use of \"LDAPUnion\" is possible. See the documentation for details.
    * @return AUTH_LDAP_2_USER_SEARCH
    **/
    @JsonProperty("AUTH_LDAP_2_USER_SEARCH")
    public List<String> getAUTHLDAP2USERSEARCH() {
        return AUTH_LDAP_2_USER_SEARCH;
    }

    /**
     * Set AUTH_LDAP_2_USER_SEARCH
     **/
    public void setAUTHLDAP2USERSEARCH(List<String> AUTH_LDAP_2_USER_SEARCH) {
        this.AUTH_LDAP_2_USER_SEARCH = AUTH_LDAP_2_USER_SEARCH;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_2_USER_SEARCH(List<String> AUTH_LDAP_2_USER_SEARCH) {
        this.AUTH_LDAP_2_USER_SEARCH = AUTH_LDAP_2_USER_SEARCH;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addAUTHLDAP2USERSEARCHItem(String AUTH_LDAP_2_USER_SEARCHItem) {
        this.AUTH_LDAP_2_USER_SEARCH.add(AUTH_LDAP_2_USER_SEARCHItem);
        return this;
    }

    /**
    * DN (Distinguished Name) of user to bind for all search queries. This is the system user account we will use to login to query LDAP for other user information. Refer to the documentation for example syntax.
    * @return AUTH_LDAP_3_BIND_DN
    **/
    @JsonProperty("AUTH_LDAP_3_BIND_DN")
    public String getAUTHLDAP3BINDDN() {
        return AUTH_LDAP_3_BIND_DN;
    }

    /**
     * Set AUTH_LDAP_3_BIND_DN
     **/
    public void setAUTHLDAP3BINDDN(String AUTH_LDAP_3_BIND_DN) {
        this.AUTH_LDAP_3_BIND_DN = AUTH_LDAP_3_BIND_DN;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_3_BIND_DN(String AUTH_LDAP_3_BIND_DN) {
        this.AUTH_LDAP_3_BIND_DN = AUTH_LDAP_3_BIND_DN;
        return this;
    }

    /**
    * Password used to bind LDAP user account.
    * @return AUTH_LDAP_3_BIND_PASSWORD
    **/
    @JsonProperty("AUTH_LDAP_3_BIND_PASSWORD")
    public String getAUTHLDAP3BINDPASSWORD() {
        return AUTH_LDAP_3_BIND_PASSWORD;
    }

    /**
     * Set AUTH_LDAP_3_BIND_PASSWORD
     **/
    public void setAUTHLDAP3BINDPASSWORD(String AUTH_LDAP_3_BIND_PASSWORD) {
        this.AUTH_LDAP_3_BIND_PASSWORD = AUTH_LDAP_3_BIND_PASSWORD;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_3_BIND_PASSWORD(String AUTH_LDAP_3_BIND_PASSWORD) {
        this.AUTH_LDAP_3_BIND_PASSWORD = AUTH_LDAP_3_BIND_PASSWORD;
        return this;
    }

    /**
    * Additional options to set for the LDAP connection.  LDAP referrals are disabled by default (to prevent certain LDAP queries from hanging with AD). Option names should be strings (e.g. \"OPT_REFERRALS\"). Refer to https://www.python-ldap.org/doc/html/ldap.html#options for possible options and values that can be set.
    * @return AUTH_LDAP_3_CONNECTION_OPTIONS
    **/
    @JsonProperty("AUTH_LDAP_3_CONNECTION_OPTIONS")
    public Object getAUTHLDAP3CONNECTIONOPTIONS() {
        return AUTH_LDAP_3_CONNECTION_OPTIONS;
    }

    /**
     * Set AUTH_LDAP_3_CONNECTION_OPTIONS
     **/
    public void setAUTHLDAP3CONNECTIONOPTIONS(Object AUTH_LDAP_3_CONNECTION_OPTIONS) {
        this.AUTH_LDAP_3_CONNECTION_OPTIONS = AUTH_LDAP_3_CONNECTION_OPTIONS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_3_CONNECTION_OPTIONS(Object AUTH_LDAP_3_CONNECTION_OPTIONS) {
        this.AUTH_LDAP_3_CONNECTION_OPTIONS = AUTH_LDAP_3_CONNECTION_OPTIONS;
        return this;
    }

    /**
    * Group DN denied from login. If specified, user will not be allowed to login if a member of this group.  Only one deny group is supported.
    * @return AUTH_LDAP_3_DENY_GROUP
    **/
    @JsonProperty("AUTH_LDAP_3_DENY_GROUP")
    public String getAUTHLDAP3DENYGROUP() {
        return AUTH_LDAP_3_DENY_GROUP;
    }

    /**
     * Set AUTH_LDAP_3_DENY_GROUP
     **/
    public void setAUTHLDAP3DENYGROUP(String AUTH_LDAP_3_DENY_GROUP) {
        this.AUTH_LDAP_3_DENY_GROUP = AUTH_LDAP_3_DENY_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_3_DENY_GROUP(String AUTH_LDAP_3_DENY_GROUP) {
        this.AUTH_LDAP_3_DENY_GROUP = AUTH_LDAP_3_DENY_GROUP;
        return this;
    }

    /**
    * Users are mapped to organizations based on their membership in LDAP groups. This setting defines the LDAP search query to find groups. Unlike the user search, group search does not support LDAPSearchUnion.
    * @return AUTH_LDAP_3_GROUP_SEARCH
    **/
    @JsonProperty("AUTH_LDAP_3_GROUP_SEARCH")
    public List<String> getAUTHLDAP3GROUPSEARCH() {
        return AUTH_LDAP_3_GROUP_SEARCH;
    }

    /**
     * Set AUTH_LDAP_3_GROUP_SEARCH
     **/
    public void setAUTHLDAP3GROUPSEARCH(List<String> AUTH_LDAP_3_GROUP_SEARCH) {
        this.AUTH_LDAP_3_GROUP_SEARCH = AUTH_LDAP_3_GROUP_SEARCH;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_3_GROUP_SEARCH(List<String> AUTH_LDAP_3_GROUP_SEARCH) {
        this.AUTH_LDAP_3_GROUP_SEARCH = AUTH_LDAP_3_GROUP_SEARCH;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addAUTHLDAP3GROUPSEARCHItem(String AUTH_LDAP_3_GROUP_SEARCHItem) {
        this.AUTH_LDAP_3_GROUP_SEARCH.add(AUTH_LDAP_3_GROUP_SEARCHItem);
        return this;
    }

    /**
    * The group type may need to be changed based on the type of the LDAP server.  Values are listed at: https://django-auth-ldap.readthedocs.io/en/stable/groups.html#types-of-groups
    * @return AUTH_LDAP_3_GROUP_TYPE
    **/
    @JsonProperty("AUTH_LDAP_3_GROUP_TYPE")
    public String getAUTHLDAP3GROUPTYPE() {
        return AUTH_LDAP_3_GROUP_TYPE;
    }

    /**
     * Set AUTH_LDAP_3_GROUP_TYPE
     **/
    public void setAUTHLDAP3GROUPTYPE(String AUTH_LDAP_3_GROUP_TYPE) {
        this.AUTH_LDAP_3_GROUP_TYPE = AUTH_LDAP_3_GROUP_TYPE;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_3_GROUP_TYPE(String AUTH_LDAP_3_GROUP_TYPE) {
        this.AUTH_LDAP_3_GROUP_TYPE = AUTH_LDAP_3_GROUP_TYPE;
        return this;
    }

    /**
    * Key value parameters to send the chosen group type init method.
    * @return AUTH_LDAP_3_GROUP_TYPE_PARAMS
    **/
    @JsonProperty("AUTH_LDAP_3_GROUP_TYPE_PARAMS")
    public Object getAUTHLDAP3GROUPTYPEPARAMS() {
        return AUTH_LDAP_3_GROUP_TYPE_PARAMS;
    }

    /**
     * Set AUTH_LDAP_3_GROUP_TYPE_PARAMS
     **/
    public void setAUTHLDAP3GROUPTYPEPARAMS(Object AUTH_LDAP_3_GROUP_TYPE_PARAMS) {
        this.AUTH_LDAP_3_GROUP_TYPE_PARAMS = AUTH_LDAP_3_GROUP_TYPE_PARAMS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_3_GROUP_TYPE_PARAMS(Object AUTH_LDAP_3_GROUP_TYPE_PARAMS) {
        this.AUTH_LDAP_3_GROUP_TYPE_PARAMS = AUTH_LDAP_3_GROUP_TYPE_PARAMS;
        return this;
    }

    /**
    * Mapping between organization admins/users and LDAP groups. This controls which users are placed into which organizations relative to their LDAP group memberships. Configuration details are available in the documentation.
    * @return AUTH_LDAP_3_ORGANIZATION_MAP
    **/
    @JsonProperty("AUTH_LDAP_3_ORGANIZATION_MAP")
    public Object getAUTHLDAP3ORGANIZATIONMAP() {
        return AUTH_LDAP_3_ORGANIZATION_MAP;
    }

    /**
     * Set AUTH_LDAP_3_ORGANIZATION_MAP
     **/
    public void setAUTHLDAP3ORGANIZATIONMAP(Object AUTH_LDAP_3_ORGANIZATION_MAP) {
        this.AUTH_LDAP_3_ORGANIZATION_MAP = AUTH_LDAP_3_ORGANIZATION_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_3_ORGANIZATION_MAP(Object AUTH_LDAP_3_ORGANIZATION_MAP) {
        this.AUTH_LDAP_3_ORGANIZATION_MAP = AUTH_LDAP_3_ORGANIZATION_MAP;
        return this;
    }

    /**
    * Group DN required to login. If specified, user must be a member of this group to login via LDAP. If not set, everyone in LDAP that matches the user search will be able to login to the service. Only one require group is supported.
    * @return AUTH_LDAP_3_REQUIRE_GROUP
    **/
    @JsonProperty("AUTH_LDAP_3_REQUIRE_GROUP")
    public String getAUTHLDAP3REQUIREGROUP() {
        return AUTH_LDAP_3_REQUIRE_GROUP;
    }

    /**
     * Set AUTH_LDAP_3_REQUIRE_GROUP
     **/
    public void setAUTHLDAP3REQUIREGROUP(String AUTH_LDAP_3_REQUIRE_GROUP) {
        this.AUTH_LDAP_3_REQUIRE_GROUP = AUTH_LDAP_3_REQUIRE_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_3_REQUIRE_GROUP(String AUTH_LDAP_3_REQUIRE_GROUP) {
        this.AUTH_LDAP_3_REQUIRE_GROUP = AUTH_LDAP_3_REQUIRE_GROUP;
        return this;
    }

    /**
    * URI to connect to LDAP server, such as \"ldap://ldap.example.com:389\" (non-SSL) or \"ldaps://ldap.example.com:636\" (SSL). Multiple LDAP servers may be specified by separating with spaces or commas. LDAP authentication is disabled if this parameter is empty.
    * @return AUTH_LDAP_3_SERVER_URI
    **/
    @JsonProperty("AUTH_LDAP_3_SERVER_URI")
    public String getAUTHLDAP3SERVERURI() {
        return AUTH_LDAP_3_SERVER_URI;
    }

    /**
     * Set AUTH_LDAP_3_SERVER_URI
     **/
    public void setAUTHLDAP3SERVERURI(String AUTH_LDAP_3_SERVER_URI) {
        this.AUTH_LDAP_3_SERVER_URI = AUTH_LDAP_3_SERVER_URI;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_3_SERVER_URI(String AUTH_LDAP_3_SERVER_URI) {
        this.AUTH_LDAP_3_SERVER_URI = AUTH_LDAP_3_SERVER_URI;
        return this;
    }

    /**
    * Whether to enable TLS when the LDAP connection is not using SSL.
    * @return AUTH_LDAP_3_START_TLS
    **/
    @JsonProperty("AUTH_LDAP_3_START_TLS")
    public Boolean getAUTHLDAP3STARTTLS() {
        return AUTH_LDAP_3_START_TLS;
    }

    /**
     * Set AUTH_LDAP_3_START_TLS
     **/
    public void setAUTHLDAP3STARTTLS(Boolean AUTH_LDAP_3_START_TLS) {
        this.AUTH_LDAP_3_START_TLS = AUTH_LDAP_3_START_TLS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_3_START_TLS(Boolean AUTH_LDAP_3_START_TLS) {
        this.AUTH_LDAP_3_START_TLS = AUTH_LDAP_3_START_TLS;
        return this;
    }

    /**
    * Mapping between team members (users) and LDAP groups. Configuration details are available in the documentation.
    * @return AUTH_LDAP_3_TEAM_MAP
    **/
    @JsonProperty("AUTH_LDAP_3_TEAM_MAP")
    public Object getAUTHLDAP3TEAMMAP() {
        return AUTH_LDAP_3_TEAM_MAP;
    }

    /**
     * Set AUTH_LDAP_3_TEAM_MAP
     **/
    public void setAUTHLDAP3TEAMMAP(Object AUTH_LDAP_3_TEAM_MAP) {
        this.AUTH_LDAP_3_TEAM_MAP = AUTH_LDAP_3_TEAM_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_3_TEAM_MAP(Object AUTH_LDAP_3_TEAM_MAP) {
        this.AUTH_LDAP_3_TEAM_MAP = AUTH_LDAP_3_TEAM_MAP;
        return this;
    }

    /**
    * Mapping of LDAP user schema to API user attributes. The default setting is valid for ActiveDirectory but users with other LDAP configurations may need to change the values. Refer to the documentation for additional details.
    * @return AUTH_LDAP_3_USER_ATTR_MAP
    **/
    @JsonProperty("AUTH_LDAP_3_USER_ATTR_MAP")
    public Object getAUTHLDAP3USERATTRMAP() {
        return AUTH_LDAP_3_USER_ATTR_MAP;
    }

    /**
     * Set AUTH_LDAP_3_USER_ATTR_MAP
     **/
    public void setAUTHLDAP3USERATTRMAP(Object AUTH_LDAP_3_USER_ATTR_MAP) {
        this.AUTH_LDAP_3_USER_ATTR_MAP = AUTH_LDAP_3_USER_ATTR_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_3_USER_ATTR_MAP(Object AUTH_LDAP_3_USER_ATTR_MAP) {
        this.AUTH_LDAP_3_USER_ATTR_MAP = AUTH_LDAP_3_USER_ATTR_MAP;
        return this;
    }

    /**
    * Alternative to user search, if user DNs are all of the same format. This approach is more efficient for user lookups than searching if it is usable in your organizational environment. If this setting has a value it will be used instead of AUTH_LDAP_USER_SEARCH.
    * @return AUTH_LDAP_3_USER_DN_TEMPLATE
    **/
    @JsonProperty("AUTH_LDAP_3_USER_DN_TEMPLATE")
    public String getAUTHLDAP3USERDNTEMPLATE() {
        return AUTH_LDAP_3_USER_DN_TEMPLATE;
    }

    /**
     * Set AUTH_LDAP_3_USER_DN_TEMPLATE
     **/
    public void setAUTHLDAP3USERDNTEMPLATE(String AUTH_LDAP_3_USER_DN_TEMPLATE) {
        this.AUTH_LDAP_3_USER_DN_TEMPLATE = AUTH_LDAP_3_USER_DN_TEMPLATE;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_3_USER_DN_TEMPLATE(String AUTH_LDAP_3_USER_DN_TEMPLATE) {
        this.AUTH_LDAP_3_USER_DN_TEMPLATE = AUTH_LDAP_3_USER_DN_TEMPLATE;
        return this;
    }

    /**
    * Retrieve users from a given group. At this time, superuser and system auditors are the only groups supported. Refer to the documentation for more detail.
    * @return AUTH_LDAP_3_USER_FLAGS_BY_GROUP
    **/
    @JsonProperty("AUTH_LDAP_3_USER_FLAGS_BY_GROUP")
    public Object getAUTHLDAP3USERFLAGSBYGROUP() {
        return AUTH_LDAP_3_USER_FLAGS_BY_GROUP;
    }

    /**
     * Set AUTH_LDAP_3_USER_FLAGS_BY_GROUP
     **/
    public void setAUTHLDAP3USERFLAGSBYGROUP(Object AUTH_LDAP_3_USER_FLAGS_BY_GROUP) {
        this.AUTH_LDAP_3_USER_FLAGS_BY_GROUP = AUTH_LDAP_3_USER_FLAGS_BY_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_3_USER_FLAGS_BY_GROUP(Object AUTH_LDAP_3_USER_FLAGS_BY_GROUP) {
        this.AUTH_LDAP_3_USER_FLAGS_BY_GROUP = AUTH_LDAP_3_USER_FLAGS_BY_GROUP;
        return this;
    }

    /**
    * LDAP search query to find users.  Any user that matches the given pattern will be able to login to the service.  The user should also be mapped into an organization (as defined in the AUTH_LDAP_ORGANIZATION_MAP setting).  If multiple search queries need to be supported use of \"LDAPUnion\" is possible. See the documentation for details.
    * @return AUTH_LDAP_3_USER_SEARCH
    **/
    @JsonProperty("AUTH_LDAP_3_USER_SEARCH")
    public List<String> getAUTHLDAP3USERSEARCH() {
        return AUTH_LDAP_3_USER_SEARCH;
    }

    /**
     * Set AUTH_LDAP_3_USER_SEARCH
     **/
    public void setAUTHLDAP3USERSEARCH(List<String> AUTH_LDAP_3_USER_SEARCH) {
        this.AUTH_LDAP_3_USER_SEARCH = AUTH_LDAP_3_USER_SEARCH;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_3_USER_SEARCH(List<String> AUTH_LDAP_3_USER_SEARCH) {
        this.AUTH_LDAP_3_USER_SEARCH = AUTH_LDAP_3_USER_SEARCH;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addAUTHLDAP3USERSEARCHItem(String AUTH_LDAP_3_USER_SEARCHItem) {
        this.AUTH_LDAP_3_USER_SEARCH.add(AUTH_LDAP_3_USER_SEARCHItem);
        return this;
    }

    /**
    * DN (Distinguished Name) of user to bind for all search queries. This is the system user account we will use to login to query LDAP for other user information. Refer to the documentation for example syntax.
    * @return AUTH_LDAP_4_BIND_DN
    **/
    @JsonProperty("AUTH_LDAP_4_BIND_DN")
    public String getAUTHLDAP4BINDDN() {
        return AUTH_LDAP_4_BIND_DN;
    }

    /**
     * Set AUTH_LDAP_4_BIND_DN
     **/
    public void setAUTHLDAP4BINDDN(String AUTH_LDAP_4_BIND_DN) {
        this.AUTH_LDAP_4_BIND_DN = AUTH_LDAP_4_BIND_DN;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_4_BIND_DN(String AUTH_LDAP_4_BIND_DN) {
        this.AUTH_LDAP_4_BIND_DN = AUTH_LDAP_4_BIND_DN;
        return this;
    }

    /**
    * Password used to bind LDAP user account.
    * @return AUTH_LDAP_4_BIND_PASSWORD
    **/
    @JsonProperty("AUTH_LDAP_4_BIND_PASSWORD")
    public String getAUTHLDAP4BINDPASSWORD() {
        return AUTH_LDAP_4_BIND_PASSWORD;
    }

    /**
     * Set AUTH_LDAP_4_BIND_PASSWORD
     **/
    public void setAUTHLDAP4BINDPASSWORD(String AUTH_LDAP_4_BIND_PASSWORD) {
        this.AUTH_LDAP_4_BIND_PASSWORD = AUTH_LDAP_4_BIND_PASSWORD;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_4_BIND_PASSWORD(String AUTH_LDAP_4_BIND_PASSWORD) {
        this.AUTH_LDAP_4_BIND_PASSWORD = AUTH_LDAP_4_BIND_PASSWORD;
        return this;
    }

    /**
    * Additional options to set for the LDAP connection.  LDAP referrals are disabled by default (to prevent certain LDAP queries from hanging with AD). Option names should be strings (e.g. \"OPT_REFERRALS\"). Refer to https://www.python-ldap.org/doc/html/ldap.html#options for possible options and values that can be set.
    * @return AUTH_LDAP_4_CONNECTION_OPTIONS
    **/
    @JsonProperty("AUTH_LDAP_4_CONNECTION_OPTIONS")
    public Object getAUTHLDAP4CONNECTIONOPTIONS() {
        return AUTH_LDAP_4_CONNECTION_OPTIONS;
    }

    /**
     * Set AUTH_LDAP_4_CONNECTION_OPTIONS
     **/
    public void setAUTHLDAP4CONNECTIONOPTIONS(Object AUTH_LDAP_4_CONNECTION_OPTIONS) {
        this.AUTH_LDAP_4_CONNECTION_OPTIONS = AUTH_LDAP_4_CONNECTION_OPTIONS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_4_CONNECTION_OPTIONS(Object AUTH_LDAP_4_CONNECTION_OPTIONS) {
        this.AUTH_LDAP_4_CONNECTION_OPTIONS = AUTH_LDAP_4_CONNECTION_OPTIONS;
        return this;
    }

    /**
    * Group DN denied from login. If specified, user will not be allowed to login if a member of this group.  Only one deny group is supported.
    * @return AUTH_LDAP_4_DENY_GROUP
    **/
    @JsonProperty("AUTH_LDAP_4_DENY_GROUP")
    public String getAUTHLDAP4DENYGROUP() {
        return AUTH_LDAP_4_DENY_GROUP;
    }

    /**
     * Set AUTH_LDAP_4_DENY_GROUP
     **/
    public void setAUTHLDAP4DENYGROUP(String AUTH_LDAP_4_DENY_GROUP) {
        this.AUTH_LDAP_4_DENY_GROUP = AUTH_LDAP_4_DENY_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_4_DENY_GROUP(String AUTH_LDAP_4_DENY_GROUP) {
        this.AUTH_LDAP_4_DENY_GROUP = AUTH_LDAP_4_DENY_GROUP;
        return this;
    }

    /**
    * Users are mapped to organizations based on their membership in LDAP groups. This setting defines the LDAP search query to find groups. Unlike the user search, group search does not support LDAPSearchUnion.
    * @return AUTH_LDAP_4_GROUP_SEARCH
    **/
    @JsonProperty("AUTH_LDAP_4_GROUP_SEARCH")
    public List<String> getAUTHLDAP4GROUPSEARCH() {
        return AUTH_LDAP_4_GROUP_SEARCH;
    }

    /**
     * Set AUTH_LDAP_4_GROUP_SEARCH
     **/
    public void setAUTHLDAP4GROUPSEARCH(List<String> AUTH_LDAP_4_GROUP_SEARCH) {
        this.AUTH_LDAP_4_GROUP_SEARCH = AUTH_LDAP_4_GROUP_SEARCH;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_4_GROUP_SEARCH(List<String> AUTH_LDAP_4_GROUP_SEARCH) {
        this.AUTH_LDAP_4_GROUP_SEARCH = AUTH_LDAP_4_GROUP_SEARCH;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addAUTHLDAP4GROUPSEARCHItem(String AUTH_LDAP_4_GROUP_SEARCHItem) {
        this.AUTH_LDAP_4_GROUP_SEARCH.add(AUTH_LDAP_4_GROUP_SEARCHItem);
        return this;
    }

    /**
    * The group type may need to be changed based on the type of the LDAP server.  Values are listed at: https://django-auth-ldap.readthedocs.io/en/stable/groups.html#types-of-groups
    * @return AUTH_LDAP_4_GROUP_TYPE
    **/
    @JsonProperty("AUTH_LDAP_4_GROUP_TYPE")
    public String getAUTHLDAP4GROUPTYPE() {
        return AUTH_LDAP_4_GROUP_TYPE;
    }

    /**
     * Set AUTH_LDAP_4_GROUP_TYPE
     **/
    public void setAUTHLDAP4GROUPTYPE(String AUTH_LDAP_4_GROUP_TYPE) {
        this.AUTH_LDAP_4_GROUP_TYPE = AUTH_LDAP_4_GROUP_TYPE;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_4_GROUP_TYPE(String AUTH_LDAP_4_GROUP_TYPE) {
        this.AUTH_LDAP_4_GROUP_TYPE = AUTH_LDAP_4_GROUP_TYPE;
        return this;
    }

    /**
    * Key value parameters to send the chosen group type init method.
    * @return AUTH_LDAP_4_GROUP_TYPE_PARAMS
    **/
    @JsonProperty("AUTH_LDAP_4_GROUP_TYPE_PARAMS")
    public Object getAUTHLDAP4GROUPTYPEPARAMS() {
        return AUTH_LDAP_4_GROUP_TYPE_PARAMS;
    }

    /**
     * Set AUTH_LDAP_4_GROUP_TYPE_PARAMS
     **/
    public void setAUTHLDAP4GROUPTYPEPARAMS(Object AUTH_LDAP_4_GROUP_TYPE_PARAMS) {
        this.AUTH_LDAP_4_GROUP_TYPE_PARAMS = AUTH_LDAP_4_GROUP_TYPE_PARAMS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_4_GROUP_TYPE_PARAMS(Object AUTH_LDAP_4_GROUP_TYPE_PARAMS) {
        this.AUTH_LDAP_4_GROUP_TYPE_PARAMS = AUTH_LDAP_4_GROUP_TYPE_PARAMS;
        return this;
    }

    /**
    * Mapping between organization admins/users and LDAP groups. This controls which users are placed into which organizations relative to their LDAP group memberships. Configuration details are available in the documentation.
    * @return AUTH_LDAP_4_ORGANIZATION_MAP
    **/
    @JsonProperty("AUTH_LDAP_4_ORGANIZATION_MAP")
    public Object getAUTHLDAP4ORGANIZATIONMAP() {
        return AUTH_LDAP_4_ORGANIZATION_MAP;
    }

    /**
     * Set AUTH_LDAP_4_ORGANIZATION_MAP
     **/
    public void setAUTHLDAP4ORGANIZATIONMAP(Object AUTH_LDAP_4_ORGANIZATION_MAP) {
        this.AUTH_LDAP_4_ORGANIZATION_MAP = AUTH_LDAP_4_ORGANIZATION_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_4_ORGANIZATION_MAP(Object AUTH_LDAP_4_ORGANIZATION_MAP) {
        this.AUTH_LDAP_4_ORGANIZATION_MAP = AUTH_LDAP_4_ORGANIZATION_MAP;
        return this;
    }

    /**
    * Group DN required to login. If specified, user must be a member of this group to login via LDAP. If not set, everyone in LDAP that matches the user search will be able to login to the service. Only one require group is supported.
    * @return AUTH_LDAP_4_REQUIRE_GROUP
    **/
    @JsonProperty("AUTH_LDAP_4_REQUIRE_GROUP")
    public String getAUTHLDAP4REQUIREGROUP() {
        return AUTH_LDAP_4_REQUIRE_GROUP;
    }

    /**
     * Set AUTH_LDAP_4_REQUIRE_GROUP
     **/
    public void setAUTHLDAP4REQUIREGROUP(String AUTH_LDAP_4_REQUIRE_GROUP) {
        this.AUTH_LDAP_4_REQUIRE_GROUP = AUTH_LDAP_4_REQUIRE_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_4_REQUIRE_GROUP(String AUTH_LDAP_4_REQUIRE_GROUP) {
        this.AUTH_LDAP_4_REQUIRE_GROUP = AUTH_LDAP_4_REQUIRE_GROUP;
        return this;
    }

    /**
    * URI to connect to LDAP server, such as \"ldap://ldap.example.com:389\" (non-SSL) or \"ldaps://ldap.example.com:636\" (SSL). Multiple LDAP servers may be specified by separating with spaces or commas. LDAP authentication is disabled if this parameter is empty.
    * @return AUTH_LDAP_4_SERVER_URI
    **/
    @JsonProperty("AUTH_LDAP_4_SERVER_URI")
    public String getAUTHLDAP4SERVERURI() {
        return AUTH_LDAP_4_SERVER_URI;
    }

    /**
     * Set AUTH_LDAP_4_SERVER_URI
     **/
    public void setAUTHLDAP4SERVERURI(String AUTH_LDAP_4_SERVER_URI) {
        this.AUTH_LDAP_4_SERVER_URI = AUTH_LDAP_4_SERVER_URI;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_4_SERVER_URI(String AUTH_LDAP_4_SERVER_URI) {
        this.AUTH_LDAP_4_SERVER_URI = AUTH_LDAP_4_SERVER_URI;
        return this;
    }

    /**
    * Whether to enable TLS when the LDAP connection is not using SSL.
    * @return AUTH_LDAP_4_START_TLS
    **/
    @JsonProperty("AUTH_LDAP_4_START_TLS")
    public Boolean getAUTHLDAP4STARTTLS() {
        return AUTH_LDAP_4_START_TLS;
    }

    /**
     * Set AUTH_LDAP_4_START_TLS
     **/
    public void setAUTHLDAP4STARTTLS(Boolean AUTH_LDAP_4_START_TLS) {
        this.AUTH_LDAP_4_START_TLS = AUTH_LDAP_4_START_TLS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_4_START_TLS(Boolean AUTH_LDAP_4_START_TLS) {
        this.AUTH_LDAP_4_START_TLS = AUTH_LDAP_4_START_TLS;
        return this;
    }

    /**
    * Mapping between team members (users) and LDAP groups. Configuration details are available in the documentation.
    * @return AUTH_LDAP_4_TEAM_MAP
    **/
    @JsonProperty("AUTH_LDAP_4_TEAM_MAP")
    public Object getAUTHLDAP4TEAMMAP() {
        return AUTH_LDAP_4_TEAM_MAP;
    }

    /**
     * Set AUTH_LDAP_4_TEAM_MAP
     **/
    public void setAUTHLDAP4TEAMMAP(Object AUTH_LDAP_4_TEAM_MAP) {
        this.AUTH_LDAP_4_TEAM_MAP = AUTH_LDAP_4_TEAM_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_4_TEAM_MAP(Object AUTH_LDAP_4_TEAM_MAP) {
        this.AUTH_LDAP_4_TEAM_MAP = AUTH_LDAP_4_TEAM_MAP;
        return this;
    }

    /**
    * Mapping of LDAP user schema to API user attributes. The default setting is valid for ActiveDirectory but users with other LDAP configurations may need to change the values. Refer to the documentation for additional details.
    * @return AUTH_LDAP_4_USER_ATTR_MAP
    **/
    @JsonProperty("AUTH_LDAP_4_USER_ATTR_MAP")
    public Object getAUTHLDAP4USERATTRMAP() {
        return AUTH_LDAP_4_USER_ATTR_MAP;
    }

    /**
     * Set AUTH_LDAP_4_USER_ATTR_MAP
     **/
    public void setAUTHLDAP4USERATTRMAP(Object AUTH_LDAP_4_USER_ATTR_MAP) {
        this.AUTH_LDAP_4_USER_ATTR_MAP = AUTH_LDAP_4_USER_ATTR_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_4_USER_ATTR_MAP(Object AUTH_LDAP_4_USER_ATTR_MAP) {
        this.AUTH_LDAP_4_USER_ATTR_MAP = AUTH_LDAP_4_USER_ATTR_MAP;
        return this;
    }

    /**
    * Alternative to user search, if user DNs are all of the same format. This approach is more efficient for user lookups than searching if it is usable in your organizational environment. If this setting has a value it will be used instead of AUTH_LDAP_USER_SEARCH.
    * @return AUTH_LDAP_4_USER_DN_TEMPLATE
    **/
    @JsonProperty("AUTH_LDAP_4_USER_DN_TEMPLATE")
    public String getAUTHLDAP4USERDNTEMPLATE() {
        return AUTH_LDAP_4_USER_DN_TEMPLATE;
    }

    /**
     * Set AUTH_LDAP_4_USER_DN_TEMPLATE
     **/
    public void setAUTHLDAP4USERDNTEMPLATE(String AUTH_LDAP_4_USER_DN_TEMPLATE) {
        this.AUTH_LDAP_4_USER_DN_TEMPLATE = AUTH_LDAP_4_USER_DN_TEMPLATE;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_4_USER_DN_TEMPLATE(String AUTH_LDAP_4_USER_DN_TEMPLATE) {
        this.AUTH_LDAP_4_USER_DN_TEMPLATE = AUTH_LDAP_4_USER_DN_TEMPLATE;
        return this;
    }

    /**
    * Retrieve users from a given group. At this time, superuser and system auditors are the only groups supported. Refer to the documentation for more detail.
    * @return AUTH_LDAP_4_USER_FLAGS_BY_GROUP
    **/
    @JsonProperty("AUTH_LDAP_4_USER_FLAGS_BY_GROUP")
    public Object getAUTHLDAP4USERFLAGSBYGROUP() {
        return AUTH_LDAP_4_USER_FLAGS_BY_GROUP;
    }

    /**
     * Set AUTH_LDAP_4_USER_FLAGS_BY_GROUP
     **/
    public void setAUTHLDAP4USERFLAGSBYGROUP(Object AUTH_LDAP_4_USER_FLAGS_BY_GROUP) {
        this.AUTH_LDAP_4_USER_FLAGS_BY_GROUP = AUTH_LDAP_4_USER_FLAGS_BY_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_4_USER_FLAGS_BY_GROUP(Object AUTH_LDAP_4_USER_FLAGS_BY_GROUP) {
        this.AUTH_LDAP_4_USER_FLAGS_BY_GROUP = AUTH_LDAP_4_USER_FLAGS_BY_GROUP;
        return this;
    }

    /**
    * LDAP search query to find users.  Any user that matches the given pattern will be able to login to the service.  The user should also be mapped into an organization (as defined in the AUTH_LDAP_ORGANIZATION_MAP setting).  If multiple search queries need to be supported use of \"LDAPUnion\" is possible. See the documentation for details.
    * @return AUTH_LDAP_4_USER_SEARCH
    **/
    @JsonProperty("AUTH_LDAP_4_USER_SEARCH")
    public List<String> getAUTHLDAP4USERSEARCH() {
        return AUTH_LDAP_4_USER_SEARCH;
    }

    /**
     * Set AUTH_LDAP_4_USER_SEARCH
     **/
    public void setAUTHLDAP4USERSEARCH(List<String> AUTH_LDAP_4_USER_SEARCH) {
        this.AUTH_LDAP_4_USER_SEARCH = AUTH_LDAP_4_USER_SEARCH;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_4_USER_SEARCH(List<String> AUTH_LDAP_4_USER_SEARCH) {
        this.AUTH_LDAP_4_USER_SEARCH = AUTH_LDAP_4_USER_SEARCH;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addAUTHLDAP4USERSEARCHItem(String AUTH_LDAP_4_USER_SEARCHItem) {
        this.AUTH_LDAP_4_USER_SEARCH.add(AUTH_LDAP_4_USER_SEARCHItem);
        return this;
    }

    /**
    * DN (Distinguished Name) of user to bind for all search queries. This is the system user account we will use to login to query LDAP for other user information. Refer to the documentation for example syntax.
    * @return AUTH_LDAP_5_BIND_DN
    **/
    @JsonProperty("AUTH_LDAP_5_BIND_DN")
    public String getAUTHLDAP5BINDDN() {
        return AUTH_LDAP_5_BIND_DN;
    }

    /**
     * Set AUTH_LDAP_5_BIND_DN
     **/
    public void setAUTHLDAP5BINDDN(String AUTH_LDAP_5_BIND_DN) {
        this.AUTH_LDAP_5_BIND_DN = AUTH_LDAP_5_BIND_DN;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_5_BIND_DN(String AUTH_LDAP_5_BIND_DN) {
        this.AUTH_LDAP_5_BIND_DN = AUTH_LDAP_5_BIND_DN;
        return this;
    }

    /**
    * Password used to bind LDAP user account.
    * @return AUTH_LDAP_5_BIND_PASSWORD
    **/
    @JsonProperty("AUTH_LDAP_5_BIND_PASSWORD")
    public String getAUTHLDAP5BINDPASSWORD() {
        return AUTH_LDAP_5_BIND_PASSWORD;
    }

    /**
     * Set AUTH_LDAP_5_BIND_PASSWORD
     **/
    public void setAUTHLDAP5BINDPASSWORD(String AUTH_LDAP_5_BIND_PASSWORD) {
        this.AUTH_LDAP_5_BIND_PASSWORD = AUTH_LDAP_5_BIND_PASSWORD;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_5_BIND_PASSWORD(String AUTH_LDAP_5_BIND_PASSWORD) {
        this.AUTH_LDAP_5_BIND_PASSWORD = AUTH_LDAP_5_BIND_PASSWORD;
        return this;
    }

    /**
    * Additional options to set for the LDAP connection.  LDAP referrals are disabled by default (to prevent certain LDAP queries from hanging with AD). Option names should be strings (e.g. \"OPT_REFERRALS\"). Refer to https://www.python-ldap.org/doc/html/ldap.html#options for possible options and values that can be set.
    * @return AUTH_LDAP_5_CONNECTION_OPTIONS
    **/
    @JsonProperty("AUTH_LDAP_5_CONNECTION_OPTIONS")
    public Object getAUTHLDAP5CONNECTIONOPTIONS() {
        return AUTH_LDAP_5_CONNECTION_OPTIONS;
    }

    /**
     * Set AUTH_LDAP_5_CONNECTION_OPTIONS
     **/
    public void setAUTHLDAP5CONNECTIONOPTIONS(Object AUTH_LDAP_5_CONNECTION_OPTIONS) {
        this.AUTH_LDAP_5_CONNECTION_OPTIONS = AUTH_LDAP_5_CONNECTION_OPTIONS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_5_CONNECTION_OPTIONS(Object AUTH_LDAP_5_CONNECTION_OPTIONS) {
        this.AUTH_LDAP_5_CONNECTION_OPTIONS = AUTH_LDAP_5_CONNECTION_OPTIONS;
        return this;
    }

    /**
    * Group DN denied from login. If specified, user will not be allowed to login if a member of this group.  Only one deny group is supported.
    * @return AUTH_LDAP_5_DENY_GROUP
    **/
    @JsonProperty("AUTH_LDAP_5_DENY_GROUP")
    public String getAUTHLDAP5DENYGROUP() {
        return AUTH_LDAP_5_DENY_GROUP;
    }

    /**
     * Set AUTH_LDAP_5_DENY_GROUP
     **/
    public void setAUTHLDAP5DENYGROUP(String AUTH_LDAP_5_DENY_GROUP) {
        this.AUTH_LDAP_5_DENY_GROUP = AUTH_LDAP_5_DENY_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_5_DENY_GROUP(String AUTH_LDAP_5_DENY_GROUP) {
        this.AUTH_LDAP_5_DENY_GROUP = AUTH_LDAP_5_DENY_GROUP;
        return this;
    }

    /**
    * Users are mapped to organizations based on their membership in LDAP groups. This setting defines the LDAP search query to find groups. Unlike the user search, group search does not support LDAPSearchUnion.
    * @return AUTH_LDAP_5_GROUP_SEARCH
    **/
    @JsonProperty("AUTH_LDAP_5_GROUP_SEARCH")
    public List<String> getAUTHLDAP5GROUPSEARCH() {
        return AUTH_LDAP_5_GROUP_SEARCH;
    }

    /**
     * Set AUTH_LDAP_5_GROUP_SEARCH
     **/
    public void setAUTHLDAP5GROUPSEARCH(List<String> AUTH_LDAP_5_GROUP_SEARCH) {
        this.AUTH_LDAP_5_GROUP_SEARCH = AUTH_LDAP_5_GROUP_SEARCH;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_5_GROUP_SEARCH(List<String> AUTH_LDAP_5_GROUP_SEARCH) {
        this.AUTH_LDAP_5_GROUP_SEARCH = AUTH_LDAP_5_GROUP_SEARCH;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addAUTHLDAP5GROUPSEARCHItem(String AUTH_LDAP_5_GROUP_SEARCHItem) {
        this.AUTH_LDAP_5_GROUP_SEARCH.add(AUTH_LDAP_5_GROUP_SEARCHItem);
        return this;
    }

    /**
    * The group type may need to be changed based on the type of the LDAP server.  Values are listed at: https://django-auth-ldap.readthedocs.io/en/stable/groups.html#types-of-groups
    * @return AUTH_LDAP_5_GROUP_TYPE
    **/
    @JsonProperty("AUTH_LDAP_5_GROUP_TYPE")
    public String getAUTHLDAP5GROUPTYPE() {
        return AUTH_LDAP_5_GROUP_TYPE;
    }

    /**
     * Set AUTH_LDAP_5_GROUP_TYPE
     **/
    public void setAUTHLDAP5GROUPTYPE(String AUTH_LDAP_5_GROUP_TYPE) {
        this.AUTH_LDAP_5_GROUP_TYPE = AUTH_LDAP_5_GROUP_TYPE;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_5_GROUP_TYPE(String AUTH_LDAP_5_GROUP_TYPE) {
        this.AUTH_LDAP_5_GROUP_TYPE = AUTH_LDAP_5_GROUP_TYPE;
        return this;
    }

    /**
    * Key value parameters to send the chosen group type init method.
    * @return AUTH_LDAP_5_GROUP_TYPE_PARAMS
    **/
    @JsonProperty("AUTH_LDAP_5_GROUP_TYPE_PARAMS")
    public Object getAUTHLDAP5GROUPTYPEPARAMS() {
        return AUTH_LDAP_5_GROUP_TYPE_PARAMS;
    }

    /**
     * Set AUTH_LDAP_5_GROUP_TYPE_PARAMS
     **/
    public void setAUTHLDAP5GROUPTYPEPARAMS(Object AUTH_LDAP_5_GROUP_TYPE_PARAMS) {
        this.AUTH_LDAP_5_GROUP_TYPE_PARAMS = AUTH_LDAP_5_GROUP_TYPE_PARAMS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_5_GROUP_TYPE_PARAMS(Object AUTH_LDAP_5_GROUP_TYPE_PARAMS) {
        this.AUTH_LDAP_5_GROUP_TYPE_PARAMS = AUTH_LDAP_5_GROUP_TYPE_PARAMS;
        return this;
    }

    /**
    * Mapping between organization admins/users and LDAP groups. This controls which users are placed into which organizations relative to their LDAP group memberships. Configuration details are available in the documentation.
    * @return AUTH_LDAP_5_ORGANIZATION_MAP
    **/
    @JsonProperty("AUTH_LDAP_5_ORGANIZATION_MAP")
    public Object getAUTHLDAP5ORGANIZATIONMAP() {
        return AUTH_LDAP_5_ORGANIZATION_MAP;
    }

    /**
     * Set AUTH_LDAP_5_ORGANIZATION_MAP
     **/
    public void setAUTHLDAP5ORGANIZATIONMAP(Object AUTH_LDAP_5_ORGANIZATION_MAP) {
        this.AUTH_LDAP_5_ORGANIZATION_MAP = AUTH_LDAP_5_ORGANIZATION_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_5_ORGANIZATION_MAP(Object AUTH_LDAP_5_ORGANIZATION_MAP) {
        this.AUTH_LDAP_5_ORGANIZATION_MAP = AUTH_LDAP_5_ORGANIZATION_MAP;
        return this;
    }

    /**
    * Group DN required to login. If specified, user must be a member of this group to login via LDAP. If not set, everyone in LDAP that matches the user search will be able to login to the service. Only one require group is supported.
    * @return AUTH_LDAP_5_REQUIRE_GROUP
    **/
    @JsonProperty("AUTH_LDAP_5_REQUIRE_GROUP")
    public String getAUTHLDAP5REQUIREGROUP() {
        return AUTH_LDAP_5_REQUIRE_GROUP;
    }

    /**
     * Set AUTH_LDAP_5_REQUIRE_GROUP
     **/
    public void setAUTHLDAP5REQUIREGROUP(String AUTH_LDAP_5_REQUIRE_GROUP) {
        this.AUTH_LDAP_5_REQUIRE_GROUP = AUTH_LDAP_5_REQUIRE_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_5_REQUIRE_GROUP(String AUTH_LDAP_5_REQUIRE_GROUP) {
        this.AUTH_LDAP_5_REQUIRE_GROUP = AUTH_LDAP_5_REQUIRE_GROUP;
        return this;
    }

    /**
    * URI to connect to LDAP server, such as \"ldap://ldap.example.com:389\" (non-SSL) or \"ldaps://ldap.example.com:636\" (SSL). Multiple LDAP servers may be specified by separating with spaces or commas. LDAP authentication is disabled if this parameter is empty.
    * @return AUTH_LDAP_5_SERVER_URI
    **/
    @JsonProperty("AUTH_LDAP_5_SERVER_URI")
    public String getAUTHLDAP5SERVERURI() {
        return AUTH_LDAP_5_SERVER_URI;
    }

    /**
     * Set AUTH_LDAP_5_SERVER_URI
     **/
    public void setAUTHLDAP5SERVERURI(String AUTH_LDAP_5_SERVER_URI) {
        this.AUTH_LDAP_5_SERVER_URI = AUTH_LDAP_5_SERVER_URI;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_5_SERVER_URI(String AUTH_LDAP_5_SERVER_URI) {
        this.AUTH_LDAP_5_SERVER_URI = AUTH_LDAP_5_SERVER_URI;
        return this;
    }

    /**
    * Whether to enable TLS when the LDAP connection is not using SSL.
    * @return AUTH_LDAP_5_START_TLS
    **/
    @JsonProperty("AUTH_LDAP_5_START_TLS")
    public Boolean getAUTHLDAP5STARTTLS() {
        return AUTH_LDAP_5_START_TLS;
    }

    /**
     * Set AUTH_LDAP_5_START_TLS
     **/
    public void setAUTHLDAP5STARTTLS(Boolean AUTH_LDAP_5_START_TLS) {
        this.AUTH_LDAP_5_START_TLS = AUTH_LDAP_5_START_TLS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_5_START_TLS(Boolean AUTH_LDAP_5_START_TLS) {
        this.AUTH_LDAP_5_START_TLS = AUTH_LDAP_5_START_TLS;
        return this;
    }

    /**
    * Mapping between team members (users) and LDAP groups. Configuration details are available in the documentation.
    * @return AUTH_LDAP_5_TEAM_MAP
    **/
    @JsonProperty("AUTH_LDAP_5_TEAM_MAP")
    public Object getAUTHLDAP5TEAMMAP() {
        return AUTH_LDAP_5_TEAM_MAP;
    }

    /**
     * Set AUTH_LDAP_5_TEAM_MAP
     **/
    public void setAUTHLDAP5TEAMMAP(Object AUTH_LDAP_5_TEAM_MAP) {
        this.AUTH_LDAP_5_TEAM_MAP = AUTH_LDAP_5_TEAM_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_5_TEAM_MAP(Object AUTH_LDAP_5_TEAM_MAP) {
        this.AUTH_LDAP_5_TEAM_MAP = AUTH_LDAP_5_TEAM_MAP;
        return this;
    }

    /**
    * Mapping of LDAP user schema to API user attributes. The default setting is valid for ActiveDirectory but users with other LDAP configurations may need to change the values. Refer to the documentation for additional details.
    * @return AUTH_LDAP_5_USER_ATTR_MAP
    **/
    @JsonProperty("AUTH_LDAP_5_USER_ATTR_MAP")
    public Object getAUTHLDAP5USERATTRMAP() {
        return AUTH_LDAP_5_USER_ATTR_MAP;
    }

    /**
     * Set AUTH_LDAP_5_USER_ATTR_MAP
     **/
    public void setAUTHLDAP5USERATTRMAP(Object AUTH_LDAP_5_USER_ATTR_MAP) {
        this.AUTH_LDAP_5_USER_ATTR_MAP = AUTH_LDAP_5_USER_ATTR_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_5_USER_ATTR_MAP(Object AUTH_LDAP_5_USER_ATTR_MAP) {
        this.AUTH_LDAP_5_USER_ATTR_MAP = AUTH_LDAP_5_USER_ATTR_MAP;
        return this;
    }

    /**
    * Alternative to user search, if user DNs are all of the same format. This approach is more efficient for user lookups than searching if it is usable in your organizational environment. If this setting has a value it will be used instead of AUTH_LDAP_USER_SEARCH.
    * @return AUTH_LDAP_5_USER_DN_TEMPLATE
    **/
    @JsonProperty("AUTH_LDAP_5_USER_DN_TEMPLATE")
    public String getAUTHLDAP5USERDNTEMPLATE() {
        return AUTH_LDAP_5_USER_DN_TEMPLATE;
    }

    /**
     * Set AUTH_LDAP_5_USER_DN_TEMPLATE
     **/
    public void setAUTHLDAP5USERDNTEMPLATE(String AUTH_LDAP_5_USER_DN_TEMPLATE) {
        this.AUTH_LDAP_5_USER_DN_TEMPLATE = AUTH_LDAP_5_USER_DN_TEMPLATE;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_5_USER_DN_TEMPLATE(String AUTH_LDAP_5_USER_DN_TEMPLATE) {
        this.AUTH_LDAP_5_USER_DN_TEMPLATE = AUTH_LDAP_5_USER_DN_TEMPLATE;
        return this;
    }

    /**
    * Retrieve users from a given group. At this time, superuser and system auditors are the only groups supported. Refer to the documentation for more detail.
    * @return AUTH_LDAP_5_USER_FLAGS_BY_GROUP
    **/
    @JsonProperty("AUTH_LDAP_5_USER_FLAGS_BY_GROUP")
    public Object getAUTHLDAP5USERFLAGSBYGROUP() {
        return AUTH_LDAP_5_USER_FLAGS_BY_GROUP;
    }

    /**
     * Set AUTH_LDAP_5_USER_FLAGS_BY_GROUP
     **/
    public void setAUTHLDAP5USERFLAGSBYGROUP(Object AUTH_LDAP_5_USER_FLAGS_BY_GROUP) {
        this.AUTH_LDAP_5_USER_FLAGS_BY_GROUP = AUTH_LDAP_5_USER_FLAGS_BY_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_5_USER_FLAGS_BY_GROUP(Object AUTH_LDAP_5_USER_FLAGS_BY_GROUP) {
        this.AUTH_LDAP_5_USER_FLAGS_BY_GROUP = AUTH_LDAP_5_USER_FLAGS_BY_GROUP;
        return this;
    }

    /**
    * LDAP search query to find users.  Any user that matches the given pattern will be able to login to the service.  The user should also be mapped into an organization (as defined in the AUTH_LDAP_ORGANIZATION_MAP setting).  If multiple search queries need to be supported use of \"LDAPUnion\" is possible. See the documentation for details.
    * @return AUTH_LDAP_5_USER_SEARCH
    **/
    @JsonProperty("AUTH_LDAP_5_USER_SEARCH")
    public List<String> getAUTHLDAP5USERSEARCH() {
        return AUTH_LDAP_5_USER_SEARCH;
    }

    /**
     * Set AUTH_LDAP_5_USER_SEARCH
     **/
    public void setAUTHLDAP5USERSEARCH(List<String> AUTH_LDAP_5_USER_SEARCH) {
        this.AUTH_LDAP_5_USER_SEARCH = AUTH_LDAP_5_USER_SEARCH;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_5_USER_SEARCH(List<String> AUTH_LDAP_5_USER_SEARCH) {
        this.AUTH_LDAP_5_USER_SEARCH = AUTH_LDAP_5_USER_SEARCH;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addAUTHLDAP5USERSEARCHItem(String AUTH_LDAP_5_USER_SEARCHItem) {
        this.AUTH_LDAP_5_USER_SEARCH.add(AUTH_LDAP_5_USER_SEARCHItem);
        return this;
    }

    /**
    * DN (Distinguished Name) of user to bind for all search queries. This is the system user account we will use to login to query LDAP for other user information. Refer to the documentation for example syntax.
    * @return AUTH_LDAP_BIND_DN
    **/
    @JsonProperty("AUTH_LDAP_BIND_DN")
    public String getAUTHLDAPBINDDN() {
        return AUTH_LDAP_BIND_DN;
    }

    /**
     * Set AUTH_LDAP_BIND_DN
     **/
    public void setAUTHLDAPBINDDN(String AUTH_LDAP_BIND_DN) {
        this.AUTH_LDAP_BIND_DN = AUTH_LDAP_BIND_DN;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_BIND_DN(String AUTH_LDAP_BIND_DN) {
        this.AUTH_LDAP_BIND_DN = AUTH_LDAP_BIND_DN;
        return this;
    }

    /**
    * Password used to bind LDAP user account.
    * @return AUTH_LDAP_BIND_PASSWORD
    **/
    @JsonProperty("AUTH_LDAP_BIND_PASSWORD")
    public String getAUTHLDAPBINDPASSWORD() {
        return AUTH_LDAP_BIND_PASSWORD;
    }

    /**
     * Set AUTH_LDAP_BIND_PASSWORD
     **/
    public void setAUTHLDAPBINDPASSWORD(String AUTH_LDAP_BIND_PASSWORD) {
        this.AUTH_LDAP_BIND_PASSWORD = AUTH_LDAP_BIND_PASSWORD;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_BIND_PASSWORD(String AUTH_LDAP_BIND_PASSWORD) {
        this.AUTH_LDAP_BIND_PASSWORD = AUTH_LDAP_BIND_PASSWORD;
        return this;
    }

    /**
    * Additional options to set for the LDAP connection.  LDAP referrals are disabled by default (to prevent certain LDAP queries from hanging with AD). Option names should be strings (e.g. \"OPT_REFERRALS\"). Refer to https://www.python-ldap.org/doc/html/ldap.html#options for possible options and values that can be set.
    * @return AUTH_LDAP_CONNECTION_OPTIONS
    **/
    @JsonProperty("AUTH_LDAP_CONNECTION_OPTIONS")
    public Object getAUTHLDAPCONNECTIONOPTIONS() {
        return AUTH_LDAP_CONNECTION_OPTIONS;
    }

    /**
     * Set AUTH_LDAP_CONNECTION_OPTIONS
     **/
    public void setAUTHLDAPCONNECTIONOPTIONS(Object AUTH_LDAP_CONNECTION_OPTIONS) {
        this.AUTH_LDAP_CONNECTION_OPTIONS = AUTH_LDAP_CONNECTION_OPTIONS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_CONNECTION_OPTIONS(Object AUTH_LDAP_CONNECTION_OPTIONS) {
        this.AUTH_LDAP_CONNECTION_OPTIONS = AUTH_LDAP_CONNECTION_OPTIONS;
        return this;
    }

    /**
    * Group DN denied from login. If specified, user will not be allowed to login if a member of this group.  Only one deny group is supported.
    * @return AUTH_LDAP_DENY_GROUP
    **/
    @JsonProperty("AUTH_LDAP_DENY_GROUP")
    public String getAUTHLDAPDENYGROUP() {
        return AUTH_LDAP_DENY_GROUP;
    }

    /**
     * Set AUTH_LDAP_DENY_GROUP
     **/
    public void setAUTHLDAPDENYGROUP(String AUTH_LDAP_DENY_GROUP) {
        this.AUTH_LDAP_DENY_GROUP = AUTH_LDAP_DENY_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_DENY_GROUP(String AUTH_LDAP_DENY_GROUP) {
        this.AUTH_LDAP_DENY_GROUP = AUTH_LDAP_DENY_GROUP;
        return this;
    }

    /**
    * Users are mapped to organizations based on their membership in LDAP groups. This setting defines the LDAP search query to find groups. Unlike the user search, group search does not support LDAPSearchUnion.
    * @return AUTH_LDAP_GROUP_SEARCH
    **/
    @JsonProperty("AUTH_LDAP_GROUP_SEARCH")
    public List<String> getAUTHLDAPGROUPSEARCH() {
        return AUTH_LDAP_GROUP_SEARCH;
    }

    /**
     * Set AUTH_LDAP_GROUP_SEARCH
     **/
    public void setAUTHLDAPGROUPSEARCH(List<String> AUTH_LDAP_GROUP_SEARCH) {
        this.AUTH_LDAP_GROUP_SEARCH = AUTH_LDAP_GROUP_SEARCH;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_GROUP_SEARCH(List<String> AUTH_LDAP_GROUP_SEARCH) {
        this.AUTH_LDAP_GROUP_SEARCH = AUTH_LDAP_GROUP_SEARCH;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addAUTHLDAPGROUPSEARCHItem(String AUTH_LDAP_GROUP_SEARCHItem) {
        this.AUTH_LDAP_GROUP_SEARCH.add(AUTH_LDAP_GROUP_SEARCHItem);
        return this;
    }

    /**
    * The group type may need to be changed based on the type of the LDAP server.  Values are listed at: https://django-auth-ldap.readthedocs.io/en/stable/groups.html#types-of-groups
    * @return AUTH_LDAP_GROUP_TYPE
    **/
    @JsonProperty("AUTH_LDAP_GROUP_TYPE")
    public String getAUTHLDAPGROUPTYPE() {
        return AUTH_LDAP_GROUP_TYPE;
    }

    /**
     * Set AUTH_LDAP_GROUP_TYPE
     **/
    public void setAUTHLDAPGROUPTYPE(String AUTH_LDAP_GROUP_TYPE) {
        this.AUTH_LDAP_GROUP_TYPE = AUTH_LDAP_GROUP_TYPE;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_GROUP_TYPE(String AUTH_LDAP_GROUP_TYPE) {
        this.AUTH_LDAP_GROUP_TYPE = AUTH_LDAP_GROUP_TYPE;
        return this;
    }

    /**
    * Key value parameters to send the chosen group type init method.
    * @return AUTH_LDAP_GROUP_TYPE_PARAMS
    **/
    @JsonProperty("AUTH_LDAP_GROUP_TYPE_PARAMS")
    public Object getAUTHLDAPGROUPTYPEPARAMS() {
        return AUTH_LDAP_GROUP_TYPE_PARAMS;
    }

    /**
     * Set AUTH_LDAP_GROUP_TYPE_PARAMS
     **/
    public void setAUTHLDAPGROUPTYPEPARAMS(Object AUTH_LDAP_GROUP_TYPE_PARAMS) {
        this.AUTH_LDAP_GROUP_TYPE_PARAMS = AUTH_LDAP_GROUP_TYPE_PARAMS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_GROUP_TYPE_PARAMS(Object AUTH_LDAP_GROUP_TYPE_PARAMS) {
        this.AUTH_LDAP_GROUP_TYPE_PARAMS = AUTH_LDAP_GROUP_TYPE_PARAMS;
        return this;
    }

    /**
    * Mapping between organization admins/users and LDAP groups. This controls which users are placed into which organizations relative to their LDAP group memberships. Configuration details are available in the documentation.
    * @return AUTH_LDAP_ORGANIZATION_MAP
    **/
    @JsonProperty("AUTH_LDAP_ORGANIZATION_MAP")
    public Object getAUTHLDAPORGANIZATIONMAP() {
        return AUTH_LDAP_ORGANIZATION_MAP;
    }

    /**
     * Set AUTH_LDAP_ORGANIZATION_MAP
     **/
    public void setAUTHLDAPORGANIZATIONMAP(Object AUTH_LDAP_ORGANIZATION_MAP) {
        this.AUTH_LDAP_ORGANIZATION_MAP = AUTH_LDAP_ORGANIZATION_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_ORGANIZATION_MAP(Object AUTH_LDAP_ORGANIZATION_MAP) {
        this.AUTH_LDAP_ORGANIZATION_MAP = AUTH_LDAP_ORGANIZATION_MAP;
        return this;
    }

    /**
    * Group DN required to login. If specified, user must be a member of this group to login via LDAP. If not set, everyone in LDAP that matches the user search will be able to login to the service. Only one require group is supported.
    * @return AUTH_LDAP_REQUIRE_GROUP
    **/
    @JsonProperty("AUTH_LDAP_REQUIRE_GROUP")
    public String getAUTHLDAPREQUIREGROUP() {
        return AUTH_LDAP_REQUIRE_GROUP;
    }

    /**
     * Set AUTH_LDAP_REQUIRE_GROUP
     **/
    public void setAUTHLDAPREQUIREGROUP(String AUTH_LDAP_REQUIRE_GROUP) {
        this.AUTH_LDAP_REQUIRE_GROUP = AUTH_LDAP_REQUIRE_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_REQUIRE_GROUP(String AUTH_LDAP_REQUIRE_GROUP) {
        this.AUTH_LDAP_REQUIRE_GROUP = AUTH_LDAP_REQUIRE_GROUP;
        return this;
    }

    /**
    * URI to connect to LDAP server, such as \"ldap://ldap.example.com:389\" (non-SSL) or \"ldaps://ldap.example.com:636\" (SSL). Multiple LDAP servers may be specified by separating with spaces or commas. LDAP authentication is disabled if this parameter is empty.
    * @return AUTH_LDAP_SERVER_URI
    **/
    @JsonProperty("AUTH_LDAP_SERVER_URI")
    public String getAUTHLDAPSERVERURI() {
        return AUTH_LDAP_SERVER_URI;
    }

    /**
     * Set AUTH_LDAP_SERVER_URI
     **/
    public void setAUTHLDAPSERVERURI(String AUTH_LDAP_SERVER_URI) {
        this.AUTH_LDAP_SERVER_URI = AUTH_LDAP_SERVER_URI;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_SERVER_URI(String AUTH_LDAP_SERVER_URI) {
        this.AUTH_LDAP_SERVER_URI = AUTH_LDAP_SERVER_URI;
        return this;
    }

    /**
    * Whether to enable TLS when the LDAP connection is not using SSL.
    * @return AUTH_LDAP_START_TLS
    **/
    @JsonProperty("AUTH_LDAP_START_TLS")
    public Boolean getAUTHLDAPSTARTTLS() {
        return AUTH_LDAP_START_TLS;
    }

    /**
     * Set AUTH_LDAP_START_TLS
     **/
    public void setAUTHLDAPSTARTTLS(Boolean AUTH_LDAP_START_TLS) {
        this.AUTH_LDAP_START_TLS = AUTH_LDAP_START_TLS;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_START_TLS(Boolean AUTH_LDAP_START_TLS) {
        this.AUTH_LDAP_START_TLS = AUTH_LDAP_START_TLS;
        return this;
    }

    /**
    * Mapping between team members (users) and LDAP groups. Configuration details are available in the documentation.
    * @return AUTH_LDAP_TEAM_MAP
    **/
    @JsonProperty("AUTH_LDAP_TEAM_MAP")
    public Object getAUTHLDAPTEAMMAP() {
        return AUTH_LDAP_TEAM_MAP;
    }

    /**
     * Set AUTH_LDAP_TEAM_MAP
     **/
    public void setAUTHLDAPTEAMMAP(Object AUTH_LDAP_TEAM_MAP) {
        this.AUTH_LDAP_TEAM_MAP = AUTH_LDAP_TEAM_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_TEAM_MAP(Object AUTH_LDAP_TEAM_MAP) {
        this.AUTH_LDAP_TEAM_MAP = AUTH_LDAP_TEAM_MAP;
        return this;
    }

    /**
    * Mapping of LDAP user schema to API user attributes. The default setting is valid for ActiveDirectory but users with other LDAP configurations may need to change the values. Refer to the documentation for additional details.
    * @return AUTH_LDAP_USER_ATTR_MAP
    **/
    @JsonProperty("AUTH_LDAP_USER_ATTR_MAP")
    public Object getAUTHLDAPUSERATTRMAP() {
        return AUTH_LDAP_USER_ATTR_MAP;
    }

    /**
     * Set AUTH_LDAP_USER_ATTR_MAP
     **/
    public void setAUTHLDAPUSERATTRMAP(Object AUTH_LDAP_USER_ATTR_MAP) {
        this.AUTH_LDAP_USER_ATTR_MAP = AUTH_LDAP_USER_ATTR_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_USER_ATTR_MAP(Object AUTH_LDAP_USER_ATTR_MAP) {
        this.AUTH_LDAP_USER_ATTR_MAP = AUTH_LDAP_USER_ATTR_MAP;
        return this;
    }

    /**
    * Alternative to user search, if user DNs are all of the same format. This approach is more efficient for user lookups than searching if it is usable in your organizational environment. If this setting has a value it will be used instead of AUTH_LDAP_USER_SEARCH.
    * @return AUTH_LDAP_USER_DN_TEMPLATE
    **/
    @JsonProperty("AUTH_LDAP_USER_DN_TEMPLATE")
    public String getAUTHLDAPUSERDNTEMPLATE() {
        return AUTH_LDAP_USER_DN_TEMPLATE;
    }

    /**
     * Set AUTH_LDAP_USER_DN_TEMPLATE
     **/
    public void setAUTHLDAPUSERDNTEMPLATE(String AUTH_LDAP_USER_DN_TEMPLATE) {
        this.AUTH_LDAP_USER_DN_TEMPLATE = AUTH_LDAP_USER_DN_TEMPLATE;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_USER_DN_TEMPLATE(String AUTH_LDAP_USER_DN_TEMPLATE) {
        this.AUTH_LDAP_USER_DN_TEMPLATE = AUTH_LDAP_USER_DN_TEMPLATE;
        return this;
    }

    /**
    * Retrieve users from a given group. At this time, superuser and system auditors are the only groups supported. Refer to the documentation for more detail.
    * @return AUTH_LDAP_USER_FLAGS_BY_GROUP
    **/
    @JsonProperty("AUTH_LDAP_USER_FLAGS_BY_GROUP")
    public Object getAUTHLDAPUSERFLAGSBYGROUP() {
        return AUTH_LDAP_USER_FLAGS_BY_GROUP;
    }

    /**
     * Set AUTH_LDAP_USER_FLAGS_BY_GROUP
     **/
    public void setAUTHLDAPUSERFLAGSBYGROUP(Object AUTH_LDAP_USER_FLAGS_BY_GROUP) {
        this.AUTH_LDAP_USER_FLAGS_BY_GROUP = AUTH_LDAP_USER_FLAGS_BY_GROUP;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_USER_FLAGS_BY_GROUP(Object AUTH_LDAP_USER_FLAGS_BY_GROUP) {
        this.AUTH_LDAP_USER_FLAGS_BY_GROUP = AUTH_LDAP_USER_FLAGS_BY_GROUP;
        return this;
    }

    /**
    * LDAP search query to find users.  Any user that matches the given pattern will be able to login to the service.  The user should also be mapped into an organization (as defined in the AUTH_LDAP_ORGANIZATION_MAP setting).  If multiple search queries need to be supported use of \"LDAPUnion\" is possible. See the documentation for details.
    * @return AUTH_LDAP_USER_SEARCH
    **/
    @JsonProperty("AUTH_LDAP_USER_SEARCH")
    public List<String> getAUTHLDAPUSERSEARCH() {
        return AUTH_LDAP_USER_SEARCH;
    }

    /**
     * Set AUTH_LDAP_USER_SEARCH
     **/
    public void setAUTHLDAPUSERSEARCH(List<String> AUTH_LDAP_USER_SEARCH) {
        this.AUTH_LDAP_USER_SEARCH = AUTH_LDAP_USER_SEARCH;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTH_LDAP_USER_SEARCH(List<String> AUTH_LDAP_USER_SEARCH) {
        this.AUTH_LDAP_USER_SEARCH = AUTH_LDAP_USER_SEARCH;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addAUTHLDAPUSERSEARCHItem(String AUTH_LDAP_USER_SEARCHItem) {
        this.AUTH_LDAP_USER_SEARCH.add(AUTH_LDAP_USER_SEARCHItem);
        return this;
    }

    /**
    * Interval (in seconds) between data gathering.
    * @return AUTOMATION_ANALYTICS_GATHER_INTERVAL
    **/
    @JsonProperty("AUTOMATION_ANALYTICS_GATHER_INTERVAL")
    public Integer getAUTOMATIONANALYTICSGATHERINTERVAL() {
        return AUTOMATION_ANALYTICS_GATHER_INTERVAL;
    }

    /**
     * Set AUTOMATION_ANALYTICS_GATHER_INTERVAL
     **/
    public void setAUTOMATIONANALYTICSGATHERINTERVAL(Integer AUTOMATION_ANALYTICS_GATHER_INTERVAL) {
        this.AUTOMATION_ANALYTICS_GATHER_INTERVAL = AUTOMATION_ANALYTICS_GATHER_INTERVAL;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTOMATION_ANALYTICS_GATHER_INTERVAL(Integer AUTOMATION_ANALYTICS_GATHER_INTERVAL) {
        this.AUTOMATION_ANALYTICS_GATHER_INTERVAL = AUTOMATION_ANALYTICS_GATHER_INTERVAL;
        return this;
    }

    /**
    * Get AUTOMATION_ANALYTICS_LAST_ENTRIES
    * @return AUTOMATION_ANALYTICS_LAST_ENTRIES
    **/
    @JsonProperty("AUTOMATION_ANALYTICS_LAST_ENTRIES")
    public String getAUTOMATIONANALYTICSLASTENTRIES() {
        return AUTOMATION_ANALYTICS_LAST_ENTRIES;
    }

    /**
     * Set AUTOMATION_ANALYTICS_LAST_ENTRIES
     **/
    public void setAUTOMATIONANALYTICSLASTENTRIES(String AUTOMATION_ANALYTICS_LAST_ENTRIES) {
        this.AUTOMATION_ANALYTICS_LAST_ENTRIES = AUTOMATION_ANALYTICS_LAST_ENTRIES;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTOMATION_ANALYTICS_LAST_ENTRIES(String AUTOMATION_ANALYTICS_LAST_ENTRIES) {
        this.AUTOMATION_ANALYTICS_LAST_ENTRIES = AUTOMATION_ANALYTICS_LAST_ENTRIES;
        return this;
    }

    /**
    * Get AUTOMATION_ANALYTICS_LAST_GATHER
    * @return AUTOMATION_ANALYTICS_LAST_GATHER
    **/
    @JsonProperty("AUTOMATION_ANALYTICS_LAST_GATHER")
    public String getAUTOMATIONANALYTICSLASTGATHER() {
        return AUTOMATION_ANALYTICS_LAST_GATHER;
    }

    /**
     * Set AUTOMATION_ANALYTICS_LAST_GATHER
     **/
    public void setAUTOMATIONANALYTICSLASTGATHER(String AUTOMATION_ANALYTICS_LAST_GATHER) {
        this.AUTOMATION_ANALYTICS_LAST_GATHER = AUTOMATION_ANALYTICS_LAST_GATHER;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTOMATION_ANALYTICS_LAST_GATHER(String AUTOMATION_ANALYTICS_LAST_GATHER) {
        this.AUTOMATION_ANALYTICS_LAST_GATHER = AUTOMATION_ANALYTICS_LAST_GATHER;
        return this;
    }

    /**
    * This setting is used to to configure the upload URL for data collection for Automation Analytics.
    * @return AUTOMATION_ANALYTICS_URL
    **/
    @JsonProperty("AUTOMATION_ANALYTICS_URL")
    public String getAUTOMATIONANALYTICSURL() {
        return AUTOMATION_ANALYTICS_URL;
    }

    /**
     * Set AUTOMATION_ANALYTICS_URL
     **/
    public void setAUTOMATIONANALYTICSURL(String AUTOMATION_ANALYTICS_URL) {
        this.AUTOMATION_ANALYTICS_URL = AUTOMATION_ANALYTICS_URL;
    }

    public SettingsSettingsLoggingTestCreateRequest AUTOMATION_ANALYTICS_URL(String AUTOMATION_ANALYTICS_URL) {
        this.AUTOMATION_ANALYTICS_URL = AUTOMATION_ANALYTICS_URL;
        return this;
    }

    /**
    * List of paths to search for extra callback plugins to be used when running jobs. Enter one path per line.
    * @return AWX_ANSIBLE_CALLBACK_PLUGINS
    **/
    @JsonProperty("AWX_ANSIBLE_CALLBACK_PLUGINS")
    public List<String> getAWXANSIBLECALLBACKPLUGINS() {
        return AWX_ANSIBLE_CALLBACK_PLUGINS;
    }

    /**
     * Set AWX_ANSIBLE_CALLBACK_PLUGINS
     **/
    public void setAWXANSIBLECALLBACKPLUGINS(List<String> AWX_ANSIBLE_CALLBACK_PLUGINS) {
        this.AWX_ANSIBLE_CALLBACK_PLUGINS = AWX_ANSIBLE_CALLBACK_PLUGINS;
    }

    public SettingsSettingsLoggingTestCreateRequest AWX_ANSIBLE_CALLBACK_PLUGINS(List<String> AWX_ANSIBLE_CALLBACK_PLUGINS) {
        this.AWX_ANSIBLE_CALLBACK_PLUGINS = AWX_ANSIBLE_CALLBACK_PLUGINS;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addAWXANSIBLECALLBACKPLUGINSItem(String AWX_ANSIBLE_CALLBACK_PLUGINSItem) {
        this.AWX_ANSIBLE_CALLBACK_PLUGINS.add(AWX_ANSIBLE_CALLBACK_PLUGINSItem);
        return this;
    }

    /**
    * Allows collections to be dynamically downloaded from a requirements.yml file for SCM projects.
    * @return AWX_COLLECTIONS_ENABLED
    **/
    @JsonProperty("AWX_COLLECTIONS_ENABLED")
    public Boolean getAWXCOLLECTIONSENABLED() {
        return AWX_COLLECTIONS_ENABLED;
    }

    /**
     * Set AWX_COLLECTIONS_ENABLED
     **/
    public void setAWXCOLLECTIONSENABLED(Boolean AWX_COLLECTIONS_ENABLED) {
        this.AWX_COLLECTIONS_ENABLED = AWX_COLLECTIONS_ENABLED;
    }

    public SettingsSettingsLoggingTestCreateRequest AWX_COLLECTIONS_ENABLED(Boolean AWX_COLLECTIONS_ENABLED) {
        this.AWX_COLLECTIONS_ENABLED = AWX_COLLECTIONS_ENABLED;
        return this;
    }

    /**
    * The directory in which the service will create new temporary directories for job execution and isolation (such as credential files).
    * @return AWX_ISOLATION_BASE_PATH
    **/
    @JsonProperty("AWX_ISOLATION_BASE_PATH")
    public String getAWXISOLATIONBASEPATH() {
        return AWX_ISOLATION_BASE_PATH;
    }

    /**
     * Set AWX_ISOLATION_BASE_PATH
     **/
    public void setAWXISOLATIONBASEPATH(String AWX_ISOLATION_BASE_PATH) {
        this.AWX_ISOLATION_BASE_PATH = AWX_ISOLATION_BASE_PATH;
    }

    public SettingsSettingsLoggingTestCreateRequest AWX_ISOLATION_BASE_PATH(String AWX_ISOLATION_BASE_PATH) {
        this.AWX_ISOLATION_BASE_PATH = AWX_ISOLATION_BASE_PATH;
        return this;
    }

    /**
    * List of paths that would otherwise be hidden to expose to isolated jobs. Enter one path per line. Volumes will be mounted from the execution node to the container. The supported format is HOST-DIR[:CONTAINER-DIR[:OPTIONS]]. 
    * @return AWX_ISOLATION_SHOW_PATHS
    **/
    @JsonProperty("AWX_ISOLATION_SHOW_PATHS")
    public List<String> getAWXISOLATIONSHOWPATHS() {
        return AWX_ISOLATION_SHOW_PATHS;
    }

    /**
     * Set AWX_ISOLATION_SHOW_PATHS
     **/
    public void setAWXISOLATIONSHOWPATHS(List<String> AWX_ISOLATION_SHOW_PATHS) {
        this.AWX_ISOLATION_SHOW_PATHS = AWX_ISOLATION_SHOW_PATHS;
    }

    public SettingsSettingsLoggingTestCreateRequest AWX_ISOLATION_SHOW_PATHS(List<String> AWX_ISOLATION_SHOW_PATHS) {
        this.AWX_ISOLATION_SHOW_PATHS = AWX_ISOLATION_SHOW_PATHS;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addAWXISOLATIONSHOWPATHSItem(String AWX_ISOLATION_SHOW_PATHSItem) {
        this.AWX_ISOLATION_SHOW_PATHS.add(AWX_ISOLATION_SHOW_PATHSItem);
        return this;
    }

    /**
    * Expose paths via hostPath for the Pods created by a Container Group. HostPath volumes present many security risks, and it is a best practice to avoid the use of HostPaths when possible. 
    * @return AWX_MOUNT_ISOLATED_PATHS_ON_K8S
    **/
    @JsonProperty("AWX_MOUNT_ISOLATED_PATHS_ON_K8S")
    public Boolean getAWXMOUNTISOLATEDPATHSONK8S() {
        return AWX_MOUNT_ISOLATED_PATHS_ON_K8S;
    }

    /**
     * Set AWX_MOUNT_ISOLATED_PATHS_ON_K8S
     **/
    public void setAWXMOUNTISOLATEDPATHSONK8S(Boolean AWX_MOUNT_ISOLATED_PATHS_ON_K8S) {
        this.AWX_MOUNT_ISOLATED_PATHS_ON_K8S = AWX_MOUNT_ISOLATED_PATHS_ON_K8S;
    }

    public SettingsSettingsLoggingTestCreateRequest AWX_MOUNT_ISOLATED_PATHS_ON_K8S(Boolean AWX_MOUNT_ISOLATED_PATHS_ON_K8S) {
        this.AWX_MOUNT_ISOLATED_PATHS_ON_K8S = AWX_MOUNT_ISOLATED_PATHS_ON_K8S;
        return this;
    }

    /**
    * Allows roles to be dynamically downloaded from a requirements.yml file for SCM projects.
    * @return AWX_ROLES_ENABLED
    **/
    @JsonProperty("AWX_ROLES_ENABLED")
    public Boolean getAWXROLESENABLED() {
        return AWX_ROLES_ENABLED;
    }

    /**
     * Set AWX_ROLES_ENABLED
     **/
    public void setAWXROLESENABLED(Boolean AWX_ROLES_ENABLED) {
        this.AWX_ROLES_ENABLED = AWX_ROLES_ENABLED;
    }

    public SettingsSettingsLoggingTestCreateRequest AWX_ROLES_ENABLED(Boolean AWX_ROLES_ENABLED) {
        this.AWX_ROLES_ENABLED = AWX_ROLES_ENABLED;
        return this;
    }

    /**
    * Only applies to jobs running in a Container Group. If not 0, send a message every so-many seconds to keep connection open.
    * @return AWX_RUNNER_KEEPALIVE_SECONDS
    **/
    @JsonProperty("AWX_RUNNER_KEEPALIVE_SECONDS")
    public Integer getAWXRUNNERKEEPALIVESECONDS() {
        return AWX_RUNNER_KEEPALIVE_SECONDS;
    }

    /**
     * Set AWX_RUNNER_KEEPALIVE_SECONDS
     **/
    public void setAWXRUNNERKEEPALIVESECONDS(Integer AWX_RUNNER_KEEPALIVE_SECONDS) {
        this.AWX_RUNNER_KEEPALIVE_SECONDS = AWX_RUNNER_KEEPALIVE_SECONDS;
    }

    public SettingsSettingsLoggingTestCreateRequest AWX_RUNNER_KEEPALIVE_SECONDS(Integer AWX_RUNNER_KEEPALIVE_SECONDS) {
        this.AWX_RUNNER_KEEPALIVE_SECONDS = AWX_RUNNER_KEEPALIVE_SECONDS;
        return this;
    }

    /**
    * Follow symbolic links when scanning for playbooks. Be aware that setting this to True can lead to infinite recursion if a link points to a parent directory of itself.
    * @return AWX_SHOW_PLAYBOOK_LINKS
    **/
    @JsonProperty("AWX_SHOW_PLAYBOOK_LINKS")
    public Boolean getAWXSHOWPLAYBOOKLINKS() {
        return AWX_SHOW_PLAYBOOK_LINKS;
    }

    /**
     * Set AWX_SHOW_PLAYBOOK_LINKS
     **/
    public void setAWXSHOWPLAYBOOKLINKS(Boolean AWX_SHOW_PLAYBOOK_LINKS) {
        this.AWX_SHOW_PLAYBOOK_LINKS = AWX_SHOW_PLAYBOOK_LINKS;
    }

    public SettingsSettingsLoggingTestCreateRequest AWX_SHOW_PLAYBOOK_LINKS(Boolean AWX_SHOW_PLAYBOOK_LINKS) {
        this.AWX_SHOW_PLAYBOOK_LINKS = AWX_SHOW_PLAYBOOK_LINKS;
        return this;
    }

    /**
    * Additional environment variables set for playbook runs, inventory updates, project updates, and notification sending.
    * @return AWX_TASK_ENV
    **/
    @JsonProperty("AWX_TASK_ENV")
    public Object getAWXTASKENV() {
        return AWX_TASK_ENV;
    }

    /**
     * Set AWX_TASK_ENV
     **/
    public void setAWXTASKENV(Object AWX_TASK_ENV) {
        this.AWX_TASK_ENV = AWX_TASK_ENV;
    }

    public SettingsSettingsLoggingTestCreateRequest AWX_TASK_ENV(Object AWX_TASK_ENV) {
        this.AWX_TASK_ENV = AWX_TASK_ENV;
        return this;
    }

    /**
    * Max number of hosts to allow to be created in a single bulk action
    * @return BULK_HOST_MAX_CREATE
    **/
    @JsonProperty("BULK_HOST_MAX_CREATE")
    public Integer getBULKHOSTMAXCREATE() {
        return BULK_HOST_MAX_CREATE;
    }

    /**
     * Set BULK_HOST_MAX_CREATE
     **/
    public void setBULKHOSTMAXCREATE(Integer BULK_HOST_MAX_CREATE) {
        this.BULK_HOST_MAX_CREATE = BULK_HOST_MAX_CREATE;
    }

    public SettingsSettingsLoggingTestCreateRequest BULK_HOST_MAX_CREATE(Integer BULK_HOST_MAX_CREATE) {
        this.BULK_HOST_MAX_CREATE = BULK_HOST_MAX_CREATE;
        return this;
    }

    /**
    * Max jobs to allow bulk jobs to launch
    * @return BULK_JOB_MAX_LAUNCH
    **/
    @JsonProperty("BULK_JOB_MAX_LAUNCH")
    public Integer getBULKJOBMAXLAUNCH() {
        return BULK_JOB_MAX_LAUNCH;
    }

    /**
     * Set BULK_JOB_MAX_LAUNCH
     **/
    public void setBULKJOBMAXLAUNCH(Integer BULK_JOB_MAX_LAUNCH) {
        this.BULK_JOB_MAX_LAUNCH = BULK_JOB_MAX_LAUNCH;
    }

    public SettingsSettingsLoggingTestCreateRequest BULK_JOB_MAX_LAUNCH(Integer BULK_JOB_MAX_LAUNCH) {
        this.BULK_JOB_MAX_LAUNCH = BULK_JOB_MAX_LAUNCH;
        return this;
    }

    /**
    * Get CLEANUP_HOST_METRICS_LAST_TS
    * @return CLEANUP_HOST_METRICS_LAST_TS
    **/
    @JsonProperty("CLEANUP_HOST_METRICS_LAST_TS")
    public String getCLEANUPHOSTMETRICSLASTTS() {
        return CLEANUP_HOST_METRICS_LAST_TS;
    }

    /**
     * Set CLEANUP_HOST_METRICS_LAST_TS
     **/
    public void setCLEANUPHOSTMETRICSLASTTS(String CLEANUP_HOST_METRICS_LAST_TS) {
        this.CLEANUP_HOST_METRICS_LAST_TS = CLEANUP_HOST_METRICS_LAST_TS;
    }

    public SettingsSettingsLoggingTestCreateRequest CLEANUP_HOST_METRICS_LAST_TS(String CLEANUP_HOST_METRICS_LAST_TS) {
        this.CLEANUP_HOST_METRICS_LAST_TS = CLEANUP_HOST_METRICS_LAST_TS;
        return this;
    }

    /**
    * If needed, you can add specific information (such as a legal notice or a disclaimer) to a text box in the login modal using this setting. Any content added must be in plain text or an HTML fragment, as other markup languages are not supported.
    * @return CUSTOM_LOGIN_INFO
    **/
    @JsonProperty("CUSTOM_LOGIN_INFO")
    public String getCUSTOMLOGININFO() {
        return CUSTOM_LOGIN_INFO;
    }

    /**
     * Set CUSTOM_LOGIN_INFO
     **/
    public void setCUSTOMLOGININFO(String CUSTOM_LOGIN_INFO) {
        this.CUSTOM_LOGIN_INFO = CUSTOM_LOGIN_INFO;
    }

    public SettingsSettingsLoggingTestCreateRequest CUSTOM_LOGIN_INFO(String CUSTOM_LOGIN_INFO) {
        this.CUSTOM_LOGIN_INFO = CUSTOM_LOGIN_INFO;
        return this;
    }

    /**
    * To set up a custom logo, provide a file that you create. For the custom logo to look its best, use a .png file with a transparent background. GIF, PNG and JPEG formats are supported.
    * @return CUSTOM_LOGO
    **/
    @JsonProperty("CUSTOM_LOGO")
    public String getCUSTOMLOGO() {
        return CUSTOM_LOGO;
    }

    /**
     * Set CUSTOM_LOGO
     **/
    public void setCUSTOMLOGO(String CUSTOM_LOGO) {
        this.CUSTOM_LOGO = CUSTOM_LOGO;
    }

    public SettingsSettingsLoggingTestCreateRequest CUSTOM_LOGO(String CUSTOM_LOGO) {
        this.CUSTOM_LOGO = CUSTOM_LOGO;
        return this;
    }

    /**
    * Paths where Tower will look for custom virtual environments (in addition to /var/lib/awx/venv/). Enter one path per line.
    * @return CUSTOM_VENV_PATHS
    **/
    @JsonProperty("CUSTOM_VENV_PATHS")
    public List<String> getCUSTOMVENVPATHS() {
        return CUSTOM_VENV_PATHS;
    }

    /**
     * Set CUSTOM_VENV_PATHS
     **/
    public void setCUSTOMVENVPATHS(List<String> CUSTOM_VENV_PATHS) {
        this.CUSTOM_VENV_PATHS = CUSTOM_VENV_PATHS;
    }

    public SettingsSettingsLoggingTestCreateRequest CUSTOM_VENV_PATHS(List<String> CUSTOM_VENV_PATHS) {
        this.CUSTOM_VENV_PATHS = CUSTOM_VENV_PATHS;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addCUSTOMVENVPATHSItem(String CUSTOM_VENV_PATHSItem) {
        this.CUSTOM_VENV_PATHS.add(CUSTOM_VENV_PATHSItem);
        return this;
    }

    /**
    * The Execution Environment to be used when one has not been configured for a job template.
    * @return DEFAULT_EXECUTION_ENVIRONMENT
    **/
    @JsonProperty("DEFAULT_EXECUTION_ENVIRONMENT")
    public Integer getDEFAULTEXECUTIONENVIRONMENT() {
        return DEFAULT_EXECUTION_ENVIRONMENT;
    }

    /**
     * Set DEFAULT_EXECUTION_ENVIRONMENT
     **/
    public void setDEFAULTEXECUTIONENVIRONMENT(Integer DEFAULT_EXECUTION_ENVIRONMENT) {
        this.DEFAULT_EXECUTION_ENVIRONMENT = DEFAULT_EXECUTION_ENVIRONMENT;
    }

    public SettingsSettingsLoggingTestCreateRequest DEFAULT_EXECUTION_ENVIRONMENT(Integer DEFAULT_EXECUTION_ENVIRONMENT) {
        this.DEFAULT_EXECUTION_ENVIRONMENT = DEFAULT_EXECUTION_ENVIRONMENT;
        return this;
    }

    /**
    * Maximum time in seconds to allow inventory updates to run. Use value of 0 to indicate that no timeout should be imposed. A timeout set on an individual inventory source will override this.
    * @return DEFAULT_INVENTORY_UPDATE_TIMEOUT
    **/
    @JsonProperty("DEFAULT_INVENTORY_UPDATE_TIMEOUT")
    public Integer getDEFAULTINVENTORYUPDATETIMEOUT() {
        return DEFAULT_INVENTORY_UPDATE_TIMEOUT;
    }

    /**
     * Set DEFAULT_INVENTORY_UPDATE_TIMEOUT
     **/
    public void setDEFAULTINVENTORYUPDATETIMEOUT(Integer DEFAULT_INVENTORY_UPDATE_TIMEOUT) {
        this.DEFAULT_INVENTORY_UPDATE_TIMEOUT = DEFAULT_INVENTORY_UPDATE_TIMEOUT;
    }

    public SettingsSettingsLoggingTestCreateRequest DEFAULT_INVENTORY_UPDATE_TIMEOUT(Integer DEFAULT_INVENTORY_UPDATE_TIMEOUT) {
        this.DEFAULT_INVENTORY_UPDATE_TIMEOUT = DEFAULT_INVENTORY_UPDATE_TIMEOUT;
        return this;
    }

    /**
    * If no output is detected from ansible in this number of seconds the execution will be terminated. Use value of 0 to indicate that no idle timeout should be imposed.
    * @return DEFAULT_JOB_IDLE_TIMEOUT
    **/
    @JsonProperty("DEFAULT_JOB_IDLE_TIMEOUT")
    public Integer getDEFAULTJOBIDLETIMEOUT() {
        return DEFAULT_JOB_IDLE_TIMEOUT;
    }

    /**
     * Set DEFAULT_JOB_IDLE_TIMEOUT
     **/
    public void setDEFAULTJOBIDLETIMEOUT(Integer DEFAULT_JOB_IDLE_TIMEOUT) {
        this.DEFAULT_JOB_IDLE_TIMEOUT = DEFAULT_JOB_IDLE_TIMEOUT;
    }

    public SettingsSettingsLoggingTestCreateRequest DEFAULT_JOB_IDLE_TIMEOUT(Integer DEFAULT_JOB_IDLE_TIMEOUT) {
        this.DEFAULT_JOB_IDLE_TIMEOUT = DEFAULT_JOB_IDLE_TIMEOUT;
        return this;
    }

    /**
    * Maximum time in seconds to allow jobs to run. Use value of 0 to indicate that no timeout should be imposed. A timeout set on an individual job template will override this.
    * @return DEFAULT_JOB_TIMEOUT
    **/
    @JsonProperty("DEFAULT_JOB_TIMEOUT")
    public Integer getDEFAULTJOBTIMEOUT() {
        return DEFAULT_JOB_TIMEOUT;
    }

    /**
     * Set DEFAULT_JOB_TIMEOUT
     **/
    public void setDEFAULTJOBTIMEOUT(Integer DEFAULT_JOB_TIMEOUT) {
        this.DEFAULT_JOB_TIMEOUT = DEFAULT_JOB_TIMEOUT;
    }

    public SettingsSettingsLoggingTestCreateRequest DEFAULT_JOB_TIMEOUT(Integer DEFAULT_JOB_TIMEOUT) {
        this.DEFAULT_JOB_TIMEOUT = DEFAULT_JOB_TIMEOUT;
        return this;
    }

    /**
    * Maximum time in seconds to allow project updates to run. Use value of 0 to indicate that no timeout should be imposed. A timeout set on an individual project will override this.
    * @return DEFAULT_PROJECT_UPDATE_TIMEOUT
    **/
    @JsonProperty("DEFAULT_PROJECT_UPDATE_TIMEOUT")
    public Integer getDEFAULTPROJECTUPDATETIMEOUT() {
        return DEFAULT_PROJECT_UPDATE_TIMEOUT;
    }

    /**
     * Set DEFAULT_PROJECT_UPDATE_TIMEOUT
     **/
    public void setDEFAULTPROJECTUPDATETIMEOUT(Integer DEFAULT_PROJECT_UPDATE_TIMEOUT) {
        this.DEFAULT_PROJECT_UPDATE_TIMEOUT = DEFAULT_PROJECT_UPDATE_TIMEOUT;
    }

    public SettingsSettingsLoggingTestCreateRequest DEFAULT_PROJECT_UPDATE_TIMEOUT(Integer DEFAULT_PROJECT_UPDATE_TIMEOUT) {
        this.DEFAULT_PROJECT_UPDATE_TIMEOUT = DEFAULT_PROJECT_UPDATE_TIMEOUT;
        return this;
    }

    /**
    * Controls whether users are prevented from using the built-in authentication system. You probably want to do this if you are using an LDAP or SAML integration.
    * @return DISABLE_LOCAL_AUTH
    **/
    @JsonProperty("DISABLE_LOCAL_AUTH")
    public Boolean getDISABLELOCALAUTH() {
        return DISABLE_LOCAL_AUTH;
    }

    /**
     * Set DISABLE_LOCAL_AUTH
     **/
    public void setDISABLELOCALAUTH(Boolean DISABLE_LOCAL_AUTH) {
        this.DISABLE_LOCAL_AUTH = DISABLE_LOCAL_AUTH;
    }

    public SettingsSettingsLoggingTestCreateRequest DISABLE_LOCAL_AUTH(Boolean DISABLE_LOCAL_AUTH) {
        this.DISABLE_LOCAL_AUTH = DISABLE_LOCAL_AUTH;
        return this;
    }

    /**
    * Maximum Size of Standard Output in bytes to display for a single job or ad hoc command event. `stdout` will end with `…` when truncated.
    * @return EVENT_STDOUT_MAX_BYTES_DISPLAY
    **/
    @JsonProperty("EVENT_STDOUT_MAX_BYTES_DISPLAY")
    public Integer getEVENTSTDOUTMAXBYTESDISPLAY() {
        return EVENT_STDOUT_MAX_BYTES_DISPLAY;
    }

    /**
     * Set EVENT_STDOUT_MAX_BYTES_DISPLAY
     **/
    public void setEVENTSTDOUTMAXBYTESDISPLAY(Integer EVENT_STDOUT_MAX_BYTES_DISPLAY) {
        this.EVENT_STDOUT_MAX_BYTES_DISPLAY = EVENT_STDOUT_MAX_BYTES_DISPLAY;
    }

    public SettingsSettingsLoggingTestCreateRequest EVENT_STDOUT_MAX_BYTES_DISPLAY(Integer EVENT_STDOUT_MAX_BYTES_DISPLAY) {
        this.EVENT_STDOUT_MAX_BYTES_DISPLAY = EVENT_STDOUT_MAX_BYTES_DISPLAY;
        return this;
    }

    /**
    * If set to true, certificate validation will not be done when installing content from any Galaxy server.
    * @return GALAXY_IGNORE_CERTS
    **/
    @JsonProperty("GALAXY_IGNORE_CERTS")
    public Boolean getGALAXYIGNORECERTS() {
        return GALAXY_IGNORE_CERTS;
    }

    /**
     * Set GALAXY_IGNORE_CERTS
     **/
    public void setGALAXYIGNORECERTS(Boolean GALAXY_IGNORE_CERTS) {
        this.GALAXY_IGNORE_CERTS = GALAXY_IGNORE_CERTS;
    }

    public SettingsSettingsLoggingTestCreateRequest GALAXY_IGNORE_CERTS(Boolean GALAXY_IGNORE_CERTS) {
        this.GALAXY_IGNORE_CERTS = GALAXY_IGNORE_CERTS;
        return this;
    }

    /**
    * Additional environment variables set for invocations of ansible-galaxy within project updates. Useful if you must use a proxy server for ansible-galaxy but not git.
    * @return GALAXY_TASK_ENV
    **/
    @JsonProperty("GALAXY_TASK_ENV")
    public Object getGALAXYTASKENV() {
        return GALAXY_TASK_ENV;
    }

    /**
     * Set GALAXY_TASK_ENV
     **/
    public void setGALAXYTASKENV(Object GALAXY_TASK_ENV) {
        this.GALAXY_TASK_ENV = GALAXY_TASK_ENV;
    }

    public SettingsSettingsLoggingTestCreateRequest GALAXY_TASK_ENV(Object GALAXY_TASK_ENV) {
        this.GALAXY_TASK_ENV = GALAXY_TASK_ENV;
        return this;
    }

    /**
    * Enables the service to gather data on automation and send it to Automation Analytics.
    * @return INSIGHTS_TRACKING_STATE
    **/
    @JsonProperty("INSIGHTS_TRACKING_STATE")
    public Boolean getINSIGHTSTRACKINGSTATE() {
        return INSIGHTS_TRACKING_STATE;
    }

    /**
     * Set INSIGHTS_TRACKING_STATE
     **/
    public void setINSIGHTSTRACKINGSTATE(Boolean INSIGHTS_TRACKING_STATE) {
        this.INSIGHTS_TRACKING_STATE = INSIGHTS_TRACKING_STATE;
    }

    public SettingsSettingsLoggingTestCreateRequest INSIGHTS_TRACKING_STATE(Boolean INSIGHTS_TRACKING_STATE) {
        this.INSIGHTS_TRACKING_STATE = INSIGHTS_TRACKING_STATE;
        return this;
    }

    /**
    * Minimum number of digit characters required in a local password. 0 means no minimum
    * @return LOCAL_PASSWORD_MIN_DIGITS
    **/
    @JsonProperty("LOCAL_PASSWORD_MIN_DIGITS")
    public Integer getLOCALPASSWORDMINDIGITS() {
        return LOCAL_PASSWORD_MIN_DIGITS;
    }

    /**
     * Set LOCAL_PASSWORD_MIN_DIGITS
     **/
    public void setLOCALPASSWORDMINDIGITS(Integer LOCAL_PASSWORD_MIN_DIGITS) {
        this.LOCAL_PASSWORD_MIN_DIGITS = LOCAL_PASSWORD_MIN_DIGITS;
    }

    public SettingsSettingsLoggingTestCreateRequest LOCAL_PASSWORD_MIN_DIGITS(Integer LOCAL_PASSWORD_MIN_DIGITS) {
        this.LOCAL_PASSWORD_MIN_DIGITS = LOCAL_PASSWORD_MIN_DIGITS;
        return this;
    }

    /**
    * Minimum number of characters required in a local password. 0 means no minimum
    * @return LOCAL_PASSWORD_MIN_LENGTH
    **/
    @JsonProperty("LOCAL_PASSWORD_MIN_LENGTH")
    public Integer getLOCALPASSWORDMINLENGTH() {
        return LOCAL_PASSWORD_MIN_LENGTH;
    }

    /**
     * Set LOCAL_PASSWORD_MIN_LENGTH
     **/
    public void setLOCALPASSWORDMINLENGTH(Integer LOCAL_PASSWORD_MIN_LENGTH) {
        this.LOCAL_PASSWORD_MIN_LENGTH = LOCAL_PASSWORD_MIN_LENGTH;
    }

    public SettingsSettingsLoggingTestCreateRequest LOCAL_PASSWORD_MIN_LENGTH(Integer LOCAL_PASSWORD_MIN_LENGTH) {
        this.LOCAL_PASSWORD_MIN_LENGTH = LOCAL_PASSWORD_MIN_LENGTH;
        return this;
    }

    /**
    * Minimum number of special characters required in a local password. 0 means no minimum
    * @return LOCAL_PASSWORD_MIN_SPECIAL
    **/
    @JsonProperty("LOCAL_PASSWORD_MIN_SPECIAL")
    public Integer getLOCALPASSWORDMINSPECIAL() {
        return LOCAL_PASSWORD_MIN_SPECIAL;
    }

    /**
     * Set LOCAL_PASSWORD_MIN_SPECIAL
     **/
    public void setLOCALPASSWORDMINSPECIAL(Integer LOCAL_PASSWORD_MIN_SPECIAL) {
        this.LOCAL_PASSWORD_MIN_SPECIAL = LOCAL_PASSWORD_MIN_SPECIAL;
    }

    public SettingsSettingsLoggingTestCreateRequest LOCAL_PASSWORD_MIN_SPECIAL(Integer LOCAL_PASSWORD_MIN_SPECIAL) {
        this.LOCAL_PASSWORD_MIN_SPECIAL = LOCAL_PASSWORD_MIN_SPECIAL;
        return this;
    }

    /**
    * Minimum number of uppercase characters required in a local password. 0 means no minimum
    * @return LOCAL_PASSWORD_MIN_UPPER
    **/
    @JsonProperty("LOCAL_PASSWORD_MIN_UPPER")
    public Integer getLOCALPASSWORDMINUPPER() {
        return LOCAL_PASSWORD_MIN_UPPER;
    }

    /**
     * Set LOCAL_PASSWORD_MIN_UPPER
     **/
    public void setLOCALPASSWORDMINUPPER(Integer LOCAL_PASSWORD_MIN_UPPER) {
        this.LOCAL_PASSWORD_MIN_UPPER = LOCAL_PASSWORD_MIN_UPPER;
    }

    public SettingsSettingsLoggingTestCreateRequest LOCAL_PASSWORD_MIN_UPPER(Integer LOCAL_PASSWORD_MIN_UPPER) {
        this.LOCAL_PASSWORD_MIN_UPPER = LOCAL_PASSWORD_MIN_UPPER;
        return this;
    }

    /**
    * URL to which unauthorized users will be redirected to log in.  If blank, users will be sent to the login page.
    * @return LOGIN_REDIRECT_OVERRIDE
    **/
    @JsonProperty("LOGIN_REDIRECT_OVERRIDE")
    public String getLOGINREDIRECTOVERRIDE() {
        return LOGIN_REDIRECT_OVERRIDE;
    }

    /**
     * Set LOGIN_REDIRECT_OVERRIDE
     **/
    public void setLOGINREDIRECTOVERRIDE(String LOGIN_REDIRECT_OVERRIDE) {
        this.LOGIN_REDIRECT_OVERRIDE = LOGIN_REDIRECT_OVERRIDE;
    }

    public SettingsSettingsLoggingTestCreateRequest LOGIN_REDIRECT_OVERRIDE(String LOGIN_REDIRECT_OVERRIDE) {
        this.LOGIN_REDIRECT_OVERRIDE = LOGIN_REDIRECT_OVERRIDE;
        return this;
    }

    /**
    * Enable sending logs to external log aggregator.
    * @return LOG_AGGREGATOR_ENABLED
    **/
    @JsonProperty("LOG_AGGREGATOR_ENABLED")
    public Boolean getLOGAGGREGATORENABLED() {
        return LOG_AGGREGATOR_ENABLED;
    }

    /**
     * Set LOG_AGGREGATOR_ENABLED
     **/
    public void setLOGAGGREGATORENABLED(Boolean LOG_AGGREGATOR_ENABLED) {
        this.LOG_AGGREGATOR_ENABLED = LOG_AGGREGATOR_ENABLED;
    }

    public SettingsSettingsLoggingTestCreateRequest LOG_AGGREGATOR_ENABLED(Boolean LOG_AGGREGATOR_ENABLED) {
        this.LOG_AGGREGATOR_ENABLED = LOG_AGGREGATOR_ENABLED;
        return this;
    }

    /**
    * Hostname/IP where external logs will be sent to.
    * @return LOG_AGGREGATOR_HOST
    **/
    @JsonProperty("LOG_AGGREGATOR_HOST")
    public String getLOGAGGREGATORHOST() {
        return LOG_AGGREGATOR_HOST;
    }

    /**
     * Set LOG_AGGREGATOR_HOST
     **/
    public void setLOGAGGREGATORHOST(String LOG_AGGREGATOR_HOST) {
        this.LOG_AGGREGATOR_HOST = LOG_AGGREGATOR_HOST;
    }

    public SettingsSettingsLoggingTestCreateRequest LOG_AGGREGATOR_HOST(String LOG_AGGREGATOR_HOST) {
        this.LOG_AGGREGATOR_HOST = LOG_AGGREGATOR_HOST;
        return this;
    }

    /**
    * If set, system tracking facts will be sent for each package, service, or other item found in a scan, allowing for greater search query granularity. If unset, facts will be sent as a single dictionary, allowing for greater efficiency in fact processing.
    * @return LOG_AGGREGATOR_INDIVIDUAL_FACTS
    **/
    @JsonProperty("LOG_AGGREGATOR_INDIVIDUAL_FACTS")
    public Boolean getLOGAGGREGATORINDIVIDUALFACTS() {
        return LOG_AGGREGATOR_INDIVIDUAL_FACTS;
    }

    /**
     * Set LOG_AGGREGATOR_INDIVIDUAL_FACTS
     **/
    public void setLOGAGGREGATORINDIVIDUALFACTS(Boolean LOG_AGGREGATOR_INDIVIDUAL_FACTS) {
        this.LOG_AGGREGATOR_INDIVIDUAL_FACTS = LOG_AGGREGATOR_INDIVIDUAL_FACTS;
    }

    public SettingsSettingsLoggingTestCreateRequest LOG_AGGREGATOR_INDIVIDUAL_FACTS(Boolean LOG_AGGREGATOR_INDIVIDUAL_FACTS) {
        this.LOG_AGGREGATOR_INDIVIDUAL_FACTS = LOG_AGGREGATOR_INDIVIDUAL_FACTS;
        return this;
    }

    /**
    * Level threshold used by log handler. Severities from lowest to highest are DEBUG, INFO, WARNING, ERROR, CRITICAL. Messages less severe than the threshold will be ignored by log handler. (messages under category awx.anlytics ignore this setting)
    * @return LOG_AGGREGATOR_LEVEL
    **/
    @JsonProperty("LOG_AGGREGATOR_LEVEL")
    public String getLOGAGGREGATORLEVEL() {
        return LOG_AGGREGATOR_LEVEL;
    }

    /**
     * Set LOG_AGGREGATOR_LEVEL
     **/
    public void setLOGAGGREGATORLEVEL(String LOG_AGGREGATOR_LEVEL) {
        this.LOG_AGGREGATOR_LEVEL = LOG_AGGREGATOR_LEVEL;
    }

    public SettingsSettingsLoggingTestCreateRequest LOG_AGGREGATOR_LEVEL(String LOG_AGGREGATOR_LEVEL) {
        this.LOG_AGGREGATOR_LEVEL = LOG_AGGREGATOR_LEVEL;
        return this;
    }

    /**
    * List of loggers that will send HTTP logs to the collector, these can include any or all of:  awx - service logs activity_stream - activity stream records job_events - callback data from Ansible job events system_tracking - facts gathered from scan jobs broadcast_websocket - errors pertaining to websockets broadcast metrics 
    * @return LOG_AGGREGATOR_LOGGERS
    **/
    @JsonProperty("LOG_AGGREGATOR_LOGGERS")
    public List<String> getLOGAGGREGATORLOGGERS() {
        return LOG_AGGREGATOR_LOGGERS;
    }

    /**
     * Set LOG_AGGREGATOR_LOGGERS
     **/
    public void setLOGAGGREGATORLOGGERS(List<String> LOG_AGGREGATOR_LOGGERS) {
        this.LOG_AGGREGATOR_LOGGERS = LOG_AGGREGATOR_LOGGERS;
    }

    public SettingsSettingsLoggingTestCreateRequest LOG_AGGREGATOR_LOGGERS(List<String> LOG_AGGREGATOR_LOGGERS) {
        this.LOG_AGGREGATOR_LOGGERS = LOG_AGGREGATOR_LOGGERS;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addLOGAGGREGATORLOGGERSItem(String LOG_AGGREGATOR_LOGGERSItem) {
        this.LOG_AGGREGATOR_LOGGERS.add(LOG_AGGREGATOR_LOGGERSItem);
        return this;
    }

    /**
    * Amount of data to store (in gigabytes) during an outage of the external log aggregator (defaults to 1). Equivalent to the rsyslogd queue.maxdiskspace setting.
    * @return LOG_AGGREGATOR_MAX_DISK_USAGE_GB
    **/
    @JsonProperty("LOG_AGGREGATOR_MAX_DISK_USAGE_GB")
    public Integer getLOGAGGREGATORMAXDISKUSAGEGB() {
        return LOG_AGGREGATOR_MAX_DISK_USAGE_GB;
    }

    /**
     * Set LOG_AGGREGATOR_MAX_DISK_USAGE_GB
     **/
    public void setLOGAGGREGATORMAXDISKUSAGEGB(Integer LOG_AGGREGATOR_MAX_DISK_USAGE_GB) {
        this.LOG_AGGREGATOR_MAX_DISK_USAGE_GB = LOG_AGGREGATOR_MAX_DISK_USAGE_GB;
    }

    public SettingsSettingsLoggingTestCreateRequest LOG_AGGREGATOR_MAX_DISK_USAGE_GB(Integer LOG_AGGREGATOR_MAX_DISK_USAGE_GB) {
        this.LOG_AGGREGATOR_MAX_DISK_USAGE_GB = LOG_AGGREGATOR_MAX_DISK_USAGE_GB;
        return this;
    }

    /**
    * Location to persist logs that should be retried after an outage of the external log aggregator (defaults to /var/lib/awx). Equivalent to the rsyslogd queue.spoolDirectory setting.
    * @return LOG_AGGREGATOR_MAX_DISK_USAGE_PATH
    **/
    @JsonProperty("LOG_AGGREGATOR_MAX_DISK_USAGE_PATH")
    public String getLOGAGGREGATORMAXDISKUSAGEPATH() {
        return LOG_AGGREGATOR_MAX_DISK_USAGE_PATH;
    }

    /**
     * Set LOG_AGGREGATOR_MAX_DISK_USAGE_PATH
     **/
    public void setLOGAGGREGATORMAXDISKUSAGEPATH(String LOG_AGGREGATOR_MAX_DISK_USAGE_PATH) {
        this.LOG_AGGREGATOR_MAX_DISK_USAGE_PATH = LOG_AGGREGATOR_MAX_DISK_USAGE_PATH;
    }

    public SettingsSettingsLoggingTestCreateRequest LOG_AGGREGATOR_MAX_DISK_USAGE_PATH(String LOG_AGGREGATOR_MAX_DISK_USAGE_PATH) {
        this.LOG_AGGREGATOR_MAX_DISK_USAGE_PATH = LOG_AGGREGATOR_MAX_DISK_USAGE_PATH;
        return this;
    }

    /**
    * Password or authentication token for external log aggregator (if required; HTTP/s only).
    * @return LOG_AGGREGATOR_PASSWORD
    **/
    @JsonProperty("LOG_AGGREGATOR_PASSWORD")
    public String getLOGAGGREGATORPASSWORD() {
        return LOG_AGGREGATOR_PASSWORD;
    }

    /**
     * Set LOG_AGGREGATOR_PASSWORD
     **/
    public void setLOGAGGREGATORPASSWORD(String LOG_AGGREGATOR_PASSWORD) {
        this.LOG_AGGREGATOR_PASSWORD = LOG_AGGREGATOR_PASSWORD;
    }

    public SettingsSettingsLoggingTestCreateRequest LOG_AGGREGATOR_PASSWORD(String LOG_AGGREGATOR_PASSWORD) {
        this.LOG_AGGREGATOR_PASSWORD = LOG_AGGREGATOR_PASSWORD;
        return this;
    }

    /**
    * Port on Logging Aggregator to send logs to (if required and not provided in Logging Aggregator).
    * @return LOG_AGGREGATOR_PORT
    **/
    @JsonProperty("LOG_AGGREGATOR_PORT")
    public Integer getLOGAGGREGATORPORT() {
        return LOG_AGGREGATOR_PORT;
    }

    /**
     * Set LOG_AGGREGATOR_PORT
     **/
    public void setLOGAGGREGATORPORT(Integer LOG_AGGREGATOR_PORT) {
        this.LOG_AGGREGATOR_PORT = LOG_AGGREGATOR_PORT;
    }

    public SettingsSettingsLoggingTestCreateRequest LOG_AGGREGATOR_PORT(Integer LOG_AGGREGATOR_PORT) {
        this.LOG_AGGREGATOR_PORT = LOG_AGGREGATOR_PORT;
        return this;
    }

    /**
    * Protocol used to communicate with log aggregator.  HTTPS/HTTP assumes HTTPS unless http:// is explicitly used in the Logging Aggregator hostname.
    * @return LOG_AGGREGATOR_PROTOCOL
    **/
    @JsonProperty("LOG_AGGREGATOR_PROTOCOL")
    public String getLOGAGGREGATORPROTOCOL() {
        return LOG_AGGREGATOR_PROTOCOL;
    }

    /**
     * Set LOG_AGGREGATOR_PROTOCOL
     **/
    public void setLOGAGGREGATORPROTOCOL(String LOG_AGGREGATOR_PROTOCOL) {
        this.LOG_AGGREGATOR_PROTOCOL = LOG_AGGREGATOR_PROTOCOL;
    }

    public SettingsSettingsLoggingTestCreateRequest LOG_AGGREGATOR_PROTOCOL(String LOG_AGGREGATOR_PROTOCOL) {
        this.LOG_AGGREGATOR_PROTOCOL = LOG_AGGREGATOR_PROTOCOL;
        return this;
    }

    /**
    * Enabled high verbosity debugging for rsyslogd.  Useful for debugging connection issues for external log aggregation.
    * @return LOG_AGGREGATOR_RSYSLOGD_DEBUG
    **/
    @JsonProperty("LOG_AGGREGATOR_RSYSLOGD_DEBUG")
    public Boolean getLOGAGGREGATORRSYSLOGDDEBUG() {
        return LOG_AGGREGATOR_RSYSLOGD_DEBUG;
    }

    /**
     * Set LOG_AGGREGATOR_RSYSLOGD_DEBUG
     **/
    public void setLOGAGGREGATORRSYSLOGDDEBUG(Boolean LOG_AGGREGATOR_RSYSLOGD_DEBUG) {
        this.LOG_AGGREGATOR_RSYSLOGD_DEBUG = LOG_AGGREGATOR_RSYSLOGD_DEBUG;
    }

    public SettingsSettingsLoggingTestCreateRequest LOG_AGGREGATOR_RSYSLOGD_DEBUG(Boolean LOG_AGGREGATOR_RSYSLOGD_DEBUG) {
        this.LOG_AGGREGATOR_RSYSLOGD_DEBUG = LOG_AGGREGATOR_RSYSLOGD_DEBUG;
        return this;
    }

    /**
    * Number of seconds for a TCP connection to external log aggregator to timeout. Applies to HTTPS and TCP log aggregator protocols.
    * @return LOG_AGGREGATOR_TCP_TIMEOUT
    **/
    @JsonProperty("LOG_AGGREGATOR_TCP_TIMEOUT")
    public Integer getLOGAGGREGATORTCPTIMEOUT() {
        return LOG_AGGREGATOR_TCP_TIMEOUT;
    }

    /**
     * Set LOG_AGGREGATOR_TCP_TIMEOUT
     **/
    public void setLOGAGGREGATORTCPTIMEOUT(Integer LOG_AGGREGATOR_TCP_TIMEOUT) {
        this.LOG_AGGREGATOR_TCP_TIMEOUT = LOG_AGGREGATOR_TCP_TIMEOUT;
    }

    public SettingsSettingsLoggingTestCreateRequest LOG_AGGREGATOR_TCP_TIMEOUT(Integer LOG_AGGREGATOR_TCP_TIMEOUT) {
        this.LOG_AGGREGATOR_TCP_TIMEOUT = LOG_AGGREGATOR_TCP_TIMEOUT;
        return this;
    }

    /**
    * Useful to uniquely identify instances.
    * @return LOG_AGGREGATOR_TOWER_UUID
    **/
    @JsonProperty("LOG_AGGREGATOR_TOWER_UUID")
    public String getLOGAGGREGATORTOWERUUID() {
        return LOG_AGGREGATOR_TOWER_UUID;
    }

    /**
     * Set LOG_AGGREGATOR_TOWER_UUID
     **/
    public void setLOGAGGREGATORTOWERUUID(String LOG_AGGREGATOR_TOWER_UUID) {
        this.LOG_AGGREGATOR_TOWER_UUID = LOG_AGGREGATOR_TOWER_UUID;
    }

    public SettingsSettingsLoggingTestCreateRequest LOG_AGGREGATOR_TOWER_UUID(String LOG_AGGREGATOR_TOWER_UUID) {
        this.LOG_AGGREGATOR_TOWER_UUID = LOG_AGGREGATOR_TOWER_UUID;
        return this;
    }

    /**
    * Format messages for the chosen log aggregator.
    * @return LOG_AGGREGATOR_TYPE
    **/
    @JsonProperty("LOG_AGGREGATOR_TYPE")
    public String getLOGAGGREGATORTYPE() {
        return LOG_AGGREGATOR_TYPE;
    }

    /**
     * Set LOG_AGGREGATOR_TYPE
     **/
    public void setLOGAGGREGATORTYPE(String LOG_AGGREGATOR_TYPE) {
        this.LOG_AGGREGATOR_TYPE = LOG_AGGREGATOR_TYPE;
    }

    public SettingsSettingsLoggingTestCreateRequest LOG_AGGREGATOR_TYPE(String LOG_AGGREGATOR_TYPE) {
        this.LOG_AGGREGATOR_TYPE = LOG_AGGREGATOR_TYPE;
        return this;
    }

    /**
    * Username for external log aggregator (if required; HTTP/s only).
    * @return LOG_AGGREGATOR_USERNAME
    **/
    @JsonProperty("LOG_AGGREGATOR_USERNAME")
    public String getLOGAGGREGATORUSERNAME() {
        return LOG_AGGREGATOR_USERNAME;
    }

    /**
     * Set LOG_AGGREGATOR_USERNAME
     **/
    public void setLOGAGGREGATORUSERNAME(String LOG_AGGREGATOR_USERNAME) {
        this.LOG_AGGREGATOR_USERNAME = LOG_AGGREGATOR_USERNAME;
    }

    public SettingsSettingsLoggingTestCreateRequest LOG_AGGREGATOR_USERNAME(String LOG_AGGREGATOR_USERNAME) {
        this.LOG_AGGREGATOR_USERNAME = LOG_AGGREGATOR_USERNAME;
        return this;
    }

    /**
    * Flag to control enable/disable of certificate verification when LOG_AGGREGATOR_PROTOCOL is \"https\". If enabled, the log handler will verify certificate sent by external log aggregator before establishing connection.
    * @return LOG_AGGREGATOR_VERIFY_CERT
    **/
    @JsonProperty("LOG_AGGREGATOR_VERIFY_CERT")
    public Boolean getLOGAGGREGATORVERIFYCERT() {
        return LOG_AGGREGATOR_VERIFY_CERT;
    }

    /**
     * Set LOG_AGGREGATOR_VERIFY_CERT
     **/
    public void setLOGAGGREGATORVERIFYCERT(Boolean LOG_AGGREGATOR_VERIFY_CERT) {
        this.LOG_AGGREGATOR_VERIFY_CERT = LOG_AGGREGATOR_VERIFY_CERT;
    }

    public SettingsSettingsLoggingTestCreateRequest LOG_AGGREGATOR_VERIFY_CERT(Boolean LOG_AGGREGATOR_VERIFY_CERT) {
        this.LOG_AGGREGATOR_VERIFY_CERT = LOG_AGGREGATOR_VERIFY_CERT;
        return this;
    }

    /**
    * Controls whether any Organization Admin has the privileges to create and manage users and teams. You may want to disable this ability if you are using an LDAP or SAML integration.
    * @return MANAGE_ORGANIZATION_AUTH
    **/
    @JsonProperty("MANAGE_ORGANIZATION_AUTH")
    public Boolean getMANAGEORGANIZATIONAUTH() {
        return MANAGE_ORGANIZATION_AUTH;
    }

    /**
     * Set MANAGE_ORGANIZATION_AUTH
     **/
    public void setMANAGEORGANIZATIONAUTH(Boolean MANAGE_ORGANIZATION_AUTH) {
        this.MANAGE_ORGANIZATION_AUTH = MANAGE_ORGANIZATION_AUTH;
    }

    public SettingsSettingsLoggingTestCreateRequest MANAGE_ORGANIZATION_AUTH(Boolean MANAGE_ORGANIZATION_AUTH) {
        this.MANAGE_ORGANIZATION_AUTH = MANAGE_ORGANIZATION_AUTH;
        return this;
    }

    /**
    * Saving a Job Template with more than this number of forks will result in an error. When set to 0, no limit is applied.
    * @return MAX_FORKS
    **/
    @JsonProperty("MAX_FORKS")
    public Integer getMAXFORKS() {
        return MAX_FORKS;
    }

    /**
     * Set MAX_FORKS
     **/
    public void setMAXFORKS(Integer MAX_FORKS) {
        this.MAX_FORKS = MAX_FORKS;
    }

    public SettingsSettingsLoggingTestCreateRequest MAX_FORKS(Integer MAX_FORKS) {
        this.MAX_FORKS = MAX_FORKS;
        return this;
    }

    /**
    * Maximum number of job events for the UI to retrieve within a single request.
    * @return MAX_UI_JOB_EVENTS
    **/
    @JsonProperty("MAX_UI_JOB_EVENTS")
    public Integer getMAXUIJOBEVENTS() {
        return MAX_UI_JOB_EVENTS;
    }

    /**
     * Set MAX_UI_JOB_EVENTS
     **/
    public void setMAXUIJOBEVENTS(Integer MAX_UI_JOB_EVENTS) {
        this.MAX_UI_JOB_EVENTS = MAX_UI_JOB_EVENTS;
    }

    public SettingsSettingsLoggingTestCreateRequest MAX_UI_JOB_EVENTS(Integer MAX_UI_JOB_EVENTS) {
        this.MAX_UI_JOB_EVENTS = MAX_UI_JOB_EVENTS;
        return this;
    }

    /**
    * Maximum number of messages to update the UI live job output with per second. Value of 0 means no limit.
    * @return MAX_WEBSOCKET_EVENT_RATE
    **/
    @JsonProperty("MAX_WEBSOCKET_EVENT_RATE")
    public Integer getMAXWEBSOCKETEVENTRATE() {
        return MAX_WEBSOCKET_EVENT_RATE;
    }

    /**
     * Set MAX_WEBSOCKET_EVENT_RATE
     **/
    public void setMAXWEBSOCKETEVENTRATE(Integer MAX_WEBSOCKET_EVENT_RATE) {
        this.MAX_WEBSOCKET_EVENT_RATE = MAX_WEBSOCKET_EVENT_RATE;
    }

    public SettingsSettingsLoggingTestCreateRequest MAX_WEBSOCKET_EVENT_RATE(Integer MAX_WEBSOCKET_EVENT_RATE) {
        this.MAX_WEBSOCKET_EVENT_RATE = MAX_WEBSOCKET_EVENT_RATE;
        return this;
    }

    /**
    * Dictionary for customizing OAuth 2 timeouts, available items are `ACCESS_TOKEN_EXPIRE_SECONDS`, the duration of access tokens in the number of seconds, `AUTHORIZATION_CODE_EXPIRE_SECONDS`, the duration of authorization codes in the number of seconds, and `REFRESH_TOKEN_EXPIRE_SECONDS`, the duration of refresh tokens, after expired access tokens, in the number of seconds.
    * @return OAUTH2_PROVIDER
    **/
    @JsonProperty("OAUTH2_PROVIDER")
    public Object getOAUTH2PROVIDER() {
        return OAUTH2_PROVIDER;
    }

    /**
     * Set OAUTH2_PROVIDER
     **/
    public void setOAUTH2PROVIDER(Object OAUTH2_PROVIDER) {
        this.OAUTH2_PROVIDER = OAUTH2_PROVIDER;
    }

    public SettingsSettingsLoggingTestCreateRequest OAUTH2_PROVIDER(Object OAUTH2_PROVIDER) {
        this.OAUTH2_PROVIDER = OAUTH2_PROVIDER;
        return this;
    }

    /**
    * Controls whether any Organization Admin can view all users and teams, even those not associated with their Organization.
    * @return ORG_ADMINS_CAN_SEE_ALL_USERS
    **/
    @JsonProperty("ORG_ADMINS_CAN_SEE_ALL_USERS")
    public Boolean getORGADMINSCANSEEALLUSERS() {
        return ORG_ADMINS_CAN_SEE_ALL_USERS;
    }

    /**
     * Set ORG_ADMINS_CAN_SEE_ALL_USERS
     **/
    public void setORGADMINSCANSEEALLUSERS(Boolean ORG_ADMINS_CAN_SEE_ALL_USERS) {
        this.ORG_ADMINS_CAN_SEE_ALL_USERS = ORG_ADMINS_CAN_SEE_ALL_USERS;
    }

    public SettingsSettingsLoggingTestCreateRequest ORG_ADMINS_CAN_SEE_ALL_USERS(Boolean ORG_ADMINS_CAN_SEE_ALL_USERS) {
        this.ORG_ADMINS_CAN_SEE_ALL_USERS = ORG_ADMINS_CAN_SEE_ALL_USERS;
        return this;
    }

    /**
    * Adds the CLI -vvv flag to ansible-playbook runs of project_update.yml used for project updates.
    * @return PROJECT_UPDATE_VVV
    **/
    @JsonProperty("PROJECT_UPDATE_VVV")
    public Boolean getPROJECTUPDATEVVV() {
        return PROJECT_UPDATE_VVV;
    }

    /**
     * Set PROJECT_UPDATE_VVV
     **/
    public void setPROJECTUPDATEVVV(Boolean PROJECT_UPDATE_VVV) {
        this.PROJECT_UPDATE_VVV = PROJECT_UPDATE_VVV;
    }

    public SettingsSettingsLoggingTestCreateRequest PROJECT_UPDATE_VVV(Boolean PROJECT_UPDATE_VVV) {
        this.PROJECT_UPDATE_VVV = PROJECT_UPDATE_VVV;
        return this;
    }

    /**
    * If the service is behind a reverse proxy/load balancer, use this setting to configure the proxy IP addresses from which the service should trust custom REMOTE_HOST_HEADERS header values. If this setting is an empty list (the default), the headers specified by REMOTE_HOST_HEADERS will be trusted unconditionally')
    * @return PROXY_IP_ALLOWED_LIST
    **/
    @JsonProperty("PROXY_IP_ALLOWED_LIST")
    public List<String> getPROXYIPALLOWEDLIST() {
        return PROXY_IP_ALLOWED_LIST;
    }

    /**
     * Set PROXY_IP_ALLOWED_LIST
     **/
    public void setPROXYIPALLOWEDLIST(List<String> PROXY_IP_ALLOWED_LIST) {
        this.PROXY_IP_ALLOWED_LIST = PROXY_IP_ALLOWED_LIST;
    }

    public SettingsSettingsLoggingTestCreateRequest PROXY_IP_ALLOWED_LIST(List<String> PROXY_IP_ALLOWED_LIST) {
        this.PROXY_IP_ALLOWED_LIST = PROXY_IP_ALLOWED_LIST;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addPROXYIPALLOWEDLISTItem(String PROXY_IP_ALLOWED_LISTItem) {
        this.PROXY_IP_ALLOWED_LIST.add(PROXY_IP_ALLOWED_LISTItem);
        return this;
    }

    /**
    * Port of RADIUS server.
    * @return RADIUS_PORT
    **/
    @JsonProperty("RADIUS_PORT")
    public Integer getRADIUSPORT() {
        return RADIUS_PORT;
    }

    /**
     * Set RADIUS_PORT
     **/
    public void setRADIUSPORT(Integer RADIUS_PORT) {
        this.RADIUS_PORT = RADIUS_PORT;
    }

    public SettingsSettingsLoggingTestCreateRequest RADIUS_PORT(Integer RADIUS_PORT) {
        this.RADIUS_PORT = RADIUS_PORT;
        return this;
    }

    /**
    * Shared secret for authenticating to RADIUS server.
    * @return RADIUS_SECRET
    **/
    @JsonProperty("RADIUS_SECRET")
    public String getRADIUSSECRET() {
        return RADIUS_SECRET;
    }

    /**
     * Set RADIUS_SECRET
     **/
    public void setRADIUSSECRET(String RADIUS_SECRET) {
        this.RADIUS_SECRET = RADIUS_SECRET;
    }

    public SettingsSettingsLoggingTestCreateRequest RADIUS_SECRET(String RADIUS_SECRET) {
        this.RADIUS_SECRET = RADIUS_SECRET;
        return this;
    }

    /**
    * Hostname/IP of RADIUS server. RADIUS authentication is disabled if this setting is empty.
    * @return RADIUS_SERVER
    **/
    @JsonProperty("RADIUS_SERVER")
    public String getRADIUSSERVER() {
        return RADIUS_SERVER;
    }

    /**
     * Set RADIUS_SERVER
     **/
    public void setRADIUSSERVER(String RADIUS_SERVER) {
        this.RADIUS_SERVER = RADIUS_SERVER;
    }

    public SettingsSettingsLoggingTestCreateRequest RADIUS_SERVER(String RADIUS_SERVER) {
        this.RADIUS_SERVER = RADIUS_SERVER;
        return this;
    }

    /**
    * This password is used to send data to Automation Analytics
    * @return REDHAT_PASSWORD
    **/
    @JsonProperty("REDHAT_PASSWORD")
    public String getREDHATPASSWORD() {
        return REDHAT_PASSWORD;
    }

    /**
     * Set REDHAT_PASSWORD
     **/
    public void setREDHATPASSWORD(String REDHAT_PASSWORD) {
        this.REDHAT_PASSWORD = REDHAT_PASSWORD;
    }

    public SettingsSettingsLoggingTestCreateRequest REDHAT_PASSWORD(String REDHAT_PASSWORD) {
        this.REDHAT_PASSWORD = REDHAT_PASSWORD;
        return this;
    }

    /**
    * This username is used to send data to Automation Analytics
    * @return REDHAT_USERNAME
    **/
    @JsonProperty("REDHAT_USERNAME")
    public String getREDHATUSERNAME() {
        return REDHAT_USERNAME;
    }

    /**
     * Set REDHAT_USERNAME
     **/
    public void setREDHATUSERNAME(String REDHAT_USERNAME) {
        this.REDHAT_USERNAME = REDHAT_USERNAME;
    }

    public SettingsSettingsLoggingTestCreateRequest REDHAT_USERNAME(String REDHAT_USERNAME) {
        this.REDHAT_USERNAME = REDHAT_USERNAME;
        return this;
    }

    /**
    * HTTP headers and meta keys to search to determine remote host name or IP. Add additional items to this list, such as \"HTTP_X_FORWARDED_FOR\", if behind a reverse proxy. See the \"Proxy Support\" section of the AAP Installation guide for more details.
    * @return REMOTE_HOST_HEADERS
    **/
    @JsonProperty("REMOTE_HOST_HEADERS")
    public List<String> getREMOTEHOSTHEADERS() {
        return REMOTE_HOST_HEADERS;
    }

    /**
     * Set REMOTE_HOST_HEADERS
     **/
    public void setREMOTEHOSTHEADERS(List<String> REMOTE_HOST_HEADERS) {
        this.REMOTE_HOST_HEADERS = REMOTE_HOST_HEADERS;
    }

    public SettingsSettingsLoggingTestCreateRequest REMOTE_HOST_HEADERS(List<String> REMOTE_HOST_HEADERS) {
        this.REMOTE_HOST_HEADERS = REMOTE_HOST_HEADERS;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addREMOTEHOSTHEADERSItem(String REMOTE_HOST_HEADERSItem) {
        this.REMOTE_HOST_HEADERS.add(REMOTE_HOST_HEADERSItem);
        return this;
    }

    /**
    * When enabled (the default), mapped Organizations and Teams will be created automatically on successful SAML login.
    * @return SAML_AUTO_CREATE_OBJECTS
    **/
    @JsonProperty("SAML_AUTO_CREATE_OBJECTS")
    public Boolean getSAMLAUTOCREATEOBJECTS() {
        return SAML_AUTO_CREATE_OBJECTS;
    }

    /**
     * Set SAML_AUTO_CREATE_OBJECTS
     **/
    public void setSAMLAUTOCREATEOBJECTS(Boolean SAML_AUTO_CREATE_OBJECTS) {
        this.SAML_AUTO_CREATE_OBJECTS = SAML_AUTO_CREATE_OBJECTS;
    }

    public SettingsSettingsLoggingTestCreateRequest SAML_AUTO_CREATE_OBJECTS(Boolean SAML_AUTO_CREATE_OBJECTS) {
        this.SAML_AUTO_CREATE_OBJECTS = SAML_AUTO_CREATE_OBJECTS;
        return this;
    }

    /**
    * Maximum number of the same job template that can be waiting to run when launching from a schedule before no more are created.
    * @return SCHEDULE_MAX_JOBS
    **/
    @JsonProperty("SCHEDULE_MAX_JOBS")
    public Integer getSCHEDULEMAXJOBS() {
        return SCHEDULE_MAX_JOBS;
    }

    /**
     * Set SCHEDULE_MAX_JOBS
     **/
    public void setSCHEDULEMAXJOBS(Integer SCHEDULE_MAX_JOBS) {
        this.SCHEDULE_MAX_JOBS = SCHEDULE_MAX_JOBS;
    }

    public SettingsSettingsLoggingTestCreateRequest SCHEDULE_MAX_JOBS(Integer SCHEDULE_MAX_JOBS) {
        this.SCHEDULE_MAX_JOBS = SCHEDULE_MAX_JOBS;
        return this;
    }

    /**
    * Maximum number of simultaneous logged in sessions a user may have. To disable enter -1.
    * @return SESSIONS_PER_USER
    **/
    @JsonProperty("SESSIONS_PER_USER")
    public Integer getSESSIONSPERUSER() {
        return SESSIONS_PER_USER;
    }

    /**
     * Set SESSIONS_PER_USER
     **/
    public void setSESSIONSPERUSER(Integer SESSIONS_PER_USER) {
        this.SESSIONS_PER_USER = SESSIONS_PER_USER;
    }

    public SettingsSettingsLoggingTestCreateRequest SESSIONS_PER_USER(Integer SESSIONS_PER_USER) {
        this.SESSIONS_PER_USER = SESSIONS_PER_USER;
        return this;
    }

    /**
    * Number of seconds that a user is inactive before they will need to login again.
    * @return SESSION_COOKIE_AGE
    **/
    @JsonProperty("SESSION_COOKIE_AGE")
    public Integer getSESSIONCOOKIEAGE() {
        return SESSION_COOKIE_AGE;
    }

    /**
     * Set SESSION_COOKIE_AGE
     **/
    public void setSESSIONCOOKIEAGE(Integer SESSION_COOKIE_AGE) {
        this.SESSION_COOKIE_AGE = SESSION_COOKIE_AGE;
    }

    public SettingsSettingsLoggingTestCreateRequest SESSION_COOKIE_AGE(Integer SESSION_COOKIE_AGE) {
        this.SESSION_COOKIE_AGE = SESSION_COOKIE_AGE;
        return this;
    }

    /**
    * The OAuth2 key (Client ID) from your Azure AD application.
    * @return SOCIAL_AUTH_AZUREAD_OAUTH2_KEY
    **/
    @JsonProperty("SOCIAL_AUTH_AZUREAD_OAUTH2_KEY")
    public String getSOCIALAUTHAZUREADOAUTH2KEY() {
        return SOCIAL_AUTH_AZUREAD_OAUTH2_KEY;
    }

    /**
     * Set SOCIAL_AUTH_AZUREAD_OAUTH2_KEY
     **/
    public void setSOCIALAUTHAZUREADOAUTH2KEY(String SOCIAL_AUTH_AZUREAD_OAUTH2_KEY) {
        this.SOCIAL_AUTH_AZUREAD_OAUTH2_KEY = SOCIAL_AUTH_AZUREAD_OAUTH2_KEY;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_AZUREAD_OAUTH2_KEY(String SOCIAL_AUTH_AZUREAD_OAUTH2_KEY) {
        this.SOCIAL_AUTH_AZUREAD_OAUTH2_KEY = SOCIAL_AUTH_AZUREAD_OAUTH2_KEY;
        return this;
    }

    /**
    * Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_AZUREAD_OAUTH2_ORGANIZATION_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_AZUREAD_OAUTH2_ORGANIZATION_MAP")
    public Object getSOCIALAUTHAZUREADOAUTH2ORGANIZATIONMAP() {
        return SOCIAL_AUTH_AZUREAD_OAUTH2_ORGANIZATION_MAP;
    }

    /**
     * Set SOCIAL_AUTH_AZUREAD_OAUTH2_ORGANIZATION_MAP
     **/
    public void setSOCIALAUTHAZUREADOAUTH2ORGANIZATIONMAP(Object SOCIAL_AUTH_AZUREAD_OAUTH2_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_AZUREAD_OAUTH2_ORGANIZATION_MAP = SOCIAL_AUTH_AZUREAD_OAUTH2_ORGANIZATION_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_AZUREAD_OAUTH2_ORGANIZATION_MAP(Object SOCIAL_AUTH_AZUREAD_OAUTH2_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_AZUREAD_OAUTH2_ORGANIZATION_MAP = SOCIAL_AUTH_AZUREAD_OAUTH2_ORGANIZATION_MAP;
        return this;
    }

    /**
    * The OAuth2 secret (Client Secret) from your Azure AD application.
    * @return SOCIAL_AUTH_AZUREAD_OAUTH2_SECRET
    **/
    @JsonProperty("SOCIAL_AUTH_AZUREAD_OAUTH2_SECRET")
    public String getSOCIALAUTHAZUREADOAUTH2SECRET() {
        return SOCIAL_AUTH_AZUREAD_OAUTH2_SECRET;
    }

    /**
     * Set SOCIAL_AUTH_AZUREAD_OAUTH2_SECRET
     **/
    public void setSOCIALAUTHAZUREADOAUTH2SECRET(String SOCIAL_AUTH_AZUREAD_OAUTH2_SECRET) {
        this.SOCIAL_AUTH_AZUREAD_OAUTH2_SECRET = SOCIAL_AUTH_AZUREAD_OAUTH2_SECRET;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_AZUREAD_OAUTH2_SECRET(String SOCIAL_AUTH_AZUREAD_OAUTH2_SECRET) {
        this.SOCIAL_AUTH_AZUREAD_OAUTH2_SECRET = SOCIAL_AUTH_AZUREAD_OAUTH2_SECRET;
        return this;
    }

    /**
    * Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_AZUREAD_OAUTH2_TEAM_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_AZUREAD_OAUTH2_TEAM_MAP")
    public Object getSOCIALAUTHAZUREADOAUTH2TEAMMAP() {
        return SOCIAL_AUTH_AZUREAD_OAUTH2_TEAM_MAP;
    }

    /**
     * Set SOCIAL_AUTH_AZUREAD_OAUTH2_TEAM_MAP
     **/
    public void setSOCIALAUTHAZUREADOAUTH2TEAMMAP(Object SOCIAL_AUTH_AZUREAD_OAUTH2_TEAM_MAP) {
        this.SOCIAL_AUTH_AZUREAD_OAUTH2_TEAM_MAP = SOCIAL_AUTH_AZUREAD_OAUTH2_TEAM_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_AZUREAD_OAUTH2_TEAM_MAP(Object SOCIAL_AUTH_AZUREAD_OAUTH2_TEAM_MAP) {
        this.SOCIAL_AUTH_AZUREAD_OAUTH2_TEAM_MAP = SOCIAL_AUTH_AZUREAD_OAUTH2_TEAM_MAP;
        return this;
    }

    /**
    * The API URL for your GitHub Enterprise instance, e.g.: http(s)://hostname/api/v3/. Refer to Github Enterprise documentation for more details.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_API_URL
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_API_URL")
    public String getSOCIALAUTHGITHUBENTERPRISEAPIURL() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_API_URL;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_API_URL
     **/
    public void setSOCIALAUTHGITHUBENTERPRISEAPIURL(String SOCIAL_AUTH_GITHUB_ENTERPRISE_API_URL) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_API_URL = SOCIAL_AUTH_GITHUB_ENTERPRISE_API_URL;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_API_URL(String SOCIAL_AUTH_GITHUB_ENTERPRISE_API_URL) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_API_URL = SOCIAL_AUTH_GITHUB_ENTERPRISE_API_URL;
        return this;
    }

    /**
    * The OAuth2 key (Client ID) from your GitHub Enterprise developer application.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_KEY
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_KEY")
    public String getSOCIALAUTHGITHUBENTERPRISEKEY() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_KEY;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_KEY
     **/
    public void setSOCIALAUTHGITHUBENTERPRISEKEY(String SOCIAL_AUTH_GITHUB_ENTERPRISE_KEY) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_KEY = SOCIAL_AUTH_GITHUB_ENTERPRISE_KEY;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_KEY(String SOCIAL_AUTH_GITHUB_ENTERPRISE_KEY) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_KEY = SOCIAL_AUTH_GITHUB_ENTERPRISE_KEY;
        return this;
    }

    /**
    * Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_ORGANIZATION_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_ORGANIZATION_MAP")
    public Object getSOCIALAUTHGITHUBENTERPRISEORGANIZATIONMAP() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_ORGANIZATION_MAP;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_ORGANIZATION_MAP
     **/
    public void setSOCIALAUTHGITHUBENTERPRISEORGANIZATIONMAP(Object SOCIAL_AUTH_GITHUB_ENTERPRISE_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_ORGANIZATION_MAP = SOCIAL_AUTH_GITHUB_ENTERPRISE_ORGANIZATION_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_ORGANIZATION_MAP(Object SOCIAL_AUTH_GITHUB_ENTERPRISE_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_ORGANIZATION_MAP = SOCIAL_AUTH_GITHUB_ENTERPRISE_ORGANIZATION_MAP;
        return this;
    }

    /**
    * The API URL for your GitHub Enterprise instance, e.g.: http(s)://hostname/api/v3/. Refer to Github Enterprise documentation for more details.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_API_URL
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_API_URL")
    public String getSOCIALAUTHGITHUBENTERPRISEORGAPIURL() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_API_URL;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_API_URL
     **/
    public void setSOCIALAUTHGITHUBENTERPRISEORGAPIURL(String SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_API_URL) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_API_URL = SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_API_URL;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_API_URL(String SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_API_URL) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_API_URL = SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_API_URL;
        return this;
    }

    /**
    * The OAuth2 key (Client ID) from your GitHub Enterprise organization application.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_KEY
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_KEY")
    public String getSOCIALAUTHGITHUBENTERPRISEORGKEY() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_KEY;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_KEY
     **/
    public void setSOCIALAUTHGITHUBENTERPRISEORGKEY(String SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_KEY) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_KEY = SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_KEY;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_KEY(String SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_KEY) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_KEY = SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_KEY;
        return this;
    }

    /**
    * The name of your GitHub Enterprise organization, as used in your organization's URL: https://github.com/<yourorg>/.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_NAME
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_NAME")
    public String getSOCIALAUTHGITHUBENTERPRISEORGNAME() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_NAME;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_NAME
     **/
    public void setSOCIALAUTHGITHUBENTERPRISEORGNAME(String SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_NAME) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_NAME = SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_NAME;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_NAME(String SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_NAME) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_NAME = SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_NAME;
        return this;
    }

    /**
    * Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_ORGANIZATION_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_ORGANIZATION_MAP")
    public Object getSOCIALAUTHGITHUBENTERPRISEORGORGANIZATIONMAP() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_ORGANIZATION_MAP;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_ORGANIZATION_MAP
     **/
    public void setSOCIALAUTHGITHUBENTERPRISEORGORGANIZATIONMAP(Object SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_ORGANIZATION_MAP = SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_ORGANIZATION_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_ORGANIZATION_MAP(Object SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_ORGANIZATION_MAP = SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_ORGANIZATION_MAP;
        return this;
    }

    /**
    * The OAuth2 secret (Client Secret) from your GitHub Enterprise organization application.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_SECRET
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_SECRET")
    public String getSOCIALAUTHGITHUBENTERPRISEORGSECRET() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_SECRET;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_SECRET
     **/
    public void setSOCIALAUTHGITHUBENTERPRISEORGSECRET(String SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_SECRET) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_SECRET = SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_SECRET;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_SECRET(String SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_SECRET) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_SECRET = SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_SECRET;
        return this;
    }

    /**
    * Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_TEAM_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_TEAM_MAP")
    public Object getSOCIALAUTHGITHUBENTERPRISEORGTEAMMAP() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_TEAM_MAP;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_TEAM_MAP
     **/
    public void setSOCIALAUTHGITHUBENTERPRISEORGTEAMMAP(Object SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_TEAM_MAP) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_TEAM_MAP = SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_TEAM_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_TEAM_MAP(Object SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_TEAM_MAP) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_TEAM_MAP = SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_TEAM_MAP;
        return this;
    }

    /**
    * The URL for your Github Enterprise instance, e.g.: http(s)://hostname/. Refer to Github Enterprise documentation for more details.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_URL
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_URL")
    public String getSOCIALAUTHGITHUBENTERPRISEORGURL() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_URL;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_URL
     **/
    public void setSOCIALAUTHGITHUBENTERPRISEORGURL(String SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_URL) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_URL = SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_URL;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_URL(String SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_URL) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_URL = SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_URL;
        return this;
    }

    /**
    * The OAuth2 secret (Client Secret) from your GitHub Enterprise developer application.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_SECRET
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_SECRET")
    public String getSOCIALAUTHGITHUBENTERPRISESECRET() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_SECRET;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_SECRET
     **/
    public void setSOCIALAUTHGITHUBENTERPRISESECRET(String SOCIAL_AUTH_GITHUB_ENTERPRISE_SECRET) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_SECRET = SOCIAL_AUTH_GITHUB_ENTERPRISE_SECRET;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_SECRET(String SOCIAL_AUTH_GITHUB_ENTERPRISE_SECRET) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_SECRET = SOCIAL_AUTH_GITHUB_ENTERPRISE_SECRET;
        return this;
    }

    /**
    * The API URL for your GitHub Enterprise instance, e.g.: http(s)://hostname/api/v3/. Refer to Github Enterprise documentation for more details.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_API_URL
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_API_URL")
    public String getSOCIALAUTHGITHUBENTERPRISETEAMAPIURL() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_API_URL;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_API_URL
     **/
    public void setSOCIALAUTHGITHUBENTERPRISETEAMAPIURL(String SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_API_URL) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_API_URL = SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_API_URL;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_API_URL(String SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_API_URL) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_API_URL = SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_API_URL;
        return this;
    }

    /**
    * Find the numeric team ID using the Github Enterprise API: http://fabian-kostadinov.github.io/2015/01/16/how-to-find-a-github-team-id/.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ID
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ID")
    public String getSOCIALAUTHGITHUBENTERPRISETEAMID() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ID;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ID
     **/
    public void setSOCIALAUTHGITHUBENTERPRISETEAMID(String SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ID) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ID = SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ID;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ID(String SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ID) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ID = SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ID;
        return this;
    }

    /**
    * The OAuth2 key (Client ID) from your GitHub Enterprise organization application.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_KEY
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_KEY")
    public String getSOCIALAUTHGITHUBENTERPRISETEAMKEY() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_KEY;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_KEY
     **/
    public void setSOCIALAUTHGITHUBENTERPRISETEAMKEY(String SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_KEY) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_KEY = SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_KEY;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_KEY(String SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_KEY) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_KEY = SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_KEY;
        return this;
    }

    /**
    * Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_MAP")
    public Object getSOCIALAUTHGITHUBENTERPRISETEAMMAP() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_MAP;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_MAP
     **/
    public void setSOCIALAUTHGITHUBENTERPRISETEAMMAP(Object SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_MAP) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_MAP = SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_MAP(Object SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_MAP) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_MAP = SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_MAP;
        return this;
    }

    /**
    * Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ORGANIZATION_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ORGANIZATION_MAP")
    public Object getSOCIALAUTHGITHUBENTERPRISETEAMORGANIZATIONMAP() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ORGANIZATION_MAP;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ORGANIZATION_MAP
     **/
    public void setSOCIALAUTHGITHUBENTERPRISETEAMORGANIZATIONMAP(Object SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ORGANIZATION_MAP = SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ORGANIZATION_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ORGANIZATION_MAP(Object SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ORGANIZATION_MAP = SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ORGANIZATION_MAP;
        return this;
    }

    /**
    * The OAuth2 secret (Client Secret) from your GitHub Enterprise organization application.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_SECRET
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_SECRET")
    public String getSOCIALAUTHGITHUBENTERPRISETEAMSECRET() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_SECRET;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_SECRET
     **/
    public void setSOCIALAUTHGITHUBENTERPRISETEAMSECRET(String SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_SECRET) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_SECRET = SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_SECRET;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_SECRET(String SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_SECRET) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_SECRET = SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_SECRET;
        return this;
    }

    /**
    * Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_TEAM_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_TEAM_MAP")
    public Object getSOCIALAUTHGITHUBENTERPRISETEAMTEAMMAP() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_TEAM_MAP;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_TEAM_MAP
     **/
    public void setSOCIALAUTHGITHUBENTERPRISETEAMTEAMMAP(Object SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_TEAM_MAP) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_TEAM_MAP = SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_TEAM_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_TEAM_MAP(Object SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_TEAM_MAP) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_TEAM_MAP = SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_TEAM_MAP;
        return this;
    }

    /**
    * The URL for your Github Enterprise instance, e.g.: http(s)://hostname/. Refer to Github Enterprise documentation for more details.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_URL
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_URL")
    public String getSOCIALAUTHGITHUBENTERPRISETEAMURL() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_URL;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_URL
     **/
    public void setSOCIALAUTHGITHUBENTERPRISETEAMURL(String SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_URL) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_URL = SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_URL;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_URL(String SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_URL) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_URL = SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_URL;
        return this;
    }

    /**
    * The URL for your Github Enterprise instance, e.g.: http(s)://hostname/. Refer to Github Enterprise documentation for more details.
    * @return SOCIAL_AUTH_GITHUB_ENTERPRISE_URL
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ENTERPRISE_URL")
    public String getSOCIALAUTHGITHUBENTERPRISEURL() {
        return SOCIAL_AUTH_GITHUB_ENTERPRISE_URL;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ENTERPRISE_URL
     **/
    public void setSOCIALAUTHGITHUBENTERPRISEURL(String SOCIAL_AUTH_GITHUB_ENTERPRISE_URL) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_URL = SOCIAL_AUTH_GITHUB_ENTERPRISE_URL;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ENTERPRISE_URL(String SOCIAL_AUTH_GITHUB_ENTERPRISE_URL) {
        this.SOCIAL_AUTH_GITHUB_ENTERPRISE_URL = SOCIAL_AUTH_GITHUB_ENTERPRISE_URL;
        return this;
    }

    /**
    * The OAuth2 key (Client ID) from your GitHub developer application.
    * @return SOCIAL_AUTH_GITHUB_KEY
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_KEY")
    public String getSOCIALAUTHGITHUBKEY() {
        return SOCIAL_AUTH_GITHUB_KEY;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_KEY
     **/
    public void setSOCIALAUTHGITHUBKEY(String SOCIAL_AUTH_GITHUB_KEY) {
        this.SOCIAL_AUTH_GITHUB_KEY = SOCIAL_AUTH_GITHUB_KEY;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_KEY(String SOCIAL_AUTH_GITHUB_KEY) {
        this.SOCIAL_AUTH_GITHUB_KEY = SOCIAL_AUTH_GITHUB_KEY;
        return this;
    }

    /**
    * Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_GITHUB_ORGANIZATION_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ORGANIZATION_MAP")
    public Object getSOCIALAUTHGITHUBORGANIZATIONMAP() {
        return SOCIAL_AUTH_GITHUB_ORGANIZATION_MAP;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ORGANIZATION_MAP
     **/
    public void setSOCIALAUTHGITHUBORGANIZATIONMAP(Object SOCIAL_AUTH_GITHUB_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_GITHUB_ORGANIZATION_MAP = SOCIAL_AUTH_GITHUB_ORGANIZATION_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ORGANIZATION_MAP(Object SOCIAL_AUTH_GITHUB_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_GITHUB_ORGANIZATION_MAP = SOCIAL_AUTH_GITHUB_ORGANIZATION_MAP;
        return this;
    }

    /**
    * The OAuth2 key (Client ID) from your GitHub organization application.
    * @return SOCIAL_AUTH_GITHUB_ORG_KEY
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ORG_KEY")
    public String getSOCIALAUTHGITHUBORGKEY() {
        return SOCIAL_AUTH_GITHUB_ORG_KEY;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ORG_KEY
     **/
    public void setSOCIALAUTHGITHUBORGKEY(String SOCIAL_AUTH_GITHUB_ORG_KEY) {
        this.SOCIAL_AUTH_GITHUB_ORG_KEY = SOCIAL_AUTH_GITHUB_ORG_KEY;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ORG_KEY(String SOCIAL_AUTH_GITHUB_ORG_KEY) {
        this.SOCIAL_AUTH_GITHUB_ORG_KEY = SOCIAL_AUTH_GITHUB_ORG_KEY;
        return this;
    }

    /**
    * The name of your GitHub organization, as used in your organization's URL: https://github.com/<yourorg>/.
    * @return SOCIAL_AUTH_GITHUB_ORG_NAME
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ORG_NAME")
    public String getSOCIALAUTHGITHUBORGNAME() {
        return SOCIAL_AUTH_GITHUB_ORG_NAME;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ORG_NAME
     **/
    public void setSOCIALAUTHGITHUBORGNAME(String SOCIAL_AUTH_GITHUB_ORG_NAME) {
        this.SOCIAL_AUTH_GITHUB_ORG_NAME = SOCIAL_AUTH_GITHUB_ORG_NAME;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ORG_NAME(String SOCIAL_AUTH_GITHUB_ORG_NAME) {
        this.SOCIAL_AUTH_GITHUB_ORG_NAME = SOCIAL_AUTH_GITHUB_ORG_NAME;
        return this;
    }

    /**
    * Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_GITHUB_ORG_ORGANIZATION_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ORG_ORGANIZATION_MAP")
    public Object getSOCIALAUTHGITHUBORGORGANIZATIONMAP() {
        return SOCIAL_AUTH_GITHUB_ORG_ORGANIZATION_MAP;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ORG_ORGANIZATION_MAP
     **/
    public void setSOCIALAUTHGITHUBORGORGANIZATIONMAP(Object SOCIAL_AUTH_GITHUB_ORG_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_GITHUB_ORG_ORGANIZATION_MAP = SOCIAL_AUTH_GITHUB_ORG_ORGANIZATION_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ORG_ORGANIZATION_MAP(Object SOCIAL_AUTH_GITHUB_ORG_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_GITHUB_ORG_ORGANIZATION_MAP = SOCIAL_AUTH_GITHUB_ORG_ORGANIZATION_MAP;
        return this;
    }

    /**
    * The OAuth2 secret (Client Secret) from your GitHub organization application.
    * @return SOCIAL_AUTH_GITHUB_ORG_SECRET
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ORG_SECRET")
    public String getSOCIALAUTHGITHUBORGSECRET() {
        return SOCIAL_AUTH_GITHUB_ORG_SECRET;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ORG_SECRET
     **/
    public void setSOCIALAUTHGITHUBORGSECRET(String SOCIAL_AUTH_GITHUB_ORG_SECRET) {
        this.SOCIAL_AUTH_GITHUB_ORG_SECRET = SOCIAL_AUTH_GITHUB_ORG_SECRET;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ORG_SECRET(String SOCIAL_AUTH_GITHUB_ORG_SECRET) {
        this.SOCIAL_AUTH_GITHUB_ORG_SECRET = SOCIAL_AUTH_GITHUB_ORG_SECRET;
        return this;
    }

    /**
    * Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_GITHUB_ORG_TEAM_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_ORG_TEAM_MAP")
    public Object getSOCIALAUTHGITHUBORGTEAMMAP() {
        return SOCIAL_AUTH_GITHUB_ORG_TEAM_MAP;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_ORG_TEAM_MAP
     **/
    public void setSOCIALAUTHGITHUBORGTEAMMAP(Object SOCIAL_AUTH_GITHUB_ORG_TEAM_MAP) {
        this.SOCIAL_AUTH_GITHUB_ORG_TEAM_MAP = SOCIAL_AUTH_GITHUB_ORG_TEAM_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_ORG_TEAM_MAP(Object SOCIAL_AUTH_GITHUB_ORG_TEAM_MAP) {
        this.SOCIAL_AUTH_GITHUB_ORG_TEAM_MAP = SOCIAL_AUTH_GITHUB_ORG_TEAM_MAP;
        return this;
    }

    /**
    * The OAuth2 secret (Client Secret) from your GitHub developer application.
    * @return SOCIAL_AUTH_GITHUB_SECRET
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_SECRET")
    public String getSOCIALAUTHGITHUBSECRET() {
        return SOCIAL_AUTH_GITHUB_SECRET;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_SECRET
     **/
    public void setSOCIALAUTHGITHUBSECRET(String SOCIAL_AUTH_GITHUB_SECRET) {
        this.SOCIAL_AUTH_GITHUB_SECRET = SOCIAL_AUTH_GITHUB_SECRET;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_SECRET(String SOCIAL_AUTH_GITHUB_SECRET) {
        this.SOCIAL_AUTH_GITHUB_SECRET = SOCIAL_AUTH_GITHUB_SECRET;
        return this;
    }

    /**
    * Find the numeric team ID using the Github API: http://fabian-kostadinov.github.io/2015/01/16/how-to-find-a-github-team-id/.
    * @return SOCIAL_AUTH_GITHUB_TEAM_ID
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_TEAM_ID")
    public String getSOCIALAUTHGITHUBTEAMID() {
        return SOCIAL_AUTH_GITHUB_TEAM_ID;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_TEAM_ID
     **/
    public void setSOCIALAUTHGITHUBTEAMID(String SOCIAL_AUTH_GITHUB_TEAM_ID) {
        this.SOCIAL_AUTH_GITHUB_TEAM_ID = SOCIAL_AUTH_GITHUB_TEAM_ID;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_TEAM_ID(String SOCIAL_AUTH_GITHUB_TEAM_ID) {
        this.SOCIAL_AUTH_GITHUB_TEAM_ID = SOCIAL_AUTH_GITHUB_TEAM_ID;
        return this;
    }

    /**
    * The OAuth2 key (Client ID) from your GitHub organization application.
    * @return SOCIAL_AUTH_GITHUB_TEAM_KEY
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_TEAM_KEY")
    public String getSOCIALAUTHGITHUBTEAMKEY() {
        return SOCIAL_AUTH_GITHUB_TEAM_KEY;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_TEAM_KEY
     **/
    public void setSOCIALAUTHGITHUBTEAMKEY(String SOCIAL_AUTH_GITHUB_TEAM_KEY) {
        this.SOCIAL_AUTH_GITHUB_TEAM_KEY = SOCIAL_AUTH_GITHUB_TEAM_KEY;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_TEAM_KEY(String SOCIAL_AUTH_GITHUB_TEAM_KEY) {
        this.SOCIAL_AUTH_GITHUB_TEAM_KEY = SOCIAL_AUTH_GITHUB_TEAM_KEY;
        return this;
    }

    /**
    * Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_GITHUB_TEAM_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_TEAM_MAP")
    public Object getSOCIALAUTHGITHUBTEAMMAP() {
        return SOCIAL_AUTH_GITHUB_TEAM_MAP;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_TEAM_MAP
     **/
    public void setSOCIALAUTHGITHUBTEAMMAP(Object SOCIAL_AUTH_GITHUB_TEAM_MAP) {
        this.SOCIAL_AUTH_GITHUB_TEAM_MAP = SOCIAL_AUTH_GITHUB_TEAM_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_TEAM_MAP(Object SOCIAL_AUTH_GITHUB_TEAM_MAP) {
        this.SOCIAL_AUTH_GITHUB_TEAM_MAP = SOCIAL_AUTH_GITHUB_TEAM_MAP;
        return this;
    }

    /**
    * Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_GITHUB_TEAM_ORGANIZATION_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_TEAM_ORGANIZATION_MAP")
    public Object getSOCIALAUTHGITHUBTEAMORGANIZATIONMAP() {
        return SOCIAL_AUTH_GITHUB_TEAM_ORGANIZATION_MAP;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_TEAM_ORGANIZATION_MAP
     **/
    public void setSOCIALAUTHGITHUBTEAMORGANIZATIONMAP(Object SOCIAL_AUTH_GITHUB_TEAM_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_GITHUB_TEAM_ORGANIZATION_MAP = SOCIAL_AUTH_GITHUB_TEAM_ORGANIZATION_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_TEAM_ORGANIZATION_MAP(Object SOCIAL_AUTH_GITHUB_TEAM_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_GITHUB_TEAM_ORGANIZATION_MAP = SOCIAL_AUTH_GITHUB_TEAM_ORGANIZATION_MAP;
        return this;
    }

    /**
    * The OAuth2 secret (Client Secret) from your GitHub organization application.
    * @return SOCIAL_AUTH_GITHUB_TEAM_SECRET
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_TEAM_SECRET")
    public String getSOCIALAUTHGITHUBTEAMSECRET() {
        return SOCIAL_AUTH_GITHUB_TEAM_SECRET;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_TEAM_SECRET
     **/
    public void setSOCIALAUTHGITHUBTEAMSECRET(String SOCIAL_AUTH_GITHUB_TEAM_SECRET) {
        this.SOCIAL_AUTH_GITHUB_TEAM_SECRET = SOCIAL_AUTH_GITHUB_TEAM_SECRET;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_TEAM_SECRET(String SOCIAL_AUTH_GITHUB_TEAM_SECRET) {
        this.SOCIAL_AUTH_GITHUB_TEAM_SECRET = SOCIAL_AUTH_GITHUB_TEAM_SECRET;
        return this;
    }

    /**
    * Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_GITHUB_TEAM_TEAM_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_GITHUB_TEAM_TEAM_MAP")
    public Object getSOCIALAUTHGITHUBTEAMTEAMMAP() {
        return SOCIAL_AUTH_GITHUB_TEAM_TEAM_MAP;
    }

    /**
     * Set SOCIAL_AUTH_GITHUB_TEAM_TEAM_MAP
     **/
    public void setSOCIALAUTHGITHUBTEAMTEAMMAP(Object SOCIAL_AUTH_GITHUB_TEAM_TEAM_MAP) {
        this.SOCIAL_AUTH_GITHUB_TEAM_TEAM_MAP = SOCIAL_AUTH_GITHUB_TEAM_TEAM_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GITHUB_TEAM_TEAM_MAP(Object SOCIAL_AUTH_GITHUB_TEAM_TEAM_MAP) {
        this.SOCIAL_AUTH_GITHUB_TEAM_TEAM_MAP = SOCIAL_AUTH_GITHUB_TEAM_TEAM_MAP;
        return this;
    }

    /**
    * Extra arguments for Google OAuth2 login. You can restrict it to only allow a single domain to authenticate, even if the user is logged in with multple Google accounts. Refer to the documentation for more detail.
    * @return SOCIAL_AUTH_GOOGLE_OAUTH2_AUTH_EXTRA_ARGUMENTS
    **/
    @JsonProperty("SOCIAL_AUTH_GOOGLE_OAUTH2_AUTH_EXTRA_ARGUMENTS")
    public Object getSOCIALAUTHGOOGLEOAUTH2AUTHEXTRAARGUMENTS() {
        return SOCIAL_AUTH_GOOGLE_OAUTH2_AUTH_EXTRA_ARGUMENTS;
    }

    /**
     * Set SOCIAL_AUTH_GOOGLE_OAUTH2_AUTH_EXTRA_ARGUMENTS
     **/
    public void setSOCIALAUTHGOOGLEOAUTH2AUTHEXTRAARGUMENTS(Object SOCIAL_AUTH_GOOGLE_OAUTH2_AUTH_EXTRA_ARGUMENTS) {
        this.SOCIAL_AUTH_GOOGLE_OAUTH2_AUTH_EXTRA_ARGUMENTS = SOCIAL_AUTH_GOOGLE_OAUTH2_AUTH_EXTRA_ARGUMENTS;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GOOGLE_OAUTH2_AUTH_EXTRA_ARGUMENTS(Object SOCIAL_AUTH_GOOGLE_OAUTH2_AUTH_EXTRA_ARGUMENTS) {
        this.SOCIAL_AUTH_GOOGLE_OAUTH2_AUTH_EXTRA_ARGUMENTS = SOCIAL_AUTH_GOOGLE_OAUTH2_AUTH_EXTRA_ARGUMENTS;
        return this;
    }

    /**
    * The OAuth2 key from your web application.
    * @return SOCIAL_AUTH_GOOGLE_OAUTH2_KEY
    **/
    @JsonProperty("SOCIAL_AUTH_GOOGLE_OAUTH2_KEY")
    public String getSOCIALAUTHGOOGLEOAUTH2KEY() {
        return SOCIAL_AUTH_GOOGLE_OAUTH2_KEY;
    }

    /**
     * Set SOCIAL_AUTH_GOOGLE_OAUTH2_KEY
     **/
    public void setSOCIALAUTHGOOGLEOAUTH2KEY(String SOCIAL_AUTH_GOOGLE_OAUTH2_KEY) {
        this.SOCIAL_AUTH_GOOGLE_OAUTH2_KEY = SOCIAL_AUTH_GOOGLE_OAUTH2_KEY;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GOOGLE_OAUTH2_KEY(String SOCIAL_AUTH_GOOGLE_OAUTH2_KEY) {
        this.SOCIAL_AUTH_GOOGLE_OAUTH2_KEY = SOCIAL_AUTH_GOOGLE_OAUTH2_KEY;
        return this;
    }

    /**
    * Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_GOOGLE_OAUTH2_ORGANIZATION_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_GOOGLE_OAUTH2_ORGANIZATION_MAP")
    public Object getSOCIALAUTHGOOGLEOAUTH2ORGANIZATIONMAP() {
        return SOCIAL_AUTH_GOOGLE_OAUTH2_ORGANIZATION_MAP;
    }

    /**
     * Set SOCIAL_AUTH_GOOGLE_OAUTH2_ORGANIZATION_MAP
     **/
    public void setSOCIALAUTHGOOGLEOAUTH2ORGANIZATIONMAP(Object SOCIAL_AUTH_GOOGLE_OAUTH2_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_GOOGLE_OAUTH2_ORGANIZATION_MAP = SOCIAL_AUTH_GOOGLE_OAUTH2_ORGANIZATION_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GOOGLE_OAUTH2_ORGANIZATION_MAP(Object SOCIAL_AUTH_GOOGLE_OAUTH2_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_GOOGLE_OAUTH2_ORGANIZATION_MAP = SOCIAL_AUTH_GOOGLE_OAUTH2_ORGANIZATION_MAP;
        return this;
    }

    /**
    * The OAuth2 secret from your web application.
    * @return SOCIAL_AUTH_GOOGLE_OAUTH2_SECRET
    **/
    @JsonProperty("SOCIAL_AUTH_GOOGLE_OAUTH2_SECRET")
    public String getSOCIALAUTHGOOGLEOAUTH2SECRET() {
        return SOCIAL_AUTH_GOOGLE_OAUTH2_SECRET;
    }

    /**
     * Set SOCIAL_AUTH_GOOGLE_OAUTH2_SECRET
     **/
    public void setSOCIALAUTHGOOGLEOAUTH2SECRET(String SOCIAL_AUTH_GOOGLE_OAUTH2_SECRET) {
        this.SOCIAL_AUTH_GOOGLE_OAUTH2_SECRET = SOCIAL_AUTH_GOOGLE_OAUTH2_SECRET;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GOOGLE_OAUTH2_SECRET(String SOCIAL_AUTH_GOOGLE_OAUTH2_SECRET) {
        this.SOCIAL_AUTH_GOOGLE_OAUTH2_SECRET = SOCIAL_AUTH_GOOGLE_OAUTH2_SECRET;
        return this;
    }

    /**
    * Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_GOOGLE_OAUTH2_TEAM_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_GOOGLE_OAUTH2_TEAM_MAP")
    public Object getSOCIALAUTHGOOGLEOAUTH2TEAMMAP() {
        return SOCIAL_AUTH_GOOGLE_OAUTH2_TEAM_MAP;
    }

    /**
     * Set SOCIAL_AUTH_GOOGLE_OAUTH2_TEAM_MAP
     **/
    public void setSOCIALAUTHGOOGLEOAUTH2TEAMMAP(Object SOCIAL_AUTH_GOOGLE_OAUTH2_TEAM_MAP) {
        this.SOCIAL_AUTH_GOOGLE_OAUTH2_TEAM_MAP = SOCIAL_AUTH_GOOGLE_OAUTH2_TEAM_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GOOGLE_OAUTH2_TEAM_MAP(Object SOCIAL_AUTH_GOOGLE_OAUTH2_TEAM_MAP) {
        this.SOCIAL_AUTH_GOOGLE_OAUTH2_TEAM_MAP = SOCIAL_AUTH_GOOGLE_OAUTH2_TEAM_MAP;
        return this;
    }

    /**
    * Update this setting to restrict the domains who are allowed to login using Google OAuth2.
    * @return SOCIAL_AUTH_GOOGLE_OAUTH2_WHITELISTED_DOMAINS
    **/
    @JsonProperty("SOCIAL_AUTH_GOOGLE_OAUTH2_WHITELISTED_DOMAINS")
    public List<String> getSOCIALAUTHGOOGLEOAUTH2WHITELISTEDDOMAINS() {
        return SOCIAL_AUTH_GOOGLE_OAUTH2_WHITELISTED_DOMAINS;
    }

    /**
     * Set SOCIAL_AUTH_GOOGLE_OAUTH2_WHITELISTED_DOMAINS
     **/
    public void setSOCIALAUTHGOOGLEOAUTH2WHITELISTEDDOMAINS(List<String> SOCIAL_AUTH_GOOGLE_OAUTH2_WHITELISTED_DOMAINS) {
        this.SOCIAL_AUTH_GOOGLE_OAUTH2_WHITELISTED_DOMAINS = SOCIAL_AUTH_GOOGLE_OAUTH2_WHITELISTED_DOMAINS;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_GOOGLE_OAUTH2_WHITELISTED_DOMAINS(List<String> SOCIAL_AUTH_GOOGLE_OAUTH2_WHITELISTED_DOMAINS) {
        this.SOCIAL_AUTH_GOOGLE_OAUTH2_WHITELISTED_DOMAINS = SOCIAL_AUTH_GOOGLE_OAUTH2_WHITELISTED_DOMAINS;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addSOCIALAUTHGOOGLEOAUTH2WHITELISTEDDOMAINSItem(String SOCIAL_AUTH_GOOGLE_OAUTH2_WHITELISTED_DOMAINSItem) {
        this.SOCIAL_AUTH_GOOGLE_OAUTH2_WHITELISTED_DOMAINS.add(SOCIAL_AUTH_GOOGLE_OAUTH2_WHITELISTED_DOMAINSItem);
        return this;
    }

    /**
    * The OIDC key (Client ID) from your IDP.
    * @return SOCIAL_AUTH_OIDC_KEY
    **/
    @JsonProperty("SOCIAL_AUTH_OIDC_KEY")
    public String getSOCIALAUTHOIDCKEY() {
        return SOCIAL_AUTH_OIDC_KEY;
    }

    /**
     * Set SOCIAL_AUTH_OIDC_KEY
     **/
    public void setSOCIALAUTHOIDCKEY(String SOCIAL_AUTH_OIDC_KEY) {
        this.SOCIAL_AUTH_OIDC_KEY = SOCIAL_AUTH_OIDC_KEY;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_OIDC_KEY(String SOCIAL_AUTH_OIDC_KEY) {
        this.SOCIAL_AUTH_OIDC_KEY = SOCIAL_AUTH_OIDC_KEY;
        return this;
    }

    /**
    * The URL for your OIDC provider including the path up to /.well-known/openid-configuration
    * @return SOCIAL_AUTH_OIDC_OIDC_ENDPOINT
    **/
    @JsonProperty("SOCIAL_AUTH_OIDC_OIDC_ENDPOINT")
    public String getSOCIALAUTHOIDCOIDCENDPOINT() {
        return SOCIAL_AUTH_OIDC_OIDC_ENDPOINT;
    }

    /**
     * Set SOCIAL_AUTH_OIDC_OIDC_ENDPOINT
     **/
    public void setSOCIALAUTHOIDCOIDCENDPOINT(String SOCIAL_AUTH_OIDC_OIDC_ENDPOINT) {
        this.SOCIAL_AUTH_OIDC_OIDC_ENDPOINT = SOCIAL_AUTH_OIDC_OIDC_ENDPOINT;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_OIDC_OIDC_ENDPOINT(String SOCIAL_AUTH_OIDC_OIDC_ENDPOINT) {
        this.SOCIAL_AUTH_OIDC_OIDC_ENDPOINT = SOCIAL_AUTH_OIDC_OIDC_ENDPOINT;
        return this;
    }

    /**
    * The OIDC secret (Client Secret) from your IDP.
    * @return SOCIAL_AUTH_OIDC_SECRET
    **/
    @JsonProperty("SOCIAL_AUTH_OIDC_SECRET")
    public String getSOCIALAUTHOIDCSECRET() {
        return SOCIAL_AUTH_OIDC_SECRET;
    }

    /**
     * Set SOCIAL_AUTH_OIDC_SECRET
     **/
    public void setSOCIALAUTHOIDCSECRET(String SOCIAL_AUTH_OIDC_SECRET) {
        this.SOCIAL_AUTH_OIDC_SECRET = SOCIAL_AUTH_OIDC_SECRET;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_OIDC_SECRET(String SOCIAL_AUTH_OIDC_SECRET) {
        this.SOCIAL_AUTH_OIDC_SECRET = SOCIAL_AUTH_OIDC_SECRET;
        return this;
    }

    /**
    * Verify the OIDC provider ssl certificate.
    * @return SOCIAL_AUTH_OIDC_VERIFY_SSL
    **/
    @JsonProperty("SOCIAL_AUTH_OIDC_VERIFY_SSL")
    public Boolean getSOCIALAUTHOIDCVERIFYSSL() {
        return SOCIAL_AUTH_OIDC_VERIFY_SSL;
    }

    /**
     * Set SOCIAL_AUTH_OIDC_VERIFY_SSL
     **/
    public void setSOCIALAUTHOIDCVERIFYSSL(Boolean SOCIAL_AUTH_OIDC_VERIFY_SSL) {
        this.SOCIAL_AUTH_OIDC_VERIFY_SSL = SOCIAL_AUTH_OIDC_VERIFY_SSL;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_OIDC_VERIFY_SSL(Boolean SOCIAL_AUTH_OIDC_VERIFY_SSL) {
        this.SOCIAL_AUTH_OIDC_VERIFY_SSL = SOCIAL_AUTH_OIDC_VERIFY_SSL;
        return this;
    }

    /**
    * Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_ORGANIZATION_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_ORGANIZATION_MAP")
    public Object getSOCIALAUTHORGANIZATIONMAP() {
        return SOCIAL_AUTH_ORGANIZATION_MAP;
    }

    /**
     * Set SOCIAL_AUTH_ORGANIZATION_MAP
     **/
    public void setSOCIALAUTHORGANIZATIONMAP(Object SOCIAL_AUTH_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_ORGANIZATION_MAP = SOCIAL_AUTH_ORGANIZATION_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_ORGANIZATION_MAP(Object SOCIAL_AUTH_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_ORGANIZATION_MAP = SOCIAL_AUTH_ORGANIZATION_MAP;
        return this;
    }

    /**
    * Configure the Entity ID, SSO URL and certificate for each identity provider (IdP) in use. Multiple SAML IdPs are supported. Some IdPs may provide user data using attribute names that differ from the default OIDs. Attribute names may be overridden for each IdP. Refer to the Ansible documentation for additional details and syntax.
    * @return SOCIAL_AUTH_SAML_ENABLED_IDPS
    **/
    @JsonProperty("SOCIAL_AUTH_SAML_ENABLED_IDPS")
    public Object getSOCIALAUTHSAMLENABLEDIDPS() {
        return SOCIAL_AUTH_SAML_ENABLED_IDPS;
    }

    /**
     * Set SOCIAL_AUTH_SAML_ENABLED_IDPS
     **/
    public void setSOCIALAUTHSAMLENABLEDIDPS(Object SOCIAL_AUTH_SAML_ENABLED_IDPS) {
        this.SOCIAL_AUTH_SAML_ENABLED_IDPS = SOCIAL_AUTH_SAML_ENABLED_IDPS;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_SAML_ENABLED_IDPS(Object SOCIAL_AUTH_SAML_ENABLED_IDPS) {
        this.SOCIAL_AUTH_SAML_ENABLED_IDPS = SOCIAL_AUTH_SAML_ENABLED_IDPS;
        return this;
    }

    /**
    * A list of tuples that maps IDP attributes to extra_attributes. Each attribute will be a list of values, even if only 1 value.
    * @return SOCIAL_AUTH_SAML_EXTRA_DATA
    **/
    @JsonProperty("SOCIAL_AUTH_SAML_EXTRA_DATA")
    public List<String> getSOCIALAUTHSAMLEXTRADATA() {
        return SOCIAL_AUTH_SAML_EXTRA_DATA;
    }

    /**
     * Set SOCIAL_AUTH_SAML_EXTRA_DATA
     **/
    public void setSOCIALAUTHSAMLEXTRADATA(List<String> SOCIAL_AUTH_SAML_EXTRA_DATA) {
        this.SOCIAL_AUTH_SAML_EXTRA_DATA = SOCIAL_AUTH_SAML_EXTRA_DATA;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_SAML_EXTRA_DATA(List<String> SOCIAL_AUTH_SAML_EXTRA_DATA) {
        this.SOCIAL_AUTH_SAML_EXTRA_DATA = SOCIAL_AUTH_SAML_EXTRA_DATA;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addSOCIALAUTHSAMLEXTRADATAItem(String SOCIAL_AUTH_SAML_EXTRA_DATAItem) {
        this.SOCIAL_AUTH_SAML_EXTRA_DATA.add(SOCIAL_AUTH_SAML_EXTRA_DATAItem);
        return this;
    }

    /**
    * Used to translate user organization membership.
    * @return SOCIAL_AUTH_SAML_ORGANIZATION_ATTR
    **/
    @JsonProperty("SOCIAL_AUTH_SAML_ORGANIZATION_ATTR")
    public Object getSOCIALAUTHSAMLORGANIZATIONATTR() {
        return SOCIAL_AUTH_SAML_ORGANIZATION_ATTR;
    }

    /**
     * Set SOCIAL_AUTH_SAML_ORGANIZATION_ATTR
     **/
    public void setSOCIALAUTHSAMLORGANIZATIONATTR(Object SOCIAL_AUTH_SAML_ORGANIZATION_ATTR) {
        this.SOCIAL_AUTH_SAML_ORGANIZATION_ATTR = SOCIAL_AUTH_SAML_ORGANIZATION_ATTR;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_SAML_ORGANIZATION_ATTR(Object SOCIAL_AUTH_SAML_ORGANIZATION_ATTR) {
        this.SOCIAL_AUTH_SAML_ORGANIZATION_ATTR = SOCIAL_AUTH_SAML_ORGANIZATION_ATTR;
        return this;
    }

    /**
    * Mapping to organization admins/users from social auth accounts. This setting controls which users are placed into which organizations based on their username and email address. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_SAML_ORGANIZATION_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_SAML_ORGANIZATION_MAP")
    public Object getSOCIALAUTHSAMLORGANIZATIONMAP() {
        return SOCIAL_AUTH_SAML_ORGANIZATION_MAP;
    }

    /**
     * Set SOCIAL_AUTH_SAML_ORGANIZATION_MAP
     **/
    public void setSOCIALAUTHSAMLORGANIZATIONMAP(Object SOCIAL_AUTH_SAML_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_SAML_ORGANIZATION_MAP = SOCIAL_AUTH_SAML_ORGANIZATION_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_SAML_ORGANIZATION_MAP(Object SOCIAL_AUTH_SAML_ORGANIZATION_MAP) {
        this.SOCIAL_AUTH_SAML_ORGANIZATION_MAP = SOCIAL_AUTH_SAML_ORGANIZATION_MAP;
        return this;
    }

    /**
    * Provide the URL, display name, and the name of your app. Refer to the documentation for example syntax.
    * @return SOCIAL_AUTH_SAML_ORG_INFO
    **/
    @JsonProperty("SOCIAL_AUTH_SAML_ORG_INFO")
    public Object getSOCIALAUTHSAMLORGINFO() {
        return SOCIAL_AUTH_SAML_ORG_INFO;
    }

    /**
     * Set SOCIAL_AUTH_SAML_ORG_INFO
     **/
    public void setSOCIALAUTHSAMLORGINFO(Object SOCIAL_AUTH_SAML_ORG_INFO) {
        this.SOCIAL_AUTH_SAML_ORG_INFO = SOCIAL_AUTH_SAML_ORG_INFO;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_SAML_ORG_INFO(Object SOCIAL_AUTH_SAML_ORG_INFO) {
        this.SOCIAL_AUTH_SAML_ORG_INFO = SOCIAL_AUTH_SAML_ORG_INFO;
        return this;
    }

    /**
    * A dict of key value pairs that are passed to the underlying python-saml security setting https://github.com/onelogin/python-saml#settings
    * @return SOCIAL_AUTH_SAML_SECURITY_CONFIG
    **/
    @JsonProperty("SOCIAL_AUTH_SAML_SECURITY_CONFIG")
    public Object getSOCIALAUTHSAMLSECURITYCONFIG() {
        return SOCIAL_AUTH_SAML_SECURITY_CONFIG;
    }

    /**
     * Set SOCIAL_AUTH_SAML_SECURITY_CONFIG
     **/
    public void setSOCIALAUTHSAMLSECURITYCONFIG(Object SOCIAL_AUTH_SAML_SECURITY_CONFIG) {
        this.SOCIAL_AUTH_SAML_SECURITY_CONFIG = SOCIAL_AUTH_SAML_SECURITY_CONFIG;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_SAML_SECURITY_CONFIG(Object SOCIAL_AUTH_SAML_SECURITY_CONFIG) {
        this.SOCIAL_AUTH_SAML_SECURITY_CONFIG = SOCIAL_AUTH_SAML_SECURITY_CONFIG;
        return this;
    }

    /**
    * The application-defined unique identifier used as the audience of the SAML service provider (SP) configuration. This is usually the URL for the service.
    * @return SOCIAL_AUTH_SAML_SP_ENTITY_ID
    **/
    @JsonProperty("SOCIAL_AUTH_SAML_SP_ENTITY_ID")
    public String getSOCIALAUTHSAMLSPENTITYID() {
        return SOCIAL_AUTH_SAML_SP_ENTITY_ID;
    }

    /**
     * Set SOCIAL_AUTH_SAML_SP_ENTITY_ID
     **/
    public void setSOCIALAUTHSAMLSPENTITYID(String SOCIAL_AUTH_SAML_SP_ENTITY_ID) {
        this.SOCIAL_AUTH_SAML_SP_ENTITY_ID = SOCIAL_AUTH_SAML_SP_ENTITY_ID;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_SAML_SP_ENTITY_ID(String SOCIAL_AUTH_SAML_SP_ENTITY_ID) {
        this.SOCIAL_AUTH_SAML_SP_ENTITY_ID = SOCIAL_AUTH_SAML_SP_ENTITY_ID;
        return this;
    }

    /**
    * A dict of key value pairs to be passed to the underlying python-saml Service Provider configuration setting.
    * @return SOCIAL_AUTH_SAML_SP_EXTRA
    **/
    @JsonProperty("SOCIAL_AUTH_SAML_SP_EXTRA")
    public Object getSOCIALAUTHSAMLSPEXTRA() {
        return SOCIAL_AUTH_SAML_SP_EXTRA;
    }

    /**
     * Set SOCIAL_AUTH_SAML_SP_EXTRA
     **/
    public void setSOCIALAUTHSAMLSPEXTRA(Object SOCIAL_AUTH_SAML_SP_EXTRA) {
        this.SOCIAL_AUTH_SAML_SP_EXTRA = SOCIAL_AUTH_SAML_SP_EXTRA;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_SAML_SP_EXTRA(Object SOCIAL_AUTH_SAML_SP_EXTRA) {
        this.SOCIAL_AUTH_SAML_SP_EXTRA = SOCIAL_AUTH_SAML_SP_EXTRA;
        return this;
    }

    /**
    * Create a keypair to use as a service provider (SP) and include the private key content here.
    * @return SOCIAL_AUTH_SAML_SP_PRIVATE_KEY
    **/
    @JsonProperty("SOCIAL_AUTH_SAML_SP_PRIVATE_KEY")
    public String getSOCIALAUTHSAMLSPPRIVATEKEY() {
        return SOCIAL_AUTH_SAML_SP_PRIVATE_KEY;
    }

    /**
     * Set SOCIAL_AUTH_SAML_SP_PRIVATE_KEY
     **/
    public void setSOCIALAUTHSAMLSPPRIVATEKEY(String SOCIAL_AUTH_SAML_SP_PRIVATE_KEY) {
        this.SOCIAL_AUTH_SAML_SP_PRIVATE_KEY = SOCIAL_AUTH_SAML_SP_PRIVATE_KEY;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_SAML_SP_PRIVATE_KEY(String SOCIAL_AUTH_SAML_SP_PRIVATE_KEY) {
        this.SOCIAL_AUTH_SAML_SP_PRIVATE_KEY = SOCIAL_AUTH_SAML_SP_PRIVATE_KEY;
        return this;
    }

    /**
    * Create a keypair to use as a service provider (SP) and include the certificate content here.
    * @return SOCIAL_AUTH_SAML_SP_PUBLIC_CERT
    **/
    @JsonProperty("SOCIAL_AUTH_SAML_SP_PUBLIC_CERT")
    public String getSOCIALAUTHSAMLSPPUBLICCERT() {
        return SOCIAL_AUTH_SAML_SP_PUBLIC_CERT;
    }

    /**
     * Set SOCIAL_AUTH_SAML_SP_PUBLIC_CERT
     **/
    public void setSOCIALAUTHSAMLSPPUBLICCERT(String SOCIAL_AUTH_SAML_SP_PUBLIC_CERT) {
        this.SOCIAL_AUTH_SAML_SP_PUBLIC_CERT = SOCIAL_AUTH_SAML_SP_PUBLIC_CERT;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_SAML_SP_PUBLIC_CERT(String SOCIAL_AUTH_SAML_SP_PUBLIC_CERT) {
        this.SOCIAL_AUTH_SAML_SP_PUBLIC_CERT = SOCIAL_AUTH_SAML_SP_PUBLIC_CERT;
        return this;
    }

    /**
    * Provide the name and email address of the support contact for your service provider. Refer to the documentation for example syntax.
    * @return SOCIAL_AUTH_SAML_SUPPORT_CONTACT
    **/
    @JsonProperty("SOCIAL_AUTH_SAML_SUPPORT_CONTACT")
    public Object getSOCIALAUTHSAMLSUPPORTCONTACT() {
        return SOCIAL_AUTH_SAML_SUPPORT_CONTACT;
    }

    /**
     * Set SOCIAL_AUTH_SAML_SUPPORT_CONTACT
     **/
    public void setSOCIALAUTHSAMLSUPPORTCONTACT(Object SOCIAL_AUTH_SAML_SUPPORT_CONTACT) {
        this.SOCIAL_AUTH_SAML_SUPPORT_CONTACT = SOCIAL_AUTH_SAML_SUPPORT_CONTACT;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_SAML_SUPPORT_CONTACT(Object SOCIAL_AUTH_SAML_SUPPORT_CONTACT) {
        this.SOCIAL_AUTH_SAML_SUPPORT_CONTACT = SOCIAL_AUTH_SAML_SUPPORT_CONTACT;
        return this;
    }

    /**
    * Used to translate user team membership.
    * @return SOCIAL_AUTH_SAML_TEAM_ATTR
    **/
    @JsonProperty("SOCIAL_AUTH_SAML_TEAM_ATTR")
    public Object getSOCIALAUTHSAMLTEAMATTR() {
        return SOCIAL_AUTH_SAML_TEAM_ATTR;
    }

    /**
     * Set SOCIAL_AUTH_SAML_TEAM_ATTR
     **/
    public void setSOCIALAUTHSAMLTEAMATTR(Object SOCIAL_AUTH_SAML_TEAM_ATTR) {
        this.SOCIAL_AUTH_SAML_TEAM_ATTR = SOCIAL_AUTH_SAML_TEAM_ATTR;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_SAML_TEAM_ATTR(Object SOCIAL_AUTH_SAML_TEAM_ATTR) {
        this.SOCIAL_AUTH_SAML_TEAM_ATTR = SOCIAL_AUTH_SAML_TEAM_ATTR;
        return this;
    }

    /**
    * Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_SAML_TEAM_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_SAML_TEAM_MAP")
    public Object getSOCIALAUTHSAMLTEAMMAP() {
        return SOCIAL_AUTH_SAML_TEAM_MAP;
    }

    /**
     * Set SOCIAL_AUTH_SAML_TEAM_MAP
     **/
    public void setSOCIALAUTHSAMLTEAMMAP(Object SOCIAL_AUTH_SAML_TEAM_MAP) {
        this.SOCIAL_AUTH_SAML_TEAM_MAP = SOCIAL_AUTH_SAML_TEAM_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_SAML_TEAM_MAP(Object SOCIAL_AUTH_SAML_TEAM_MAP) {
        this.SOCIAL_AUTH_SAML_TEAM_MAP = SOCIAL_AUTH_SAML_TEAM_MAP;
        return this;
    }

    /**
    * Provide the name and email address of the technical contact for your service provider. Refer to the documentation for example syntax.
    * @return SOCIAL_AUTH_SAML_TECHNICAL_CONTACT
    **/
    @JsonProperty("SOCIAL_AUTH_SAML_TECHNICAL_CONTACT")
    public Object getSOCIALAUTHSAMLTECHNICALCONTACT() {
        return SOCIAL_AUTH_SAML_TECHNICAL_CONTACT;
    }

    /**
     * Set SOCIAL_AUTH_SAML_TECHNICAL_CONTACT
     **/
    public void setSOCIALAUTHSAMLTECHNICALCONTACT(Object SOCIAL_AUTH_SAML_TECHNICAL_CONTACT) {
        this.SOCIAL_AUTH_SAML_TECHNICAL_CONTACT = SOCIAL_AUTH_SAML_TECHNICAL_CONTACT;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_SAML_TECHNICAL_CONTACT(Object SOCIAL_AUTH_SAML_TECHNICAL_CONTACT) {
        this.SOCIAL_AUTH_SAML_TECHNICAL_CONTACT = SOCIAL_AUTH_SAML_TECHNICAL_CONTACT;
        return this;
    }

    /**
    * Used to map super users and system auditors from SAML.
    * @return SOCIAL_AUTH_SAML_USER_FLAGS_BY_ATTR
    **/
    @JsonProperty("SOCIAL_AUTH_SAML_USER_FLAGS_BY_ATTR")
    public Object getSOCIALAUTHSAMLUSERFLAGSBYATTR() {
        return SOCIAL_AUTH_SAML_USER_FLAGS_BY_ATTR;
    }

    /**
     * Set SOCIAL_AUTH_SAML_USER_FLAGS_BY_ATTR
     **/
    public void setSOCIALAUTHSAMLUSERFLAGSBYATTR(Object SOCIAL_AUTH_SAML_USER_FLAGS_BY_ATTR) {
        this.SOCIAL_AUTH_SAML_USER_FLAGS_BY_ATTR = SOCIAL_AUTH_SAML_USER_FLAGS_BY_ATTR;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_SAML_USER_FLAGS_BY_ATTR(Object SOCIAL_AUTH_SAML_USER_FLAGS_BY_ATTR) {
        this.SOCIAL_AUTH_SAML_USER_FLAGS_BY_ATTR = SOCIAL_AUTH_SAML_USER_FLAGS_BY_ATTR;
        return this;
    }

    /**
    * Mapping of team members (users) from social auth accounts. Configuration details are available in the documentation.
    * @return SOCIAL_AUTH_TEAM_MAP
    **/
    @JsonProperty("SOCIAL_AUTH_TEAM_MAP")
    public Object getSOCIALAUTHTEAMMAP() {
        return SOCIAL_AUTH_TEAM_MAP;
    }

    /**
     * Set SOCIAL_AUTH_TEAM_MAP
     **/
    public void setSOCIALAUTHTEAMMAP(Object SOCIAL_AUTH_TEAM_MAP) {
        this.SOCIAL_AUTH_TEAM_MAP = SOCIAL_AUTH_TEAM_MAP;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_TEAM_MAP(Object SOCIAL_AUTH_TEAM_MAP) {
        this.SOCIAL_AUTH_TEAM_MAP = SOCIAL_AUTH_TEAM_MAP;
        return this;
    }

    /**
    * Enabling this setting will tell social auth to use the full Email as username instead of the full name
    * @return SOCIAL_AUTH_USERNAME_IS_FULL_EMAIL
    **/
    @JsonProperty("SOCIAL_AUTH_USERNAME_IS_FULL_EMAIL")
    public Boolean getSOCIALAUTHUSERNAMEISFULLEMAIL() {
        return SOCIAL_AUTH_USERNAME_IS_FULL_EMAIL;
    }

    /**
     * Set SOCIAL_AUTH_USERNAME_IS_FULL_EMAIL
     **/
    public void setSOCIALAUTHUSERNAMEISFULLEMAIL(Boolean SOCIAL_AUTH_USERNAME_IS_FULL_EMAIL) {
        this.SOCIAL_AUTH_USERNAME_IS_FULL_EMAIL = SOCIAL_AUTH_USERNAME_IS_FULL_EMAIL;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_USERNAME_IS_FULL_EMAIL(Boolean SOCIAL_AUTH_USERNAME_IS_FULL_EMAIL) {
        this.SOCIAL_AUTH_USERNAME_IS_FULL_EMAIL = SOCIAL_AUTH_USERNAME_IS_FULL_EMAIL;
        return this;
    }

    /**
    * When set to an empty list `[]`, this setting prevents new user accounts from being created. Only users who have previously logged in using social auth or have a user account with a matching email address will be able to login.
    * @return SOCIAL_AUTH_USER_FIELDS
    **/
    @JsonProperty("SOCIAL_AUTH_USER_FIELDS")
    public List<String> getSOCIALAUTHUSERFIELDS() {
        return SOCIAL_AUTH_USER_FIELDS;
    }

    /**
     * Set SOCIAL_AUTH_USER_FIELDS
     **/
    public void setSOCIALAUTHUSERFIELDS(List<String> SOCIAL_AUTH_USER_FIELDS) {
        this.SOCIAL_AUTH_USER_FIELDS = SOCIAL_AUTH_USER_FIELDS;
    }

    public SettingsSettingsLoggingTestCreateRequest SOCIAL_AUTH_USER_FIELDS(List<String> SOCIAL_AUTH_USER_FIELDS) {
        this.SOCIAL_AUTH_USER_FIELDS = SOCIAL_AUTH_USER_FIELDS;
        return this;
    }
    public SettingsSettingsLoggingTestCreateRequest addSOCIALAUTHUSERFIELDSItem(String SOCIAL_AUTH_USER_FIELDSItem) {
        this.SOCIAL_AUTH_USER_FIELDS.add(SOCIAL_AUTH_USER_FIELDSItem);
        return this;
    }

    /**
    * Maximum Size of Standard Output in bytes to display before requiring the output be downloaded.
    * @return STDOUT_MAX_BYTES_DISPLAY
    **/
    @JsonProperty("STDOUT_MAX_BYTES_DISPLAY")
    public Integer getSTDOUTMAXBYTESDISPLAY() {
        return STDOUT_MAX_BYTES_DISPLAY;
    }

    /**
     * Set STDOUT_MAX_BYTES_DISPLAY
     **/
    public void setSTDOUTMAXBYTESDISPLAY(Integer STDOUT_MAX_BYTES_DISPLAY) {
        this.STDOUT_MAX_BYTES_DISPLAY = STDOUT_MAX_BYTES_DISPLAY;
    }

    public SettingsSettingsLoggingTestCreateRequest STDOUT_MAX_BYTES_DISPLAY(Integer STDOUT_MAX_BYTES_DISPLAY) {
        this.STDOUT_MAX_BYTES_DISPLAY = STDOUT_MAX_BYTES_DISPLAY;
        return this;
    }

    /**
    * This password is used to retrieve subscription and content information
    * @return SUBSCRIPTIONS_PASSWORD
    **/
    @JsonProperty("SUBSCRIPTIONS_PASSWORD")
    public String getSUBSCRIPTIONSPASSWORD() {
        return SUBSCRIPTIONS_PASSWORD;
    }

    /**
     * Set SUBSCRIPTIONS_PASSWORD
     **/
    public void setSUBSCRIPTIONSPASSWORD(String SUBSCRIPTIONS_PASSWORD) {
        this.SUBSCRIPTIONS_PASSWORD = SUBSCRIPTIONS_PASSWORD;
    }

    public SettingsSettingsLoggingTestCreateRequest SUBSCRIPTIONS_PASSWORD(String SUBSCRIPTIONS_PASSWORD) {
        this.SUBSCRIPTIONS_PASSWORD = SUBSCRIPTIONS_PASSWORD;
        return this;
    }

    /**
    * This username is used to retrieve subscription and content information
    * @return SUBSCRIPTIONS_USERNAME
    **/
    @JsonProperty("SUBSCRIPTIONS_USERNAME")
    public String getSUBSCRIPTIONSUSERNAME() {
        return SUBSCRIPTIONS_USERNAME;
    }

    /**
     * Set SUBSCRIPTIONS_USERNAME
     **/
    public void setSUBSCRIPTIONSUSERNAME(String SUBSCRIPTIONS_USERNAME) {
        this.SUBSCRIPTIONS_USERNAME = SUBSCRIPTIONS_USERNAME;
    }

    public SettingsSettingsLoggingTestCreateRequest SUBSCRIPTIONS_USERNAME(String SUBSCRIPTIONS_USERNAME) {
        this.SUBSCRIPTIONS_USERNAME = SUBSCRIPTIONS_USERNAME;
        return this;
    }

    /**
    * Get SUBSCRIPTION_USAGE_MODEL
    * @return SUBSCRIPTION_USAGE_MODEL
    **/
    @JsonProperty("SUBSCRIPTION_USAGE_MODEL")
    public String getSUBSCRIPTIONUSAGEMODEL() {
        return SUBSCRIPTION_USAGE_MODEL;
    }

    /**
     * Set SUBSCRIPTION_USAGE_MODEL
     **/
    public void setSUBSCRIPTIONUSAGEMODEL(String SUBSCRIPTION_USAGE_MODEL) {
        this.SUBSCRIPTION_USAGE_MODEL = SUBSCRIPTION_USAGE_MODEL;
    }

    public SettingsSettingsLoggingTestCreateRequest SUBSCRIPTION_USAGE_MODEL(String SUBSCRIPTION_USAGE_MODEL) {
        this.SUBSCRIPTION_USAGE_MODEL = SUBSCRIPTION_USAGE_MODEL;
        return this;
    }

    /**
    * Choose the authentication protocol used by TACACS+ client.
    * @return TACACSPLUS_AUTH_PROTOCOL
    **/
    @JsonProperty("TACACSPLUS_AUTH_PROTOCOL")
    public String getTACACSPLUSAUTHPROTOCOL() {
        return TACACSPLUS_AUTH_PROTOCOL;
    }

    /**
     * Set TACACSPLUS_AUTH_PROTOCOL
     **/
    public void setTACACSPLUSAUTHPROTOCOL(String TACACSPLUS_AUTH_PROTOCOL) {
        this.TACACSPLUS_AUTH_PROTOCOL = TACACSPLUS_AUTH_PROTOCOL;
    }

    public SettingsSettingsLoggingTestCreateRequest TACACSPLUS_AUTH_PROTOCOL(String TACACSPLUS_AUTH_PROTOCOL) {
        this.TACACSPLUS_AUTH_PROTOCOL = TACACSPLUS_AUTH_PROTOCOL;
        return this;
    }

    /**
    * Hostname of TACACS+ server.
    * @return TACACSPLUS_HOST
    **/
    @JsonProperty("TACACSPLUS_HOST")
    public String getTACACSPLUSHOST() {
        return TACACSPLUS_HOST;
    }

    /**
     * Set TACACSPLUS_HOST
     **/
    public void setTACACSPLUSHOST(String TACACSPLUS_HOST) {
        this.TACACSPLUS_HOST = TACACSPLUS_HOST;
    }

    public SettingsSettingsLoggingTestCreateRequest TACACSPLUS_HOST(String TACACSPLUS_HOST) {
        this.TACACSPLUS_HOST = TACACSPLUS_HOST;
        return this;
    }

    /**
    * Port number of TACACS+ server.
    * @return TACACSPLUS_PORT
    **/
    @JsonProperty("TACACSPLUS_PORT")
    public Integer getTACACSPLUSPORT() {
        return TACACSPLUS_PORT;
    }

    /**
     * Set TACACSPLUS_PORT
     **/
    public void setTACACSPLUSPORT(Integer TACACSPLUS_PORT) {
        this.TACACSPLUS_PORT = TACACSPLUS_PORT;
    }

    public SettingsSettingsLoggingTestCreateRequest TACACSPLUS_PORT(Integer TACACSPLUS_PORT) {
        this.TACACSPLUS_PORT = TACACSPLUS_PORT;
        return this;
    }

    /**
    * Shared secret for authenticating to TACACS+ server.
    * @return TACACSPLUS_SECRET
    **/
    @JsonProperty("TACACSPLUS_SECRET")
    public String getTACACSPLUSSECRET() {
        return TACACSPLUS_SECRET;
    }

    /**
     * Set TACACSPLUS_SECRET
     **/
    public void setTACACSPLUSSECRET(String TACACSPLUS_SECRET) {
        this.TACACSPLUS_SECRET = TACACSPLUS_SECRET;
    }

    public SettingsSettingsLoggingTestCreateRequest TACACSPLUS_SECRET(String TACACSPLUS_SECRET) {
        this.TACACSPLUS_SECRET = TACACSPLUS_SECRET;
        return this;
    }

    /**
    * TACACS+ session timeout value in seconds, 0 disables timeout.
    * @return TACACSPLUS_SESSION_TIMEOUT
    **/
    @JsonProperty("TACACSPLUS_SESSION_TIMEOUT")
    public Integer getTACACSPLUSSESSIONTIMEOUT() {
        return TACACSPLUS_SESSION_TIMEOUT;
    }

    /**
     * Set TACACSPLUS_SESSION_TIMEOUT
     **/
    public void setTACACSPLUSSESSIONTIMEOUT(Integer TACACSPLUS_SESSION_TIMEOUT) {
        this.TACACSPLUS_SESSION_TIMEOUT = TACACSPLUS_SESSION_TIMEOUT;
    }

    public SettingsSettingsLoggingTestCreateRequest TACACSPLUS_SESSION_TIMEOUT(Integer TACACSPLUS_SESSION_TIMEOUT) {
        this.TACACSPLUS_SESSION_TIMEOUT = TACACSPLUS_SESSION_TIMEOUT;
        return this;
    }

    /**
    * This setting is used by services like notifications to render a valid url to the service.
    * @return TOWER_URL_BASE
    **/
    @JsonProperty("TOWER_URL_BASE")
    public String getTOWERURLBASE() {
        return TOWER_URL_BASE;
    }

    /**
     * Set TOWER_URL_BASE
     **/
    public void setTOWERURLBASE(String TOWER_URL_BASE) {
        this.TOWER_URL_BASE = TOWER_URL_BASE;
    }

    public SettingsSettingsLoggingTestCreateRequest TOWER_URL_BASE(String TOWER_URL_BASE) {
        this.TOWER_URL_BASE = TOWER_URL_BASE;
        return this;
    }

    /**
    * If disabled, the page will not refresh when events are received. Reloading the page will be required to get the latest details.
    * @return UI_LIVE_UPDATES_ENABLED
    **/
    @JsonProperty("UI_LIVE_UPDATES_ENABLED")
    public Boolean getUILIVEUPDATESENABLED() {
        return UI_LIVE_UPDATES_ENABLED;
    }

    /**
     * Set UI_LIVE_UPDATES_ENABLED
     **/
    public void setUILIVEUPDATESENABLED(Boolean UI_LIVE_UPDATES_ENABLED) {
        this.UI_LIVE_UPDATES_ENABLED = UI_LIVE_UPDATES_ENABLED;
    }

    public SettingsSettingsLoggingTestCreateRequest UI_LIVE_UPDATES_ENABLED(Boolean UI_LIVE_UPDATES_ENABLED) {
        this.UI_LIVE_UPDATES_ENABLED = UI_LIVE_UPDATES_ENABLED;
        return this;
    }

    /**
    * Enable preview of new user interface.
    * @return UI_NEXT
    **/
    @JsonProperty("UI_NEXT")
    public Boolean getUINEXT() {
        return UI_NEXT;
    }

    /**
     * Set UI_NEXT
     **/
    public void setUINEXT(Boolean UI_NEXT) {
        this.UI_NEXT = UI_NEXT;
    }

    public SettingsSettingsLoggingTestCreateRequest UI_NEXT(Boolean UI_NEXT) {
        this.UI_NEXT = UI_NEXT;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SettingsSettingsLoggingTestCreateRequest {\n");

        sb.append("    ACTIVITY_STREAM_ENABLED: ").append(toIndentedString(ACTIVITY_STREAM_ENABLED)).append("\n");
        sb.append("    ACTIVITY_STREAM_ENABLED_FOR_INVENTORY_SYNC: ").append(toIndentedString(ACTIVITY_STREAM_ENABLED_FOR_INVENTORY_SYNC)).append("\n");
        sb.append("    AD_HOC_COMMANDS: ").append(toIndentedString(AD_HOC_COMMANDS)).append("\n");
        sb.append("    ALLOW_JINJA_IN_EXTRA_VARS: ").append(toIndentedString(ALLOW_JINJA_IN_EXTRA_VARS)).append("\n");
        sb.append("    ALLOW_METRICS_FOR_ANONYMOUS_USERS: ").append(toIndentedString(ALLOW_METRICS_FOR_ANONYMOUS_USERS)).append("\n");
        sb.append("    ALLOW_OAUTH2_FOR_EXTERNAL_USERS: ").append(toIndentedString(ALLOW_OAUTH2_FOR_EXTERNAL_USERS)).append("\n");
        sb.append("    ANSIBLE_FACT_CACHE_TIMEOUT: ").append(toIndentedString(ANSIBLE_FACT_CACHE_TIMEOUT)).append("\n");
        sb.append("    API_400_ERROR_LOG_FORMAT: ").append(toIndentedString(API_400_ERROR_LOG_FORMAT)).append("\n");
        sb.append("    AUTH_BASIC_ENABLED: ").append(toIndentedString(AUTH_BASIC_ENABLED)).append("\n");
        sb.append("    AUTH_LDAP_1_BIND_DN: ").append(toIndentedString(AUTH_LDAP_1_BIND_DN)).append("\n");
        sb.append("    AUTH_LDAP_1_BIND_PASSWORD: ").append(toIndentedString(AUTH_LDAP_1_BIND_PASSWORD)).append("\n");
        sb.append("    AUTH_LDAP_1_CONNECTION_OPTIONS: ").append(toIndentedString(AUTH_LDAP_1_CONNECTION_OPTIONS)).append("\n");
        sb.append("    AUTH_LDAP_1_DENY_GROUP: ").append(toIndentedString(AUTH_LDAP_1_DENY_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_1_GROUP_SEARCH: ").append(toIndentedString(AUTH_LDAP_1_GROUP_SEARCH)).append("\n");
        sb.append("    AUTH_LDAP_1_GROUP_TYPE: ").append(toIndentedString(AUTH_LDAP_1_GROUP_TYPE)).append("\n");
        sb.append("    AUTH_LDAP_1_GROUP_TYPE_PARAMS: ").append(toIndentedString(AUTH_LDAP_1_GROUP_TYPE_PARAMS)).append("\n");
        sb.append("    AUTH_LDAP_1_ORGANIZATION_MAP: ").append(toIndentedString(AUTH_LDAP_1_ORGANIZATION_MAP)).append("\n");
        sb.append("    AUTH_LDAP_1_REQUIRE_GROUP: ").append(toIndentedString(AUTH_LDAP_1_REQUIRE_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_1_SERVER_URI: ").append(toIndentedString(AUTH_LDAP_1_SERVER_URI)).append("\n");
        sb.append("    AUTH_LDAP_1_START_TLS: ").append(toIndentedString(AUTH_LDAP_1_START_TLS)).append("\n");
        sb.append("    AUTH_LDAP_1_TEAM_MAP: ").append(toIndentedString(AUTH_LDAP_1_TEAM_MAP)).append("\n");
        sb.append("    AUTH_LDAP_1_USER_ATTR_MAP: ").append(toIndentedString(AUTH_LDAP_1_USER_ATTR_MAP)).append("\n");
        sb.append("    AUTH_LDAP_1_USER_DN_TEMPLATE: ").append(toIndentedString(AUTH_LDAP_1_USER_DN_TEMPLATE)).append("\n");
        sb.append("    AUTH_LDAP_1_USER_FLAGS_BY_GROUP: ").append(toIndentedString(AUTH_LDAP_1_USER_FLAGS_BY_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_1_USER_SEARCH: ").append(toIndentedString(AUTH_LDAP_1_USER_SEARCH)).append("\n");
        sb.append("    AUTH_LDAP_2_BIND_DN: ").append(toIndentedString(AUTH_LDAP_2_BIND_DN)).append("\n");
        sb.append("    AUTH_LDAP_2_BIND_PASSWORD: ").append(toIndentedString(AUTH_LDAP_2_BIND_PASSWORD)).append("\n");
        sb.append("    AUTH_LDAP_2_CONNECTION_OPTIONS: ").append(toIndentedString(AUTH_LDAP_2_CONNECTION_OPTIONS)).append("\n");
        sb.append("    AUTH_LDAP_2_DENY_GROUP: ").append(toIndentedString(AUTH_LDAP_2_DENY_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_2_GROUP_SEARCH: ").append(toIndentedString(AUTH_LDAP_2_GROUP_SEARCH)).append("\n");
        sb.append("    AUTH_LDAP_2_GROUP_TYPE: ").append(toIndentedString(AUTH_LDAP_2_GROUP_TYPE)).append("\n");
        sb.append("    AUTH_LDAP_2_GROUP_TYPE_PARAMS: ").append(toIndentedString(AUTH_LDAP_2_GROUP_TYPE_PARAMS)).append("\n");
        sb.append("    AUTH_LDAP_2_ORGANIZATION_MAP: ").append(toIndentedString(AUTH_LDAP_2_ORGANIZATION_MAP)).append("\n");
        sb.append("    AUTH_LDAP_2_REQUIRE_GROUP: ").append(toIndentedString(AUTH_LDAP_2_REQUIRE_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_2_SERVER_URI: ").append(toIndentedString(AUTH_LDAP_2_SERVER_URI)).append("\n");
        sb.append("    AUTH_LDAP_2_START_TLS: ").append(toIndentedString(AUTH_LDAP_2_START_TLS)).append("\n");
        sb.append("    AUTH_LDAP_2_TEAM_MAP: ").append(toIndentedString(AUTH_LDAP_2_TEAM_MAP)).append("\n");
        sb.append("    AUTH_LDAP_2_USER_ATTR_MAP: ").append(toIndentedString(AUTH_LDAP_2_USER_ATTR_MAP)).append("\n");
        sb.append("    AUTH_LDAP_2_USER_DN_TEMPLATE: ").append(toIndentedString(AUTH_LDAP_2_USER_DN_TEMPLATE)).append("\n");
        sb.append("    AUTH_LDAP_2_USER_FLAGS_BY_GROUP: ").append(toIndentedString(AUTH_LDAP_2_USER_FLAGS_BY_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_2_USER_SEARCH: ").append(toIndentedString(AUTH_LDAP_2_USER_SEARCH)).append("\n");
        sb.append("    AUTH_LDAP_3_BIND_DN: ").append(toIndentedString(AUTH_LDAP_3_BIND_DN)).append("\n");
        sb.append("    AUTH_LDAP_3_BIND_PASSWORD: ").append(toIndentedString(AUTH_LDAP_3_BIND_PASSWORD)).append("\n");
        sb.append("    AUTH_LDAP_3_CONNECTION_OPTIONS: ").append(toIndentedString(AUTH_LDAP_3_CONNECTION_OPTIONS)).append("\n");
        sb.append("    AUTH_LDAP_3_DENY_GROUP: ").append(toIndentedString(AUTH_LDAP_3_DENY_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_3_GROUP_SEARCH: ").append(toIndentedString(AUTH_LDAP_3_GROUP_SEARCH)).append("\n");
        sb.append("    AUTH_LDAP_3_GROUP_TYPE: ").append(toIndentedString(AUTH_LDAP_3_GROUP_TYPE)).append("\n");
        sb.append("    AUTH_LDAP_3_GROUP_TYPE_PARAMS: ").append(toIndentedString(AUTH_LDAP_3_GROUP_TYPE_PARAMS)).append("\n");
        sb.append("    AUTH_LDAP_3_ORGANIZATION_MAP: ").append(toIndentedString(AUTH_LDAP_3_ORGANIZATION_MAP)).append("\n");
        sb.append("    AUTH_LDAP_3_REQUIRE_GROUP: ").append(toIndentedString(AUTH_LDAP_3_REQUIRE_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_3_SERVER_URI: ").append(toIndentedString(AUTH_LDAP_3_SERVER_URI)).append("\n");
        sb.append("    AUTH_LDAP_3_START_TLS: ").append(toIndentedString(AUTH_LDAP_3_START_TLS)).append("\n");
        sb.append("    AUTH_LDAP_3_TEAM_MAP: ").append(toIndentedString(AUTH_LDAP_3_TEAM_MAP)).append("\n");
        sb.append("    AUTH_LDAP_3_USER_ATTR_MAP: ").append(toIndentedString(AUTH_LDAP_3_USER_ATTR_MAP)).append("\n");
        sb.append("    AUTH_LDAP_3_USER_DN_TEMPLATE: ").append(toIndentedString(AUTH_LDAP_3_USER_DN_TEMPLATE)).append("\n");
        sb.append("    AUTH_LDAP_3_USER_FLAGS_BY_GROUP: ").append(toIndentedString(AUTH_LDAP_3_USER_FLAGS_BY_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_3_USER_SEARCH: ").append(toIndentedString(AUTH_LDAP_3_USER_SEARCH)).append("\n");
        sb.append("    AUTH_LDAP_4_BIND_DN: ").append(toIndentedString(AUTH_LDAP_4_BIND_DN)).append("\n");
        sb.append("    AUTH_LDAP_4_BIND_PASSWORD: ").append(toIndentedString(AUTH_LDAP_4_BIND_PASSWORD)).append("\n");
        sb.append("    AUTH_LDAP_4_CONNECTION_OPTIONS: ").append(toIndentedString(AUTH_LDAP_4_CONNECTION_OPTIONS)).append("\n");
        sb.append("    AUTH_LDAP_4_DENY_GROUP: ").append(toIndentedString(AUTH_LDAP_4_DENY_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_4_GROUP_SEARCH: ").append(toIndentedString(AUTH_LDAP_4_GROUP_SEARCH)).append("\n");
        sb.append("    AUTH_LDAP_4_GROUP_TYPE: ").append(toIndentedString(AUTH_LDAP_4_GROUP_TYPE)).append("\n");
        sb.append("    AUTH_LDAP_4_GROUP_TYPE_PARAMS: ").append(toIndentedString(AUTH_LDAP_4_GROUP_TYPE_PARAMS)).append("\n");
        sb.append("    AUTH_LDAP_4_ORGANIZATION_MAP: ").append(toIndentedString(AUTH_LDAP_4_ORGANIZATION_MAP)).append("\n");
        sb.append("    AUTH_LDAP_4_REQUIRE_GROUP: ").append(toIndentedString(AUTH_LDAP_4_REQUIRE_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_4_SERVER_URI: ").append(toIndentedString(AUTH_LDAP_4_SERVER_URI)).append("\n");
        sb.append("    AUTH_LDAP_4_START_TLS: ").append(toIndentedString(AUTH_LDAP_4_START_TLS)).append("\n");
        sb.append("    AUTH_LDAP_4_TEAM_MAP: ").append(toIndentedString(AUTH_LDAP_4_TEAM_MAP)).append("\n");
        sb.append("    AUTH_LDAP_4_USER_ATTR_MAP: ").append(toIndentedString(AUTH_LDAP_4_USER_ATTR_MAP)).append("\n");
        sb.append("    AUTH_LDAP_4_USER_DN_TEMPLATE: ").append(toIndentedString(AUTH_LDAP_4_USER_DN_TEMPLATE)).append("\n");
        sb.append("    AUTH_LDAP_4_USER_FLAGS_BY_GROUP: ").append(toIndentedString(AUTH_LDAP_4_USER_FLAGS_BY_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_4_USER_SEARCH: ").append(toIndentedString(AUTH_LDAP_4_USER_SEARCH)).append("\n");
        sb.append("    AUTH_LDAP_5_BIND_DN: ").append(toIndentedString(AUTH_LDAP_5_BIND_DN)).append("\n");
        sb.append("    AUTH_LDAP_5_BIND_PASSWORD: ").append(toIndentedString(AUTH_LDAP_5_BIND_PASSWORD)).append("\n");
        sb.append("    AUTH_LDAP_5_CONNECTION_OPTIONS: ").append(toIndentedString(AUTH_LDAP_5_CONNECTION_OPTIONS)).append("\n");
        sb.append("    AUTH_LDAP_5_DENY_GROUP: ").append(toIndentedString(AUTH_LDAP_5_DENY_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_5_GROUP_SEARCH: ").append(toIndentedString(AUTH_LDAP_5_GROUP_SEARCH)).append("\n");
        sb.append("    AUTH_LDAP_5_GROUP_TYPE: ").append(toIndentedString(AUTH_LDAP_5_GROUP_TYPE)).append("\n");
        sb.append("    AUTH_LDAP_5_GROUP_TYPE_PARAMS: ").append(toIndentedString(AUTH_LDAP_5_GROUP_TYPE_PARAMS)).append("\n");
        sb.append("    AUTH_LDAP_5_ORGANIZATION_MAP: ").append(toIndentedString(AUTH_LDAP_5_ORGANIZATION_MAP)).append("\n");
        sb.append("    AUTH_LDAP_5_REQUIRE_GROUP: ").append(toIndentedString(AUTH_LDAP_5_REQUIRE_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_5_SERVER_URI: ").append(toIndentedString(AUTH_LDAP_5_SERVER_URI)).append("\n");
        sb.append("    AUTH_LDAP_5_START_TLS: ").append(toIndentedString(AUTH_LDAP_5_START_TLS)).append("\n");
        sb.append("    AUTH_LDAP_5_TEAM_MAP: ").append(toIndentedString(AUTH_LDAP_5_TEAM_MAP)).append("\n");
        sb.append("    AUTH_LDAP_5_USER_ATTR_MAP: ").append(toIndentedString(AUTH_LDAP_5_USER_ATTR_MAP)).append("\n");
        sb.append("    AUTH_LDAP_5_USER_DN_TEMPLATE: ").append(toIndentedString(AUTH_LDAP_5_USER_DN_TEMPLATE)).append("\n");
        sb.append("    AUTH_LDAP_5_USER_FLAGS_BY_GROUP: ").append(toIndentedString(AUTH_LDAP_5_USER_FLAGS_BY_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_5_USER_SEARCH: ").append(toIndentedString(AUTH_LDAP_5_USER_SEARCH)).append("\n");
        sb.append("    AUTH_LDAP_BIND_DN: ").append(toIndentedString(AUTH_LDAP_BIND_DN)).append("\n");
        sb.append("    AUTH_LDAP_BIND_PASSWORD: ").append(toIndentedString(AUTH_LDAP_BIND_PASSWORD)).append("\n");
        sb.append("    AUTH_LDAP_CONNECTION_OPTIONS: ").append(toIndentedString(AUTH_LDAP_CONNECTION_OPTIONS)).append("\n");
        sb.append("    AUTH_LDAP_DENY_GROUP: ").append(toIndentedString(AUTH_LDAP_DENY_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_GROUP_SEARCH: ").append(toIndentedString(AUTH_LDAP_GROUP_SEARCH)).append("\n");
        sb.append("    AUTH_LDAP_GROUP_TYPE: ").append(toIndentedString(AUTH_LDAP_GROUP_TYPE)).append("\n");
        sb.append("    AUTH_LDAP_GROUP_TYPE_PARAMS: ").append(toIndentedString(AUTH_LDAP_GROUP_TYPE_PARAMS)).append("\n");
        sb.append("    AUTH_LDAP_ORGANIZATION_MAP: ").append(toIndentedString(AUTH_LDAP_ORGANIZATION_MAP)).append("\n");
        sb.append("    AUTH_LDAP_REQUIRE_GROUP: ").append(toIndentedString(AUTH_LDAP_REQUIRE_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_SERVER_URI: ").append(toIndentedString(AUTH_LDAP_SERVER_URI)).append("\n");
        sb.append("    AUTH_LDAP_START_TLS: ").append(toIndentedString(AUTH_LDAP_START_TLS)).append("\n");
        sb.append("    AUTH_LDAP_TEAM_MAP: ").append(toIndentedString(AUTH_LDAP_TEAM_MAP)).append("\n");
        sb.append("    AUTH_LDAP_USER_ATTR_MAP: ").append(toIndentedString(AUTH_LDAP_USER_ATTR_MAP)).append("\n");
        sb.append("    AUTH_LDAP_USER_DN_TEMPLATE: ").append(toIndentedString(AUTH_LDAP_USER_DN_TEMPLATE)).append("\n");
        sb.append("    AUTH_LDAP_USER_FLAGS_BY_GROUP: ").append(toIndentedString(AUTH_LDAP_USER_FLAGS_BY_GROUP)).append("\n");
        sb.append("    AUTH_LDAP_USER_SEARCH: ").append(toIndentedString(AUTH_LDAP_USER_SEARCH)).append("\n");
        sb.append("    AUTOMATION_ANALYTICS_GATHER_INTERVAL: ").append(toIndentedString(AUTOMATION_ANALYTICS_GATHER_INTERVAL)).append("\n");
        sb.append("    AUTOMATION_ANALYTICS_LAST_ENTRIES: ").append(toIndentedString(AUTOMATION_ANALYTICS_LAST_ENTRIES)).append("\n");
        sb.append("    AUTOMATION_ANALYTICS_LAST_GATHER: ").append(toIndentedString(AUTOMATION_ANALYTICS_LAST_GATHER)).append("\n");
        sb.append("    AUTOMATION_ANALYTICS_URL: ").append(toIndentedString(AUTOMATION_ANALYTICS_URL)).append("\n");
        sb.append("    AWX_ANSIBLE_CALLBACK_PLUGINS: ").append(toIndentedString(AWX_ANSIBLE_CALLBACK_PLUGINS)).append("\n");
        sb.append("    AWX_COLLECTIONS_ENABLED: ").append(toIndentedString(AWX_COLLECTIONS_ENABLED)).append("\n");
        sb.append("    AWX_ISOLATION_BASE_PATH: ").append(toIndentedString(AWX_ISOLATION_BASE_PATH)).append("\n");
        sb.append("    AWX_ISOLATION_SHOW_PATHS: ").append(toIndentedString(AWX_ISOLATION_SHOW_PATHS)).append("\n");
        sb.append("    AWX_MOUNT_ISOLATED_PATHS_ON_K8S: ").append(toIndentedString(AWX_MOUNT_ISOLATED_PATHS_ON_K8S)).append("\n");
        sb.append("    AWX_ROLES_ENABLED: ").append(toIndentedString(AWX_ROLES_ENABLED)).append("\n");
        sb.append("    AWX_RUNNER_KEEPALIVE_SECONDS: ").append(toIndentedString(AWX_RUNNER_KEEPALIVE_SECONDS)).append("\n");
        sb.append("    AWX_SHOW_PLAYBOOK_LINKS: ").append(toIndentedString(AWX_SHOW_PLAYBOOK_LINKS)).append("\n");
        sb.append("    AWX_TASK_ENV: ").append(toIndentedString(AWX_TASK_ENV)).append("\n");
        sb.append("    BULK_HOST_MAX_CREATE: ").append(toIndentedString(BULK_HOST_MAX_CREATE)).append("\n");
        sb.append("    BULK_JOB_MAX_LAUNCH: ").append(toIndentedString(BULK_JOB_MAX_LAUNCH)).append("\n");
        sb.append("    CLEANUP_HOST_METRICS_LAST_TS: ").append(toIndentedString(CLEANUP_HOST_METRICS_LAST_TS)).append("\n");
        sb.append("    CUSTOM_LOGIN_INFO: ").append(toIndentedString(CUSTOM_LOGIN_INFO)).append("\n");
        sb.append("    CUSTOM_LOGO: ").append(toIndentedString(CUSTOM_LOGO)).append("\n");
        sb.append("    CUSTOM_VENV_PATHS: ").append(toIndentedString(CUSTOM_VENV_PATHS)).append("\n");
        sb.append("    DEFAULT_EXECUTION_ENVIRONMENT: ").append(toIndentedString(DEFAULT_EXECUTION_ENVIRONMENT)).append("\n");
        sb.append("    DEFAULT_INVENTORY_UPDATE_TIMEOUT: ").append(toIndentedString(DEFAULT_INVENTORY_UPDATE_TIMEOUT)).append("\n");
        sb.append("    DEFAULT_JOB_IDLE_TIMEOUT: ").append(toIndentedString(DEFAULT_JOB_IDLE_TIMEOUT)).append("\n");
        sb.append("    DEFAULT_JOB_TIMEOUT: ").append(toIndentedString(DEFAULT_JOB_TIMEOUT)).append("\n");
        sb.append("    DEFAULT_PROJECT_UPDATE_TIMEOUT: ").append(toIndentedString(DEFAULT_PROJECT_UPDATE_TIMEOUT)).append("\n");
        sb.append("    DISABLE_LOCAL_AUTH: ").append(toIndentedString(DISABLE_LOCAL_AUTH)).append("\n");
        sb.append("    EVENT_STDOUT_MAX_BYTES_DISPLAY: ").append(toIndentedString(EVENT_STDOUT_MAX_BYTES_DISPLAY)).append("\n");
        sb.append("    GALAXY_IGNORE_CERTS: ").append(toIndentedString(GALAXY_IGNORE_CERTS)).append("\n");
        sb.append("    GALAXY_TASK_ENV: ").append(toIndentedString(GALAXY_TASK_ENV)).append("\n");
        sb.append("    INSIGHTS_TRACKING_STATE: ").append(toIndentedString(INSIGHTS_TRACKING_STATE)).append("\n");
        sb.append("    LOCAL_PASSWORD_MIN_DIGITS: ").append(toIndentedString(LOCAL_PASSWORD_MIN_DIGITS)).append("\n");
        sb.append("    LOCAL_PASSWORD_MIN_LENGTH: ").append(toIndentedString(LOCAL_PASSWORD_MIN_LENGTH)).append("\n");
        sb.append("    LOCAL_PASSWORD_MIN_SPECIAL: ").append(toIndentedString(LOCAL_PASSWORD_MIN_SPECIAL)).append("\n");
        sb.append("    LOCAL_PASSWORD_MIN_UPPER: ").append(toIndentedString(LOCAL_PASSWORD_MIN_UPPER)).append("\n");
        sb.append("    LOGIN_REDIRECT_OVERRIDE: ").append(toIndentedString(LOGIN_REDIRECT_OVERRIDE)).append("\n");
        sb.append("    LOG_AGGREGATOR_ENABLED: ").append(toIndentedString(LOG_AGGREGATOR_ENABLED)).append("\n");
        sb.append("    LOG_AGGREGATOR_HOST: ").append(toIndentedString(LOG_AGGREGATOR_HOST)).append("\n");
        sb.append("    LOG_AGGREGATOR_INDIVIDUAL_FACTS: ").append(toIndentedString(LOG_AGGREGATOR_INDIVIDUAL_FACTS)).append("\n");
        sb.append("    LOG_AGGREGATOR_LEVEL: ").append(toIndentedString(LOG_AGGREGATOR_LEVEL)).append("\n");
        sb.append("    LOG_AGGREGATOR_LOGGERS: ").append(toIndentedString(LOG_AGGREGATOR_LOGGERS)).append("\n");
        sb.append("    LOG_AGGREGATOR_MAX_DISK_USAGE_GB: ").append(toIndentedString(LOG_AGGREGATOR_MAX_DISK_USAGE_GB)).append("\n");
        sb.append("    LOG_AGGREGATOR_MAX_DISK_USAGE_PATH: ").append(toIndentedString(LOG_AGGREGATOR_MAX_DISK_USAGE_PATH)).append("\n");
        sb.append("    LOG_AGGREGATOR_PASSWORD: ").append(toIndentedString(LOG_AGGREGATOR_PASSWORD)).append("\n");
        sb.append("    LOG_AGGREGATOR_PORT: ").append(toIndentedString(LOG_AGGREGATOR_PORT)).append("\n");
        sb.append("    LOG_AGGREGATOR_PROTOCOL: ").append(toIndentedString(LOG_AGGREGATOR_PROTOCOL)).append("\n");
        sb.append("    LOG_AGGREGATOR_RSYSLOGD_DEBUG: ").append(toIndentedString(LOG_AGGREGATOR_RSYSLOGD_DEBUG)).append("\n");
        sb.append("    LOG_AGGREGATOR_TCP_TIMEOUT: ").append(toIndentedString(LOG_AGGREGATOR_TCP_TIMEOUT)).append("\n");
        sb.append("    LOG_AGGREGATOR_TOWER_UUID: ").append(toIndentedString(LOG_AGGREGATOR_TOWER_UUID)).append("\n");
        sb.append("    LOG_AGGREGATOR_TYPE: ").append(toIndentedString(LOG_AGGREGATOR_TYPE)).append("\n");
        sb.append("    LOG_AGGREGATOR_USERNAME: ").append(toIndentedString(LOG_AGGREGATOR_USERNAME)).append("\n");
        sb.append("    LOG_AGGREGATOR_VERIFY_CERT: ").append(toIndentedString(LOG_AGGREGATOR_VERIFY_CERT)).append("\n");
        sb.append("    MANAGE_ORGANIZATION_AUTH: ").append(toIndentedString(MANAGE_ORGANIZATION_AUTH)).append("\n");
        sb.append("    MAX_FORKS: ").append(toIndentedString(MAX_FORKS)).append("\n");
        sb.append("    MAX_UI_JOB_EVENTS: ").append(toIndentedString(MAX_UI_JOB_EVENTS)).append("\n");
        sb.append("    MAX_WEBSOCKET_EVENT_RATE: ").append(toIndentedString(MAX_WEBSOCKET_EVENT_RATE)).append("\n");
        sb.append("    OAUTH2_PROVIDER: ").append(toIndentedString(OAUTH2_PROVIDER)).append("\n");
        sb.append("    ORG_ADMINS_CAN_SEE_ALL_USERS: ").append(toIndentedString(ORG_ADMINS_CAN_SEE_ALL_USERS)).append("\n");
        sb.append("    PROJECT_UPDATE_VVV: ").append(toIndentedString(PROJECT_UPDATE_VVV)).append("\n");
        sb.append("    PROXY_IP_ALLOWED_LIST: ").append(toIndentedString(PROXY_IP_ALLOWED_LIST)).append("\n");
        sb.append("    RADIUS_PORT: ").append(toIndentedString(RADIUS_PORT)).append("\n");
        sb.append("    RADIUS_SECRET: ").append(toIndentedString(RADIUS_SECRET)).append("\n");
        sb.append("    RADIUS_SERVER: ").append(toIndentedString(RADIUS_SERVER)).append("\n");
        sb.append("    REDHAT_PASSWORD: ").append(toIndentedString(REDHAT_PASSWORD)).append("\n");
        sb.append("    REDHAT_USERNAME: ").append(toIndentedString(REDHAT_USERNAME)).append("\n");
        sb.append("    REMOTE_HOST_HEADERS: ").append(toIndentedString(REMOTE_HOST_HEADERS)).append("\n");
        sb.append("    SAML_AUTO_CREATE_OBJECTS: ").append(toIndentedString(SAML_AUTO_CREATE_OBJECTS)).append("\n");
        sb.append("    SCHEDULE_MAX_JOBS: ").append(toIndentedString(SCHEDULE_MAX_JOBS)).append("\n");
        sb.append("    SESSIONS_PER_USER: ").append(toIndentedString(SESSIONS_PER_USER)).append("\n");
        sb.append("    SESSION_COOKIE_AGE: ").append(toIndentedString(SESSION_COOKIE_AGE)).append("\n");
        sb.append("    SOCIAL_AUTH_AZUREAD_OAUTH2_KEY: ").append(toIndentedString(SOCIAL_AUTH_AZUREAD_OAUTH2_KEY)).append("\n");
        sb.append("    SOCIAL_AUTH_AZUREAD_OAUTH2_ORGANIZATION_MAP: ").append(toIndentedString(SOCIAL_AUTH_AZUREAD_OAUTH2_ORGANIZATION_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_AZUREAD_OAUTH2_SECRET: ").append(toIndentedString(SOCIAL_AUTH_AZUREAD_OAUTH2_SECRET)).append("\n");
        sb.append("    SOCIAL_AUTH_AZUREAD_OAUTH2_TEAM_MAP: ").append(toIndentedString(SOCIAL_AUTH_AZUREAD_OAUTH2_TEAM_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_API_URL: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_API_URL)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_KEY: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_KEY)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_ORGANIZATION_MAP: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_ORGANIZATION_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_API_URL: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_API_URL)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_KEY: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_KEY)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_NAME: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_NAME)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_ORGANIZATION_MAP: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_ORGANIZATION_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_SECRET: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_SECRET)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_TEAM_MAP: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_TEAM_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_URL: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_ORG_URL)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_SECRET: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_SECRET)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_API_URL: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_API_URL)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ID: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ID)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_KEY: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_KEY)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_MAP: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ORGANIZATION_MAP: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_ORGANIZATION_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_SECRET: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_SECRET)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_TEAM_MAP: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_TEAM_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_URL: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_TEAM_URL)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ENTERPRISE_URL: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ENTERPRISE_URL)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_KEY: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_KEY)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ORGANIZATION_MAP: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ORGANIZATION_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ORG_KEY: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ORG_KEY)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ORG_NAME: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ORG_NAME)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ORG_ORGANIZATION_MAP: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ORG_ORGANIZATION_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ORG_SECRET: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ORG_SECRET)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_ORG_TEAM_MAP: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_ORG_TEAM_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_SECRET: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_SECRET)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_TEAM_ID: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_TEAM_ID)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_TEAM_KEY: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_TEAM_KEY)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_TEAM_MAP: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_TEAM_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_TEAM_ORGANIZATION_MAP: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_TEAM_ORGANIZATION_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_TEAM_SECRET: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_TEAM_SECRET)).append("\n");
        sb.append("    SOCIAL_AUTH_GITHUB_TEAM_TEAM_MAP: ").append(toIndentedString(SOCIAL_AUTH_GITHUB_TEAM_TEAM_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_GOOGLE_OAUTH2_AUTH_EXTRA_ARGUMENTS: ").append(toIndentedString(SOCIAL_AUTH_GOOGLE_OAUTH2_AUTH_EXTRA_ARGUMENTS)).append("\n");
        sb.append("    SOCIAL_AUTH_GOOGLE_OAUTH2_KEY: ").append(toIndentedString(SOCIAL_AUTH_GOOGLE_OAUTH2_KEY)).append("\n");
        sb.append("    SOCIAL_AUTH_GOOGLE_OAUTH2_ORGANIZATION_MAP: ").append(toIndentedString(SOCIAL_AUTH_GOOGLE_OAUTH2_ORGANIZATION_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_GOOGLE_OAUTH2_SECRET: ").append(toIndentedString(SOCIAL_AUTH_GOOGLE_OAUTH2_SECRET)).append("\n");
        sb.append("    SOCIAL_AUTH_GOOGLE_OAUTH2_TEAM_MAP: ").append(toIndentedString(SOCIAL_AUTH_GOOGLE_OAUTH2_TEAM_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_GOOGLE_OAUTH2_WHITELISTED_DOMAINS: ").append(toIndentedString(SOCIAL_AUTH_GOOGLE_OAUTH2_WHITELISTED_DOMAINS)).append("\n");
        sb.append("    SOCIAL_AUTH_OIDC_KEY: ").append(toIndentedString(SOCIAL_AUTH_OIDC_KEY)).append("\n");
        sb.append("    SOCIAL_AUTH_OIDC_OIDC_ENDPOINT: ").append(toIndentedString(SOCIAL_AUTH_OIDC_OIDC_ENDPOINT)).append("\n");
        sb.append("    SOCIAL_AUTH_OIDC_SECRET: ").append(toIndentedString(SOCIAL_AUTH_OIDC_SECRET)).append("\n");
        sb.append("    SOCIAL_AUTH_OIDC_VERIFY_SSL: ").append(toIndentedString(SOCIAL_AUTH_OIDC_VERIFY_SSL)).append("\n");
        sb.append("    SOCIAL_AUTH_ORGANIZATION_MAP: ").append(toIndentedString(SOCIAL_AUTH_ORGANIZATION_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_SAML_ENABLED_IDPS: ").append(toIndentedString(SOCIAL_AUTH_SAML_ENABLED_IDPS)).append("\n");
        sb.append("    SOCIAL_AUTH_SAML_EXTRA_DATA: ").append(toIndentedString(SOCIAL_AUTH_SAML_EXTRA_DATA)).append("\n");
        sb.append("    SOCIAL_AUTH_SAML_ORGANIZATION_ATTR: ").append(toIndentedString(SOCIAL_AUTH_SAML_ORGANIZATION_ATTR)).append("\n");
        sb.append("    SOCIAL_AUTH_SAML_ORGANIZATION_MAP: ").append(toIndentedString(SOCIAL_AUTH_SAML_ORGANIZATION_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_SAML_ORG_INFO: ").append(toIndentedString(SOCIAL_AUTH_SAML_ORG_INFO)).append("\n");
        sb.append("    SOCIAL_AUTH_SAML_SECURITY_CONFIG: ").append(toIndentedString(SOCIAL_AUTH_SAML_SECURITY_CONFIG)).append("\n");
        sb.append("    SOCIAL_AUTH_SAML_SP_ENTITY_ID: ").append(toIndentedString(SOCIAL_AUTH_SAML_SP_ENTITY_ID)).append("\n");
        sb.append("    SOCIAL_AUTH_SAML_SP_EXTRA: ").append(toIndentedString(SOCIAL_AUTH_SAML_SP_EXTRA)).append("\n");
        sb.append("    SOCIAL_AUTH_SAML_SP_PRIVATE_KEY: ").append(toIndentedString(SOCIAL_AUTH_SAML_SP_PRIVATE_KEY)).append("\n");
        sb.append("    SOCIAL_AUTH_SAML_SP_PUBLIC_CERT: ").append(toIndentedString(SOCIAL_AUTH_SAML_SP_PUBLIC_CERT)).append("\n");
        sb.append("    SOCIAL_AUTH_SAML_SUPPORT_CONTACT: ").append(toIndentedString(SOCIAL_AUTH_SAML_SUPPORT_CONTACT)).append("\n");
        sb.append("    SOCIAL_AUTH_SAML_TEAM_ATTR: ").append(toIndentedString(SOCIAL_AUTH_SAML_TEAM_ATTR)).append("\n");
        sb.append("    SOCIAL_AUTH_SAML_TEAM_MAP: ").append(toIndentedString(SOCIAL_AUTH_SAML_TEAM_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_SAML_TECHNICAL_CONTACT: ").append(toIndentedString(SOCIAL_AUTH_SAML_TECHNICAL_CONTACT)).append("\n");
        sb.append("    SOCIAL_AUTH_SAML_USER_FLAGS_BY_ATTR: ").append(toIndentedString(SOCIAL_AUTH_SAML_USER_FLAGS_BY_ATTR)).append("\n");
        sb.append("    SOCIAL_AUTH_TEAM_MAP: ").append(toIndentedString(SOCIAL_AUTH_TEAM_MAP)).append("\n");
        sb.append("    SOCIAL_AUTH_USERNAME_IS_FULL_EMAIL: ").append(toIndentedString(SOCIAL_AUTH_USERNAME_IS_FULL_EMAIL)).append("\n");
        sb.append("    SOCIAL_AUTH_USER_FIELDS: ").append(toIndentedString(SOCIAL_AUTH_USER_FIELDS)).append("\n");
        sb.append("    STDOUT_MAX_BYTES_DISPLAY: ").append(toIndentedString(STDOUT_MAX_BYTES_DISPLAY)).append("\n");
        sb.append("    SUBSCRIPTIONS_PASSWORD: ").append(toIndentedString(SUBSCRIPTIONS_PASSWORD)).append("\n");
        sb.append("    SUBSCRIPTIONS_USERNAME: ").append(toIndentedString(SUBSCRIPTIONS_USERNAME)).append("\n");
        sb.append("    SUBSCRIPTION_USAGE_MODEL: ").append(toIndentedString(SUBSCRIPTION_USAGE_MODEL)).append("\n");
        sb.append("    TACACSPLUS_AUTH_PROTOCOL: ").append(toIndentedString(TACACSPLUS_AUTH_PROTOCOL)).append("\n");
        sb.append("    TACACSPLUS_HOST: ").append(toIndentedString(TACACSPLUS_HOST)).append("\n");
        sb.append("    TACACSPLUS_PORT: ").append(toIndentedString(TACACSPLUS_PORT)).append("\n");
        sb.append("    TACACSPLUS_SECRET: ").append(toIndentedString(TACACSPLUS_SECRET)).append("\n");
        sb.append("    TACACSPLUS_SESSION_TIMEOUT: ").append(toIndentedString(TACACSPLUS_SESSION_TIMEOUT)).append("\n");
        sb.append("    TOWER_URL_BASE: ").append(toIndentedString(TOWER_URL_BASE)).append("\n");
        sb.append("    UI_LIVE_UPDATES_ENABLED: ").append(toIndentedString(UI_LIVE_UPDATES_ENABLED)).append("\n");
        sb.append("    UI_NEXT: ").append(toIndentedString(UI_NEXT)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}