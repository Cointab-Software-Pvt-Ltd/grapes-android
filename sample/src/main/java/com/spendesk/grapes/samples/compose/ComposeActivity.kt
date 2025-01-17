package com.spendesk.grapes.samples.compose

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.spendesk.grapes.compose.theme.GrapesTheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * @author : kelian
 * @since : 17/01/2025
 **/
@AndroidEntryPoint
class ComposeActivity : ComponentActivity() {

    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, ComposeActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GrapesTheme {
                // noop
            }
        }
    }
}
