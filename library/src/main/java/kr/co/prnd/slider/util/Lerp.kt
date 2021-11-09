package kr.co.prnd.slider.util

import androidx.annotation.FloatRange

/**
 * Linearly interpolate between two values
 */
internal fun lerp(
    startValue: Float,
    endValue: Float,
    @FloatRange(from = 0.0, to = 1.0) fraction: Float
): Float = startValue + fraction * (endValue - startValue)
