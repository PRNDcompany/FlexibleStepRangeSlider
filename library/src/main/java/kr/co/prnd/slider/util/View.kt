package kr.co.prnd.slider.util

import android.view.View
import android.view.ViewGroup

internal fun View.canScrollVertically(): Boolean {
    var view = parent
    while (view is ViewGroup) {
        val canScrollVertically = view.canScrollVertically(1) || view.canScrollVertically(-1)
        if (canScrollVertically && view.shouldDelayChildPressedState()) {
            return true
        }
        view = view.parent
    }
    return false
}
