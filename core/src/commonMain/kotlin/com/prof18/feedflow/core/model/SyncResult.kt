package com.prof18.feedflow.core.model

sealed interface SyncResult {
    data object Success : SyncResult
    data object Error : SyncResult

    fun isError(): Boolean = this is Error
    fun isSuccess(): Boolean = this is Success
}
