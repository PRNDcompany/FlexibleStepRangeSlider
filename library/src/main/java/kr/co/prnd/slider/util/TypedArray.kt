package kr.co.prnd.slider.util

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.TypedArray
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

private const val DEF_FLOAT_VALUE = Float.MIN_VALUE

internal fun TypedArray.toFloatArray(): FloatArray = FloatArray(length()) { idx ->
    getFloat(idx, DEF_FLOAT_VALUE)
}

internal fun TypedArray.getFloatOrNull(index: Int): Float? =
    getFloat(index, DEF_FLOAT_VALUE).takeIf { it != DEF_FLOAT_VALUE }

internal fun TypedArray.getColorStateList(
    context: Context,
    index: Int,
    @ColorRes defaultColorResId: Int
): ColorStateList = getColorStateList(index)
    ?: context.getColorStateListOrThrow(defaultColorResId)

internal fun Context.getColorStateListOrThrow(@ColorRes id: Int): ColorStateList =
    requireNotNull(ContextCompat.getColorStateList(this, id))
