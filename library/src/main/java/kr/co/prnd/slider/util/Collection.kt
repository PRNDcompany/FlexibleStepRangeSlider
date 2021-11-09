package kr.co.prnd.slider.util

import kotlin.math.abs

internal fun List<Float>.approximate(value: Float): Float {
    var diff: Float
    var minDiff = Float.MAX_VALUE
    var approximate = Float.NaN

    for (idx in indices) {
        diff = abs(get(idx) - value)
        if (minDiff >= diff) {
            minDiff = diff
            approximate = get(idx)
        }
    }

    return approximate
}

internal fun List<Float>.clapped(
    idx: Int,
    minimumValue: Float,
    maximumValue: Float,
    value: Float
): Float {
    val upperBound = getOrNull(idx + 1) ?: maximumValue
    val lowerBound = getOrNull(idx - 1) ?: minimumValue

    return value.coerceIn(lowerBound, upperBound)
}
