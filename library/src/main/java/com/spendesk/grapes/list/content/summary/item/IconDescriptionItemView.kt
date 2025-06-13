package com.spendesk.grapes.list.content.summary.item

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.DrawableRes
import androidx.appcompat.widget.AppCompatTextView
import com.spendesk.grapes.R

/**
 * @author RomainGF
 * @since 13/06/2025
 */
class IconDescriptionItemView : AppCompatTextView {

    constructor(context: Context) : super(context, null, R.style.MapBlockAddressText)
    constructor(context: Context, attributeSet: AttributeSet?) : super(context, attributeSet, R.style.MapBlockAddressText)
    constructor(context: Context, attributeSet: AttributeSet?, defStyleAttr: Int) : super(context, attributeSet, defStyleAttr)

    data class Configuration(
        @DrawableRes val icon: Int,
        val title: CharSequence,
    )

    fun updateConfiguration(configuration: Configuration) {
        text = configuration.title
        compoundDrawablePadding = resources.getDimensionPixelSize(R.dimen.smallMargin)
        setCompoundDrawablesRelativeWithIntrinsicBounds(configuration.icon, 0, 0, 0)
    }
}
