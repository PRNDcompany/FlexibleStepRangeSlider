package kr.co.prnd.slider.util

import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.ShapeAppearanceModel

internal fun MaterialShapeDrawable.stateful(block: MaterialShapeDrawable.() -> Unit) {
    if (isStateful) {
        block(this)
    }
}

internal fun MaterialShapeDrawable.setBounds(radius: Int) {
    shapeAppearanceModel = ShapeAppearanceModel.builder()
        .setAllCorners(CornerFamily.ROUNDED, radius.toFloat())
        .build()
    setBounds(0, 0, radius * 2, radius * 2)
}
