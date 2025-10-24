package com.spendesk.grapes.samples.core.extensions

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

/**
 * @author Kélian CLERC
 * @since 25/08/2023
 */
context(scope: CoroutineScope, lifecycleOwner: LifecycleOwner)
fun <T> Flow<T>.collectOnCreated(block: suspend (value: T) -> Unit) {
    scope.launch {
        lifecycleOwner.repeatOnLifecycle(Lifecycle.State.CREATED) {
            collect { value ->
                block(value)
            }
        }
    }
}
