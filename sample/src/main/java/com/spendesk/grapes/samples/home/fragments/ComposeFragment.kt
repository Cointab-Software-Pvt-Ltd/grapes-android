package com.spendesk.grapes.samples.home.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import com.spendesk.grapes.compose.button.GrapesButton
import com.spendesk.grapes.compose.theme.GrapesTheme
import com.spendesk.grapes.samples.compose.ComposeActivity

/**
 * @author : danyboucanova
 * @since : 16/05/2022, Mon
 **/
class ComposeFragment : Fragment() {

    companion object {

        fun newInstance() = ComposeFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        ComposeView(requireContext()).apply {
            setContent {
                GrapesTheme {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = GrapesTheme.dimensions.unit16, vertical = GrapesTheme.dimensions.unit16),
                        verticalArrangement = Arrangement.spacedBy(GrapesTheme.dimensions.unit16),
                    ) {
                        GrapesButton(
                            text = "First Compose component test",
                            onClick = {}
                        )
                        Spacer(Modifier.height(GrapesTheme.dimensions.unit16))
                        Text(text = "Shapes", style = GrapesTheme.typography.titleL)
                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .width(200.dp)
                                .background(GrapesTheme.colors.primaryDark, shape = GrapesTheme.shapes.radius0),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "shape0",
                                style = GrapesTheme.typography.titleS.copy(color = GrapesTheme.colors.backgroundPrimaryDefault),
                            )
                        }
                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .width(200.dp)
                                .background(GrapesTheme.colors.primaryDark, shape = GrapesTheme.shapes.radius4),
                            contentAlignment = Alignment.Center
                        ) {

                            Text(
                                text = "shape1",
                                style = GrapesTheme.typography.titleS.copy(color = GrapesTheme.colors.backgroundPrimaryDefault),
                            )
                        }
                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .width(200.dp)
                                .background(GrapesTheme.colors.primaryDark, shape = GrapesTheme.shapes.radius8),
                            contentAlignment = Alignment.Center
                        ) {

                            Text(
                                text = "shape2",
                                style = GrapesTheme.typography.titleS.copy(color = GrapesTheme.colors.backgroundPrimaryDefault),
                            )
                        }
                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .width(200.dp)
                                .background(GrapesTheme.colors.primaryDark, shape = GrapesTheme.shapes.radius12),
                            contentAlignment = Alignment.Center
                        ) {

                            Text(
                                text = "shape3",
                                style = GrapesTheme.typography.titleS.copy(color = GrapesTheme.colors.backgroundPrimaryDefault),
                            )
                        }
                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .width(200.dp)
                                .background(GrapesTheme.colors.primaryDark, shape = GrapesTheme.shapes.radius1000),
                            contentAlignment = Alignment.Center
                        ) {

                            Text(
                                text = "shape4",
                                style = GrapesTheme.typography.titleS.copy(color = GrapesTheme.colors.backgroundPrimaryDefault),
                            )
                        }
                    }
                }
            }
        }
}
