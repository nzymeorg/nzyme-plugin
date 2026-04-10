package app.nzyme.plugin.distributed.tasksqueue;

public enum TaskType {

    TEST,

    PROVIDE_PGP_KEYS,

    PURGE_DATA_CATEGORY_GLOBAL,
    PURGE_DATA_CATEGORY_ORGANIZATION,
    PURGE_DATA_CATEGORY_TENANT,

    MONITOR_EXECUTION

}
