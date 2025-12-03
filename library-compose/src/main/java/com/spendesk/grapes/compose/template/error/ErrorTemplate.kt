package com.spendesk.grapes.compose.template.error

/**
 * @author Kélian CLERC
 * @since 01/06/2023
 */
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.spendesk.grapes.compose.button.core.GrapesButtonState
import com.spendesk.grapes.compose.button.primary.GrapesBrandPrimaryButton
import com.spendesk.grapes.compose.icons.GrapesHighlightIconAlert
import com.spendesk.grapes.compose.icons.GrapesHighlightIconSize
import com.spendesk.grapes.compose.theme.GrapesTheme
import kotlinx.coroutines.delay

@Composable
fun ErrorScreen(
    title: String,
    retryMessage: String,
    onRetryClick: () -> Unit,
    modifier: Modifier = Modifier,
    description: String? = null,
    retryEnabled: Boolean = true,
    icon: @Composable () -> Unit = { GrapesHighlightIconAlert(size = GrapesHighlightIconSize.EXTRA_LARGE) },
    configuration: ErrorScreenDefaults.Configuration = ErrorScreenDefaults.defaultConfiguration(),
) {
    ErrorTemplate(
        title = { ErrorTitle(title) },
        icon = icon,
        description = description?.let { { ErrorDescription(it) } },
        retryButton = {
            ErrorRetryButton(
                text = retryMessage,
                enabled = retryEnabled,
                onClick = onRetryClick,
                modifier = Modifier.fillMaxWidth()
            )
        },
        configuration = configuration,
        modifier = modifier,
    )
}

@Composable
fun ErrorScreen(
    title: String,
    modifier: Modifier = Modifier,
    description: String? = null,
    icon: @Composable () -> Unit = { GrapesHighlightIconAlert(size = GrapesHighlightIconSize.EXTRA_LARGE) },
    configuration: ErrorScreenDefaults.Configuration = ErrorScreenDefaults.defaultConfiguration(),
) {
    ErrorTemplate(
        title = { ErrorTitle(title) },
        icon = icon,
        description = description?.let { { ErrorDescription(it) } },
        retryButton = null,
        configuration = configuration,
        modifier = modifier,
    )
}

@Composable
@Deprecated("Use ErrorScreen without ErrorRetryUiModel instead", ReplaceWith("ErrorScreen"))
fun ErrorTemplate(
    title: String,
    description: String? = null,
    retryUiModel: ErrorRetryUiModel? = null,
    icon: @Composable () -> Unit = { GrapesHighlightIconAlert(size = GrapesHighlightIconSize.EXTRA_LARGE) },
    configuration: ErrorScreenDefaults.Configuration = ErrorScreenDefaults.defaultConfiguration(),
) {
    ErrorTemplate(
        title = { ErrorTitle(title) },
        icon = icon,
        description = description?.let { { ErrorDescription(it) } },
        retryButton = retryUiModel?.canRetry?.takeIf { it }?.let {
            {
                ErrorRetryButton(
                    text = retryUiModel.message,
                    enabled = true,
                    onClick = retryUiModel.onRetryClicked,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },
        configuration = configuration,
        modifier = Modifier
            .fillMaxSize()
            .padding(GrapesTheme.dimensions.unit16),
    )
}

@Composable
private fun ErrorTitle(
    title: String,
    modifier: Modifier = Modifier,
) {
    Text(
        text = title,
        style = GrapesTheme.typography.titleL,
        color = GrapesTheme.colors.contentPrimary,
        modifier = modifier,
    )
}

@Composable
private fun ErrorDescription(
    string: String,
    modifier: Modifier = Modifier,
) {
    Text(
        text = string,
        style = GrapesTheme.typography.bodyL,
        textAlign = TextAlign.Center,
        color = GrapesTheme.colors.contentSecondaryBGPrimary,
        modifier = modifier,
    )
}

@Composable
private fun ErrorRetryButton(
    text: String,
    enabled: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    GrapesBrandPrimaryButton(
        text = text,
        state = if (enabled) {
            GrapesButtonState.Enabled
        } else {
            GrapesButtonState.Disabled
        },
        onClick = onClick,
        modifier = modifier
    )
}

@Composable
private fun ErrorTemplate(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    icon: @Composable () -> Unit = { GrapesHighlightIconAlert(size = GrapesHighlightIconSize.EXTRA_LARGE) },
    description: (@Composable () -> Unit)? = null,
    retryButton: (@Composable () -> Unit)? = null,
    configuration: ErrorScreenDefaults.Configuration = ErrorScreenDefaults.defaultConfiguration(),
) {
    var isVisible by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        delay(configuration.startingDelayMs)
        isVisible = true
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AnimatedVisibility(visible = isVisible, enter = configuration.iconEnterAnimation) {
                icon()
            }

            Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit24))

            AnimatedVisibility(visible = isVisible, enter = configuration.titleEnterAnimation) {
                title()
            }

            description?.let {
                Spacer(modifier = Modifier.height(GrapesTheme.dimensions.unit12))
                AnimatedVisibility(visible = isVisible, enter = configuration.descriptionEnterAnimation) {
                    description()
                }
            }
        }

        if (retryButton != null) {
            AnimatedVisibility(visible = isVisible, enter = configuration.retryButtonEnterAnimation) {
                retryButton()
            }
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Preview(showBackground = true)
@Composable
fun ErrorTemplatePreview() {
    var isError by remember { mutableStateOf(false) }
    GrapesTheme {
        Column(
            modifier = Modifier
                .background(GrapesTheme.colors.backgroundPrimaryDefault)
                .padding(GrapesTheme.dimensions.unit16),
            verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit16)
        ) {
            AnimatedContent(targetState = isError, label = "Preview animation") { animatedIsError ->
                if (animatedIsError) {
                    ErrorScreen(
                        title = "Phone number reset failed",
                        description = "An error occurred while resetting your phone number. Please try again later.",
                        retryMessage = "Retry",
                        retryEnabled = true,
                        onRetryClick = { isError = false },
                    )
                } else {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        GrapesBrandPrimaryButton(
                            text = "Perform some network call",
                            onClick = { isError = true },
                        )
                    }
                }
            }

        }
    }
}
